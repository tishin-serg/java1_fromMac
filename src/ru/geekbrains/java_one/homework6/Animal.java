package ru.geekbrains.java_one.homework6;

public abstract class Animal {
    static final int SWIM_OK = 1;
    static final int SWIM_FAIL = 0;
    static final int SWIM_NOT = -1;

    protected static int countAnimals = 0;

    protected String name;
    protected int runMax;
    protected float jumpMax;
    protected int swimMax;

    protected Animal (String name, int runMax, float jumpMax, int swimMax) {
        this.name = name;
        this.runMax = runMax;
        this.jumpMax = jumpMax;
        this.swimMax = swimMax;
        countAnimals++;
    }

    protected boolean running(int distance) {
        return (distance <= runMax);
    }

    protected boolean jumping(float high) {
        return (high <= jumpMax);
    }

    protected int swimming(int distance) {
        return (distance <= swimMax) ? SWIM_OK : SWIM_FAIL;
    }

    public String getName() {
        return name;
    }

    public static int getCountAnimals() {
        return countAnimals;
    }
}
