package kodlama.IoWeb.entities.concrete;

import kodlama.IoWeb.entities.abstracts.Entity;

import java.util.List;

public class Instructor implements Entity {

    private int instructorId;
    private String instructorFirstName;
    private String instructorLastName;
    private List<Course> courses;

    public Instructor(int instructorId, String instructorFirstName, String instructorLastName, List<Course> courses) {
        this.instructorId = instructorId;
        this.instructorFirstName = instructorFirstName;
        this.instructorLastName = instructorLastName;
        this.courses = courses;
    }

    public Instructor() {
    }

    public int getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }

    public String getInstructorFirstName() {
        return instructorFirstName;
    }

    public void setInstructorFirstName(String instructorFirstName) {
        this.instructorFirstName = instructorFirstName;
    }

    public String getInstructorLastName() {
        return instructorLastName;
    }

    public void setInstructorLastName(String instructorLastName) {
        this.instructorLastName = instructorLastName;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }


}
