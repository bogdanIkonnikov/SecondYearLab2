package org.example;

import javax.management.StringValueExp;

public class StringProcessor {
    public static String StringMultiply(String s, int N) {
        if (N == 0) return "";
        if (N < 0) throw new IllegalArgumentException("Index out of range");
        String sOut = "";
        for (int i = 0;i<N;i++){
            sOut += s;
        }
        return sOut;
    }
    public static int CountEntry(String s1, String s2) {
        int count = 0;
        if (s2.isEmpty() || s2 == null) throw new IllegalArgumentException("String is empty");
        while (s1.indexOf(s2) != -1) {
            count++;
            s1 = s1.replaceFirst(s2,"");
        }
        return count;
    }
    public static String ReplaceNumbers(String s) {
        String sOut;
        sOut = s.replace("1","один")
                .replace("2","два")
                .replace("3","три");
        return sOut;
    }
    public static void StringDel(StringBuilder stringBuilder) {
        for(int i = 1; i < stringBuilder.length(); i++) {
            System.out.println(i);
            stringBuilder.deleteCharAt(i);
        }
    }

    public static String StringReverse(String string) {
        char[] arr = new char[string.length()];
        int j = string.length() - 1;
        char buffer;
        for (int i = 0;i < string.length();i++) {
            arr[i] = string.charAt(i);
        }
        for (int i = 0;i < string.length();i++) {
            if (j == i) break;
            if (arr[i] != ' ') {
                while (arr[j] == ' ') {
                    if (j == 0) break;
                    j--;
                }
                buffer = arr[i];
                arr[i] = arr[j];
                arr[j] = buffer;
                j--;
            }
        }
        return new String(arr);
    }

    public static String Numbs(String start){
        int cutIndex, cutElement, stepen, sum = 0;
        for (int i = 0; i < start.length(); i++){
            cutIndex = start.indexOf("0x")+2; // нашли число
            if (start.contains("0x")) {
                //проверяем буковки
                for (int j = 0;j < 8;j++){ //преобразовали в 10-ую
                    switch (start.charAt(cutIndex+j)){
                        case 'A':
                            cutElement = 10;
                            break;
                        case 'B':
                            cutElement = 11;
                            break;
                        case 'C':
                            cutElement = 12;
                            break;
                        case 'D':
                            cutElement = 13;
                            break;
                        case 'E':
                            cutElement = 14;
                            break;
                        case 'F':
                            cutElement = 15;
                            break;
                        default:
                            cutElement = Character.getNumericValue(start.charAt(cutIndex+j));
                            break;
                    }
                    stepen = (int) Math.pow(16,7-j);
                    sum += cutElement * stepen;
                }

                start = start.replace(start.substring(cutIndex-2,cutIndex+8), String.valueOf(sum));
            }
            sum = 0;
        }
        return start;
    }

}
