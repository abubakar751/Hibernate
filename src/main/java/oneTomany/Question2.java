package oneTomany;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Question2 {
	@Id
	private int  quesId;
	private String question;
	@ManyToOne
	private List<Answer1> answer1s;
	public int getQuesId() {
		return quesId;
	}
	public void setQuesId(int quesId) {
		this.quesId = quesId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<Answer1> getAnswer1s() {
		return answer1s;
	}
	public void setAnswer1s(List<Answer1> answer1s) {
		this.answer1s = answer1s;
	}
	@Override
	public String toString() {
		return "Question2 [quesId=" + quesId + ", question=" + question + ", answer1s=" + answer1s + "]";
	}

	


}
