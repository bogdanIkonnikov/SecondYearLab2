package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FinanceReportProcessorTest {
    @Test
    public void getPaymentsSecondName(){
        Payment payment1 = new Payment("Первов Первак Первович", 9,10,2005, 1100);
        Payment payment2 = new Payment("Второв Вторяк Вторович", 9,10,2005, 2213);
        Payment payment3 = new Payment("Третьёв Третьяк Третьевич", 2,12,2045, 3394);
        Payment payment4 = new Payment("Третьёв Третьяк Третьевич", 2,12,2045, 3394);
        FinanceReport financeReport = new FinanceReport(new Payment[] {payment1,payment2,payment3,payment4},
                "Иконников Богдан Константинович",
                "09.10.05");
        Assertions.assertEquals("""
                [Автор: Finance Report Processor, дата: 09.10.05. Платежи: [
                Плательщик: Третьёв Третьяк Третьевич, дата: 2.12.2045 сумма: 33 руб. 94 коп.
                Плательщик: Третьёв Третьяк Третьевич, дата: 2.12.2045 сумма: 33 руб. 94 коп.
                 ... ]]""", FinanceReportProcessor.getPaymentsSecondName(financeReport, 'Т').toString());
    }
    @Test
    public void getPaymentsUnderValue(){
        Payment payment1 = new Payment("Первов Первак Первович", 9,10,2005, 1100);
        Payment payment2 = new Payment("Второв Вторяк Вторович", 9,10,2005, 2213);
        Payment payment3 = new Payment("Третьёв Третьяк Третьевич", 2,12,2045, 3394);
        Payment payment4 = new Payment("Третьёв Третьяк Третьевич", 2,12,2045, 3394);
        FinanceReport financeReport = new FinanceReport(new Payment[] {payment1,payment2,payment3,payment4},
                "Иконников Богдан Константинович",
                "10.10.24");
        Assertions.assertEquals("""
                [Автор: Finance Report Processor, дата: 09.10.05. Платежи: [
                Плательщик: Первов Первак Первович, дата: 9.10.2005 сумма: 11 руб. 0 коп.
                Плательщик: Второв Вторяк Вторович, дата: 9.10.2005 сумма: 22 руб. 13 коп.
                Плательщик: Третьёв Третьяк Третьевич, дата: 2.12.2045 сумма: 33 руб. 94 коп.
                Плательщик: Третьёв Третьяк Третьевич, дата: 2.12.2045 сумма: 33 руб. 94 коп.
                 ... ]]""", FinanceReportProcessor.getPaymentsUnderValue(financeReport, 30000).toString());
    }
    @Test
    public void getPayByDate(){
        Payment payment1 = new Payment("Первов Первак Первович", 9,10,2005, 1100);
        Payment payment2 = new Payment("Второв Вторяк Вторович", 9,10,2005, 2213);
        Payment payment3 = new Payment("Третьёв Третьяк Третьевич", 2,12,2045, 3394);
        Payment payment4 = new Payment("Третьёв Третьяк Третьевич", 2,12,2045, 3394);
        FinanceReport financeReport = new FinanceReport(new Payment[] {payment1,payment2,payment3,payment4},
                "Иконников Богдан Константинович",
                "10.10.24");
        Assertions.assertEquals(6788, FinanceReportProcessor.getPayByDate(2,12,2045,financeReport));
    }
    @Test
    public void whichYearNoPays(){
        Payment payment1 = new Payment("Первов Первак Первович", 9,10,2005, 1100);
        Payment payment2 = new Payment("Второв Вторяк Вторович", 9,10,2005, 2213);
        Payment payment3 = new Payment("Третьёв Третьяк Третьевич", 2,12,2045, 3394);
        Payment payment4 = new Payment("Третьёв Третьяк Третьевич", 2,12,2045, 3394);
        FinanceReport financeReport = new FinanceReport(new Payment[] {payment1,payment2,payment3,payment4},
                "Иконников Богдан Константинович",
                "10.10.24");
        Assertions.assertEquals(
                "Список месяцев, в которых не было платежей за 2005 год: Январь Февраль Март Апрель Май Июнь Июль Август Сентябрь Ноябрь Декабрь",
                FinanceReportProcessor.whichYearNoPays(2005, financeReport));
    }
}
