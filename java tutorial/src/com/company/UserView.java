package com.company;

public class UserView {
    public static void welcom(User obj){
        System.out.printf("Привет! Введен код: %d, пароль: %s" ,
                obj.getNumericCode(), obj.getPassword());
    }

}
