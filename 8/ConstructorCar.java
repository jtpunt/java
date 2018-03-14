public class ConstructorCar
{
   public static void main(String[] args)
   {
int yearModel;
String make;
int speed;

yearModel = 1993;
make = "Lincoln";
Vehicle car = new Vehicle(yearModel, make);
System.out.println("Year: Make:   Speed:");
System.out.println(car.getYearModel() + "  " + car.getMake() + " " + car.getSpeed()+ "mph");
System.out.println("We are going to accelerate, the speed is now " + car.accelerate(1) + "mph");
System.out.println("We are going to accelerate, the speed is now " + car.accelerate(2)+ "mph");
System.out.println("We are going to accelerate, the speed is now " +car.accelerate(3)+ "mph");
System.out.println("We are going to accelerate, the speed is now " +car.accelerate(4)+ "mph");
System.out.println("We are going to accelerate, the speed is now " +car.accelerate(5)+ "mph");
System.out.println("We are going to brake, the speed is now " + car.brake(1)+ "mph");
System.out.println("We are going to brake, the speed is now " + car.brake(2)+ "mph");
System.out.println("We are going to brake, the speed is now " + car.brake(3)+ "mph");
System.out.println("We are going to brake, the speed is now " + car.brake(4)+ "mph");
System.out.println("We are going to brake, the speed is now " + car.brake(5)+ "mph");

}
}