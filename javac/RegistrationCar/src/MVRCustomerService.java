import java.util.ArrayList;
import java.util.Scanner;

public class MVRCustomerService implements MVRCSInterface{
    private static ArrayList<ApplicationForReRegistration>  applications = new ArrayList<>();
    private static int currentEntryNumber=1;
    private int counterNum;
    public MVRCustomerService(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the counter: ");
        this.counterNum = sc.nextInt();
    }
    public static ArrayList<ApplicationForReRegistration> getApplications() {
        return applications;
    }

    public static void setApplications(ArrayList<ApplicationForReRegistration> applications) {
        MVRCustomerService.applications = applications;
    }

    public static int getCurrentEntryNumber() {
        return currentEntryNumber;
    }

    public static void setCurrentEntryNumber(int currentEntryNumber) {
        MVRCustomerService.currentEntryNumber = currentEntryNumber;
    }


    @Override
    public int applicationAcceptance(ApplicationForReRegistration application) {
        application.entryNumber = currentEntryNumber;
        applications.add(application);
        return  currentEntryNumber++;
    }
    public void deleteApplication(int entryNumber) {
        for(ApplicationForReRegistration application : applications) {
            if(application.entryNumber == entryNumber) {
                applications.remove(application);
            }
        }
    }

}
