package quiz;

import java.util.InputMismatchException;

// This class inherits the Quiz class. That is, it inherits all of its methods and attributes
public class ComputerScienceQuiz extends Quiz {
	// We create a new quiz, but will inherit all the methods and attributes(fields) of the QuizClass class
	
	private int score;
	private int numberOfQuestions;
	
	public ComputerScienceQuiz() {
		this.score = 0;
		this.numberOfQuestions = 0;
	}
	
	// A method that contains all the quiz questions
	public void quizQuestions() {
		System.out.println("\n---------- COMPUTER SCIENCE QUIZ ----------");
		System.out.println("---------- Press enter to begin the quiz----------");
		scanner.nextLine();
		
	// Question 1
		System.out.println("1. What is the device that interpretes and executes programmed commands? ");
		System.out.print("Answer... ");
		String answer = scanner.nextLine();
		
		if (answer.equalsIgnoreCase("Computer")) {
			System.out.println("Correct");
			this.score++; // Increment score should the user get the questions correct by one
		}
		else {
			System.out.println("Incorrect");
		}
		this.numberOfQuestions++; // After the questions has been answered, increment the number of questions by one
		continueQuiz();
		
		
	// Question 2
		System.out.println("2. The software that as an intermediary (interface) between user applications and hardware is called an... ");
		System.out.print("Answer... ");
		String answer2 = scanner.nextLine();
		
		if (answer2.equalsIgnoreCase("Operating system")) {
			System.out.println("Correct");
			this.score++;
		}
		else {
			System.out.println("Incorrect");
		}
		this.numberOfQuestions++;
		continueQuiz();
		
	// Question 3
		// Store the possible answers in an array
		String[] values = {"1 064 672", "38 573", "1 048 576", "329 839", "2 392 346"};
		
		System.out.println("3. Now, suppose you have 3 GB of storage in your computer, how many MB of storage do you have?");
		System.out.println("Select the number of the correct answer from the ones listed below");
		int number;
		
	// Display all the answers for the user to see
		for (int i = 0; i < values.length; i++) {
			System.out.println(" " + (i + 1) + ". " + values[i]);
		}
		System.out.print("Number... ");
		
		// Execute this block of code so long as the number is not from the listed ones below
		
			
			try {
				number = scanner.nextInt();
			
			
				if (number == 1) {
					System.out.println("Incorrect");
				}
				else if (number == 2) {
					System.out.println("Incorrect");
				}
				else if (number == 3) {
					System.out.println("Correct");
					this.score++;
		    		}
				else if (number == 4) {
					System.out.println("Incorrect");
				}
				else if (number == 5) {
					System.out.println("Incorrect");
				}
				else {
					System.out.println("\nInvalid number! Please select from the ones above");
					System.out.print("Number... ");
				}
			}
				catch (InputMismatchException e) {
					System.out.println("Invalid input! Input a number from the ones listed above");
				}
			
			
		continueQuiz();
		scanner.nextLine();
		
	// Question 4
		// Store possible answers in an array
		String[] protocols = {"DHCP (Dynamic Host Control Protocol)", "OSPF (Open Shortest Path First)", "IP (Internet Protocol)", "TCP (Transmission Control Protocol)"};
		
		System.out.println("4. What is the protocol used by devices to get IP Addresses automatically from the network they are in?");
		System.out.println("Write down the answer from the choices below");
		String protocolSelection;
		
		// Display the protocols to the user
		for (int i = 0; i < protocols.length; i++) {
			System.out.println(" " + (i + 1) + ". " + protocols[i]);
		}
		System.out.print("Answer... ");
		
		
		// Perform a do-while loop
		do {
			
			protocolSelection = scanner.nextLine();
			
			if (protocolSelection.equalsIgnoreCase("DHCP")) {
				System.out.println("Correct");
				this.score++;
			}
			else if (protocolSelection.equalsIgnoreCase("OSPF")) {
				System.out.println("Incorrect");
			}
			else if (protocolSelection.equalsIgnoreCase("IP")) {
				System.out.println("Incorrect");
			}
			else if (protocolSelection.equalsIgnoreCase("TCP")) {
				System.out.println("Incorrect");
			}
			else {
				System.out.println("\nInvalid input! Please select from the ones above");
				System.out.print("Answer... ");
			}
			
		} while(!protocolSelection.equalsIgnoreCase("DHCP") && !protocolSelection.equalsIgnoreCase("OSPF") && !protocolSelection.equals("IP") && !protocolSelection.equals("TCP"));
		
		this.numberOfQuestions++;
		continueQuiz();
		
		// Question 5
		System.out.println("5. Write the answer from the ones listed below");
		System.out.println("The physical components of a computer are known as its...");
		
		// Store possible choices in an array
		String[] options = {"Software", "Monitor", "Physicals", "Hardware"};
		String optionLetter;
		boolean isValid = false;
		
		// Display all the possible answers to the user
		for (int i = 0; i < options.length; i++) {
			System.out.println(" " + (i + 1) + ". "+ options[i]);
		}
		
		// Perform a do-while loop
		while (!isValid) {
			
			try {
				
				System.out.print("Answer... ");
				optionLetter = scanner.nextLine();
				
				if (optionLetter.equalsIgnoreCase(options[0])) {
					System.out.println("Incorrect");
					isValid = true;
				}
				else if (optionLetter.equalsIgnoreCase(options[1])) {
					System.out.println("Incorrect");
					isValid = true;
				}
				else if (optionLetter.equalsIgnoreCase(options[2])) {
					System.out.println("Incorrect");
					isValid = true;
				}
				else if (optionLetter.equalsIgnoreCase(options[3])) {
					System.out.println("Correct");
					this.score++;
					isValid = true;
				}
				else {
					System.out.println("\nInvalid input! Write from the ones listed above");
				}
			}
			catch (InputMismatchException e) {
				System.out.println("Invalid Input! Please enter a string from from the ones listed above");
			}
			
		}
		
		this.numberOfQuestions++;
		continueQuiz();
		
		
		// Question 6
		System.out.println("6. Say whether the statement is true or false");
		System.out.println("The RAM (random access memory) is volatile. That is, all data is lost from RAM, if not saved, once the computer shuts down");
		boolean isTrueOrFalse = true;
		
		// Set the flag initially to false
		boolean flag1 = false;
		
		// Perform a do-while loop
		while (!flag1) {
			
			// Catch any input mismatch exceptions in a try-catch block
			try {
				
				System.out.print("Answer... ");
				isTrueOrFalse = scanner.nextBoolean();
			
				if (isTrueOrFalse) {
					System.out.println("Correct");
					this.score++;
					flag1 = true;
				}
				else if (!isTrueOrFalse) {
					System.out.println("Incorrect");
					flag1 = true;
				}
			}
			catch (InputMismatchException e) {
				System.out.println("\nInvalid input! Enter either true or false");
				scanner.nextLine();
			}
		}
			
		this.numberOfQuestions++;
		continueQuiz();
		scanner.nextLine();
		
		// Question 7
		System.out.println("7. Processes in a computer gets allocated memory space in RAM by the operating system due to a process of memory management");
		System.out.println("Now, what is this scheme called? Write only the scheme (e.g. local memory)");
		System.out.print("Answer... ");
		String provideAnswer = scanner.nextLine();
		
		// Perform verification logic
		if (provideAnswer.equalsIgnoreCase("Dynamic memory")) {
			System.out.println("Correct");
			this.score++;
		}
		else {
			System.out.println("Incorrect");
		}
		
		this.numberOfQuestions++;
		continueQuiz();
		
		
		// Question 8
		System.out.println("8. Computers have the ability to use the secondary memory as if it were part of main memory. However, a throwback about this process is that the operating system may experience thrashing");
		System.out.println("What is this process called?");
		System.out.print("Answer... ");
		String process = scanner.nextLine();
		
		// Perform verification logic
		if (process.equalsIgnoreCase("Virtual memory")) {
			System.out.println("Correct");
			this.score++;
		}
		else {
			System.out.println("Incorrect");
		}
		
		this.numberOfQuestions++;
		continueQuiz();
		
		
		// Question 9
		System.out.println("9. How many digits is a byte made out of? Write only the number");
		int digit;
		boolean flag2 = false; // Set the flag to false initially. This is going to be used in the while loop
		
		
		while (!flag2) {
			
			// Catch any input mismatch exceptions
			try {
				
				System.out.print("Answer... ");
				digit = scanner.nextInt();
				
				if (digit == 8) {
					System.out.println("Correct");
					this.score++;
					flag2 = true;
				}
				else if (digit != 8){
					System.out.println("Incorrect");
					flag2 = true;
				}
			}
			catch (InputMismatchException e) {
				System.out.println("\nInvalid Input! Enter an integer");
				scanner.nextLine();
			}
		}
		
		this.numberOfQuestions++;
		continueQuiz();
		
		
		// Question 10
		System.out.println("10. State whether the statement is true or false. In programming, a method contains code designed to perform a specific action");
		System.out.println("In programming, a method contains a block of code designed to perform a specific task and can be reused however many times when called");
		boolean isTrue;
		boolean flag3 = false; // Flag the input whether it is true of false
		
		
		// While the input is incorrect, execute this block of code, else exit it
		while (!flag3) {
			
			// Catch any input mismatch exceptions
			try {
				
				System.out.print("Answer... ");
				isTrue = scanner.nextBoolean();
			
				// Perform verification
				if (isTrue) {
					System.out.println("Correct");
					this.score++;
					flag3 = true;
				}
				else if (!isTrue) {
					System.out.println("Incorrect");
					flag3 = true;
				}
			}
			catch (InputMismatchException e) {
				System.out.println("Invalid input! Enter either true or false");
				scanner.nextLine();
			}
			
		}
		
		this.numberOfQuestions++;
		continueQuiz();
		
		
		// Question 11
		System.out.println("11. What does WWW stand for?");
		System.out.print("Answer... ");
		String meaning = scanner.nextLine();
		
		if (meaning.equalsIgnoreCase("World Wide Web")) {
			System.out.println("Correct");
			this.score++;
		}
		else {
			System.out.println("Correct");
		}
		
		this.numberOfQuestions++;
		continueQuiz();
		
		// Question 12
		System.out.println("12. What is the hardware component that is responsible for executing processes? Write its full name");
		System.out.print("Answer... ");
		String fullName = scanner.nextLine();
		
		// Perform answer verification
		if (fullName.equalsIgnoreCase("Central Processing Unit")) {
			System.out.println("Correct");
			this.score++;
		}
		else {
			System.out.println("Incorrect");
		}
		
		this.numberOfQuestions++;
		continueQuiz();
		
		// Question 13
		System.out.println("13. ");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// Call the quizScore() method after all the questions have been answered
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
	
 }
