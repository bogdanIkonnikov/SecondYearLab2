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
        if (s2.isEmpty()) {
            throw new IllegalArgumentException("String is empty");
        }
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
        StringBuilder stringBuilder = new StringBuilder();
        String buffer;
        /*int k = 0;
        int index = 0;
        for (int i = 0; i < string.length();) {
            if (string.charAt(i) != ' '){
                while (k+1 < string.length() &&  string.charAt(k+1) != ' ') {
                    if (k >= string.length() - 1) {
                        break;
                    }
                    else {
                        k++;
                    }
                }
                arr[index] = string.substring(i,k+1);
                index++;
                i = k + 1;
                k++;
            }
            if (i < string.length()) {
                if (string.charAt(i) == ' ' ){
                    while (k+1 < string.length() && string.charAt(k+1) == ' ') {
                        if (k >= string.length() - 1) {
                            break;
                        }
                        else {
                            k++;
                        }
                    }
                    arr[index] = string.substring(i,k+1);
                    index++;
                    i = k + 1;
                    k++;
                }
            }

        }

        int j = arr.length - 1;
        for (int i = 0; i < arr.length; i++){
            if (!arr[i].startsWith(" ")){
                while (arr[j] == null || arr[j].startsWith(" ")) {
                    j--;
                    if (i == j || i > j) break;
                }
                if (i == j || i > j) break;
                buffer = arr[i];
                arr[i] = arr[j];
                arr[j] = buffer;
                j--;
            }
        }
        */

        String[] arr = string.split(" ");
        int j = arr.length - 1;
        for (int i = 0; i < string.length(); ++i) {
            if (!arr[i].equals("")) {
                while (arr[j].equals("")) {
                    j--;
                    if (i == j || i > j) break;
                }
                if (i == j || i > j) break;
                buffer = arr[i];
                arr[i] = arr[j];
                arr[j] = buffer;
                j--;
            }
        }
        if (string.length() != 0) {
            for (int i =0; i < arr.length; ++i) {
                if (!arr[i].equals("")) {
                    stringBuilder.append(arr[i]);
                    if (i != arr.length - 1){
                        stringBuilder.append(" ");
                    }
                }
                else {
                    stringBuilder.append(" ");
                }
            }
        }

        return stringBuilder.toString();
    }

    public static String numbs(String start) {
        int cutIndex, cutElement, stepen, sum = 0;
        for (int i = 0; i < start.length(); i++) {
            cutIndex = start.indexOf("0x") + 2; // нашли число
            if (start.contains("0x")) {
                //проверяем буковки
                for (int j = 0; j < 8; j++) { //преобразовали в 10-ую
                    cutElement = switch (start.charAt(cutIndex + j)) {
                        case 'A' -> 10;
                        case 'B' -> 11;
                        case 'C' -> 12;
                        case 'D' -> 13;
                        case 'E' -> 14;
                        case 'F' -> 15;
                        default -> Character.getNumericValue(start.charAt(cutIndex + j));
                    };
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
