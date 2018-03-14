import javax.swing.JOptionPane;

public class doubleProblemTen
{
 public static void main(String[] args)
   {  
   
   double totalPoints, finalAverage, lastNumber;
   double convTestOne, convTestTwo, convTestThree;
   String testOne,testTwo,testThree;
    
   
    System.out.println("\tAverage Test Grade Calculator");
    
      JOptionPane.showMessageDialog(null,"This program will find the average of your three test grades, enter each test grade individually with two decimal places. (ex. 97.50, not 98 or 97.5)");
     
	   testOne=JOptionPane.showInputDialog(null,"Enter your 1st test grade (ex. 95.50): ");
      convTestOne = Double.parseDouble(testOne); 
      
      testTwo=JOptionPane.showInputDialog(null,"Enter your 2nd test grade (ex. 95.50): ");
      convTestTwo = Double.parseDouble(testTwo);
   
      testThree=JOptionPane.showInputDialog(null,"Enter your 2nd test grade (ex. 95.50): ");
      convTestThree = Double.parseDouble(testThree);
     
      
      totalPoints = (convTestOne + convTestTwo + convTestThree);
      finalAverage = totalPoints / 3;
      
      lastNumber = finalAverage; // this is to round the final average to two decimal places
      lastNumber = Math.round(lastNumber * 100);
      lastNumber = lastNumber/100;
      
      JOptionPane.showMessageDialog(null,"Your test grades are " + testOne +", " + testTwo + ", and " + testThree + ". "  + "Your average test grade is " + lastNumber + "." );
      
       }
}   