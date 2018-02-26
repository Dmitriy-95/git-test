package com.company.section2;

import java.util.ArrayList;
import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>(); // временное хранение строк для их обработки
        ArrayList<Integer> len = new ArrayList<Integer>(); // временное хранение длин строк для их обработки
        int indexr = 0; // индекс удаляемой строки после её вывода
        int lenmax = 0; // значение самой длинной строки из оставшихся
        String setalon = new String();
        Scanner sin = new Scanner(System.in);
        System.out.println("Введите n строк, окончание ввода строк, завершите пустой строкой.");
        do {
            System.out.print("Введите строку символов: ");
            setalon = sin.nextLine();
            list.add(setalon);
            len.add(setalon.length());
        } while (setalon.length() > 0); // сбор строки в list + сбор их длин в len
        System.out.println();
        System.out.println("Строки по убыванию: ");
        while (len.size() > 1) { // находим самую длинную строку, выводим на  экран, удаляем её из list и len, и обратно
            // ищем максимальную строку из оставшихся
            for (int i = 0; i < len.size(); i++) { // проходим все строки, кроме последней пустой.
                if (len.get(i) > lenmax) {
                    lenmax = len.get(i); // запоминаем максимальное значение  длины строки для последующего сравнения
                    indexr = i; // запоминаем индекс максимальной строки
                }
            }
            System.out.println(list.get(indexr)); // выводим максимально длинную  строку
            list.remove(indexr); // удаляем из списка эту максимальную строку
            len.remove(indexr); // удаляем из списка значение длины этой максимальной строки
            indexr = 0; // возвращаемся в начало
            lenmax = len.get(0); // сохраняем начальное значение длины первой строки

        }

    }
}
