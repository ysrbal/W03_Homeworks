package Homework_03.business;

import Homework_03.core.logging.ILogger;
import Homework_03.dataAccess.ICategoryDao;
import Homework_03.entities.Category;

public class CategoryManager {
    private ICategoryDao categoryDao;
    private ILogger[] loggers;

    public CategoryManager(ICategoryDao categoryDao, ILogger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }

    public void add(Category category) throws Exception {
        Category[] categories = {new Category(1, "Back-end", "1B"),
                new Category(2, "Front-end", "2F"),
                new Category(3, "Java", "3J")};
        for (Category category1 : categories) {
            if (category.getCategoryName() == category1.getCategoryName()) {
                throw new Exception ("The category name cannot be repeated.");
            }
        }
        categoryDao.add(category);
        for (ILogger logger : loggers) {
            System.out.println(category.getCategoryName());

        }
    }
}
