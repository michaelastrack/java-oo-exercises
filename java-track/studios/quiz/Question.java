package quiz;

public class Question {
	
	private String answer;
	protected String question;
	
	public Question (String question, String answer) {
		this.question = question;
		this.answer = answer;
	}
	
	public boolean isCorrect (String input) {
		if (this.answer.equals(input)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString () {
		return this.question;
	}

}
