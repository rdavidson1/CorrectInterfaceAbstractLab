package lab1;

import javax.swing.JOptionPane;


public class AdvancedJavaCourse extends ProgrammingCourses{
    
private String courseName;

     public AdvancedJavaCourse(String courseName, String courseNumber, double credits) {
        super(courseName, courseNumber, credits);
    }

     @Override
    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }
    


    

    
   
    
    
}
