package UT;

public class Round {
	private String question;
	private String[] choices;
	private String answer;
	private int value;
	
	public Round(String question, String[] choices, String answer, int value) {
		this.question = question;
		this.choices = choices;
		this.answer = answer;
		this.value = value;
		
	}

	public String getQuestion() {
		return question;
	}
	
	public String[] getChoices() {
		return choices;
	}

	public void printChoices() {
		System.out.println("a: " + choices[0] +
				"\nb: " + choices[1] +
				"\nc: " + choices[2] +
				"\nd: " + choices[3] + "\n");
		
	}
	
	public String getAnswer() {
		return answer;
	}

	public int getValue() {
		return value;
	}

	
}
