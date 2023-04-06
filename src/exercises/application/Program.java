package exercises.application;

import exercises.entities.BrazilTaxService;
import exercises.entities.CarRental;
import exercises.entities.RentalService;
import exercises.entities.Vehicle;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        // Entering data for car rental
        System.out.print("Rental data: ");
        System.out.print("Car model: ");
        String carModel = sc.nextLine();
        System.out.print("Start (DD/MM/YYYY HH:MM) -> ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), dtf);
        System.out.print("Return (DD/MM/YYYY HH:MM) -> ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), dtf);

        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));
        
        System.out.print("Enter price per hour: $");
        double pricePerHour = sc.nextDouble();
        System.out.print("Enter price per day: $");
        double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());

        rentalService.processInvoice(cr);

        System.out.println("INVOICE:");
        System.out.printf("Basic Payment: $%.2f \n", cr.getInvoice().getBasicPayment());
        System.out.printf("Tax: $%.2f \n", cr.getInvoice().getTax());
        System.out.printf("Total Payment: $%.2f \n", cr.getInvoice().getTotalPayment());

        sc.close();
    }
}
