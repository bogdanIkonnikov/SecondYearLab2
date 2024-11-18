package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringProcessorTest {

    @Test
    public void multiplyString1(){
        Assertions.assertEquals("abcabcabc", StringProcessor.multiplyString("abc", 3));
    }

    @Test
    public void multiplyString2(){
        Assertions.assertEquals("", StringProcessor.multiplyString("", 3));
    }

    @Test()
    public void multiplyString3(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> StringProcessor.multiplyString("abc", -1));
    }

    @Test
    public void countEntryTest(){
        Assertions.assertEquals(2, StringProcessor.countEntry("aa", "a"));
        Assertions.assertEquals(3, StringProcessor.countEntry("aaa", "a"));
        Assertions.assertEquals(2, StringProcessor.countEntry("aaa", "aa"));
    }

    @Test
    public void replaceNumbers(){
        Assertions.assertEquals("Я рос один только два капитана три мушкетера", StringProcessor.replaceNumbers("Я рос 1 только 2 капитана 3 мушкетера"));
        Assertions.assertEquals("одиндватри", StringProcessor.replaceNumbers("123"));
        Assertions.assertEquals("одиноодиндва", StringProcessor.replaceNumbers("1о12"));
    }

    @Test
    public void stringDel(){
        Assertions.assertEquals("1111", StringProcessor.stringDel(new StringBuilder("12121212")).toString());
    }

    @Test
    public void stringReverse(){
        Assertions.assertEquals(" aaa bbb cc dd", StringProcessor.stringReverse(" dd cc bbb aaa"));
    }
    @Test
    public void stringReverse1(){
        Assertions.assertEquals("", StringProcessor.stringReverse(""));
    }

    @Test
    public void numbs(){
        Assertions.assertEquals("Мне 11 лет 0", StringProcessor.numbs("Мне 0x0000000B лет 0x00000000"));
        Assertions.assertEquals("37 45", StringProcessor.numbs("0x000000037 0x000000040x00000005"));
    }
}
