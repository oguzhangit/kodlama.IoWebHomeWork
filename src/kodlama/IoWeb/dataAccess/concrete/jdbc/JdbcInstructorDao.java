package kodlama.IoWeb.dataAccess.concrete.jdbc;

import kodlama.IoWeb.dataAccess.abstracts.InstructorDao;
import kodlama.IoWeb.entities.concrete.Instructor;

public class JdbcInstructorDao implements InstructorDao {
    @Override
    public void add(Instructor instructor) {
        System.out.println(instructor.getInstructorFirstName() + " " + instructor.getInstructorLastName() + " : Jdbc ile eklendi ");
    }
}
