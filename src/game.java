import java.util.Random;
import java.util.Scanner;

public class game { //Class Name
public static void main(String[] args) { //Main Method
        
        int lives = 3; //Initializing Life count to 3
        
        Scanner inputScanner = new Scanner(System.in); //Scanner to take input from user
        System.out.print("Enter your name : ");
        String playerName = inputScanner.nextLine(); //ask player's name
        System.out.println("Welcome "+playerName+" !!"); //Greet the player
        
        while( lives > 0 ){ //while loop to repeat game until life becomes zero
            
            Random randomGenerator = new Random(); //Java's in built Random object
            int secretNumber = randomGenerator.nextInt(10); //Assign random number (0-9)
        
            if (secretNumber == 0) { //assign number as 1 if 0 is generated
                secretNumber = 1;
            } 
            
            
            System.out.print("Please Enter your guess (1-9) : ");
            int playerGuess = inputScanner.nextInt(); // ask player's guess
            
            //show the number guessed by the computer
            System.out.println("Computer guessed the number "+secretNumber);
            
            //check if the guess is right or wrong
            if (secretNumber==playerGuess) { //if player's guess is equal to computer's guess
                System.out.println("Such Guess, Much talent, Wow");
            }else{
                System.out.println("LOL, Nope !!");
                lives = lives - 1; // When guess is wrong, decrease life count by 1
                System.out.println("Current Life Count: "+lives); //print current life count
                }
            
            if (lives==0) { //check if life count is equal to zero
                System.out.println("GAME OVER !! GG ");
            }
        }
      inputScanner.close();
    }
}
