package quiz; // A package that contains all the quiz classes

// ----------------------------------- Program Details ----------------------------------------------------------------

// 04 October 2026, Sunday. 22:18 (Creating and testing the program based on the QuizClass class)
// We create a quiz program (named QuizWhiz), using classes and objects, that allows users to answer quiz questions to 
// test their knowledge and view their results
// With this program, I implemented the concept of inheritance in Java OOP

// 05 October 2026, Monday. 19:59 (Updating the Main class based on the QuizClass class)

// 07 October 2026, Wednesday, 22:55 (Creating the ComputerScienceQuiz class and updating 
// the Main on the new ComputerScienceQuiz class): Implementation of Inheritance

// --------------------------------------------------------------------------------------------------------------------

// ----------------------------------- Begin Program execution --------------------------------------------------------


// Import the Scanner class
import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
		
		// Create a scanner object
		Scanner scanner = new Scanner(System.in);

		
		// Create a parentQuiz object from the Quiz class
		Quiz parentQuiz = new Quiz();
		
		// Create a quiz object from the QuizClass class
		GeneralQuiz genquiz = new GeneralQuiz();
		
		// Create a csquiz object from the ComputerScienceQuiz class
		ComputerScienceQuiz csquiz = new ComputerScienceQuiz();
		
		// Create a mathquiz object from the MathQuiz class
		MathQuiz mathquiz = new MathQuiz();
		
		
		
		System.out.println("\n---------- HELLO AND WELCOME TO QUIZWHIZ. TAKE A QUIZ TO TEST YOUR KNOWLEDGE ----------\n");
		parentQuiz.continueQuiz();
		
		System.out.println("These are the available quiz types:");
		
		// Store the available quizes in an array
		String[] quizTypes = {"General", "Math", "Computer Science"};
		
		// Display the available quizzes to the user
		for (int i = 0; i < quizTypes.length; i++) {
			System.out.println(" " + (i + 1) + ". " + quizTypes[i] + " quiz");
		}
		
		System.out.println("\nPlease select the quiz you would like to take.");
		System.out.println("Write only the type of the quiz (e.g. General). Note that cases do not matter (e.g. You can write 'math' insted of 'Math')");
		String quizSelection;
		
		// Prompt the user to enter a quiz type again should their input not be from the array
		do {
			
			System.out.print("Quiz type... ");
			quizSelection = scanner.nextLine();
			
			if (quizSelection.equalsIgnoreCase(quizTypes[0])) {
				genquiz.quizQuestions();
			}
			else if (quizSelection.equalsIgnoreCase(quizTypes[1])) {
				mathquiz.quizQuestions();
			}
			else if (quizSelection.equalsIgnoreCase(quizTypes[2])){
				csquiz.quizQuestions();
			}
			else {
				System.out.println("\nSelect from the quizes listed above");
			}
			
		}while(!quizSelection.equalsIgnoreCase(quizTypes[0]) && !quizSelection.equalsIgnoreCase(quizTypes[1]) && !quizSelection.equalsIgnoreCase(quizTypes[2]));
		
		
		/*System.out.println("General Quiz: This is a quiz based on general knowledge");
		System.out.println("Math quiz: This is a mathematics-related quiz. You will answer only math questions");
		System.out.println("Computer Science quiz: This is a computer science-related quiz. You will answer questions "
							+ "that are based on computer science only");
		System.out.println("Please select a quiz you would like to take");
		System.out.println();*/
		// Call the quizQuestions() method to start taking the quiz
		// genquiz.quizQuestions();
		
		// Prompt the user if they would like to re-take the quiz
		System.out.print("Would you like to retake the quiz? Enter Yes or No ");
		String yesOrNo;
		
		// Execute this block of code again and again should the user enter an answer that is neither 'Yes' nor 'No'
		do {
			
			yesOrNo = scanner.nextLine();
			
			// Create logic base on the answer the user entered
			if (yesOrNo.equalsIgnoreCase("Yes")) {
				genquiz.resetProgressVariables();
				genquiz.quizQuestions();
			}
			else if (yesOrNo.equalsIgnoreCase("No")) {
				System.out.println("-------------------------------------------------------\n");
				System.out.println("Goodbye. We hope you visit QuizWhiz again!\n");
				System.out.println("----------- Press Enter to Terminate the program ------------\n");
				scanner.nextLine();
				System.out.println("------------ Program terminated successfully! --------------");
				System.exit(0);
			}
			else {
				System.out.print("Answer with either 'Yes' or 'No' ");
				System.out.println();
			}
			
		} while(!yesOrNo.equalsIgnoreCase("Yes") && !yesOrNo.equalsIgnoreCase("No"));
		
		// close the scanner object
		scanner.close();
		
	}

}
