package oneTomanyPa;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Answer {
	@Id
   private int id;
   private String answer;
   private Question question;
public Answer() {
	super();
	// TODO Auto-generated constructor stub
}
public Answer(int id, String answer, Question question) {
	super();
	this.id = id;
	this.answer = answer;
	this.question = question;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getAnswer() {
	return answer;
}
public void setAnswer(String answer) {
	this.answer = answer;
}
public Question getQuestion() {
	return question;
}
public void setQuestion(Question question) {
	this.question = question;
}
@Override
public String toString() {
	return "Answer [id=" + id + ", answer=" + answer + ", question=" + question + "]";
}
   
  
   
}
