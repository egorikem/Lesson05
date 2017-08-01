package com.company;

public class Main {

    public static void main(String[] args) {

        // Часть 1

        boolean a = true;
        boolean b = action();


        printA(хуй(action()));

        printA(true);
        printA(false);
        printA(true);
        printA(true);

        // Часть 2

        for (int i = 1; i <= 3; i++) {
            if(decide(i) == true) {
                sayMiau();
            }
        }
    }

    static void sayMiau() {
        System.out.println("Миау");
    }

    static boolean decide(int number) {
        return number % 2 == 0;
    }

    static boolean action() {
        return true;
    }

    static boolean хуй(boolean c) {
        boolean d = true;
        return c == d;
    }

    static void printA(boolean f) {
        System.out.println(f);
    }
}
