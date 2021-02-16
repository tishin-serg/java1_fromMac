package ru.geekbrains.java_one.homework6;

public class Dog extends Animal {

    protected static int countDogs = 0;

    public Dog(String name, int runMax, float jumpMax, int swimMax) {
        super(name, runMax, jumpMax, swimMax);
        countDogs++;
    }

    public static int getCountDogs() {
        return countDogs;
    }
}
