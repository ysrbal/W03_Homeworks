package Homework_03.entities;

public class Category {
    private int categoryID;
    private String categoryName;
    private String categoryCode;

    public Category() {
    }

    public Category(int categoryID, String categoryName, String categoryCode) {
        this.categoryID = categoryID;
        this.categoryName = categoryName;
        this.categoryCode = categoryCode;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }
}
