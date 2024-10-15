package org.example;

public class StringProcessor {
    public static String multiplyString(String s, int N) {
        if (N == 0) return "";
        if (N < 0) throw new IllegalArgumentException("Index out of range");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < N; i++) {
            result.append(s);
        }
        return result.toString();
    }

    public static int countEntry(String s1, String s2) {
        int count = 0;
        if (s2.isEmpty()) throw new IllegalArgumentException("String is empty");
        for(int i = 0; i <= s1.length() - s2.length(); i++){
            if (s1.startsWith(s2, i)){
                count++;
            }
        }
        return count;
    }

    public static String replaceNumbers(String s) {
        String sOut;
        sOut = s.replace("1", "один")
                .replace("2", "два")
                .replace("3", "три");
        return sOut;
    }
    public static StringBuilder stringDel(StringBuilder stringBuilder) {
        for(int i = 1; i < stringBuilder.length(); i++) {
            stringBuilder.deleteCharAt(i);
        }
        return stringBuilder;
    }

    public static String stringReverse(String string) {
        char[] arr = new char[string.length()];
        int j = string.length() - 1;
        char buffer;
        for (int i = 0; i < string.length(); i++) {
            arr[i] = string.charAt(i);
        }
        for (int i = 0; i < string.length(); i++) {
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

    public static String numbs(String start) {
        int cutIndex, cutElement, stepen, sum = 0;
        for (int i = 0; i < start.length(); i++) {
            cutIndex = start.indexOf("0x") + 2; // нашли число
            if (start.contains("0x")) {
                //проверяем буковки
                for (int j = 0; j < 8; j++) { //преобразовали в 10-ую
                    switch (start.charAt(cutIndex + j)) {
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
                            cutElement = Character.getNumericValue(start.charAt(cutIndex + j));
                            break;
                    }
                    stepen = (int) Math.pow(16, 7 - j);
                    sum += cutElement * stepen;
                }

                start = start.replace(start.substring(cutIndex - 2, cutIndex + 8), String.valueOf(sum));
            }
            sum = 0;
        }
        return start;
    }

}
