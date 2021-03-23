package ru.geekbrains.java_one.homework5;

public class Employe {

    private String name;
    private String post;
    private String email;
    private String number;
    private int salary;
    private int age;

    Employe(String name, String post, String email, String number, int salary, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }


    public String getName() {
        return this.name;
    }

    public String getPost() {
        return this.post;
    }

    public String getEmail() {
        return this.email;
    }

    public String getNumber() {
        return this.number;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getAge() {
        return this.age;
    }

    public void info() {
        System.out.printf("Name is %s, post is %s, email is %s, number is %s, salary is %d, age is %d\n", name, post, email, number, salary, age);
    }
}
