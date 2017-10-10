package f17oct10comp1030;

import java.security.SecureRandom;

/**
 *
 * @author JWright
 */
public class Dice {
    //define our PRIVATE instance variables (things that get set everytime
    //we create new Dice objects
    private int numOfSides, faceValue;
    
    /**
     * This is the constructor. It is just like a method, but does not have 
     * any return type.  The goal of this is to set the instance variables and
     * create a new object
     * @param numberOfSides valid amounts are 4-100
     */
    public Dice(int numberOfSides)
    {
        if (numberOfSides >= 4 && numberOfSides <= 100)
            numOfSides = numberOfSides; //it is a valid input, so set the instance variable
        else
            throw new IllegalArgumentException("Number of sides must be 4-100");
        rollDie();
    }//end of constructor
    
    
    /**
     * This method will simulate rolling the die with a pseudo random number
     */
    public void rollDie()
    {
        //this is a random number generator
        SecureRandom rng = new SecureRandom();
        faceValue = rng.nextInt(numOfSides)+1;
    }
    
    public int getFaceValue()
    {
        return faceValue;
    }
}
