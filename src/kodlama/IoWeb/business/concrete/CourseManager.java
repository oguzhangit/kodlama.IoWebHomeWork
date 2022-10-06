package kodlama.IoWeb.business.concrete;

import kodlama.IoWeb.business.abstracts.CourseService;
import kodlama.IoWeb.core.logging.abstracts.logger.Logger;
import kodlama.IoWeb.dataAccess.abstracts.CourseDao;
import kodlama.IoWeb.dataAccess.concrete.hibernate.HibernateCourseDao;
import kodlama.IoWeb.entities.concrete.Course;

import java.util.ArrayList;

public class CourseManager implements CourseService {

    private CourseDao courseDao;
    private Logger[] loggers;

    public CourseManager(CourseDao courseDao , Logger[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;

    }


    @Override
    public void add(Course course) throws  Exception {

        Course course1 = new Course();
        course1.setCourseName("Java");
        course1.setCourseprice(500);
        Course course2 = new Course();
        course1.setCourseName("C#");

        ArrayList<Course> courses = new ArrayList<>();
        courses.add(course1);

        for (Course c : courses)  {
            if (c.getCourseName() == course.getCourseName())
            {
                throw new Exception("Kurs ismi tekrar edemez");
            }
            if (c.getCourseprice() < 0)
            {
                throw new Exception("Kurs fiyatı 0 dan küçük olamaz");
            }
        }

        for (Logger logger : loggers)
        {
            logger.log(course.getCourseName());
        }


        courseDao.add(course);
    }
}
