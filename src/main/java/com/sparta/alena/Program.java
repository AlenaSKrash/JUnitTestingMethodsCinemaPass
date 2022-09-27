package com.sparta.alena;

public class Program {
    public static void main(String[] args) {
        int timeOfDay = 21;
        System.out.println(greeting(timeOfDay));
    }

    public static String greeting(int timeOfDay) {
        String message = "";
        if (timeOfDay >= 5 && timeOfDay < 12) {
            message = "Good morning!";
        } else if (timeOfDay >= 12 && timeOfDay <= 18) {
            message = "Good afternoon!";
        } else {
            message = "Good evening!";
        }
        return message;
    }
}
