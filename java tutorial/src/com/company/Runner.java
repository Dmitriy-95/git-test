package com.company;

public class Runner {
    public static void main(String[] args) {
        User user = new User();
        user.numericCode = 71;
        user.setPassword("pass");
        UserView.welcom(user);
    }
}
