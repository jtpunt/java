import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class InternetServiceProviders
{
   public static void main (String[] args)
   {
   String input, hours,statementA;
   double hoursA, totalHours, cost;
   char serviceProvider;
   
   statementA = "Total cost is ";
   
   DecimalFormat formatter = new DecimalFormat("$#00.00");
   
   
   input = JOptionPane.showInputDialog(null, "Enter in your subcription package (A, B, or C).");
   serviceProvider = input.charAt(0);
   
   switch (serviceProvider)
   {
   case 'a':
   case 'A':
   
   hours = JOptionPane.showInputDialog(null, "You have picked package A, enter in the number of hours that were used.");
   hoursA = Double.parseDouble(hours);
   
      if (hoursA > 10)
      {
      totalHours = (hoursA - 10);
      cost = 9.95 + (totalHours * 2.00);
      JOptionPane.showMessageDialog(null, statementA + formatter.format(cost) +".");
      }
   
      else 
      {
     cost = 9.95;
     JOptionPane.showMessageDialog(null, statementA + formatter.format(cost) +".");
      }
     break;
     
   case 'b':
   case 'B':
   
   hours = JOptionPane.showInputDialog(null, "You have picked package B, enter in the number of hours that were used.");
   hoursA = Double.parseDouble(hours);
   
      if (hoursA > 20)
      {
      totalHours = (hoursA - 20);
      cost = 13.95 + (totalHours * 1.00);
      JOptionPane.showMessageDialog(null, statementA + formatter.format(cost)+".");
      }
   
      else 
      {
     cost = 13.95;
     JOptionPane.showMessageDialog(null, statementA + formatter.format(cost)+".");
     }
     break;
     
   case 'c':
   case 'C':
   JOptionPane.showMessageDialog(null, "You have picked package C, total cost is $19.95.");
   break;
   
   default:
         JOptionPane.showMessageDialog(null,"Invalid choice.");

     
   System.exit(0);
      }
   }
}
     
      
   
  
   

  
   

   
  