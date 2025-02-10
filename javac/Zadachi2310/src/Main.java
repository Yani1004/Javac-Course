import Zadacha1.Person;
import Zadacha1.Student;
import Zadacha2.Car;
import Zadacha2.ElectricCar;

public class Main {
    public static void main(String[] args) {
/*
        Person person = new Person("Yanichka",19);
        person.printDetails();
        System.out.println();
        Student student = new Student("Ivana",14,6);
        student.printDetails();
*/
        Car[] cars = new Car[3];

        cars[0] = new Car("Mercedes", 100, 50, 1000, 5.5);
        cars[1] = new ElectricCar("Tesla", 120, 0, 5000, 15.0, 80);
        cars[2] = new Car("BMW", 90, 40, 1500, 6.0);

        for (Car car : cars) {
            if (car instanceof ElectricCar) {
                ((ElectricCar) car).driveElectric(50);


            } else {
                car.drive(50);
            }
        }

    }
}