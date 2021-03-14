package ru.geekbrains.java_one.homework7;

public class Cat {
    private String name;
    private int appetite;
    private boolean isFullness;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isFullness = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public void eat (Plate plate1) {
        isFullness = plate1.decreaseFood(appetite);
    }

    public void infoCat() {
        System.out.println(name + " isFulness: " + isFullness);
    }

}
