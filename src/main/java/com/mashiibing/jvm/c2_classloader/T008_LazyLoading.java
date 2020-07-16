package com.mashiibing.jvm.c2_classloader;

public class T008_LazyLoading {
    public static void main(String[] args) {
//        P p;
//        X x = new X();
//        System.out.println(P.i);
//        System.out.println(P.j);
        try {
            Class.forName("com.mashiibing.jvm.c2_classloader.T008_LazyLoading$P");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static class P{
        final static int i = 8;
        static int j = 9;
        static{
            System.out.println("P");
        }
    }

    public static class X extends P{
        static {
            System.out.println("X");
        }
    }
}
