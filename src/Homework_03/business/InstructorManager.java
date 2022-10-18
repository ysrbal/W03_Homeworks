package Homework_03.business;

import Homework_03.core.logging.ILogger;
import Homework_03.dataAccess.hibernate.HibernateInstructorDao;
import Homework_03.dataAccess.InstructorDao;
import Homework_03.entities.Instructor;

import java.util.List;

public class InstructorManager {
    private InstructorDao instructorDao;
    private ILogger[] loggers;

    public InstructorManager(InstructorDao instructorDao, ILogger[] loggers) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }

    public void add(Instructor instructor) {
        instructorDao.add(instructor);

        for (ILogger logger : loggers) {
            logger.log(instructor.getInstructorName());
        }
    }

}
