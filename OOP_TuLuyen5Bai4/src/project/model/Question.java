package project.model;

public class Question implements Complexity {
	private int complexity;
	private String question;
	private String answer;
	
	
	public Question(int complexity, String question, String answer) {
		super();
		this.complexity = complexity;
		this.question = question;
		this.answer = answer;
	}
	public String getQuestion() {
		return question;
	}
	public String getAnswer() {
		return answer;
	}
	public int getComplexity() {
		return this.complexity;
	}	
	public void setComplexity(int complexity) {
		this.complexity=complexity;		
	}
	public boolean answerCorrect(String ans)
	{
		if(this.answer.equalsIgnoreCase(ans)) return true;
		return false;
	}
	@Override
	public String toString() {
		return "Complexity: "+this.complexity+" Question: "+this.question+" Answer: "+this.answer;
	}
}
