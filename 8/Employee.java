public class Employee
{
private String name;
private int idNumber;
private String department;
private String position; 

public Employee()
{
name = "";
idNumber = 0;
department = "";
position = "";
}

public Employee(String x1, int x2, String x3, String x4)
{
name = x1;
idNumber = x2;
department = x3;
position = x4; 
}

public Employee(String x1, int x2)
{
name = x1;
idNumber = x2;
}

public String getName()
{
return name;
}

public int getidNumber()
{
return idNumber;
}

public String getDepartment()
{
return department;
}

public String getPosition()
{
return position;
}



}
