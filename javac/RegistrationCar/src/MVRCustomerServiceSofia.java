public class MVRCustomerServiceSofia extends MVRCustomerService implements MVRCSInterface {
    @Override
    public int applicationAcceptance(ApplicationForReRegistration application) {
        String regNumber = application.getLicencePlate();
        // Check if the registration number starts with "C" or "CA"
        if (regNumber.startsWith("C") || regNumber.startsWith("CA")) {
            return super.applicationAcceptance(application); // Call the parent method
        } else {
            System.out.println("Молбата е отхвърлена: Невалиден регистрационен номер.");
            return 0; // Application is rejected
        }
    }

}
