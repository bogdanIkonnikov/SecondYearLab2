package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FinanceReportProcessorTest {
    @Test
    public void getPaymentsSecondName(){
        Payment payment1 = new Payment("Первов Первак Первович", "09.10.05", 1100);
        Payment payment2 = new Payment("Второв Вторяк Вторович", "01.09.15", 2213);
        Payment payment3 = new Payment("Третьёв Третьяк Третьевич", "02.12.45", 3394);
        Payment payment4 = new Payment("Третьёв Третьяк Третьевич", "02.12.45", 3394);
        FinanceReport financeReport = new FinanceReport(new Payment[] {payment1,payment2,payment3,payment4},
                "Иконников Богдан Константинович",
                "09.10.05");
        Assertions.assertEquals("[Автор: Finance Report Processor, дата: 09.10.05\n" +
                "Платежи: [\n" +
                "Плательщик: Третьёв Третьяк Третьевич, дата: 02.12.45 сумма: 33 руб. 94 коп.\n" +
                "Плательщик: Третьёв Третьяк Третьевич, дата: 02.12.45 сумма: 33 руб. 94 коп.\n" +
                " ... ]]", FinanceReportProcessor.getPaymentsSecondName(financeReport, 'Т').toString());
    }
    @Test
    public void getPaymentsUnderValue(){
        Payment payment1 = new Payment("Первов Первак Первович", "09.10.05", 1100);
        Payment payment2 = new Payment("Второв Вторяк Вторович", "01.09.15", 2213);
        Payment payment3 = new Payment("Третьёв Третьяк Третьевич", "02.12.45", 3394);
        Payment payment4 = new Payment("Третьёв Третьяк Третьевич", "02.12.45", 3394);
        FinanceReport financeReport = new FinanceReport(new Payment[] {payment1,payment2,payment3,payment4},
                "Иконников Богдан Константинович",
                "10.10.24");
        Assertions.assertEquals("[Автор: Finance Report Processor, дата: 09.10.05\n" +
                "Платежи: [\n" +
                "Плательщик: Первов Первак Первович, дата: 09.10.05 сумма: 11 руб. 0 коп.\n" +
                "Плательщик: Второв Вторяк Вторович, дата: 01.09.15 сумма: 22 руб. 13 коп.\n" +
                "Плательщик: Третьёв Третьяк Третьевич, дата: 02.12.45 сумма: 33 руб. 94 коп.\n" +
                "Плательщик: Третьёв Третьяк Третьевич, дата: 02.12.45 сумма: 33 руб. 94 коп.\n" +
                " ... ]]", FinanceReportProcessor.getPaymentsUnderValue(financeReport, 30000).toString());
    }
    @Test
    public void getPayByDate(){
        Payment payment1 = new Payment("Первов Первак Первович", "09.10.05", 1100);
        Payment payment2 = new Payment("Второв Вторяк Вторович", "01.09.15", 2213);
        Payment payment3 = new Payment("Третьёв Третьяк Третьевич", "02.12.45", 3394);
        Payment payment4 = new Payment("Третьёв Третьяк Третьевич", "02.12.45", 3394);
        FinanceReport financeReport = new FinanceReport(new Payment[] {payment1,payment2,payment3,payment4},
                "Иконников Богдан Константинович",
                "10.10.24");
        Assertions.assertEquals(6788, FinanceReportProcessor.getPayByDate("02.12.45",financeReport));
    }
    @Test
    public void whichYearNoPays(){
        Payment payment1 = new Payment("Первов Первак Первович", "09.10.05", 1100);
        Payment payment2 = new Payment("Второв Вторяк Вторович", "01.09.15", 2213);
        Payment payment3 = new Payment("Третьёв Третьяк Третьевич", "02.12.45", 3394);
        Payment payment4 = new Payment("Третьёв Третьяк Третьевич", "02.12.45", 3394);
        FinanceReport financeReport = new FinanceReport(new Payment[] {payment1,payment2,payment3,payment4},
                "Иконников Богдан Константинович",
                "10.10.24");
        Assertions.assertEquals("Список месяцев, в которых не было платежей за 5 год: Январь Февраль Март Апрель Май Июнь Июль Август Сентябрь Ноябрь Декабрь", FinanceReportProcessor.whichYearNoPays(5, financeReport));

    }
}
