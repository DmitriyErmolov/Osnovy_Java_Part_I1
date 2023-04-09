package src;

public class Test {
    public static void main(String[] args) {
        byte numOfByte = 20;// -128 до 127
        short numOfShort = 0; // -32768 до 32767
        int numOfInt = 1; // -2_147_483_648 до 2_147_483_647
        long numOfLong = 0; // -9_223_372_036_854_775_808 до 9_223_372_036_854_775_807
        float numOfFloat = 0.1f; // 1.4e-45f до 3.4e+38f
        double numOfDouble = 1.0; // 4.9e-324 до 1.7e+308

        // Вычисления +, -, *, /, %
        System.out.println("Сложение числа \"numOfByte\" с числом \"1\" = " + (numOfByte + 1));
        System.out.println("Вычитание числа \"numOfByte\" на число \"1\" = " + (numOfByte - 1));
        System.out.println("Умножение числа \"numOfByte\" на число \"2\" = " + (numOfByte * 2));
        System.out.println("Деление числа \"numOfByte\" на число \"2\" = " + (numOfByte / 2));
        System.out.println("Остаток от деления числа \"numOfByte\" на число \"3\" = " + (numOfByte % 3));

        // Переполнение типа данных "int"
        System.out.println("Результат переполнения = " + (numOfInt + 2_147_483_647));

        // Вычисление комбинаций типов данных "int" и "double"
        System.out.println("Сложение числа \"int\" с числом \"double\" = " + (numOfByte + numOfDouble));
        System.out.println("Вычитание числа \"double\" из числа \"int\" = " + (numOfInt - numOfDouble));
        System.out.println("Умножение числа \"int\" на число \"double\" = " + (numOfByte * numOfDouble));
        System.out.println("Деление числа \"int\" на число \"double\" = " + (numOfByte / numOfDouble));

        // Операторы сравнения >, <, >=, <=, !=, ==
        System.out.println(numOfByte>numOfShort?"numOfByte > numOfShort":"numOfByte < numOfShort");
        System.out.println(numOfByte<numOfShort?"numOfByte < numOfShort":"numOfByte > numOfShort");
        System.out.println(numOfByte>=numOfShort?"numOfByte >= numOfShort":"numOfByte < numOfShort");
        System.out.println(numOfByte<=numOfShort?"numOfByte <= numOfShort":"numOfByte > numOfShort");
        System.out.println(numOfByte==numOfShort?"numOfByte == numOfShort":"numOfByte != numOfShort");
        System.out.println(numOfByte!=numOfShort?"numOfByte!= numOfShort":"numOfByte == numOfShort");


    }
}
