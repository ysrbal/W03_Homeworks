package Homework_02.Video_40;

public class Main {
    public static void main(String[] args) {
        GameCalculator gameCalculator = new WomanGameCalculator();
        gameCalculator.calculate();
        gameCalculator.gameOver();
    }
}
