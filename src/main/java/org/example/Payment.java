package org.example;

import java.util.Objects;

public class Payment {
    private String fio;
    private int day;
    private int month;
    private int year;
    private int pay;
    public Payment(String fio, int day, int month, int year, int pay) {
        this.fio = fio;
        this.day = day;
        this.month = month;
        this.year = year;
        this.pay = pay;
    }

    public int getPay() {
        return pay;
    }
    public String getFio() {
        return fio;
    }
    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }
    public void setFio(String fio) {
        this.fio = fio;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setPay(int pay) {
        this.pay = pay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return day == payment.day && month == payment.month && year == payment.year && pay == payment.pay && Objects.equals(fio, payment.fio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fio, day, month, year, pay);
    }

    @Override
    public String toString() {
        return String.format("Плательщик: %s, дата: %d.%d.%d сумма: %d руб. %d коп.",fio,day,month,year,pay/100,pay%100);
    }
}
