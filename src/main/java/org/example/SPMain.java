package org.example;

import javax.print.DocFlavor;

public class SPMain {
    public static void main( String[] args )
    {
        String SRTest1 = " 12  3 4 567   8";
        StringBuilder sb = new StringBuilder("12345678");

        //1
        System.out.println(StringProcessor.StringMultiply("Abc", 3));
        //2
        System.out.println(StringProcessor.CountEntry("14344", "4"));
        //3
        System.out.println(StringProcessor.ReplaceNumbers("14344"));
        //4
        StringProcessor.StringDel(sb);
        System.out.println(sb);
        //5
        System.out.println(SRTest1);
        System.out.println(StringProcessor.StringReverse(SRTest1));
        System.out.println(StringProcessor.StringReverse("123       "));
        //6
        System.out.println(StringProcessor.Numbs("Мне 0x0000000B лет 0x00000000"));
    }
}
