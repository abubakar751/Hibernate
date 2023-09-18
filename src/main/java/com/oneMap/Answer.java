package com.oneMap;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Answer {
	@Id
	private int ansId;
	private String answer;

	public int getAnsId() {
		return ansId;
	}

	public void setAnsId(int ansId) {
		this.ansId = ansId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Answer [ansId=" + ansId + ", answer=" + answer + "]";
	}

}
