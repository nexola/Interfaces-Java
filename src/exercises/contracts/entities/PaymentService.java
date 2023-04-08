package exercises.contracts.entities;

import java.util.List;

public interface PaymentService {

    public List<Double> tax(double amount, int portion);

}
