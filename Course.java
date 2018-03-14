public class Course
{
private String courseId;
private String courseTitle;
private int creditHours;

public Course()
{
   courseId = "";
   courseTitle = "";
   creditHours = 0;
}
//init constructor
public Course(String courseId, String courseTitle, int creditHours)
{
   this.courseId = courseId;
   this.courseTitle= courseTitle;
   this.creditHours = creditHours;
}
//getters
public String getCourseId() {return courseId;}
public String getCourseTitle() {return courseTitle;}
public int getCreditHours() {return creditHours;}
//setters
public void setCourseId(String courseId) {this.courseId = courseId;}
public void setCourseTitle(String courseTitle) {this.courseTitle = courseTitle;}
public void setCreditHours(int courseHours) {this.creditHours = creditHours;}
}