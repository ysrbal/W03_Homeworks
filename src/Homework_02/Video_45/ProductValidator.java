package Homework_02.Video_45;

public class ProductValidator {

    static {
        System.out.println("Static block ran.");
    }
    public static boolean isValid(Product product) {
        if (product.price > 0 && !product.name.isEmpty()){
            return true;
        }else {
            return false;
        }
    }

}
