public class RetailItemDemo
{
   public static void main(String[] args)
   {
String description;
int unitsOnHand;
double price;

RetailItem item1 = new RetailItem();
item1.setDescription("Jacket");
item1.setUnitsOnHand(12);
item1.setPrice(39.95);

RetailItem item2 = new RetailItem("Designer Jeans", 40, 34.95);

RetailItem item3 = new RetailItem();
item3.setDescription("Shirt");
item3.setUnitsOnHand(20);
item3.setPrice(24.95);

System.out.println("Item1 Description: " + item1.getDescription() + "---Units On Hand: " + item1.getUnitsOnHand() + "---Price: $" + item1.getPrice());
System.out.println("Item2 Description: " + item2.getDescription() + "---Units On Hand: " + item2.getUnitsOnHand() + "---Price: $" + item2.getPrice());
System.out.println("Item3 Description: " + item3.getDescription() + "---Units On Hand: " + item3.getUnitsOnHand() + "---Price: $" + item3.getPrice());
}
}