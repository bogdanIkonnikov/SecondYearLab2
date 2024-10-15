package org.example;

public class FinanceReport {
    private Payment[] pays;
    private String fio;
    private String date;

    public FinanceReport(Payment[] pays, String fio, String date) {
        this.pays = pays;
        this.fio = fio;
        this.date = date;
    }
    public FinanceReport() {
        this.pays = new Payment[] {};
        this.fio = "none";
        this.date = "00.00.00";
    }
    public int getQuantityPayments(){
        return pays.length;
    }
    public Payment getPayment(int index){
        return pays[index];
    }
    public void setPayment(int index,Payment payment){
        pays[index] = payment;
    }
    @Override
    public String toString(){
        String Pays = "";
        for (int index = 0;index<pays.length;index++){
            if(pays[index] == null) break;
            else{
                Pays += pays[index].toString();
                Pays += "\n";
            }
        }

        return String.format("[Автор: %s, дата: " + date +
                "\nПлатежи: [\n%s ... ]]",
                fio, Pays);
    }
    public void copyFrom(FinanceReport financeReport){
        this.pays = financeReport.pays;
        this.date = financeReport.date;
        this.fio = financeReport.fio;
    }
}
