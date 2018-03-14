import javax.swing.JOptionPane;
public class DistanceTraveledDouble
{
   public static void main(String [] args)
   {
   String speed, hours;
   int hour;
   hour = 1;
   double speed1, hour1, traveled; 


   speed = JOptionPane.showInputDialog(null,"Enter in the speed traveled in miles per hour format.");
   speed1 = Double.parseDouble(speed);
   
    while (speed1 < 0)
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



      while (hour <= hour1)
      {
      traveled = (hour*speed1);
      JOptionPane.showMessageDialog(null,"Hour " + hour + " and distance traveled is " + traveled + " miles.");
      hour++;
      }
      JOptionPane.showMessageDialog(null,"Report Complete.");
   }
}   