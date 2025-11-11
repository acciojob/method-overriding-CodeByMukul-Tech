package com.driver;

public class Main {
    public static void main(String[] args) {
        B b = new B();
        A aref = new A();
        System.out.println(aref.meth());
        System.out.println(b.meth());
    }
}