package Zadacha1;

public class Student extends Person implements Printable {
    private double grade;
    public Student(String name, int age, double grade) {
        super(name, age);
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
    public void introduce() {
        System.out.printf("Name: %s, Age: %d, Grade: %f\n", name, age, grade);

    }
    public void printDetails() {
        System.out.println("Details about this person:");
        System.out.printf("Name: %s\nAge: %d\nGrsde: %2f",name,age,grade);
    }

}
