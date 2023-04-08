package exercises.contracts.entities;

import java.util.ArrayList;
import java.util.List;

public class PayPal implements PaymentService {

    // PayPal interest per month 1% | Payment tax 2%
    // Returns a list of installments
    @Override
    public List<Double> tax(double amount, int portion) {
        List<Double> installments = new ArrayList<>();
        for (int i = 0; i < portion; i++) {
            double quota = amount / portion;
            quota += (quota * 0.01) * (i+1);
            quota += (quota * 0.02);
            installments.add(quota);
        }
        return installments;
    }
}
