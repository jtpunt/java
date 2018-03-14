import javax.swing.JOptionPane;

public class SoftwareSales1
{
   public static void main (String[] args)
   {
   String amount, discount1;
   int quantity; 
   double discount, price, finalPrice;
   price = 99;
   
   amount = JOptionPane.showInputDialog(null, "Enter in the number of packages purchased.");
   quantity = Integer.parseInt(amount);
   
   if (quantity < 10)
   {
   discount1 = "0";
      discount = 0;
      }
      else if ((quantity < 20) && (quantity  > 9))
      {
      discount1 = "20";
      discount = .20;
         }
         else if ((quantity < 50) && (quantity > 19))
         {
         discount1 = "30";
          discount = .30;
             }
             else if ((quantity < 100) && (quantity > 49))
            {
            discount1 = "40";
            discount = .40;
   }
    else 
   {
   discount1 = "50";
      discount = .50;
      }
   
   finalPrice = (quantity * price) * (1 - discount);

   JOptionPane.showMessageDialog(null,"Your discount is " + discount1 + "%" + ". And your final price is $" +  finalPrice);
   
   System.exit(0);
   }
}