package kodlama.IoWeb.dataAccess.concrete.hibernate;

import kodlama.IoWeb.dataAccess.abstracts.CourseDao;
import kodlama.IoWeb.entities.concrete.Category;
import kodlama.IoWeb.entities.concrete.Course;


import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class HibernateCourseDao implements CourseDao {




    @Override
    public void add(Course course) {
        System.out.println(course.getCourseName() + ": Kursu Hibernate İle Eklendi");


    }







}
