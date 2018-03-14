import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class DistanceTraveledMethod
{
   public static void main(String [] args)
   {
 
   String speed, hours;
   double speed1, hour1;
   DecimalFormat formatter = new DecimalFormat(",#00.00");

   speed = JOptionPane.showInputDialog(null,"Enter in the speed traveled in miles per hour format.");
   speed1 = Double.parseDouble(speed);
   
    while (speed1 <= 0)
      {
       speed = JOptionPane.showInputDialog(null,"Please enter in a positive number for speed.");
       speed1 = Double.parseDouble(speed);
       }
   
   hours = JOptionPane.showInputDialog(null,"Enter in the total number of hours driven.");
   hour1 = Double.parseDouble(hours);
   
     while (hour1 < 1)
      {
       hours = JOptionPane.showInputDialog(null,"Please enter in a value greater or equal to 1 for hours");
       hour1 = Double.parseDouble(hours); 
       }



   double distanceTraveled = distance(speed1, hour1);
   JOptionPane.showMessageDialog(null,formatter.format(distanceTraveled) + " miles is the distance traveled.");
   }
      
      
      
 public static double distance (double speed1, double hour1)
  {
   double traveled = (hour1*speed1);
   return traveled;
   }
   }
   
       
