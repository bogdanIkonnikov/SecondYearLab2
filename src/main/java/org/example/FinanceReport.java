package org.example;

import java.util.Arrays;
import java.util.Objects;

public class FinanceReport {
    private final Payment[] payments;
    private final String fio;
    private final String date;

    public FinanceReport(Payment[] payments, String fio, String date) {
        this.payments = payments;
        this.fio = fio;
        this.date = date;
    }

    public FinanceReport(FinanceReport financeReport) {
        this.fio = financeReport.fio;
        this.date = financeReport.date;
        this.payments = new Payment[financeReport.payments.length];
        for (int i = 0; i < financeReport.getQuantityPayments(); ++i) {
            payments[i] = new Payment(
                    financeReport.getPayment(i).getFio(),
                    financeReport.getPayment(i).getDay(),
                    financeReport.getPayment(i).getMonth(),
                    financeReport.getPayment(i).getYear(),
                    financeReport.getPayment(i).getPay());
        }

    }

    public FinanceReport() {
        this.payments = new Payment[]{};
        this.fio = "none";
        this.date = "01.01.01";
    }

    public int getQuantityPayments() {
        return payments.length;
    }

    public Payment getPayment(int index) {
        return payments[index];
    }

    public void setPayment(int index, Payment payment) {
        payments[index] = payment;
    }

    @Override
    public String toString() {
        StringBuilder pays = new StringBuilder();
        for (Payment payment : payments) {
            if (payment == null) break;
            pays.append(payment).append(System.lineSeparator());
        }
        return String.format("[Автор: %s, дата: " + date +
                        ". Платежи: [\n%s]]",
                fio, pays);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FinanceReport that = (FinanceReport) o;
        return Arrays.equals(payments, that.payments) && Objects.equals(fio, that.fio) && Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(fio, date);
        result = 31 * result + Arrays.hashCode(payments);
        return result;
    }
}
