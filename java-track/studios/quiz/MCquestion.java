package quiz;

public class MCquestion extends Question {
	
	private String OptionA;
	private String OptionB;
	private String OptionC;
	private String OptionD;
	
	public MCquestion (String question, String answer, String OptionA, String OptionB, String OptionC, String OptionD) {
		super (question, answer);
		this.OptionA = OptionA;
		this.OptionB = OptionB;
		this.OptionC = OptionC;
		this.OptionD = OptionD;
	}
	
	public String toString () {
		String response = super.question + "\n";
		response += "a: " + this.OptionA + "\n";
		response += "b: " + this.OptionB + "\n";
		response += "c: " + this.OptionC + "\n";
		response += "d: " + this.OptionD + "\n";
		return response;
	}

}
