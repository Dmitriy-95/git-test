package com.company.homeWorck;

import java.util.Arrays;
import java.util.Scanner;

public class Operation {
    public static void main(String[] args) {
// создаем массив
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Insert array elements:");

        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.print ("Inserted array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print (" " + array[i]);
        }
// выводим четные элементы массива
        System.out.println();
        System.out.print("четные элементы массива: " );

        for (int i = 0; i < size; i++){

            if (array[i] % 2 == 0) {

                System.out.print(" " + array[i]);
            }
        }
// выводим не четные элементы массива
        System.out.println();
        System.out.print("не четные элементы массива: " );

        for (int i = 0; i < size; i++){

            if (array[i] % 2-1 == 0) {

                System.out.print(" " + array[i]);
            }
        }
// выводим элементы с максимальным и минимальным значением
        System.out.println();
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
//        int max = 0, min=1000000;
        for(int i = 0; i < size; i++) {
            System.out.println(max + " - " + min);
            if(array[i] > max)
                max = array[i];

            if(array[i] < min)
                min = array[i];
        }

        System.out.println("Максимальное число: " + max);
        System.out.println("Минимальное число: " + min);

// вывод элементы которые делятся на 3 или на 9
        System.out.print("делятся на 3 или на 9: ");
        for(int i = 0; i < size; i++) {
            if(array[i] % 3 == 0) {
                System.out.print(" " + array[i]);
            }
            else if(array[i] % 9 == 0) {
                System.out.print(" " + array[i]);
            }
        }

//        числа делятся на 5 и на 7
        System.out.println();
        System.out.print("числа делятся на 5 и на 7: ");
        for(int i = 0; i < size; i++){
            if(array[i] % 7 == 0){
                if(array[i] % 5 == 0){
                    System.out.print(array[i]);
                }
            }
        }

//        String f = array.toString();
        System.out.println(Arrays.toString(array));
//            int[] a = new int[size];
//        for (int i= 0; i <= array.length; i++){
//            if(Math.abs(array[i]) < Math.abs(array[i + 1])){
//                a[i] = array[i + 1];
//            }
//        }

//        boolean swapped = true;
//        int j = 0;
//        int tmp;
//        while (swapped) {
//            swapped = false;
//            j++;
//            for (int i = 0; i < array.length - j; i++) {
//                if (Math.abs(array[i]) < Math.abs(array[i + 1])) {
//                    tmp = array[i];
//                    array[i] = array[i + 1];
//                    array[i + 1] = tmp;
//                    swapped = true;
//                }
//                System.out.print(Arrays.asList(array));
//            }
//        }





    }
}
