import java.util.*;

public class RandomNumber {
    public static void main(String[] args) {
        System.out.println("hello welcome to the guessing game.Press 1 to start the game!");
      // create an instance of the Scanner class
        Scanner s = new Scanner(System.in);
        int restart = s.nextInt();
          do {
           // ask user to take a choose a difficulty
           System.out.println("what difficulty you want? (Enter the number)");
           System.out.println("1. Baby");
           System.out.println("2. Medium");
           System.out.println("3. Nightmare");
           int userMode = s.nextInt();
           // System.out.println(numGroups);

           int maximum=0;

           if (userMode == 1) {
             System.out.println("Welcome to baby ( not the literal Da Baby) mode, guess a number from 1 - 10");
             maximum = 10;
           }
           else if (userMode == 2) {
               System.out.println("Welcome to medium mode, guess a number from 1 - 100");
               maximum = 100;
           }
           else{
             System.out.println("Welcome to Nightmare mode you kmight want to stop if dont want to lose your sanity, guess a number from 1 - 1000");
             maximum = 1000;
           }
           // determine random number
           int randomChoice = (int)(Math.random()*maximum + 1);
           //System.out.println(randomChoice);
           int userGuess = s.nextInt();
           //while loop for incorrect answer so user can re enter a number
             while(randomChoice != userGuess){
               if (userGuess > randomChoice){
               System.out.println("Take another guess.Your guess is too high.");
               }
             else{
               System.out.println("Take another guess.Your guess is too low.");
               }
               userGuess = s.nextInt();
               //System.out.println("User guess" + userGuess);
                 }
             if (userGuess == randomChoice){
             System.out.println("your guess is correct");
               }
             System.out.println("would you like to play again?(Enter the number)");
             System.out.println("1.Yes");
             System.out.println("2.No");
             restart = s.nextInt();
          } while (restart == 1);
          s.close();
    }// end main method
}// end class
