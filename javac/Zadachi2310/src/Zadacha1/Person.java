package Zadacha1;

import java.sql.SQLOutput;

public class Person implements Printable {
    protected String name;
    protected int age;

    public Person(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void introduce() {
        System.out.printf("Name : %s, Age : %d\n",name,age);
    }

    @Override
    public void printDetails() {
        System.out.println("Details about this person:");
        System.out.printf("Name: %s\nAge: %d\n",name,age);
    }
}
