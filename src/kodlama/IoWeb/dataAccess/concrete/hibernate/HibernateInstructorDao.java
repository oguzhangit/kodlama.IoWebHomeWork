package kodlama.IoWeb.dataAccess.concrete.hibernate;

import kodlama.IoWeb.dataAccess.abstracts.InstructorDao;
import kodlama.IoWeb.entities.concrete.Instructor;

public class HibernateInstructorDao implements InstructorDao {
    @Override
    public void add(Instructor instructor) {
        System.out.println(instructor.getInstructorFirstName() + " " + instructor.getInstructorLastName() + " : Eğitmeni Hibernate İle Eklendi");
    }
}
