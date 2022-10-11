package Homework_01.Chapter_3;

public class Main {
    public static void main(String[] args) {
        CustomerManager cm1 = new CustomerManager(new Customer(), new TeacherCreditManager());
        cm1.giveCredit();
        CustomerManager cm2 = new CustomerManager(new Customer(), new MilitaryCreditManager());
        cm2.giveCredit();
        TeacherCreditManager teacherCreditManager = new TeacherCreditManager();
        teacherCreditManager.save();
    }
}
