import java.util.Scanner;
import java.io.*;
 
public class UpperCase
{
        public static void main(String[] args)throws IOException
        {

          Scanner scan= new Scanner(System.in);
           
          System.out.print("Enter the first file name: (HINT: lower.txt)");
          String filename1 = scan.nextLine();
          System.out.print("Enter the Second file name");
          String filename2= scan.nextLine();
           
          File myFile =new File(filename1);
          Scanner inputFile= new Scanner(myFile);
          PrintWriter outputFile = new PrintWriter(filename2);
            
          while (inputFile.hasNextLine())
          {
            String fileRead = inputFile.nextLine();
            String upperFileinput = fileRead.toUpperCase();
            outputFile.println(upperFileinput);
   
            
            }
             inputFile.close();
            outputFile.close();
}
}
