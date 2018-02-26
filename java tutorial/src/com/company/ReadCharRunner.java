package com.company;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadCharRunner {
    public static void main(String[] args) {

        InputStreamReader is = new InputStreamReader(System.in);

        BufferedReader bis = new BufferedReader(is);

        try {
            System.out.println("введите ваше имя и нажмте <Enter>: ");
            String name = bis.readLine();
            System.out.println("привет: "+ name);
        } catch (IIOException e){
            System.err.print("ошшибка ввода" + e);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
