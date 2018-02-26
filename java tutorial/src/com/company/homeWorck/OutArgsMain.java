//package com.company.homeWorck;

public class OutArgsMain {
    public static void main(String[] args) {

        System.out.println(args.length);
        for (int i = args.length - 1; i >= 0; --i) {
            System.out.println("Аргумент = " + args [i]);
        }
    }
}
