package exercises.entities;

// Implements the head class TaxService
public class BrazilTaxService implements TaxService{

    // Tax amount for Brazil
    public double tax(double amount) {
        if (amount <= 100.0) {
            return amount * 0.2;
        } else {
            return amount * 0.15;
        }
    }
}
