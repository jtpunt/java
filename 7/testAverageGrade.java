import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class testAverageGrade
{
   public static void main(String[] args)
   {
String input1, input2, input3, input4, input5;
double test1, test2, test3, test4, test5, average;
char letterGrade,singleGrade;
DecimalFormat formatter = new DecimalFormat(",#00.00");

input1 = JOptionPane.showInputDialog(null, "Enter in your 1st test Grade: ");
test1 = Double.parseDouble(input1);

while ((test1 > 100) || (test1 < 0))
{
input1 = JOptionPane.showInputDialog(null, "Invalid: Reenter a grade between 0 and 100. ");
test1 = Double.parseDouble(input1);
}
singleGrade = determineGrade(test1);
letterGrade(singleGrade);

   input2 = JOptionPane.showInputDialog(null, "Enter in your 2nd test Grade: ");
   test2 = Double.parseDouble(input2);
   while ((test2 > 100) || (test2 < 0))
   {
   input2 = JOptionPane.showInputDialog(null, "Invalid: Reenter a grade between 0 and 100. ");
   test2 = Double.parseDouble(input2);
   }
   singleGrade = determineGrade(test2);
   letterGrade(singleGrade);
   
      input3 = JOptionPane.showInputDialog(null, "Enter in your 3rd test Grade: ");
      test3 = Double.parseDouble(input3);
      while ((test3 > 100) || (test3 < 0))
      {
      input3 = JOptionPane.showInputDialog(null, "Invalid: Reenter a grade between 0 and 100. ");
      test3 = Double.parseDouble(input3);
      }
      singleGrade = determineGrade(test3);
      letterGrade(singleGrade);
      
         input4 = JOptionPane.showInputDialog(null, "Enter in your 4th test Grade: ");
         test4 = Double.parseDouble(input4);
         while ((test4 > 100) || (test4 < 0))
         {
         input4 = JOptionPane.showInputDialog(null, "Invalid: Reenter a grade between 0 and 100. ");
         test4 = Double.parseDouble(input4);
         }
         singleGrade = determineGrade(test4);
         letterGrade(singleGrade);
input5 = JOptionPane.showInputDialog(null, "Enter in your 5th test Grade: ");
test5 = Double.parseDouble(input5);
while ((test5 > 100) || (test5 < 0))
{
input5 = JOptionPane.showInputDialog(null, "Invalid: Reenter a grade between 0 and 100. ");
test5 = Double.parseDouble(input5);
}
singleGrade = determineGrade(test5);
letterGrade(singleGrade);

average = calcAverage(test1,test2,test3,test4,test5);
letterGrade = determineGrade(average);

JOptionPane.showMessageDialog(null, "Your final average is " + formatter.format(average) + ", and your letter grade is " + letterGrade + ".");
}


public static double calcAverage (double test1,double test2,double test3,double test4,double test5)
{
double total = (test1 + test2 + test3 + test4 + test5);
double average = total/5;
return average;
}

public static char determineGrade (double average)
{
char testGrade;
if (average < 60)
testGrade = 'F';
else if (average < 70)
testGrade = 'D';
else if (average < 80)
testGrade = 'C';
else if (average < 90)
testGrade = 'B';
else 
testGrade = 'A';

return testGrade;
}


public static void letterGrade (char grade)
{
switch (grade)
{
case 'A':
JOptionPane.showMessageDialog(null,"You made an A!");
break;
case 'B':
JOptionPane.showMessageDialog(null,"You made an B!");
break;
case 'C':
JOptionPane.showMessageDialog(null,"You made an C!");
break;
case 'D':
JOptionPane.showMessageDialog(null,"You made an D!");
break;
case 'F':
JOptionPane.showMessageDialog(null,"You made an F!");
break;
}
}
}