package com.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.VO.GameVO;
import com.VO.MemberVO;
import com.VO.WrongVO;

public class GameDAO {
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "madang";
	private String pass = "madang";

	private Connection con = null;
	private PreparedStatement pst = null;
	private ResultSet rs = null;
	private MemberVO vo = null;
	private GameVO vo1 = null;
	private WrongVO vo2 = null;

	private int memno = 0;
	private String id = null;
	private String password = null;
	private String name = null;
	private int score = 0;

	private int qnum = 0;
	private String question = null;
	private String answer = null;
	private int qscore = 0;
	private int grade = 0;
	private int wrno = 0;

	private boolean result = false;

	public void connect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			con = DriverManager.getConnection(url, user, pass);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void close(ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void close(PreparedStatement pst) {
		if (pst != null) {
			try {
				pst.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void close(Connection con) {
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public boolean insertStd(String id, String password, String name, int score) {
		try {
			connect();

			String sql = "insert into member values(stSeq.nextval, ?, ?, ?, ?)";

			pst = con.prepareStatement(sql);
			pst.setString(1, id);
			pst.setString(2, password);
			pst.setString(3, name);
			pst.setInt(4, score);

			int cnt = pst.executeUpdate();
			if (cnt > 0) {
				result = true;
			} else {
				result = false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pst);
			close(con);
		}
		return result;
	}

	public MemberVO oneSelectStd(String temp, String temp2) {
		try {
			connect();

			String sql = " select * from member where id = ? and password = ?";
			pst = con.prepareStatement(sql);
			pst.setString(1, temp);
			pst.setString(2, temp2);
			boolean isList = false;
			rs = pst.executeQuery();
			while (rs.next()) {
				memno = rs.getInt(1);
				id = rs.getString(2);
				password = rs.getString(3);
				name = rs.getString(4);
				score = rs.getInt(5);
				vo = new MemberVO(memno, id, password, name, score);

				isList = true;
			}
		} catch (Exception e) {
			System.out.println(vo.toString());
			e.printStackTrace();
		} finally {
			close(pst);
			close(con);
		}
		return vo;
	}

	public ArrayList<GameVO> levelSelectStd(int level) {
		ArrayList<GameVO> al2 = new ArrayList<GameVO>();
		try {
			connect();
			String sql = " SELECT  WORD.QNUM, WORD.QUESTION, WORD.ANSWER, WORD.QSCORE, WORD.GRADE "
					+ " FROM (SELECT QNUM, QUESTION, ANSWER, QSCORE, GRADE FROM WORD "
					+ " ORDER BY  dbms_random.value ) WORD " + " WHERE word.grade =? " + " and ROWNUM<=10 ";

			pst = con.prepareStatement(sql);
			pst.setInt(1, level);

			rs = pst.executeQuery();
			while (rs.next()) {
				qnum = rs.getInt(1);
				question = rs.getString(2);
				answer = rs.getString(3);
				qscore = rs.getInt(4);
				grade = rs.getInt(5);
				vo1 = new GameVO(qnum, question, answer, qscore, grade);
				al2.add(vo1);
			}
		} catch (Exception e) {
			// System.out.println(vo1.toString());
			e.printStackTrace();
		} finally {
			close(pst);
			close(con);
		}
		return al2;
	}

	public boolean insertWrong(String id, String question, String answer, int grade) {
		try {
			connect();

			String sql = "insert into wrong values(stSeq.nextval, ?, ?, ?, ?)";
			// 4. 바인드 변수 채우기
			pst = con.prepareStatement(sql);
			pst.setString(1, id);
			pst.setString(2, question);
			pst.setString(3, answer);
			pst.setInt(4, grade);

			int cnt = pst.executeUpdate();
			if (cnt > 0) {
				result = true;
			} else {
				result = false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pst);
			close(con);
		}
		return result;
	}

	public ArrayList<GameVO> RandomSelectStd() {
		ArrayList<GameVO> al2 = new ArrayList<GameVO>();
		try {
			connect();
			String sql = " SELECT  WORD.QNUM, WORD.QUESTION, WORD.ANSWER, WORD.QSCORE, WORD.GRADE "
					+ " FROM (SELECT QNUM, QUESTION, ANSWER, QSCORE, GRADE FROM WORD "
					+ " ORDER BY  dbms_random.value ) WORD " + " WHERE ROWNUM<=20 ";

			pst = con.prepareStatement(sql);

			rs = pst.executeQuery();
			while (rs.next()) {
				qnum = rs.getInt(1);
				question = rs.getString(2);
				answer = rs.getString(3);
				qscore = rs.getInt(4);
				grade = rs.getInt(5);
				vo1 = new GameVO(qnum, question, answer, qscore, grade);
				al2.add(vo1);
			}
		} catch (Exception e) {
			// System.out.println(vo1.toString());
			e.printStackTrace();
		} finally {
			close(pst);
			close(con);
		}
		return al2;
	}

	public ArrayList<WrongVO> WrongselectStd(String id) { // 여기서는 String 아이디
		ArrayList<WrongVO> al3 = new ArrayList<WrongVO>();
		try {
			connect();

			String sql = " select * from wrong where id = ? order by wrno asc ";
			pst = con.prepareStatement(sql);
			pst.setString(1, id);

			rs = pst.executeQuery();
			while (rs.next()) {
				wrno = rs.getInt("wrno");
				id = rs.getString("id");
				question = rs.getString("question");
				answer = rs.getString("answer");
				grade = rs.getInt("grade");
				vo2 = new WrongVO(wrno, id, question, answer, grade);
				al3.add(vo2);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pst);
			close(con);
		}
		return al3;
	}

	public boolean updateScore(int memno, String id, String password, String name, int score) { // 2 붙은거 지워도 된다
		try {
			connect();

			String sql = null;
			sql = " update member ";
			sql += " set ";
			sql += " id = ?, ";
			sql += " password = ?, ";
			sql += " name = ?, ";
			sql += " score = ? ";
			sql += " where memno = ? ";

			pst = con.prepareStatement(sql);
			pst.setString(1, id);
			pst.setString(2, password);
			pst.setString(3, name);
			pst.setInt(4, score);
			pst.setInt(5, memno);

			int cnt = pst.executeUpdate();

			if (cnt > 0) {
				result = true;
			} else {
				result = false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pst);
			close(con);
		}
		return result;
	}

	public ArrayList<MemberVO> RankselectStd() {
		ArrayList<MemberVO> al = new ArrayList<MemberVO>();
		try {
			connect();

			String sql = " select * from member order by score desc ";
			pst = con.prepareStatement(sql);

			rs = pst.executeQuery();
			while (rs.next()) {
				memno = rs.getInt("memno");
				id = rs.getString("id");
				password = rs.getString("password");
				name = rs.getString("name");
				score = rs.getInt("score");
				vo = new MemberVO(memno, id, password, name, score);
				al.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pst);
			close(con);
		}
		return al;
	}

	public boolean deleteWrong(String id) {
		try {
			connect();
			String sql = " delete from wrong where id = ? ";

			pst = con.prepareStatement(sql);
			pst.setString(1, id);

			int cnt = pst.executeUpdate();
			if (cnt > 0) {
				result = true;
			} else {
				result = false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pst);
			close(con);
		}
		return result;
	}

	public MemberVO isLogin(String id, String password) {
		try {
			connect();

			String sql = " select * from member where id = ? and password = ?";
			pst = con.prepareStatement(sql);
			pst.setString(1, id);
			pst.setString(2, password);
			boolean isList = false;
			rs = pst.executeQuery();
			while (rs.next()) {
				memno = rs.getInt(1);
				id = rs.getString(2);
				password = rs.getString(3);
				name = rs.getString(4);
				score = rs.getInt(5);
				vo = new MemberVO(memno, id, password, name, score);

				isList = true;
			}
		} catch (Exception e) {
			System.out.println(vo.toString());
			e.printStackTrace();
		} finally {
			close(pst);
			close(con);
		}
		return vo;
	}


}
