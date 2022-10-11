package Homework_01.Chapter_3;

public class Customer {
    private int id;
    private String FirstName;
    private String LastName;
    private String NationalIdentity;
    private String City;

    public Customer(int id, String firstName, String lastName, String nationalIdentity, String city) {
        this.id = id;
        FirstName = firstName;
        LastName = lastName;
        NationalIdentity = nationalIdentity;
        City = city;
    }

    public Customer(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getNationalIdentity() {
        return NationalIdentity;
    }

    public void setNationalIdentity(String nationalIdentity) {
        NationalIdentity = nationalIdentity;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }
}
