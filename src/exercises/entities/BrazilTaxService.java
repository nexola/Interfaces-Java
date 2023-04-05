package exercises.entities;

public class BrazilTaxService {

    // Tax amount for Brazil costumers
    public double tax(double amount) {
        if (amount <= 100.0) {
            return amount * 0.2;
        } else {
            return amount * 0.15;
        }
    }
}
