package Homework_02.Video_38;

public class Main {
    public static void main(String[] args) {
        BaseLogger[] loggers = new BaseLogger[]{new DatabaseLogger(), new EmailLogger(), new FileLogger(), new ConsoleLogger()};
        for (BaseLogger logger : loggers) {
            logger.log("Log message");
        }

        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.add();

    }
}
