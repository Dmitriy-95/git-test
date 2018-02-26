package com.company;



public class ComparingStrings {
    public static void main(String[] args) {
        String s1, s2;
        s1 = "java";
        s2 = s1;
        System.out.println("сравнение ссылок" + (s1==s2));

        s1 += '2';

        s2 = new String(s1);
        System.out.println("сравнение ссылок" + (s1==s2));

        System.out.println("сравнение значений" + s1.equals(s2));
    }
}
