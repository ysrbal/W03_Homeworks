package Homework_01.Chapter_2.Customer;

public class CustomerManager {
    private Customer customer;

    public CustomerManager(Customer customer) {
        this.customer = customer;
    }

    public void Calculate() {
        System.out.println("Calculated.");
    }

    public void Save() {
        System.out.println("Saved : " + this.customer.getFirstName());
    }

    public void Delete() {
        System.out.println("Deleted : " + this.customer.getFirstName());
    }

}
