package Homework_01.Chapter_3;

public class CustomerManager {
    private Customer customer;
    private ICreditManager iCreditManager;

    public CustomerManager(Customer customer, ICreditManager iCreditManager) {
        this.customer = customer;
        this.iCreditManager = iCreditManager;
    }

    public void Calculate() {
        System.out.println("Calculated.");
    }

    public void Save() {
        System.out.println("Saved.");
    }

    public void Delete() {
        System.out.println("Deleted.");
    }

    public void giveCredit() {
        this.iCreditManager.calculate();
        System.out.println("Gave credit.");
    }

}
