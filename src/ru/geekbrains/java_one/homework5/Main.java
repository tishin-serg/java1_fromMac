package ru.geekbrains.java_one.homework5;

public class Main {
    public static void main(String[] args) {

        Employe[] array = new Employe[5];
        array[0] = new Employe("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        array[1] = new Employe("Petr Sidorov", "dustman", "rubbish112@gmail.com", "89961234567", 25000, 29);
        array[2] = new Employe("Alex Petrov", "manager", "alex13@gmail.com", "89923347766", 40000, 41);
        array[3] = new Employe("Oleg Ivanov", "chairman", "boss123@gmail.com", "89961230000", 125000, 42);
        array[4] = new Employe("Elena Kozlova", "assistant", "812elena@gmail.com", "89963322111", 20000, 23);

        for (int i = 0; i < array.length; i++) {
            if (array[i].getAge() > 40) {
                array[i].info();
            }
        }
    }
}

