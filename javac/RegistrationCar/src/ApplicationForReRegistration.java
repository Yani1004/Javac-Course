public class ApplicationForReRegistration {
    private final  String currentOwnerName;
    private final String newOwnerName;
    private final String licencePlate;
    public int entryNumber;
    public ApplicationForReRegistration(String currentOwnerName, String newOwnerName, String licencePlate, int entryNumber) {
        this.currentOwnerName = currentOwnerName;
        this.newOwnerName = newOwnerName;
        this.licencePlate = licencePlate;
        this.entryNumber = 0;
    }


    public String getCurrentOwnerName() {
        return currentOwnerName;
    }

    public String getNewOwnerName() {
        return newOwnerName;
    }

    public String getLicencePlate() {
        return licencePlate;
    }
}

