package Homework_01.Chapter_2.Bank;

public class CustomerManager {
    private Customer customer;

    public CustomerManager (Customer customer){
        this.customer = customer;
    }

    public void saved(){
        System.out.println("Saved.");
    }

    public void deleted(){
        System.out.println("Deleted.");
    }
}