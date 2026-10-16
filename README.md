**Quiz Project in Java named QuizWhiz**

I implemented a quiz project in Java's Eclipse IDE that implements different classes and objects to present the user with different quizzes. Thus, this project was 
implemented using Object-Oriented Programming (OOP)

**Classes implemented**
		The following are the implemented classes:
			**- Main.java** - This is the main class that runs all the other classes. It also creates objects of the different classes.
			**- GeneralQuiz.java** - This class implements a general quiz that presents the user with general questions they must answer.
			**- MathQuiz.java** - Implements a math quiz that contains questions specifically related to Mathematics that users must answer (Hasn't been implemented).
			**- ComputerScienceQuiz.java** - Implements a computer science quiz that contains Computer Science questions with which users are presented (Still under 		development).
			**- Quiz.java** - Contains methods that are inherited by GeneralQuiz, MathQuiz, and ComputerScienceQuiz classes.

**Implementation**
		Now, this project makes use of OOP to implement these different quizzes. Encapsulation and inheritance were used in the implementation process. Progress variables (attributes) *numberOfQuestions* and 
		*score* were used to keep track of all the questions answered and the score of each question answered correctly, respectively. These variables are initially set to zero at the beginning of the quiz. 
		For each question answered, *numberOfQuestions* is incremented by one and, for each questions answered correctly, *score* is incremented by one. 
		These variables are used to calculate the score of the user at the end of the quiz, that is, when all the questions are answered.
		I also made use of methods to implement the quiz questions, to calculate the score, and to reset the progress variables to zero should the user decide to re-take the quiz.

  **- Encapsulation**
	  	With encapsulation, the progress variables are kept private so as to disallow a user or anyone from tempering with the score of the quiz. This was made possible by the *private* access modifier.
	  	By making use of encapsulation, I ensure that all the progress
	  	variables are kept hidden from the user and are only accessible within a class in which they are declared. So, in the main class **(Main.java)** the variables (attributes) are not accessed directly, instead, they are 
	    accessed through getter methods.

  **- Inheritance**
	  	Inheritance ensures that all attributes and methods of one class are accessed by another class. So, the **GeneralQuiz**, **MathQuiz**, and **ComputerScienceQuiz** classes inherit the **Quiz** class. This is made possible by the 
	    *extends* keyword. Inheritance was implemented so as to avoid re-writing the same method of code over and over again as this could get tedious and unnecessary.
	
**How does it Work**
		* When run, the user is welcomed to **QuizWhiz.**
		* They are to press enter to continue.
		* *General quiz*, *math quiz*, and *Computer science quiz* are presented to them as options.
		* They are prompted to type in the quiz type they would like to take (e.g. General). Cases are ignored.
   		* Once the quiz is completely taken, they are able to view their score together with the corresponding percentage.
    	* They are then prompted whether they would like to re-take or exit the quiz.

**Requirements to run the project**
  * In order for users to run the project, they need a **Java Runtime Environment (JRE)** installed on their machine
     which can be downloaded from Oracle's official website (oracle.com).
  * A **runnable JAR file** will be shared to them so they are able run the project, provided they have a JRE installed.
  * It is worth noting that Java projects are designed to run on desktop environments like laptops, not mobile devices.
