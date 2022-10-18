package Homework_03.core.logging;

public class MailLogger implements ILogger {
    @Override
    public void log(String data) {
        System.out.println("It is logged to the mail : " + data);
    }
}
