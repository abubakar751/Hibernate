package oneTomanyPa;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class Question {
	@Id
  private int id;
  private String question;
 @OneToMany
  private List<Answer> answers;
public Question(int id, String question, List<Answer> answers) {
	super();
	this.id = id;
	this.question = question;
	this.answers = answers;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getQuestion() {
	return question;
}
public void setQuestion(String question) {
	this.question = question;
}
public List<Answer> getAnswers() {
	return answers;
}
public void setAnswers(List<Answer> answers) {
	this.answers = answers;
}
public Question() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Question [id=" + id + ", question=" + question + ", answers=" + answers + "]";
}
  
}
