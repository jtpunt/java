import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class bankCharges
{
public static void main (String[] args)
   {

String input,cost1,statementA,statementB; 
double finalPrice,basePrice,cost;
int input1;

statementA = "Checks will cost ";
statementB = "Your bill this month is ";
basePrice = 10.00;
DecimalFormat formatter = new DecimalFormat("$#00.00");

input = JOptionPane.showInputDialog(null, "Enter in the number of checks written for the month so we can estimate your bill.");
input1 = Integer.parseInt(input);

if (input1 < 20)
 {
   cost1 = ".10";
   cost = .10;
      }
      else if ((input1 < 40) && (input1  > 19))
      {
      cost1 = ".08";
      cost = .08;
         }
         else if ((input1 < 60) && (input1 > 39))
         {
         cost1 = ".06";
         cost = .06;
             }
 else 
  {
   cost1 = ".04";
   cost = .04;
   }
   
   
   
   
finalPrice = ((cost * input1) + basePrice);

JOptionPane.showMessageDialog(null,statementA + formatter.format(cost) + " each. " + statementB + formatter.format(finalPrice) + ".");

System.exit(0);
      }
}
