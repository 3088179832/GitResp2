package com.mashiibing.jvm.c2_classloader;

public class T005_LoadClassByHand {
    public static void main(String[] args) {
        try {
            Class clazz = T005_LoadClassByHand.class.getClassLoader().loadClass("com.mashiibing.jvm.c2_classloader.T004_ParentAndChild");
            System.out.println(clazz.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
