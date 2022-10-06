package kodlama.IoWeb.dataAccess.concrete.jdbc;

import kodlama.IoWeb.dataAccess.abstracts.CourseDao;
import kodlama.IoWeb.entities.concrete.Course;

public class JdbcCourseDao implements CourseDao {
    @Override
    public void add(Course course) {
        System.out.println(course.getCourseName() + ": Jdbc İle Eklendi");
    }
}
