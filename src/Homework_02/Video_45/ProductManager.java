package Homework_02.Video_45;

public class ProductManager {

    public void add(Product product) {

        if (ProductValidator.isValid(product)) {
            System.out.println("Added.");
        } else {
            System.out.println("Invalid entry.");
        }
    }
}
