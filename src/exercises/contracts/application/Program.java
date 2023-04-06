package exercises.contracts.application;

import exercises.contracts.entities.Contract;
import exercises.contracts.entities.PayPal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter contract data");
        System.out.print("Contract number: ");
        Integer contractNumber = sc.nextInt();
        System.out.print("Contract date: (DD/MM/YYYY) -> ");
        sc.nextLine();
        LocalDate date = LocalDate.parse(sc.nextLine(), dtf);
        System.out.print("Contract value: $");
        Double value = sc.nextDouble();
        System.out.print("Quantity of installments: ");
        Integer portion = sc.nextInt();

        Contract contract = new Contract(contractNumber, date, value, portion, new PayPal());

        System.out.println(contract);
    }
}
