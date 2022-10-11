package Homework_01.Chapter_2.Bank;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        Person person = new Person();

        person.setNationalIdentity("11111111111");
        System.out.println(person.getNationalIdentity());
        company.setTaxNumber("2222222222 ");
        System.out.println(company.getTaxNumber());

        CustomerManager customerManager2 = new CustomerManager(new Company());
        customerManager2.saved();


        Customer c1 = new Customer();
        Customer c2 = new Company();
        Customer c3 = new Person();
    }
}
