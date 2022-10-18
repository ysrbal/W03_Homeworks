package Homework_03.dataAccess.hibernate;

import Homework_03.dataAccess.ICategoryDao;
import Homework_03.entities.Category;

public class HibernateCategoryDao implements ICategoryDao {
    @Override
    public void add(Category category) {
        System.out.println("Added to database with Hibernate.");
    }
}
