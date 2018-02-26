package com.company.homeWorck;
import java.util.Scanner;

public class OutString {
    public static String string(){
        Scanner scan = new Scanner(System.in);

        System.out.println("введите строку ");
        String str = scan.next();
        System.out.println("введите количество строк для вывода");
        int n = scan.nextInt();
        System.out.println("введите 0 если переход нужен, если нет введите 1");
        int k = scan.nextInt();

        if(k==1) {
            for (int i = 0; i < n; i++) {
                System.out.println(str);
            }
        }
        else {
            for (int i = 0; n >= i; i++) {
                System.out.print(str);
            }
        }
        return str;
    }

    public static void main(String[] args) {
        string();
    }
}
