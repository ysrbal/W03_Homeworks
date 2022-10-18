package Homework_03.dataAccess.jdbc;

import Homework_03.dataAccess.InstructorDao;
import Homework_03.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {
    public void add(Instructor instructor) {
        System.out.println("Added to database with JDBC.");
    }


}
