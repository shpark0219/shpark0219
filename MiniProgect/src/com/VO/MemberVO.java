package com.VO;

public class MemberVO {
	// 1. field
	// 회원 모델 정보 =
	private int memno = 0;
	private String id = null;
	private String password = null;
	private String name = null;
	private int score = 0;

	// 2. method
	// 생성자 5개짜리, 4개짜리, 기본 생성자
	public MemberVO(int memno, String id, String password, String name, int score) {
		this.memno = memno;
		this.id = id;
		this.password = password;
		this.name = name;
		this.score = score;
	}

	public MemberVO() {
	}

	public int getMemno() {
		return memno;
	}

	public void setMemno(int memno) {
		this.memno = memno;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}
