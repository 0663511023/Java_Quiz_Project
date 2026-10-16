package quiz;


public class GeneralQuiz extends Quiz {
	
	// Declare progress variables
	private int numberOfQuestions;
	private int score;
			
	
	// Create a QuizClass constructor
	public GeneralQuiz () {
			this.numberOfQuestions = 0;
			this.score = 0;
		}
	
	// Define getter methods
		public int getScore () {
				return this.score;
		}
			
		public int getNumberOfQuestions () {
			return this.numberOfQuestions;
		}
	
	public void quizQuestions() {
		// The quizQuestions() method asks the user a question and prompts them to enter an answer.
		// If the user gets the answer correct, we increment the score variable by one
		// For each question asked, numberOfQuestions increases by one
		// Then, after each question is answered, we call the quizContinue method to continue the quiz
		
		System.out.println("---------- General Quiz ----------\n");
		continueQuiz();
		
		// Question 1
		System.out.println("1. What is the period when animals go to sleep for a long time during winter called? ");
		System.out.print("Answer... ");
		String answer1 = scanner.nextLine();
			if (answer1.equalsIgnoreCase("Hibernation")) {
				System.out.println("Correct");
				this.score++;
			}
			else {
				System.out.println("Incorrect");
			}
			this.numberOfQuestions++;
			continueQuiz();
		
		// Question 2
		System.out.println("2. What is the organ that pumps blood in the body? ");
		System.out.print("Answer... ");
		String answer2 = scanner.nextLine();
			if (answer2.equalsIgnoreCase("Heart")) {
				System.out.println("Correct");
				this.score++;
			}
			else {
				System.out.println("Incorrect");
			}
			this.numberOfQuestions++;
			continueQuiz();
		
		// Question 3
		System.out.println("3. What is the tallest animal on earth? ");
		System.out.print("Answer... ");
		String answer3 = scanner.nextLine();
			if (answer3.equalsIgnoreCase("Girrafe")) {
				System.out.println("Correct");
				this.score++;
			}
			else {
				System.out.println("Incorrect");
			}
			this.numberOfQuestions++;
			continueQuiz();
		
		// Question 4
		System.out.println("4. What is the larget animal on earth? ");
		System.out.print("Answer... ");
		String answer4 = scanner.nextLine();
			if (answer4.equalsIgnoreCase("Blue whale") || answer4.equalsIgnoreCase("whale")) {
				System.out.println("Correct");
				this.score++;
			}
			else {
				System.out.println("Incorrect");
			}
			this.numberOfQuestions++;
			continueQuiz();
		
		// Question 5
		System.out.println("5. What is the shelter where animals live called? ");
		System.out.print("Answer... ");
		String answer5 = scanner.nextLine();
			if (answer5.equalsIgnoreCase("Habitat")) {
				System.out.println("Correct");
				this.score++;
			}
			else {
				System.out.println("Incorrect");
			}
			this.numberOfQuestions++;
			continueQuiz();
		
		// Question 6
		System.out.println("6. What is the natural logarithm of 1? ");
		System.out.print("Answer... ");
		String answer6 = scanner.nextLine();
			if (answer6.equalsIgnoreCase("0") || answer6.equalsIgnoreCase("Zero")) {
				System.out.println("Correct");
				this.score++;
			}
			else {
				System.out.println("Incorrect");
			}
			this.numberOfQuestions++;
			continueQuiz();
		
		// Question 7
		System.out.println("7. What is the air that people and animals breathe in? ");
		System.out.print("Answer... ");
		String answer7 = scanner.nextLine();
			if (answer7.equalsIgnoreCase("Oxygen")) {
				System.out.println("Correct");
				this.score++;
			}
			else {
				System.out.println("Incorrect");
			}
			this.numberOfQuestions++;
			continueQuiz();
		
		// Question 8
		System.out.println("8. In which galaxy is the earth located? ");
		System.out.print("Answer... ");
		String answer8 = scanner.nextLine();
			if (answer8.equalsIgnoreCase("Milky Way Galaxy") || answer8.equalsIgnoreCase("Milky Way")) {
				System.out.println("Correct");
				this.score++;
			}
			else {
				System.out.println("Incorrect");
			}
			this.numberOfQuestions++;
			continueQuiz();
		
		// Question 9
		System.out.println("9. What is the largest planet in our system? ");
		System.out.print("Answer... ");
		String answer9 = scanner.nextLine();
			if (answer9.equalsIgnoreCase("Jupiter")) {
				System.out.println("Correct");
				this.score++;
			}
			else {
				System.out.println("Incorrect");
			}
			this.numberOfQuestions++;
			continueQuiz();
		
		// Question 10
		System.out.println("10. How many bones are there in an adult human being? ");
		System.out.print("Answer... ");
		int answer10 = scanner.nextInt();
			if (answer10 == 206) {
				System.out.println("Correct");
				this.score++;
			}
			else {
				System.out.println("Incorrect");
			}
			this.numberOfQuestions++;
			continueQuiz();
			scanner.nextLine();
			
		// Question 11
		System.out.println("11. Germany was once ruled by a ruthless leader. What was his name? ");
		System.out.print("Answer... ");
		String answer11 = scanner.nextLine();
			if (answer11.equalsIgnoreCase("Adolf Hitler")) {
				System.out.println("Correct");
				this.score++;
			}
			else {
				System.out.println("Incorrect");
			}
			this.numberOfQuestions++;
			continueQuiz();
		
		// Question 12
		System.out.println("12. The device that interpretes and executes programmed commands is known as a: ");
		System.out.print("Answer... ");
		String answer12 = scanner.nextLine();
			if (answer12.equalsIgnoreCase("Computer")) {
				System.out.println("Correct");
				this.score++;
			}
			else {
				System.out.println("Incorrect");
			}
		this.numberOfQuestions++;
		continueQuiz();
		
		// Question 13
		System.out.println("13. Enter the letter that matches the correct answer from the ones listed below: ");
		System.out.println("Compute 2 * 5 + 3");
		
		String letter;
		do {
			System.out.println("---------");
			System.out.println(" A. 13\n B. 12\n C. 25\n D. 10 ");
			System.out.println("---------");
			System.out.print("Letter... ");
			
			// Prompt the user to enter a letter, then use switch statements to compare the letter
			// against those listed
			// If they match, display a "Correct" else, display "Incorrect" or the default output
				letter = scanner.nextLine();
				switch (letter) {
				case "A": 
					System.out.println("Correct");
					this.score++;
				break;
				
				case "B":
					System.out.println("Incorrect");
				break;
			
				case "C":
					System.out.println("Incorrect");
				break;
				
				case "D":
					System.out.println("Incorrect");
				break;
			
				default: System.out.println("Select a letter from the ones listed ");
				break;
			}
		} while (!letter.equals("A") && !letter.equals("B" )&& !letter.equals("C") && !letter.equals("D"));
		this.numberOfQuestions++;
		continueQuiz();
		
		// Question 14
		System.out.println("14. Enter the letter that matches the correct answer from the ones listed below: ");
		
		System.out.println("What is the derivative of the function f(x) = 2x^3 below? ");
		String letter2;
		do {
			System.out.println("---------");
			System.out.println(" A. 6x\n B. 2x\n C. 6x^2\n D. 6x^3");
			System.out.println("---------");
			System.out.print("Letter... ");
			
			// Prompt the user to enter a letter, then compare it against those listed.
			// If they match, display a "Correct" message, else "Incorrect" or the default output
			letter2 = scanner.nextLine();
			
			switch (letter2) {
			case "A":
				System.out.println("Incorrect");
			break;
			case "B":
				System.out.println("Incorrect");
			break;
			case "C":
				System.out.println("Correct");
				score++;
			break;
			case "D":
				System.out.println("Incorrect");
			break;
			default: System.out.println("Select a letter from the ones listed above. ");
			break;
			}
			
		} while (!letter2.equals("A") && !letter2.equals("B") && !letter2.equals("C") && !letter2.equals("D"));
		this.numberOfQuestions++;
		continueQuiz();
		
		// Question 15
		System.out.println("15. Write the correct answer. Choose from the possible answers listed below:");
		System.out.println("What is another term used in place of 'Integration' with respect to a derivative? ");
		
		// Store possible answers in an array and display them for the user to see
		String[] possibleAnswers = {"Post-derivative", "Anti-derivative", "Reverse-derivative"};
		
		// Store the answer that the user answered
		String choice;
		
		// Execute this block of code while the answer entered is not any of those listed
		do {
			
			System.out.println("--------------------------------");
			for (int i = 0; i < possibleAnswers.length; i++) {
				System.out.println(" " + (i + 1) + ". " + possibleAnswers[i]);
			}
			System.out.println("--------------------------------");
			System.out.print("Answer... "); 
			
			// Prompt the user for an answer
			choice = scanner.nextLine();
			
			// Compare the answer entered against the ones listed
			if (choice.equalsIgnoreCase(possibleAnswers[1])) {
				System.out.println("Correct");
				this.score++;
			}
			else if (choice.equalsIgnoreCase(possibleAnswers[0])) {
				System.out.println("Incorrect");
			}
			else if (choice.equalsIgnoreCase(possibleAnswers[2])) {
				System.out.println("Incorrect");
			}
			else {
				System.out.println("Choose from the answers listed below");
			}
			
		} while(!choice.equalsIgnoreCase(possibleAnswers[0]) && !choice.equalsIgnoreCase(possibleAnswers[1]) && !choice.equalsIgnoreCase(possibleAnswers[2]));
		this.numberOfQuestions++;
		continueQuiz();
		
		// Question 16
		System.out.println("16. Write the correct answer. Choose from the ones listed below");
		System.out.println("What is the set of all possible input values for a function to be defined? ");
		
		// Store possible answers in an array and display them for the user to see
		String[] choices = {"Codomain", "Range", "Domain", "Output"};
		
		// Store the answer entered by the user
		String answer;
		
		// Execute this block of code while the answer entered is not one of the possible answers listed
		do {
			
			System.out.println("------------------------");
			for (int i = 0; i < choices.length; i++) {
				System.out.println(" " + (i + 1) + ". " + choices[i]);
			}
			System.out.println("------------------------");
			System.out.print("Answer... ");
			
			// Prompt the user for an answer
			answer = scanner.nextLine();
			
			// Compare the entered answer against the ones listed
			if (answer.equalsIgnoreCase(choices[2])) { 
				System.out.println("Correct");
				this.score++;
			}
			else if (answer.equalsIgnoreCase(choices[1])) {
				System.out.println("Incorrect");
			}
			else if (answer.equalsIgnoreCase(choices[0])) {
				System.out.println("Incorrect");
			}
			else if (answer.equalsIgnoreCase(choices[3])) {
				System.out.println("Incorrect");
			}
			else {
				System.out.println("Choose from the answers provided below");
			}
			
		} while (!answer.equalsIgnoreCase(choices[0]) && !answer.equalsIgnoreCase(choices[1]) && !answer.equalsIgnoreCase(choices[2]) && !answer.equalsIgnoreCase(choices[3]));
		this.numberOfQuestions++;
		continueQuiz();
		
		// Question 17
		System.out.println("17. Enter the correct answer. Choose from the ones listed below");
		System.out.println("The set of all possible output values produced by a function is called its... ");
		
		// Create an array to store all the possible answers
		String[] listOfPossibleAnswers = {"Domain", "Range", "Variable", "Parameter"};
		
		// Store the answer entered by the user
		String possibleAnswer;
		
		// Execute this block of code while the answer entered by the user does not match any of the ones provided
		do {
			
			// Print all the answers so they are visible to the user
			System.out.println("-----------------");
			for (int i = 0; i < listOfPossibleAnswers.length; i++) {
				System.out.println(" " + (i + 1) + ". " + listOfPossibleAnswers[i]);
			}
			System.out.println("-----------------");
			System.out.print("Answer... ");
			
			// Prompt the user to enter an answer
			possibleAnswer = scanner.nextLine();
			
			// Compare the answer entered against the possible answers listed
			if (possibleAnswer.equalsIgnoreCase(listOfPossibleAnswers[1])) {
				System.out.println("Correct");
				this.score++;
			}
			else if (possibleAnswer.equalsIgnoreCase(listOfPossibleAnswers[0])) {
				System.out.println("Incorrect");
			}
			else if (possibleAnswer.equalsIgnoreCase(listOfPossibleAnswers[2])) {
				System.out.println("Incorrect");
			}
			else if (possibleAnswer.equalsIgnoreCase(listOfPossibleAnswers[3])) {
				System.out.println("Incorrect");
			}
			else {
				System.out.println("Choose from the ones provided below");
			}
		
		} while (!possibleAnswer.equalsIgnoreCase(listOfPossibleAnswers[0]) && !possibleAnswer.equalsIgnoreCase(listOfPossibleAnswers[1]) && !possibleAnswer.equalsIgnoreCase(listOfPossibleAnswers[2]) && !possibleAnswer.equalsIgnoreCase(listOfPossibleAnswers[3]));
		this.numberOfQuestions++;
		continueQuiz();
		
		// Question 18
		System.out.println("18. State whether the statement is either true or false:");
		System.out.println("Any number divided by zero is undefined ");
		System.out.print("Answer... ");
		
		// Prompt the user to enter a Boolean value
		boolean isTrue = scanner.nextBoolean();
		
		if (isTrue) {
			System.out.println("Correct");
			this.score++;
		}
		else {
			System.out.println("Incorrect");
		}
		this.numberOfQuestions++;
		continueQuiz();
		scanner.nextLine();
		
		// Question 19
		System.out.println("19. State whether the statement is either true or false:");
		System.out.println("Zero raised to the power zero is defined ");
		System.out.print("Answer... ");
		
		// Prompt the user to enter a Boolean value
		boolean isFalse = scanner.nextBoolean();
		
		if (!isFalse) {
			System.out.println("Correct");
			this.score++;
		}
		else {
			System.out.println("Incorrect");
		}
		this.numberOfQuestions++;
		continueQuiz();
		scanner.nextLine();
		
		// Question 20
		System.out.println("20. Enter the correct answer:");
		System.out.println("A number that can be written in a form of a fraction is called a: ");
		System.out.print("Answer... ");
		
		// Prompt the user for an answer
		String input = scanner.nextLine();
		
		// Check logic
		if (input.equalsIgnoreCase("Rational number") || input.equalsIgnoreCase("Rational")) {
			System.out.println("Correct");
			this.score++;
		}
		else {
			System.out.println("Incorrect");
		}
		this.numberOfQuestions++;
		continueQuiz();
		
		// Question 21
		System.out.println("21. Enter the correct answer:");
		System.out.println("A number that cannot be written in a form of a fraction is called an: ");
		System.out.print("Answer... ");
			
		// Prompt the user for an answer
		String input1 = scanner.nextLine();
			
		// Check logic
		if (input1.equalsIgnoreCase("Irrational number") || input1.equalsIgnoreCase("Irrational")) {
			System.out.println("Correct");
			this.score++;
		}
		else {
			System.out.println("Incorrect");
		}
		this.numberOfQuestions++;
		continueQuiz();
		
		// Question 22
		System.out.println("22. An ant can lift up to 50 times its weight. Is this true or is it false? ");
		System.out.print("Answer... ");
		
		// Prompt the user to enter the answer
		boolean isYes = scanner.nextBoolean();
		
		if (isYes) {
			System.out.println("Correct");
			this.score++;
		}
		else {
			System.out.println("Incorrect");
		}
		this.numberOfQuestions++;
		continueQuiz();
		scanner.nextLine();
		
		// Call the quizScore() method to view score
		quizScore();
		
	}
	
	public void quizScore() {
		
		// A method to calculate the total score of the questions answered correctly
			System.out.println("--------------- Quiz Complete! ---------------");
			System.out.println("Press enter to get your total score");
			scanner.nextLine();
			System.out.println("Total score: " + this.score + "/" + this.numberOfQuestions);
			
		// Calculate percentage
			double percentage = (double) this.score / numberOfQuestions * 100;
			System.out.printf("Percentage: %.2f%%\n", percentage);
		}
	
	public void resetProgressVariables() {
		// This method resets the progress variables whenever called
			this.score = 0;
			this.numberOfQuestions = 0;
		}
	
	

}
