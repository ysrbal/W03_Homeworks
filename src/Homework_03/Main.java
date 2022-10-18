package Homework_03;

import Homework_03.business.CategoryManager;
import Homework_03.business.CourseManager;
import Homework_03.business.InstructorManager;
import Homework_03.core.logging.DatabaseLogger;
import Homework_03.core.logging.FileLogger;
import Homework_03.core.logging.ILogger;
import Homework_03.core.logging.MailLogger;
import Homework_03.dataAccess.hibernate.HibernateCourseDao;
import Homework_03.dataAccess.hibernate.HibernateInstructorDao;
import Homework_03.dataAccess.jdbc.JdbcCategoryDao;
import Homework_03.dataAccess.jdbc.JdbcInstructorDao;
import Homework_03.entities.Category;
import Homework_03.entities.Course;
import Homework_03.entities.Instructor;


public class Main {


    public static void main(String[] args) throws Exception {
        Instructor instructor1 = new Instructor(1, "Ahmet", 27, "ahmet@ahmet.com");
        Category category1 = new Category();
        Course course1 = new Course();


        ILogger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
        InstructorManager instructorManager1 = new InstructorManager(new HibernateInstructorDao(), loggers);
        CategoryManager categoryManager1 = new CategoryManager(new JdbcCategoryDao(), loggers);
        CourseManager courseManager1 = new CourseManager(new HibernateCourseDao(), loggers);


        instructorManager1.add(instructor1);
        categoryManager1.add(category1);
        courseManager1.add(course1);
    }
}
