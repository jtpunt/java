import javax.swing.JOptionPane;
public class TestScoresGrade
{
   public static void main(String[] args)
   {
   String input1, input2, input3;
   double test1, test2, test3,testTotal, avgTest;
   
   input1 = JOptionPane.showInputDialog(null, "Enter in your 1st test grade with up to two decimal places.");
   test1 = Double.parseDouble(input1); 
   
   input2 = JOptionPane.showInputDialog(null, "Enter in your 2nd test grade with up to two decimal places.");
   test2 = Double.parseDouble(input2);
   
   input3 = JOptionPane.showInputDialog(null, "Enter in your 3rd test grade with up to two decimal places.");
   test3 = Double.parseDouble(input3);
   
   testTotal = test1 + test2 + test3;
   avgTest = (testTotal / 3);
   
   
   if (avgTest < 60)
      JOptionPane.showMessageDialog(null, "Your grade is F.");
   
   else if (avgTest < 70)
      JOptionPane.showMessageDialog(null, "Your grade is D.");
   
   else if (avgTest < 80)
      JOptionPane.showMessageDialog(null, "Your grade is C.");
   
   else if (avgTest < 90)
      JOptionPane.showMessageDialog(null, "Your grade is B.");
   
   else 
       JOptionPane.showMessageDialog(null, "Your grade is A .");

   
   JOptionPane.showMessageDialog(null,"Your test score average is an " 
                                 + Math.round(avgTest) + ","
                                 + " and your 3 test scores were " + test1 + ", " + test2 + ", and " + test3 +".");
   
    
   System.exit(0);
   }
}

