package ru.geekbrains.java_one.homework6;

public class Cat extends Animal {

    public static int countCats = 0;

    public Cat(String name, int runMax, float jumpMax, int swimMax) {
        super(name, runMax, jumpMax, swimMax);
        countCats++;
    }

    @Override
    protected int swimming(int distance) {
        return Animal.SWIM_NOT;
    }

    public static int getCountCats() {
        return countCats;
    }
}
