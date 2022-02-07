package com.company;

public class Triangle {

    int a;
    int b;
    int c;

    void area() {
        System.out.println("triangle - a b c");
        System.out.println("a = "+a+", "+"b = "+b+", "+"c = "+c);
        int s = (a + b + c) / 2;
        System.out.println("p = " + s);
        System.out.println("S = "+Math.round(Math.sqrt(s*(s-a)*(s-b)*(s-c))));




    }
}
