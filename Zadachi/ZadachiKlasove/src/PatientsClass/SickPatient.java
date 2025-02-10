package PatientsClass;

import java.util.ArrayList;

public abstract class SickPatient extends Patient {
    protected String status;
    protected int dayOfStart;
    protected ArrayList<String> epicrises;
    public SickPatient(String name, String address, int UCN, String status, int dayOfStart, ArrayList<String> epicrises) {
        super(name, address, UCN);
        this.status = status;
        this.dayOfStart = dayOfStart;
        this.epicrises = new ArrayList<>();
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public int getDayOfStart() {
        return dayOfStart;
    }
    public void setDayOfStart(int dayOfStart) {
        this.dayOfStart = dayOfStart;
    }
    public ArrayList<String> getEpicrises() {
        return epicrises;
    }
    public void setEpicrises(ArrayList<String> epicrises) {
        this.epicrises = epicrises;
    }


    @Override
    public void cure(String nameOfMedicine, int dosage) {
        this.epicrises.add(nameOfMedicine+" "+dosage);
    }
}
