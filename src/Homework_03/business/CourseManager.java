package Homework_03.business;

import Homework_03.core.logging.ILogger;
import Homework_03.dataAccess.ICourseDao;
import Homework_03.entities.Course;

public class CourseManager {
    private ICourseDao courseDao;
    private ILogger[] loggers;

    public CourseManager(ICourseDao courseDao, ILogger[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    public void add(Course course) throws Exception {
        Course[] courses = {new Course(1, "Back-end Development Bootcamp", "1B", 550),
                new Course(2, "Front-end Development Bootcamp", "2F", 450),
                new Course(3, "Java Bootcamp", "3J", 400)};
        for (Course course1 : courses) {
            if (course.getCourseName() == course1.getCourseName()) {
                throw new Exception("The course name cannot be repeated.");
            } else if (course.getCoursePrice() < 0) {
                throw new Exception("The course price cannot be less than 0. ");
            }
        }
        courseDao.add(course);
        for (ILogger logger : loggers) {
            System.out.println(course.getCourseName());
        }
    }
}

