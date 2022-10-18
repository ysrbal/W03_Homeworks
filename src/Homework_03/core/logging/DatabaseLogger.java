package Homework_03.core.logging;

public class DatabaseLogger implements ILogger {
    @Override
    public void log(String data) {
        System.out.println("It is logged to the database : " + data);
    }
}
