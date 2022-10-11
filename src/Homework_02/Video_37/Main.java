package Homework_02.Video_37;

public class Main {
    public static void main(String[] args) {
    CreditUI creditUI = new CreditUI();
    creditUI.creditCalculate(new TeacherCreditManager());
    creditUI.creditCalculate(new AgriculturalCreditManager());
    }
}
