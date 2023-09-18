package OnetoManyAnno;

import jakarta.persistence.*;


@Entity
public class Answer3 {
    @Id
	private int answerId;
	private String answer;
    
	@ManyToOne
	private Question3 question3;
	
	public int getAnswerId() {
		return answerId;
	}
	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public Question3 getQuestion3() {
		return question3;
	}
	public void setQuestion3(Question3 question3) {
		this.question3 = question3;
	}
	@Override
	public String toString() {
		return "Answer3 [answerId=" + answerId + ", answer=" + answer + ", question3=" + question3 + "]";
	}
	

}
