package oneTomany;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

public class Answer1 {
	private int ansId;
	private String ans;
	@OneToMany
	private Question2 question2;
	public int getAnsId() {
		return ansId;
	}
	public void setAnsId(int ansId) {
		this.ansId = ansId;
	}
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	public Question2 getQuestion2() {
		return question2;
	}
	public void setQuestion2(Question2 question2) {
		this.question2 = question2;
	}
	@Override
	public String toString() {
		return "Answer1 [ansId=" + ansId + ", ans=" + ans + ", question2=" + question2 + "]";
	}

}
