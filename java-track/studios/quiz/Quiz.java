package quiz;

import java.util.ArrayList;

public class Quiz {
	
	private ArrayList <Question> quiz;
	
	public Quiz () {
		this.quiz = new ArrayList <Question>();
	}
	
	public void AddQuestion (String question, String answer) {
		Question q = new Question (question, answer);
		this.quiz.add(q);
	}
	
	public void AddQuestion (String question, String answer, String OptA, String OptB, String OptC, String OptD) {
		MCquestion q = new MCquestion (question, answer, OptA, OptB, OptC, OptD);
		this.quiz.add(q);
	}
	
	public boolean AskQuestion (Question q, String input) {
		System.out.println(q);
		System.out.println(input);
		
		return q.isCorrect(input);
	}
	
	public static void main(String[] args) {
		String q = "What's my name?";
		String a = "Michael";
		String q2 = "Pick the prime number:";
		String a2 = "c";
		String A = "21";
		String B = "15";
		String C = "37";
		String D = "12";
		
		Quiz test = new Quiz();
		test.AddQuestion(q, a);
		test.AddQuestion(q2, a2, A, B, C, D);
		
		System.out.println(test.AskQuestion(test.quiz.get(0), "Michael"));
		System.out.println(test.AskQuestion(test.quiz.get(0), "Mike"));
		System.out.println(test.AskQuestion(test.quiz.get(1), "a"));
		System.out.println(test.AskQuestion(test.quiz.get(1), "c"));
	}

}
