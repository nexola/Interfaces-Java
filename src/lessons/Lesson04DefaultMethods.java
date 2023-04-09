package lessons;

import lessons_entities.lesson04.BrazilInterestService;
import lessons_entities.lesson04.InterestService;
import lessons_entities.lesson04.USAInterestService;

import java.security.InvalidParameterException;
import java.util.Scanner;

public class Lesson04DefaultMethods {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Amount: ");
            double amount = sc.nextDouble();
            System.out.print("Months: ");
            int months = sc.nextInt();

            InterestService brazilInterestService = new BrazilInterestService(2.0);

            System.out.printf("Payment after %d months:\n", months);
            System.out.printf("%.2f", brazilInterestService.payment(amount, months));

            sc.close();
        } catch (InvalidParameterException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
