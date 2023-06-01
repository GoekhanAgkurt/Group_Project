package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(add(2,3));
        System.out.println(isBiggerThenHundret(98));
        System.out.println(smallerThenZero(2));
        smallerThenZero(6);
    }

    public static int add(int number1, int number2) {
        return number1 + number2;
    }



    public static boolean isBiggerThenHundret (int number) {
        if (number < 100) {
            System.out.println("Zahl ist kleiner als 100");
            return false;
        }
        else {
            System.out.println("Zahl ist größer als 100");
            return true;
        }
    }

    public static boolean smallerThenZero(int number){
        return number < 0;

    }

    public static String fizzbuzz(int number) {
        if (number % 3 == 0 && number % 5 ==0) {
            return "fizzbuzz";
        } else if (number % 3 ==0){
            return "fizz";
        } else
            return "buzz";
    }





}
