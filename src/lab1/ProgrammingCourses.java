/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1;

import javax.swing.JOptionPane;

/**
 *
 * @author Ryan
 */
public abstract class ProgrammingCourses {
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public ProgrammingCourses(String courseName, String courseNumber, double credits) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
        this.credits = credits;
    }

    public String getCourseName() {
        return courseName;
    }

    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }

    public double getCredits() {
        return credits;
    }



    public String getPrerequisites() {
        return prerequisites;
    }


    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);}
        
        this.prerequisites = prerequisites;
    }
    
    
    public String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }
    
    
    public void setCredits(double credits) {
        if(credits < 0 || credits > 5.0) {
            System.out.println(
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.setCredits(credits);
    }
}
    

   