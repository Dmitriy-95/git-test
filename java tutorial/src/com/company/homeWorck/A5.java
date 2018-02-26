//package com.company.homeWorck;

public class A5 {
    public static void main(String[] args) {
        int k;
        int sum = 0;
        for (int i = 0 ; i < args.length; i++) {
             k = Integer.parseInt(args[i]);
            sum += k;
            System.out.println("args sum = " + sum);
        }

        int pro = 1;
        for (int i = 0 ; i < args.length; i++) {
            k = Integer.parseInt(args[i]);
            pro *= k;
            System.out.println("args pro = " + pro);
        }

    }
}
