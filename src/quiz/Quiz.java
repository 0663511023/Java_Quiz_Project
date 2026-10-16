package quiz;

import java.util.Scanner;


public class Quiz {
	
	Scanner scanner = new Scanner(System.in);
		
		
		public void continueQuiz() {
			
		// After each question answered, perform this set of code
			System.out.println("\n---------- Press enter to continue to the next question ----------");
			scanner.nextLine();
		}
		
}
