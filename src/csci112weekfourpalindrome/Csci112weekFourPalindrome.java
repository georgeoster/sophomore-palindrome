package csci112weekfourpalindrome;

import java.util.Scanner;

/**
 * Palindrome Application 
 * @author George Oster
 */
public class Csci112weekFourPalindrome { 

    public static void main(String[] args) {
        
        Scanner qwerty = new Scanner(System.in);
        String userString;
        String playAgain;
        int again = 1;
        boolean valid;

        do {
            
            System.out.println("\nyou type whatever you want.");
            System.out.println("i'll tell you if it is a palindrome.");
            System.out.print("go:  ");
            userString = qwerty.nextLine();

     
            if ((userString.length() % 2) == 0) {//length is even
                
                valid = evenChecker(userString, 0);
                if (valid == false) 
                    System.out.println("That is NOT a palindrome.");
                else 
                    System.out.println("CONGRATS!! That is a palindrome!");
                
            } 

      
            else {//length is odd
                
                valid = oddChecker(userString, 0);
                if (valid == false) 
                    System.out.println("That is NOT a palindrome.!");
                else 
                    System.out.println("CONGRATS!! That is a palindrome!");
                
            }


            
            System.out.println("\nWould you like to try again?");
            System.out.println("Type 1 if you would like to try again.");
            System.out.print("Type anything else to exit. ");
            playAgain = qwerty.nextLine();
            
            if ("1".equals(playAgain)) 
                again = 1;
            else 
                again = 0;
            
        } while (again == 1);

    }// end main method



    public static boolean evenChecker(String toTest, int index) { 
        
        boolean valid = false;
        int numLetters = toTest.length() - 1;

        int i;
        for (i = index; i < (numLetters + 1) / 2; i++) {
            
            if (toTest.charAt(i) == toTest.charAt(numLetters - index)) {
                valid = true;
                evenChecker(toTest, index + 1);
            }
            else 
                valid = false;
            
            return valid;
            
        }//end for
        
        return valid;
    } // end evenChecker

    

    public static boolean oddChecker(String toTest, int index) {
        
        boolean valid = false;
        int numLetters = toTest.length() - 1;

        int i;
        for (i = index; i < numLetters / 2; i++) {
            
            if (toTest.charAt(i) == toTest.charAt(numLetters - index)) {
                valid = true;
                oddChecker(toTest, index + 1);
            } else 
                valid = false;
            
            return valid;
        }//end for
        
        return valid;
    } // end oddChecker

}// end class Csci112weekFourPalindrome
