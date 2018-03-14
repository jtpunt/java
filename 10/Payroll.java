public class Payroll
{
private int [] hours = new int [7]; 
private double [] payRate = new double [7];  
private int [] employeeId = {5658845,4520125,7895122,8777541, 8451277, 1302850, 7580489};
private double [] wages = new double [7]; 
int NUM_EMPLOYEES = 7;


public void setEmployeeIdAt(int i, int id)
{
employeeId[i] = id;
}

public void setHoursAt(int i, int h)
{
hours[i] = h;
}

public void setPayRateAt(int i, double p)
{
payRate[i] = p;
}

public void setWagesAt(int i, double w)
{
wages[i] = w;
}

public int getEmployeeIdAt (int i)
{
return employeeId[i];
}

public int getHoursAt(int i)
{
return hours[i];
}

public double getPayRateAt(int i)
{
return payRate[i];
}

public double getWagesAt(int i)
{
return wages[i];
}

public double getGrossPay(int i)
{
return hours[i] * payRate[i];
}
}

