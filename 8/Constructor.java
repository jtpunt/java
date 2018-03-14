public class Constructor
{
   public static void main(String[] args)
   {
String name;
int idNumber;
String department;
String position; 

name = "Susan Meyers";
idNumber = 47899;
department = "Accounting";
position = "Vice President";
Employee employee1 = new Employee (name, idNumber, department, position);

name = "Mark Jones";
idNumber = 39119;
department = "IT";
position = "Programmer";
Employee employee2 = new Employee (name, idNumber, department, position);

name = "Joy Rogers";
idNumber = 81774;
department = "Manufacturing";
position = "Engineer";
Employee employee3 = new Employee (name, idNumber, department, position);

System.out.println("Employee Name:" + "    " + "ID Number:" + "   " + "Department:" + "    " + "Position:");
System.out.println(employee1.getName() + "      " + employee1.getidNumber() + "        " + employee1.getDepartment() + "     " + employee1.getPosition());
System.out.println(employee2.getName() + "        " + employee2.getidNumber() + "        " + employee2.getDepartment() + "             " + employee2.getPosition());
System.out.println(employee3.getName() + "        " + employee3.getidNumber() + "        " + employee3.getDepartment() + "  " + employee3.getPosition());
}
}