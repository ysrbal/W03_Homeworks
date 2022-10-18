package Homework_03.dataAccess.jdbc;

import Homework_03.dataAccess.ICourseDao;
import Homework_03.entities.Course;

public class JdbcCourseDao implements ICourseDao {
    @Override
    public void add(Course course) {
        System.out.println("Added to database with JDBC.");
    }
}
