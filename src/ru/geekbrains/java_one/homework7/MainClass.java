package ru.geekbrains.java_one.homework7;

public class MainClass {
    public static void main(String[] args) {

        Cat cat = new Cat("Murzik", 15);
        Cat cat2 = new Cat("Barsik", 15);
        Cat cat3 = new Cat("Kisa", 15);
        Plate plate1 = new Plate(40);

        Cat[] cats = {cat, cat2, cat3};
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate1);
            plate1.info();
            cats[i].infoCat();
        }

    }
}
