package org.example;

import java.util.Arrays;

public class FinanceReportProcessor {
    public static FinanceReport getPaymentsSecondName(FinanceReport report,char character){
        Payment[] payments = new Payment[report.getQuantityPayments()];
        int j = 0;
        for (int i = 0; i < report.getQuantityPayments(); i++){
            if (report.getPayment(i).getFio().charAt(0) == character) {
                payments[j] = report.getPayment(i);
                j++;
            }
        }
        return new FinanceReport(payments,"Finance Report Processor", "09.10.05");
    }
    public static FinanceReport getPaymentsUnderValue(FinanceReport report, int value){
        Payment[] payments = new Payment[report.getQuantityPayments()];
        int j = 0;
        for (int i = 0; i < report.getQuantityPayments(); i++){
            if (report.getPayment(i).getPay() < value) {
                payments[j] = report.getPayment(i);
                j++;
            }
        }
        return new FinanceReport(payments,"Finance Report Processor", "09.10.05");
    }
    public static int getPayByDate(String date, FinanceReport report){
        int sum = 0;
        for(int i = 0; i < report.getQuantityPayments();i++){
            if(report.getPayment(i).getDate().equals(date)){
                sum += report.getPayment(i).getPay();
            }
        }
        return sum;
    }
    public static String whichYearNoPays(int year, FinanceReport report){
        if(year/10 == 0)
        String[] months = new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};
        for(int i = 0; i < report.getQuantityPayments();i++){
            if()
        }
    }
}
