/*
Jeremie Bornais
Mrs. Campbell
ICS4U
04/04/2019
Word Guess Game
*/

import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Boolean guesstime = false;
    String[] word = {"-","-","-","-","-"};
    String[] realword = {"B","R","A","I","N"};
    String wordstring = "BRAIN";
    String guess;
    String letter;
    int numguesses = 0;
    

    int x = 0;
	int y = 0;
	String playAgain = "";
	
    while (x==0){

		for (int i=0; i<5;i++){
		  System.out.print(word[i]);
		}
	
		System.out.println();
		System.out.println("Please guess a letter:");
		
		letter = input.nextLine();
	  letter = letter.toUpperCase();
	  numguesses++;
		//Checking Letters
	if (Arrays.asList(realword).contains(letter)){
		  if (letter.equals("B")){
			word[0]="B";
		  }
		  if (letter.equals("R")){
			word[1]="R";
		  }
		  if (letter.equals("A")){
			word[2]="A";
		  }
		  if (letter.equals("I")){
			word[3]="I";
		  }
		  if (letter.equals("N")){
			word[4]="N";
		  }
		}
		//Goes to the "guesstime period"
		if (letter.equals("!")){
		  y=1;
		  numguesses--;
		}

    //"guesstime period"
		while (y==1){
			numguesses++;
			System.out.println("What is your guess?");
			guess = input.next();
			if (guess.toUpperCase().equals(wordstring)){
        //exits both loops and goes to the end
				x=1;
				y=0;
			}else{
        //We only need to check for a negative response for our purposes
        System.out.println("Incorrect.");
				System.out.println("Would you like to guess again? Y/N");
				playAgain=input.next();
				if (playAgain.equals("N")){
					y=0;
				}
			}
		}
		  
		System.out.println();
    }
    

    System.out.println("Correct!");
    System.out.println("You guessed: "+numguesses+" times");
    
    
    
  }
}