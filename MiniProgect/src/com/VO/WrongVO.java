package com.VO;

public class WrongVO {
	
	private int wrno = 0;
	private String id = null;
	private String question;
	private String answer;
	private int grade = 0;

	public WrongVO(int wrno, String id, String question, String answer, int grade) {		
		this.wrno = wrno;
		this.id = id;
		this.question = question;
		this.answer = answer;
		this.grade = grade;
	}
	
	public int getWrno() {
		return wrno;
	}

	public void setWrno(int wrno) {
		this.wrno = wrno;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
}
