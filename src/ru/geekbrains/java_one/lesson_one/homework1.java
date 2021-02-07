package ru.geekbrains.java_one.lesson_one;

public class homework1 {

    public static float task3 (float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    public static boolean task4 (int a, int b) {
        return a + b <= 20 || a + b >= 10;
    }

    public static void task5 (int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean task6 (int a) {
        return a >= 0;
    }

    public static void task7 (String name) {
        System.out.println("Привет, " + name);
    }

    public static void main(String[] args) {
        int a = 1;
        long b = 1000000L;
        short c = 11;
        byte d = 1;
        char e = 'F';
        float f = 11f;
        double g = 11.1;
        boolean j = true;


    }


}
