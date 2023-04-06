package exercises.contracts.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Contract {
    private Integer number;
    private LocalDate date;
    private Double value;
    private Integer portion;
    private PaymentService paymentService;

    public Contract(Integer number, LocalDate date, Double value, Integer portion, PaymentService paymentService) {
        this.number = number;
        this.date = date;
        this.value = value;
        this.portion = portion;
        this.paymentService = paymentService;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Integer getPortion() {
        return portion;
    }

    public void setPortion(Integer portion) {
        this.portion = portion;
    }

    public PaymentService getPaymentService() {
        return paymentService;
    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public String toString() {
        List<Double> installments = getPaymentService().tax(value, portion);
        StringBuilder sb = new StringBuilder();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        sb.append("Installments: \n");
        for (int i = 0; i < portion; i++) {
            sb.append(dtf.format(date.plusMonths(i + 1))).append(" - ").append(installments.get(i)).append("\n");
        }
        return sb.toString();
        }
    }


