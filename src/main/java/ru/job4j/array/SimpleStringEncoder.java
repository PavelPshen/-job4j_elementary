package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                counter++;
            } else {
                result = counter > 1 ? result + symbol + counter : result + symbol;
                counter = 1;
                symbol = input.charAt(i);
            }
        }
        result = counter > 1 ? result + symbol + counter : result + symbol;
        return result;
    }
}