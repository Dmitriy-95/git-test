//package com.company.homeWorck;
import java.util.Date;
import java.util.Scanner;

public class A6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] name = new String[10];
        Date date = new Date();

        for (int i =0; i <= 10; i++){
            name[i] = input.nextLine()+ " " + date.toString();

                if(name[i].equals("0" + " " + date.toString())) {
                    System.out.println();

                    for (int k = 0; k <= 10; k++) {
                        System.out.println(" " + name[k]);
                    }

                break;
                }
        }
    }
}
