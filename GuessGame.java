
public class GuessGame {
	
	public void guess() {
		 number = (int) (Math.random()* 10);
		 System.out.println("Im guessing " + number);
	}
	
		int number = 0;

		Players p1;   //GuessGame has 3 instance
		Players p2;   //variables for the three 
		Players p3;   // player objects
		
		public void startGame() {  
									//Create 3 player objects and assign
			p1 = new Players();    //them to the 3 player instance variables
			p2 = new Players();
			p3 = new Players();
			
			int guessP1 = 0;	//declare 3 variables to hold the guesses
			int guessP2 = 0;
			int guessP3 = 0;
			
			boolean p1isRight = false; //declare 3 variables to hold a false 
			boolean p2isRight = false; //value based on the players answeres
			boolean p3isRight = false;
			
			int targetNum = (int) (Math.random() * 10); //target number that players have to guess
			System.out.println("I am thinking of a number between 0 and 9...");
			
			while(true) {
				System.out.println("Number to guess is... " + targetNum);
				
				p1.guess(); //call each players guess() method
				p2.guess();
				p3.guess();
				
				guessP1 = p1.number;
				System.out.println("Plauer 1 guessed " + guessP1);		//get each players guess (result of guess method running)
				guessP2 = p2.number;									//by accessing the number variable of each player
				System.out.println("Player 2 guessed " + guessP2);
				guessP3 = p3.number;
				System.out.println("Plauer 3 guessed " + guessP3);
				
				if (guessP1 == targetNum) {								//check each players guess if it matches the target number
					p1isRight = true;									//If a player is right, then set that players variable
				} 														// to be true (we set default to be false at first)
				if (guessP2 == targetNum) {
					p2isRight = true;
				}
				if (guessP3 == targetNum) {
					p3isRight = true;
				}
				
				if (p1isRight || p2isRight || p3isRight) {						//If player 1 OR player 2 OR player 3 is right...
					System.out.println("We have a WEENER!");
					System.out.println("Player 1 got it right? " + p1isRight);
					System.out.println("Player 2 got it right? " + p2isRight);
					System.out.println("Plauer 3 got it right? " + p3isRight);
					System.out.println("Game Over.");
					break; //game over, so break out of the loop
					
				} else {														//Otherwise, stay in the loop and ask for another guess.
					System.out.println("Players will have to try again.");
				}
			}
		}
	}

