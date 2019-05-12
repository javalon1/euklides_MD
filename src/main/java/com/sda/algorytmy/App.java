package com.sda.algorytmy;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj a: ");
        int a = scanner.nextInt();
        System.out.println("Podaj b: ");
        int b = scanner.nextInt();
        System.out.println(nwd(a, b));
    }


    public static int nwd(int a, int b) {
        if (a == b) {
            return a;
        } else if (a > b) {
            while (a > b) {
                a = a - b;
            }
            return a;

        } else {
            while (b > a) {
                b = b - a;
            }
            return b;
        }
    }
}

