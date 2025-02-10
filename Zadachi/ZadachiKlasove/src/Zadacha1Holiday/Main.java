package Zadacha1Holiday;

public class Main {
    public static void main(String[] args) {
        // Create a Holiday instance
        Holiday holiday = new Holiday("Hawaii", 7, 1200.0, "Sunset Resort");
        System.out.println("Holiday Details:");
        System.out.println("Destination: " + holiday.getDestination());
        System.out.println("Duration (days): " + holiday.getDurationDays());
        System.out.println("Price: $" + holiday.getPrice());
        System.out.println("Hotel Name: " + holiday.getHotelName());

        // Fix the price for the holiday
        holiday.fixPrice(holiday.getPrice());
        System.out.println("Updated Holiday Price (after applying fix): $" + holiday.getPrice());

        System.out.println();

        // Create an Excursion instance
        Excursion excursion = new Excursion("Europe Tour", 10, 2500.0, 5);
        System.out.println("Excursion Details:");
        System.out.println("Destination: " + excursion.getDestination());
        System.out.println("Duration (days): " + excursion.getDurationDays());
        System.out.println("Price: $" + excursion.getPrice());
        System.out.println("Number of Hotels: " + excursion.getNumberOfHotels());

        // Fix the price for the excursion
        excursion.fixPrice(excursion.getPrice());
        System.out.println("Updated Excursion Price (after applying fix): $" + excursion.getPrice());

        // Get number of days for the excursion (it should subtract 1)
        int updatedDuration = excursion.getNumberOfDays();
        System.out.println("Updated Excursion Duration (after subtracting 1 day): " + updatedDuration + " days");
    }
}
