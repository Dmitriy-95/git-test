package com.company.homeWorck;

import java.util.Scanner;

public class TasckB {
    private static int[] CreateArray(){
        Scanner input = new Scanner(System.in);
        System.out.println("введите количество элементов массива: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("заполните элементы массива:");

        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.print ("ваш массив:");
        for (int i = 0; i < size; i++) {
            System.out.print (" " + array[i]);
        }

        return array;

    }
}
