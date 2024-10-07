package org.example;

import javax.print.DocFlavor;

public class SPMain {
    public static void main( String[] args )
    {
        String SRTest1 = " 12  3 4 567   8";
        System.out.println(StringProcessor.StringMultiply("Abc", 3));
        System.out.println(StringProcessor.CountEntry("14344", "4"));
        System.out.println(StringProcessor.ReplaceNumbers("14344"));
        StringBuilder sb = new StringBuilder();
        sb.append("12345678");
        StringProcessor.StringDel(sb);
        System.out.println(sb);
        System.out.println(SRTest1);
        System.out.println(StringProcessor.StringReverse(SRTest1));
        System.out.println(StringProcessor.StringReverse("123       "));
        System.out.println(StringProcessor.Numbs("Мне 0x0000000B лет 0x00000000"));
    }
}
