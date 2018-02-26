package com.company;

public class User {
    public int numericCode;
    private String password;

    public void setNumericCode (int valie){
        if(valie > 0) numericCode = valie;
        else numericCode = 1;
    }

    public int getNumericCode(){
        return  numericCode;
    }

    public void setPassword(String pass){
        if (pass != null) password = pass;
        else password = "11111";
    }

    public String getPassword() {
        return password;
    }
}
