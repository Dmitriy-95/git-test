package com.company.section2;

import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        int maxString = Integer.MIN_VALUE;
        int minString = Integer.MAX_VALUE;
        String smin = new String();
        String smax = new String();
        String setalon = new String();
        Scanner input = new Scanner(System.in);
        System.out.println("вводите строки, чтобы закончить введите пустую строку: ");
        do {
            System.out.print("Введите строку : ");
            setalon = input.nextLine();
            if (setalon.length() >= maxString) {
                smax = setalon;
                maxString = setalon.length();
            }
            if (setalon.length() <= minString && setalon.length() > 0) {
                smin = setalon;
                minString = setalon.length();
            }
        } while (setalon.length() > 0);
        System.out.println();
        if (maxString > minString) {
            System.out.print("Самая длинная строка: " + smax + " : ");
            System.out.println("Длина строки: " + maxString + " симв.");
            System.out.print("Самая короткая строка: " + smin + " : ");
            System.out.println("Длина строки: " + minString + " симв.");
        } else if (maxString != 0) {
            System.out.println("По длине строки одинаковы : по " + maxString + " симв.");
        } else {
            System.out.println("Недостаточно строк для сравнения.");
        }

    }
}
