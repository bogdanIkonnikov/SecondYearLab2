package org.example;

public class FinanceReport {
    private Payment[] pays;
    private String fio;
    private int[] date;

    public FinanceReport(Payment[] pays, String fio, int[] date) {
        this.pays = pays;
        this.fio = fio;
        this.date = date;
    }
    public int getQuantityPayments(){
        return pays.length;
    }

    //ДОПИСАТЬ ДОСТУП К ИТОМУ ПЛАТЕЖУ
}
