package f17oct10comp1030;

/**
 *
 * @author JWright
 */
public class ForLoop {
    public static void main(String[] args)
    {
        //print the numbers 1-10 on the screen
        for (int i=1; i<=10;i++)
        {
            System.out.println("i="+i);
        }
        
        //write code that will loop 100,000 times using a for loop
        //the loop should count the amount of times you rolled
        //Box_cars (double 6's) with 2 Dice objects
        Dice die1 = new Dice(6);
        Dice die2 = new Dice(6);
        int boxcarCount=0;
        for (int i=1; i<=100000;i++)
        {
            die1.rollDie();
            die2.rollDie();
            if ((die1.getFaceValue() + die2.getFaceValue()) == 12)
                boxcarCount++;
        }
        
        System.out.printf("We rolled Boxcars (double 6's) %d times in 100,000 rolls.%n", boxcarCount);
    }
}
