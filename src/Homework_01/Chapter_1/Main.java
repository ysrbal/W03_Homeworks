package Homework_01.Chapter_1;

public class Main {
    public static void main(String[] args) {
        int sayi1 = 10;
        int sayi2 = 20;
        sayi1 = sayi2;
        sayi2 = 100;
        System.out.println(sayi1);// 20
        ////////////////////////////////
        int[] sayilar1 = { 1, 2, 3 };
        int[] sayilar2 = { 4, 5, 6 };
        sayilar1 = sayilar2;
        sayilar2[0] = 100;
        //////////////////////////////////
        System.out.println(sayilar1[0]);// 100
    }
}