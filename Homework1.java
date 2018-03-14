import javax.swing.*;
import java.util.*; 
import java.text.DecimalFormat;
public class Homework1
{
public static double total = 0;
    public static void main(String[] args)
    {
    /* Declaring variables */
int k = 0;
int t = 0;

/*Creating an array for days of the week, and the temperature*/   
String[] dayOfWeek = {"Monday's", "Tuesday's","Wednesday's", "Thursday's", "Friday's", "Saturday's", "Sunday's"};
double[] temperature = new double[7];
int l = 0;
while (l = 0)
{
for (int i = 0; i < temperature.length; i++)
  {
     try
     {
     temperature[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter " + dayOfWeek[k] + " temperature in Fahrenheit. ", "TempApp", JOptionPane.QUESTION_MESSAGE));
     while (temperature[i] > 1000 || temperature[i] < -200)
     {
     temperature[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter a temperature between -200 and 1000 for " + dayOfWeek[k] + "in Fahrenheit. ", "TempApp", JOptionPane.QUESTION_MESSAGE));
     } 
     if (i = 6)
     { l++;}
  }  
     catch(NumberFormatException ex)
     {
         int l = 0;
     }
     k++;
  }
}
      /*Calling my methods*/
      double average = calcAverage(temperature);
      float conversion = convertTemp(average);
      displayResults(average, conversion);
}
public static double calcAverage(double[] t)
  {
     for (int i = 0; i < t.length; i ++)
     {
      total += t[i];  
     }
     return (total/7);
  }
public static float convertTemp(double avg)
      {
      float f = (float)avg;
      return ((f - 32)*5)/9;
      }  
public static void displayResults(double a, float c)
   {
   DecimalFormat dec = new DecimalFormat("#.00");
   JOptionPane.showMessageDialog(null, "The weekly average temperature was " + dec.format(a) + " degrees Fahrenheit, \n which was " + dec.format(c) + " degrees Celcius.", "TempApp", JOptionPane.INFORMATION_MESSAGE);
   }     
}

