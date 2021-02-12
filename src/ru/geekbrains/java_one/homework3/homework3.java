package ru.geekbrains.java_one.homework3;

import java.util.Random;
import java.util.Scanner;

public class homework3 {

    private static final Scanner SCANNER = new Scanner(System.in);

    private static final Random RANDOM = new Random();

    private static int tryCount = 3;

    public static void main(String[] args) {

        int userAnswer;
        int answer;
        int answerAfterGame;

        do {
            answer = RANDOM.nextInt(9);
            System.out.println("Введите число от 1 до 9");
            for (int i = 0; i < tryCount; i++) {
                userAnswer = SCANNER.nextInt();
                if (userAnswer == answer) System.out.println("Вы победили");
                if (userAnswer > answer) System.out.println("Загаданное число меньше");
                if (userAnswer < answer) System.out.println("Загаданное число больше");
            }
            System.out.println("Повторить игру ещё раз? 1 – да, 0 — нет");
            answerAfterGame = SCANNER.nextInt();
        } while (answerAfterGame != 0);
        SCANNER.close();
    }
}
