package com.company.homeWorck;

public class Te {

    String s = new String("1");

    public boolean  equals(Te obg) {


        if (s.equals(obg.s)) {
            return true;
        } else
            return false;
    }


    public static void main(String[] args) {
        Te te = new Te();

        Te TE1 = new Te();
        Te TE2 = new Te();

        TE1.s = "123";
        TE2.s = "123";
// equal - true

        System.out.println(TE1.equals(TE2));

        TE1.s = "123";
        TE2.s = "124";
//equal false

//        System.out.println(te.equals(TE1.s,TE2.s));
    }

}
