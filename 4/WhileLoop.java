import javax.swing.JOptionPane;
public class WhileLoop
{
   public static void main(String [] args)
   {
   
   String input;
   int number,number0, total;

  
   

   
   input = JOptionPane.showInputDialog("Enter a positive integer and I'll calculate the sum total of all numbers from 0 to your chosen number.");
   number = Integer.parseInt(input);
   number0 = number;
   total = ((number*(number + 1))/2);
   

     

      while ((number > 0) && (number <= number0))
     
      {
          JOptionPane.showMessageDialog(null, total + " is your total sum.");
          number++;
      }

   }
}