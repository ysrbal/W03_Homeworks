package Homework_03.dataAccess.hibernate;

import Homework_03.dataAccess.InstructorDao;
import Homework_03.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {
    @Override
    public void add(Instructor instructor) {
        System.out.println("Added to database with Hibernate.");
    }
}
