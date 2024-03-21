package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float result = value / 70;
        return result;
    }

    public static float rubleToDollar(float value) {
        float result = value / 60;
        return result;
    }

    public static float dollarToEuro(float value) {
        float result = value * 0.857F;
        return result;
    }

    public static float euroToDollar(float value) {
        float result = value * 1.167F;
        return result;
    }

    public static void main(String[] args) {
        float input = 140;
        float expected = 2;
        float output = Converter.rubleToEuro(input);
        boolean passed = expected == output;
        System.out.println("140 rubles are 2. Test result : " + passed);
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        input = 180;
        expected = 3;
        output = Converter.rubleToDollar(input);
        passed = expected == output;
        System.out.println("180 rubles are 3. Test result : " + passed);
        float dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + dollar + " dollar.");
        input = 10;
        expected = 8.57F;
        output = Converter.dollarToEuro(input);
        passed = expected == output;
        System.out.println("10 dollar are 8.57. Test result : " + passed);
        euro = Converter.dollarToEuro(100);
        System.out.println("100 dollar are " + euro + " euro.");
        input = 20;
        expected = 23.34F;
        output = Converter.euroToDollar(input);
        passed = expected == output;
        System.out.println("20 euro are 23.34. Test result : " + passed);
        dollar = Converter.euroToDollar(100);
        System.out.println("100 euro are " + dollar + " dollar.");
    }
}