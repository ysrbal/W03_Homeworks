package Homework_03.entities;

public class Instructor {
    private int instructorID;
    private String instructorName;
    private int instructorAge;
    private String instructorEmail;

    public Instructor() {
    }

    public Instructor(int instructorID, String instructorName, int instructorAge, String instructorEmail) {
        this.instructorID = instructorID;
        this.instructorName = instructorName;
        this.instructorAge = instructorAge;
        this.instructorEmail = instructorEmail;
    }

    public int getInstructorID() {
        return instructorID;
    }

    public void setInstructorID(int instructorID) {
        this.instructorID = instructorID;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public int getInstructorAge() {
        return instructorAge;
    }

    public void setInstructorAge(int instructorAge) {
        this.instructorAge = instructorAge;
    }

    public String getInstructorEmail() {
        return instructorEmail;
    }

    public void setInstructorEmail(String instructorEmail) {
        this.instructorEmail = instructorEmail;
    }
}
