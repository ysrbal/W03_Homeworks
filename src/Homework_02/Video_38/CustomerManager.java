package Homework_02.Video_38;

public class CustomerManager {
    private BaseLogger logger;

    public CustomerManager(BaseLogger logger) {
        this.logger = logger;
    }

    public void add() {
        System.out.println("Added");
        this.logger.log("Log Message");

    }
}
