public class Vehicle
{
private int yearModel;
private String make;
private int speed;

public Vehicle (int year, String Make)
{
yearModel = year;
make = Make;
speed = 0;
}

public int getYearModel()
{
return yearModel;
}

public String getMake()
{
return make;
}

public int getSpeed()
{
return speed;
}

public int accelerate(int x)
{
speed =+5*x;
return speed;
}

public int brake(int x)
{
speed =-5*x;
return speed;
}
}

