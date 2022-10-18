package Homework_03.entities;

public class Course {
    private int courseID;
    private String courseName;
    private String courseCode;
    private int coursePrice;

    public Course(int courseID, String courseName, String courseCode, int coursePrice) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.coursePrice = coursePrice;
    }

    public Course() {
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public int getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(int coursePrice) {
        this.coursePrice = coursePrice;
    }
}
