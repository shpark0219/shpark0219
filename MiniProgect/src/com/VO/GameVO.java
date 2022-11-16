package com.VO;

public class GameVO {

	// 게임 정보 모델 = 게임정보 TABLE
	private int qnum = 0;
	private String question = null;
	private String answer = null;
	private int qscore = 0;
	private int grade = 0;

	// 생성자
	public GameVO(int qnum, String question, String answer, int qscore, int grade) {

		this.qnum = qnum;
		this.question = question;
		this.answer = answer;
		this.qscore = qscore;
		this.grade = grade;
	}

	// 게터 세터
	public int getQnum() {
		return qnum;
	}

	public void setQnum(int qnum) {
		this.qnum = qnum;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public int getQscore() {
		return qscore;
	}

	public void setQscore(int qscore) {
		this.qscore = qscore;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
}
