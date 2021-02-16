package ru.geekbrains.java_one.homework6;

public class Main {

    protected static final int DISTANCE_RUN = 250;
    protected static final float HIGH_JUMP = 1;
    protected static final int DISTANCE_SWIM = 5;


    public static void main(String[] args) {

        Cat c = new Cat("Till", 200, 2, 0);
        Dog d = new Dog("Poppy", 500, 0.5f, 10);
        Cat c1 = new Cat("Barsik", 400, 4, 0);

        Animal[] zoo = {c, d, c1};

        for (int i = 0; i < zoo.length; i++) {
            if ((zoo[i].running(DISTANCE_RUN))) {
                System.out.printf("%s пробежал %d м\n", zoo[i].getName(), DISTANCE_RUN);
            } else {
                System.out.printf("%s не пробежал %d м\n", zoo[i].getName(), DISTANCE_RUN);
            }
            if ((zoo[i].swimming(DISTANCE_SWIM)) == 1) {
                System.out.printf("%s проплыл %d м\n", zoo[i].getName(), DISTANCE_SWIM);
            } else if ((zoo[i].swimming(DISTANCE_SWIM)) == -1) {
                System.out.printf("%s не умеет плавать\n", zoo[i].getName());
            } else {
                System.out.printf("%s не проплыл %d м\n", zoo[i].getName(), DISTANCE_SWIM);
            }
            if ((zoo[i].jumping(HIGH_JUMP))) {
                System.out.printf("%s перепрыгнул %d м\n", zoo[i].getName(), DISTANCE_RUN);
            } else {
                System.out.printf("%s не перепрыгнул %d м\n", zoo[i].getName(), DISTANCE_RUN);
            }
        }
        System.out.printf("Создано %d котов, %d собак, %d животных", Cat.getCountCats(), Dog.getCountDogs(), Animal.getCountAnimals());
    }
}
