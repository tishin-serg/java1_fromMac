package ru.geekbrains.java_one.lesson_one;

public class lesson1 {

    private static void checkCoordinates(int x, int y) {
        int fieldSizeX = 3;
        int fieldSizeY = 3;

        boolean outOfx = x >= fieldSizeX;
        boolean outOfy = y >= fieldSizeY;
        boolean lessField = x < 0 || y < 0;

        if (outOfx || lessField) {
            System.out.println("Вы вышли за пределы поля X");
            if (outOfy || lessField) {
                System.out.println("Вы вышли за пределы поля Y");
            }
        }
    }

    private static int sumOfThreeNumbers(int x, int y, int z) {
        return x + y + z;
    }

    private static void helloUser (String nickName) {
        System.out.println ("Hello " + nickName);
    }

    public static void main(String[] args) {

        int userInputX = 3;
        int userInputY = 1;

        checkCoordinates(userInputX, userInputY);
        checkCoordinates(1, 5);

        int i = sumOfThreeNumbers(1,2,3);
        System.out.println(i);

        helloUser("Sergey");


    }

}
