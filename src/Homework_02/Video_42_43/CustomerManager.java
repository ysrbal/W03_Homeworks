package Homework_02.Video_42_43;

public class CustomerManager {
    private ICustomerDal customerDal;


    public CustomerManager(ICustomerDal customerDal){
        this.customerDal = customerDal;
    }
    public void add() {
        customerDal.add();
    }
}
