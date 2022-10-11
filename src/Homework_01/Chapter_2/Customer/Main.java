package Homework_01.Chapter_2.Customer;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setId(1);
        customer.setFirstName("Yasar");
        customer.setLastName("BAL");
        customer.setNationalIdentity("11111111111");
        customer.setCity("Ankara");


        CustomerManager customerManager = new CustomerManager(customer);
        customerManager.Save();
        customerManager.Delete();
    }
}
