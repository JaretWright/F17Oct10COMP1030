
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
        
        System.out.printf("Die 1: %d \t Die2: %d%n", die1.getFaceValue(), die2.getFaceValue());
        
        die1.rollDie();
        die2.rollDie();
        
        System.out.printf("Die 1: %d \t Die2: %d%n", die1.getFaceValue(), die2.getFaceValue());
        
        
    }
}
