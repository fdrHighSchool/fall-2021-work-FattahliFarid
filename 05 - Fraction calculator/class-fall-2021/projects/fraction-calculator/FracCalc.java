import java.util.*;

public class FracCalc {

    /**
     * Prompts user for input, passes that input to produceAnswer, then outputs the result.
     * @param args - unused
     */
    public static void main(String[] args){
     Scanner s = new Scanner(System.in);
     System.out.println("Hey.Welcome to the fraction calculator.");
     boolean play = true ;
     do {
       System.out.println("please enter 2 fractions with a operator");
       String fraction = s.nextLine() ;

       if (fraction.equals("quit")) {
         play = false;
       }
       produceAnswer(fraction);
     } while(play) ;
          // System.out.println(fraction);
        // TODO: Read the input from the user and call produceAnswer with an equation
        // Checkpoint 1: Create a Scanner, read one line of input, pass that input to produceAnswer, print the result.
        // Checkpoint 2: Accept user input multiple times.
    }//end main method

    /**
     * produceAnswer - This function takes a String 'input' and produces the result.
     * @param input - A fraction string that needs to be evaluated.  For your program, this will be the user input.
     *      Example: input ==> "1/2 + 3/4"
     * @return the result of the fraction after it has been calculated.
     *      Example: return ==> "1_1/4"
     */
    public static String produceAnswer(String input){
      int space = input.indexOf (" ");
      String  frac1 = input.substring(0, space);
      //System.out.println(frac1);
      String  frac2 = input.substring(space + 3);
      String oper = input.substring(space + 1,space + 2);
      //System.out.println(frac2);
      String num1 = GetNum(frac1);
      System.out.println(num1);
      String num2 = GetNum2(frac2);
      System.out.println(num2);
      return "";
      }
    public static String GetNum(String frac1){
      int oper2 = frac1.indexOf ("/");
      String num = frac1.substring (0, oper2);
      System.out.println(num);
      return "";
        }
    public static String GetNum2(String frac2){
      int oper2 = frac2.indexOf ("/");
      String num2 = frac2.substring (0, oper2);
      System.out.println(num2);
      return "";
        }
    public static String GetDen(String frac1){

    }
        //System.out.println(oper);

        // TODO: Implement this function to produce the solution to the input
        // Checkpoint 1: Return the second operand.  Example "4/5 * 1_2/4" returns "1_2/4".
        // Checkpoint 2: Return the second operand as a string representing each part.
        //               Example "4/5 * 1_2/4" returns "whole:1 numerator:2 denominator:4".
        // Checkpoint 3: Evaluate the formula and return the result as a fraction.
        //               Example "4/5 * 1_2/4" returns "6/5".
        //               Note: Answer does not need to be reduced, but it must be correct.
        // Final project: All answers must be reduced.
        //               Example "4/5 * 1_2/4" returns "1_1/5".


    }//end produceAnswer method

    // TODO: Fill in the space below with helper methods

    /**
     * greatestCommonDivisor - Find the largest integer that evenly divides two integers.
     *      Use this helper method in the Final Checkpoint to reduce fractions.
     * @param a - First integer.
     * @param b - Second integer.
     * @return The GCD.
     */
  //  public static int greatestCommonDivisor(int a, int b){

  //  }//end greatestCommonDivisor method

    /**
     * leastCommonMultiple - Find the smallest integer that can be evenly divided by two integers.
     *      Use this helper method in Checkpoint 3 to evaluate expressions.
     * @param a - First integer.
     * @param b - Second integer.
     * @return The LCM.
     */
  //  public static int leastCommonMultiple(int a, int b){

  //  }//end leastCommonMultiple
  //end class
