package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FinanceReportTest {
    @Test
    public void getQuantityPayments(){
        Payment payment1 = new Payment("Первов Первак Первович", "09.10.05", 1100);
        Payment payment2 = new Payment("Второв Вторяк Вторович", "01.11.15", 2213);
        Payment payment3 = new Payment("Третьёв Третьяк Третьевич", "02.12.45", 3394);
        Payment payment4 = new Payment("Третьёв Третьяк Третьевич", "02.12.45", 3394);
        FinanceReport financeReport = new FinanceReport(new Payment[] {payment1,payment2,payment3,payment4},
                "Иконников Богдан Константинович",
                "02.03.04");
        Assertions.assertEquals(4, financeReport.getQuantityPayments());

    }
    @Test
    public void getSet(){
        Payment payment1 = new Payment("Первов Первак Первович", "09.10.05", 1100);
        Payment payment2 = new Payment("Второв Вторяк Вторович", "01.11.15", 2213);
        FinanceReport financeReport = new FinanceReport(new Payment[] {payment1,payment2},
                "Иконников Богдан Константинович",
                "10.10.24");
        financeReport.setPayment(1, payment1);
        Assertions.assertEquals(payment1, financeReport.getPayment(1));
    }
    @Test
    public void toStringTest(){
        Payment payment1 = new Payment("Первов Первак Первович", "09.10.05", 1100);
        Payment payment2 = new Payment("Второв Вторяк Вторович", "01.11.15", 2213);
        FinanceReport financeReport = new FinanceReport(new Payment[] {payment1,payment2},
                "Иконников Богдан Константинович",
                "10.10.24");
        Assertions.assertEquals("[Автор: Иконников Богдан Константинович, дата: 10.10.24\n" +
                "Платежи: [\n" +
                "Плательщик: Первов Первак Первович, дата: 09.10.05 сумма: 11 руб. 0 коп.\n" +
                "Плательщик: Второв Вторяк Вторович, дата: 01.11.15 сумма: 22 руб. 13 коп.\n" +
                " ... ]]", financeReport.toString());
    }
    @Test
    public void copyFrom(){
        Payment payment1 = new Payment("Первов Первак Первович", "09.10.05", 1100);
        Payment payment2 = new Payment("Второв Вторяк Вторович", "01.11.15", 2213);
        FinanceReport financeReport = new FinanceReport(new Payment[] {payment1,payment2},
                "Иконников Богдан Константинович",
                "10.10.24");
        FinanceReport financeReport1 = new FinanceReport();
        financeReport1.copyFrom(financeReport);
        Assertions.assertTrue(financeReport1.getPayment(0).equals(financeReport.getPayment(0)));
        Assertions.assertTrue(financeReport1.getPayment(1).equals(financeReport.getPayment(1)));
    }
}
