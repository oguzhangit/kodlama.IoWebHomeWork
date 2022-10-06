package kodlama.IoWeb;

import kodlama.IoWeb.business.concrete.CategoryManager;
import kodlama.IoWeb.business.concrete.CourseManager;
import kodlama.IoWeb.business.concrete.InstructorManager;
import kodlama.IoWeb.core.logging.abstracts.logger.Logger;
import kodlama.IoWeb.core.logging.concrete.DatabaseLogger;
import kodlama.IoWeb.core.logging.concrete.FileLogger;
import kodlama.IoWeb.dataAccess.concrete.hibernate.HibernateCategoryDao;
import kodlama.IoWeb.dataAccess.concrete.hibernate.HibernateCourseDao;
import kodlama.IoWeb.dataAccess.concrete.hibernate.HibernateInstructorDao;
import kodlama.IoWeb.dataAccess.concrete.jdbc.JdbcCategoryDao;
import kodlama.IoWeb.dataAccess.concrete.jdbc.JdbcCourseDao;
import kodlama.IoWeb.dataAccess.concrete.jdbc.JdbcInstructorDao;
import kodlama.IoWeb.entities.concrete.Category;
import kodlama.IoWeb.entities.concrete.Course;
import kodlama.IoWeb.entities.concrete.Instructor;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) throws Exception {

        Category category1 = new Category(1 , "Web");
        Category category2 = new Category(2 , "yapay zeka");

        ArrayList<Category> categories = new ArrayList<>();
        categories.add(category2 );
        categories.add(category1);


        Instructor instructor1 = new Instructor();
        instructor1.setInstructorFirstName("Engin");
        instructor1.setInstructorLastName("Demiroğ");


        Course course1 = new Course();
        course1.setCourseId(1);
        course1.setCourseprice(1500);
        course1.setCourseName("abc");
        course1.setCategories(categories);
        course1.setInstructor(instructor1);


        ArrayList<Course> courses = new ArrayList<>();

        Logger[] loggers = new Logger[]{
                new FileLogger(),
                new DatabaseLogger()
        };


        CourseManager courseManager = new CourseManager(new JdbcCourseDao() , loggers);
        courseManager.add(course1);

        System.out.println("---------------------------------------------------------------");

        CategoryManager  categoryManager = new CategoryManager(new JdbcCategoryDao() , loggers );
        categoryManager.add(category2);

        System.out.println("---------------------------------------------------------------");

        InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao() , loggers);
        instructorManager.add(instructor1);


    }

}
