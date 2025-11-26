package com.tut.one_to_one_bi;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.tut.one_to_one.Answer;

@Entity
public class Question1 {

	@Id
	@Column(name = "question_id")
	private int questionId;

	private String question;

	@OneToOne
	@JoinColumn(name = "a_id")
	private Answer1 answer;

	public Question1() {
		// TODO Auto-generated constructor stub
	}

	public Question1(int questionId, String question, Answer1 answer) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answer = answer;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Answer1 getAnswer() {
		return answer;
	}

	public void setAnswer(Answer1 answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", question=" + question + ", answer=" + answer + "]";
	}

}
