package org.example;

import java.util.Arrays;
import java.util.Objects;

public class Payment {
    private String fio;
    private int[] date;
    private int pay;
    public Payment(String fio, int[] date, int pay) {
        this.fio = fio;
        this.date = date;
        this.pay = pay;
    }

    public int getPay() {
        return pay;
    }
    public String getFio() {
        return fio;
    }
    public int[] getDate() {
        return date;
    }
    public void setFio(String fio) {
        this.fio = fio;
    }
    public void setDate(int[] date) {
        this.date = date;
    }
    public void setPay(int pay) {
        this.pay = pay;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return pay == payment.pay && fio.equals(payment.fio) && Arrays.equals(date, payment.date);
    }
    @Override
    public int hashCode() {
        int result = Objects.hash(fio, pay);
        result = 31 * result + Arrays.hashCode(date);
        return result;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "fio='" + fio + '\'' +
                ", date=" + Arrays.toString(date) +
                ", pay=" + pay +
                '}';
    }
}
