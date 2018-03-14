import javax.swing.JOptionPane;

public class problemeight
{
   public static void main(String[] args)
   {  
   
   
   double countySalesTax = .04;
   double stateSalesTax = .02;
   double totalSalesTax, finalPrice, convertedPurchase, lastNumber; 
   String stringPurchase;
   
   totalSalesTax = countySalesTax + stateSalesTax;
   

  
   
   System.out.println("\tTotal Cost Calculator");
			stringPurchase=JOptionPane.showInputDialog(null,"Enter the price of the item you bought with two decimal places. (ex. 99.99, not $100 or $99.9)");
         convertedPurchase = Double.parseDouble(stringPurchase);
         
        
        
   JOptionPane.showMessageDialog(null,"The County Sales Tax is " + countySalesTax + 
      " and the State Sales Tax is " + stateSalesTax +". Total Sales Tax is " + totalSalesTax + " or 6%.");
      


   finalPrice = convertedPurchase + (convertedPurchase * totalSalesTax);
   
   lastNumber = finalPrice; // this is to round the finalPrice to two decimal places. 
   lastNumber = Math.round(lastNumber * 100);
   lastNumber = lastNumber/100;



JOptionPane.showMessageDialog(null, "The original purchase price is $" + stringPurchase + 
   ", and the total price is $" + lastNumber + " due to taxes."); 

	}
}


   
   