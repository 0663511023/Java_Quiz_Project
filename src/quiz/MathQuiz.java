package quiz;

public class MathQuiz extends Quiz {
	
	// Declare progress variables
	private int score;
	private int numberOfQuestions;
	
	// Create a constructor
	public MathQuiz() {
		this.score = 0;
		this.numberOfQuestions = 0;
	}
	
	// Create getter methods
	public int getScore() {
		return this.score;
	}
	
	public int getNumberOfQuestions() {
		return this.numberOfQuestions;
	}
	
	public void quizQuestions() {
		System.out.println("---------- Math Quiz ----------");
		System.out.println("Press enter to begin the quiz");
		scanner.nextLine();
	}
}
