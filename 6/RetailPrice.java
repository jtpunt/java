import java.text.DecimalFormat;  
import javax.swing.JOptionPane;



public class RetailPrice
{
   public static void main(String[] args)
   {
   
   String wholesaleCost, markUp, answerOne;
   double wholesaleCost1, markUp1, finalPriceOne;
   int answerTwo;
   DecimalFormat formatter = new DecimalFormat("$#00.00");
   
   
   JOptionPane.showMessageDialog(null, "This program will calculate an item's retail price.");
   
   wholesaleCost = JOptionPane.showInputDialog(null, "Enter in the item's wholesale cost.");
   wholesaleCost1 = Double.parseDouble(wholesaleCost);
   
   if (wholesaleCost1 < 0)
   {
   wholesaleCost = JOptionPane.showInputDialog(null,"Invalid input, re-enter the item's wholesale cost as a positive number.");
   wholesaleCost1 = Double.parseDouble(wholesaleCost);
   }
   
   markUp = JOptionPane.showInputDialog(null, "Enter in the item's mark up percentage: (Example - Enter in 50 for 50%");
   markUp1 = Double.parseDouble(markUp); 
   
   if (markUp1 < 0)
   {
   markUp = JOptionPane.showInputDialog(null,"Invalid input, re-enter the item's mark up percentage: (Example - Enter in 25 for 25%");
   markUp1 = Double.parseDouble(markUp);
   }
   
   finalPriceOne = calculateRetail(wholesaleCost1,markUp1);
   JOptionPane.showMessageDialog(null,"The final price is " + formatter.format(finalPriceOne) + ".");
   }

   
   
   
   public static double calculateRetail(double num1, double num2)
   {
      double markUpConversion = (num2 + 100)/100;
      double finalPrice = markUpConversion * num1;
      return finalPrice;     
   }
 
}
