package OnetoManyAnno;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Question3 {
	@Id
	private int id;
	
	private String quesName;
	
	@OneToMany
	private List<Answer3> answer;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuesName() {
		return quesName;
	}
	public void setQuesName(String quesName) {
		this.quesName = quesName;
	}
	public List<Answer3> getAnswer() {
		return answer;
	}
	public void setAnswer(List<Answer3> answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "Question3 [id=" + id + ", quesName=" + quesName + ", answer=" + answer + "]";
	}
	
	
}
