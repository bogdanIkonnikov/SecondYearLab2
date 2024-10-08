package org.example;

public class FinanceMain {
    public static void main(String[] args){
        //7
        Payment payment1 = new Payment("Первов Первак Первович", new int[] {9,10,2005}, 1100);
        Payment payment2 = new Payment("Второв Вторяк Вторович", new int[] {1,11,2015}, 2213);
        Payment payment3 = new Payment("Третьёв Третьяк Третьевич", new int[] {2,12,2045}, 3394);
        Payment payment4 = new Payment("Третьёв Третьяк Третьевич", new int[] {2,12,2045}, 3394);
        if (payment3.equals(payment4)) System.out.println("payment3 equals payment4");
        else System.out.println("payment3 isn't equals payment4");
        System.out.println(payment1.toString());
        //8
        FinanceReport report = new FinanceReport(new Payment[] {payment1, payment2, payment3, payment4},
                "Иконников Богдан Константинович",
                new int[] {10,10,2024});
        System.out.println("Количество платежей: " + report.getQuantityPayments());
        report.setPayment(3, payment2);
        System.out.println(report.qetPayment(3).toString());
        //9
        System.out.println(report.toString());

    }

}
