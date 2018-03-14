import javax.swing.JOptionPane;
public class DistanceTraveled
{
   public static void main(String [] args)
   {
   String speed, hours;
   int speed1,hour, hour1,traveled;
   hour = 1;


   speed = JOptionPane.showInputDialog(null,"Enter in the speed traveled in miles per hour format.");
   speed1 = Integer.parseInt(speed);
   
    while (speed1 < 0)
      {
       speed = JOptionPane.showInputDialog(null,"Please enter in a positive number for speed.");
       speed1 = Integer.parseInt(speed);
       }
   
   hours = JOptionPane.showInputDialog(null,"Enter in the total number of hours driven.");
   hour1 = Integer.parseInt(hours);
   
     while (hour1 < 1)
      {
       hours = JOptionPane.showInputDialog(null,"Please enter in a value greater or equal to 1 for hours");
       hour1 = Integer.parseInt(hours); 
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