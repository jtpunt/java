import java.util.Scanner;

public class scannerProblemTen
{
 public static void main(String[] args)
   {  
   
   double totalPoints, finalAverage, lastNumber;
   double testOne, testTwo, testThree;
  
   
   Scanner keyboard = new Scanner(System.in);

    
   
    
      System.out.println("This program will find the average of your three test grades," );
      System.out.println("enter each test grade individually with two decimal places.");
      System.out.println("(ex. 97.50, not 98 or 97.5)");
      
      System.out.print("Enter your 1st test grade (ex. 95.50): ");
      testOne = keyboard.nextDouble();

      
      System.out.print("Enter your 2nd test grade (ex. 95.50): ");
      testTwo = keyboard.nextDouble();
   
      System.out.print("Enter your 2nd test grade (ex. 95.50): ");
      testThree = keyboard.nextDouble();
     
      
      totalPoints = (testOne + testTwo + testThree);
      finalAverage = totalPoints / 3;
      
      lastNumber = finalAverage; // this is to round the final average to two decimal places
      lastNumber = Math.round(lastNumber * 100);
      lastNumber = lastNumber/100;
      
      System.out.println("Your test grades are " + testOne +", " + testTwo + ", and " + testThree + ". " );
      System.out.print("Your average test grade is " + lastNumber + "." );
      
       }
}   