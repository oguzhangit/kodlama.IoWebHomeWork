package kodlama.IoWeb.business.concrete;

import kodlama.IoWeb.business.abstracts.InstructorService;
import kodlama.IoWeb.core.logging.abstracts.logger.Logger;
import kodlama.IoWeb.dataAccess.abstracts.InstructorDao;
import kodlama.IoWeb.entities.concrete.Instructor;

public class InstructorManager implements InstructorService {

    private InstructorDao instructorDao;
    private Logger[] loggers;

    public InstructorManager(InstructorDao instructorDao , Logger[] loggers) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }

    @Override
    public void add(Instructor instructor) {

        for (Logger logger : loggers)
        {
            logger.log(instructor.getInstructorFirstName());
        }
        instructorDao.add(instructor);
    }
}
