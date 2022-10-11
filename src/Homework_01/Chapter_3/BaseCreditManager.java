package Homework_01.Chapter_3;

public abstract class BaseCreditManager implements ICreditManager {
    @Override
    public abstract void calculate();

    @Override
    public void save() {
        System.out.println("Saved.");
    }
}
