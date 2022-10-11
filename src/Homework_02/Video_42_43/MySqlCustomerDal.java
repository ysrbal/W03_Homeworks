package Homework_02.Video_42_43;

public class MySqlCustomerDal implements ICustomerDal, IRepository {
    @Override
    public void add() {
        System.out.println("Added : MySql");
    }
}
