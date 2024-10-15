package org.example;

public class SPMain {
    public static void main( String[] args )
    {
        String SRTest1 = " 12  3 4 567   8";
        StringBuilder sb = new StringBuilder("12345678");

        //1
        System.out.println(StringProcessor.multiplyString("Abc", 3));
        //2
        System.out.println(StringProcessor.countEntry("14344", "4"));
        //3
        System.out.println(StringProcessor.replaceNumbers("14344"));
        //4
//        StringProcessor.stringDel(sb);
        System.out.println(sb);
        //5
        System.out.println(SRTest1);
        System.out.println(StringProcessor.stringReverse(SRTest1));
        System.out.println(StringProcessor.stringReverse("123       "));
        //6
        System.out.println(StringProcessor.numbs("Мне 0x0000000B лет 0x00000000"));
    }
}
