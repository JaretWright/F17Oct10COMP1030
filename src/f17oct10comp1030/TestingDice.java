
package f17oct10comp1030;

import java.util.Scanner;

/**
 *
 * @author JWright
 */
public class TestingDice {
    public static void main(String[] args)
    {
        //Class     variable name     Constructor
        Scanner     keyboard    = new Scanner(System.in);
        Dice        die1        = new Dice(6);
        Dice        die2        = new Dice(6);
        
        //initial count
        int count = 1;
        
        //loop while we do not have snake eyes
        while (die1.getFaceValue() + die2.getFaceValue() != 2)
        {
            System.out.printf("%d.  Die 1: %d \t Die2: %d%n", count, die1.getFaceValue(), die2.getFaceValue());
            count++;
            die1.rollDie();
            die2.rollDie();
        }
        
        System.out.printf("%d.  Die 1: %d \t Die2: %d%n",count, die1.getFaceValue(), die2.getFaceValue());
        System.out.printf("It took %d attempts to roll snake eyes%n", count);
        
        
    }
}
