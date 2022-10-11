package Homework_01.Chapter_3;

public class TeacherCreditManager extends BaseCreditManager implements ICreditManager {
    @Override
    public void calculate() {
        System.out.println("Teacher credit calculated.");
    }
}
