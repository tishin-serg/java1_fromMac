package ru.geekbrains.java_one.homework7;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("Plate contains: " + food);
    }

    public boolean decreaseFood(int count) {
        if (food >= count) {
            food = food - count;
            return true;
        } else {
            System.out.println("Cat can't eat. Plate contains less food than cat's appetite");
            return false;
        }
    }

    public void increaseFood(int count) {
        food += count;
    }
}
