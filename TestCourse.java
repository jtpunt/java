import javax.swing.*;
class TestCourse
{
    public static void main(String[] args)
    {

Course[] course = new Course[3];     
course[0] = new Course("CS101", "Introductory Computer Science", 3);
course[1] = new Course("CS102", "Data Structures", 3);
course[2] = new Course("CS103", "C++ Programming", 4);

System.out.print("****************************************************\n");
System.out.print("     Courses Offered      \n");
System.out.print("****************************************************\n");
System.out.print("Course Id   Course Title                Credit Hours\n");
System.out.print("----------------------------------------------------\n");

for (int i = 0; i < course.length; i++)
{
   System.out.print(course[i].getCourseId() + "       " + course[i].getCourseTitle()  + "        "+ course[i].getCreditHours() + "\n");
}
}}