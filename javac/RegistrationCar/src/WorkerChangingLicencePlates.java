import java.util.ArrayList;

public abstract class WorkerChangingLicencePlates {
    private String workerName;
    private int numberOfChangedPlates;
    private static int totalChangedPlatesCount = 0;

    public abstract void unscrewTheOldAndScrewTheNewNumber(String licencePlate);

    public void performService(){
        ArrayList<ApplicationForReRegistration> applications = MVRCustomerService.getApplications();
        int min = applications.get(0).entryNumber;
        for(ApplicationForReRegistration application : applications){
            if(application.entryNumber < min){
                min = application.entryNumber;
            }
        }
        for(ApplicationForReRegistration application : applications){
            if(application.entryNumber == min){
                unscrewTheOldAndScrewTheNewNumber(application.getLicencePlate());
                applications.remove(application);
                numberOfChangedPlates++;
                totalChangedPlatesCount++;
            }
        }

    }
}
