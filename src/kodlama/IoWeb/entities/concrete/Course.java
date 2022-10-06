package kodlama.IoWeb.entities.concrete;

import kodlama.IoWeb.entities.abstracts.Entity;

import java.util.List;

public class Course implements Entity {

    private  int courseId;
    private String courseName;
    private List<Category> categories;

    private int courseprice;
    private Instructor instructor;

    public Course() {

    }

    public int getCourseprice() {
        return courseprice;
    }

    public void setCourseprice(int courseprice) {
        this.courseprice = courseprice;
    }

    public Course(int courseId, int courseprice , String courseName, List<Category> categories, Instructor instructor) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.categories = categories;
        this.instructor = instructor;
        this.courseprice = courseprice;
    }


        public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }




}
