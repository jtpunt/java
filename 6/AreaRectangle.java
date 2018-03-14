/**
   You must complete this program so it calculates
   and displays the area of a rectangle. 
*/

import javax.swing.JOptionPane;

public class AreaRectangle
{
   public static void main(String[] args)
   {
      double length,    // The rectangle's length
             width,     // The rectangle's width
             area;      // The rectangle's area
   
      // Get the rectangle's length from the user.
      length = getLength();
   
      // Get the rectangle's width from the user.
      width = getWidth();

      // Get the rectangle's area.
      area = getArea(length, width);

      // Display the rectangle data.
      displayData(length, width, area);
   }
   
   public static double getLength()
   {
   String length1;
   double length;
   length1 = JOptionPane.showInputDialog(null, "Enter in the rectangles length.");
   length = Double.parseDouble(length1);
   return length;
   }
   
   public static double getWidth()
   {
   String width1;
   double width;
   width1 = JOptionPane.showInputDialog(null, "Enter in the rectangles width.");
   width = Double.parseDouble(width1);
   return width;
   }
   
   public static double getArea(double length,double width)
   {
   double area = length * width;
   return area;
   }
   
   public static void displayData (double length,double width, double area)
   {
   JOptionPane.showMessageDialog(null,"The length is " + length +", the width is " + width + ", and the area is " + area + ".");
   
   }
}


