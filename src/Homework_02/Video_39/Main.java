package Homework_02.Video_39;

public class Main {
    public static void main(String[] args) {
        BaseCreditManager[] creditManagers = new BaseCreditManager[]
                {new AgriculturalCreditManager(), new TeacherCreditManager(), new StudentCreditManager()};
        for (BaseCreditManager creditManager : creditManagers) {
            System.out.println(creditManager.calculate(1000));
        }
    }
}

