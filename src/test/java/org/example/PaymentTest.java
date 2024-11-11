package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PaymentTest {

    @Test
    public void ConstructorGetSet(){
        Payment payment = new Payment("Фамилия Имя Отчество", 9,10,2005, 11111);
        //FIO
        Assertions.assertEquals("Фамилия Имя Отчество", payment.getFio());
        payment.setFio("A s d");
        Assertions.assertEquals("A s d", payment.getFio());
        //DATE
        Assertions.assertEquals(9, payment.getDay());
        //pay
        Assertions.assertEquals(11111, payment.getPay());
    }

    @Test
    public void equals(){
        Payment payment1 = new Payment("Фамилия Имя Отчество", 9,10,2005, 11111);
        Payment payment2 = new Payment("Фамилия Имя Отчество", 9,10,2005, 11111);
        Assertions.assertTrue(payment1.equals(payment2));
        payment1.setFio("123");
        Assertions.assertFalse(payment1.equals(payment2));
    }

    @Test
    public void toStringTest(){
        Payment payment = new Payment("Фамилия Имя Отчество", 9,10,2005, 11111);
        Assertions.assertEquals("Плательщик: Фамилия Имя Отчество, дата: 9.10.2005 сумма: 111 руб. 11 коп.", payment.toString());
    }
}
