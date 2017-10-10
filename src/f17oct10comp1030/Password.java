package f17oct10comp1030;

import java.util.Scanner;

/**
 *
 * @author JWright
 */
public class Password {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.printf("Enter the password: ");
        String pw = keyboard.nextLine();
        
        //loop while the password (pw) does NOT equal the String "tac"
        while (!pw.equalsIgnoreCase("tac"))
        {
            System.out.printf("Enter the correct password next time."
                    + "%nAfter 10 attempts, we will unleash killer bunnies: ");
            pw = keyboard.nextLine();
        }
        
        System.out.printf("Thou shall pass...%n");
    }// end of main method
    
}  //end of class
