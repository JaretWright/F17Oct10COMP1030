package f17oct10comp1030;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Scanner;

/**
 *
 * @author JWright
 */
public class WarmUp {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String userName = keyboard.nextLine();
        
        System.out.printf("%s, what year were you born? ", userName);
        int yearBorn = keyboard.nextInt();
        
        System.out.printf("%s, you are %d years old %n", userName, getAge(yearBorn));
        
        System.out.printf("Nathaniel you are %d years old %n", 
                        getAge(LocalDate.of(1992, Month.AUGUST, 26)));
    } //end of main method
    
    /**
     * This method will calculate the age given the year born (assumes the
     * birthday has already passed this year)
     */
    public static int getAge(int yearBorn)
    {
        return LocalDate.now().getYear()-yearBorn;
    }
    
    /**
     * This method will calculate the age based on a LocalDate argument
     * as the birthdate
     */
    public static int getAge(LocalDate birthday)
    {
        return Period.between(birthday, LocalDate.now()).getYears();
    }
}
