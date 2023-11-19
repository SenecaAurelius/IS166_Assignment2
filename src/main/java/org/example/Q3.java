package org.example;


public class Q3 {
    private int a;
    public int x;
    public Q3() {
        a = 2;
    }

    public Q3(int p) {
        a = p;
    }

    public void fun() {
        System.out.println(a);
    }

    public void fun(int p, int q) {
        q = p / a;
        System.out.println(a + p - q);
    }

    public void fun(int p, double q){
        q = a / p;
        System.out.println(a + p - q);
    }
}