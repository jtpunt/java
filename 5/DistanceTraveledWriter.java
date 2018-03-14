import java.util.Scanner;   // Needed for Scanner class
import java.io.*;    // Needed for File I/O classes
public class DistanceTraveledWriter
{
   public static void main(String [] args)throws IOException
   {
   String filename, text;
   int hour;
   hour = 1;
   double speed1, hour1, traveled; 
   
   Scanner keyboard = new Scanner(System.in);

   System.out.print("Enter in the speed traveled in miles per hour format.");
   speed1 = keyboard.nextDouble();
   


    while (speed1 < 0)
      {
       System.out.print("Please enter in a positive number for speed.");
       speed1 = keyboard.nextDouble();
       }
   
   System.out.print("Enter in the total number of hours driven.");
   hour1 = keyboard.nextDouble();
   
     while (hour1 < 1)
      {
       System.out.print("Please enter in a value greater or equal to 1 for hours");
       hour1 = keyboard.nextDouble(); 
       }
       
       keyboard.nextLine();
   
   
   System.out.print("Enter the filename: ");
   filename = keyboard.nextLine();
   
   PrintWriter outputFile = new PrintWriter(filename);



      while (hour <= hour1)
      {
      traveled = (hour*speed1);
      text = ("Hour " + hour + " and distance traveled is " + traveled + " miles.");
      outputFile.println(text);
      System.out.println(text);
      hour++;

      }
      outputFile.close();
      System.out.print("Report Complete.");
   }
}   