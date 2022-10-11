package Homework_01.Chapter_3;

public class MilitaryCreditManager extends BaseCreditManager implements ICreditManager{
    @Override
    public void calculate() {
        System.out.println("Military credit calculated.");
    }
}
