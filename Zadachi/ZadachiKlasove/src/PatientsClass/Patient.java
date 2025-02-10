package PatientsClass;

import java.util.Scanner;

abstract class Patient {
    protected String name;
    protected String address;
    protected int UCN;

    public Patient(String name, String address, int UCN) {
        this.name = name;
        this.address = address;
        this.UCN = UCN;
    }
    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Type in the name: ");
        this.name = sc.nextLine();
        System.out.println("Type in the address: ");
        this.address = sc.nextLine();
        System.out.println("Type in the UCN: ");
        this.UCN = Integer.parseInt(sc.nextLine());
    }
    public void outputData(){
        System.out.println("Name: " + this.name);
        System.out.println("Address: " + this.address);
        System.out.println("UCN: " + this.UCN);
    }
    public abstract void cure();

    public abstract void cure(String nameOfMedicine, int dosage);
}
