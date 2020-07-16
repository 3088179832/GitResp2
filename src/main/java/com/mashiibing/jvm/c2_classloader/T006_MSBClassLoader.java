package com.mashiibing.jvm.c2_classloader;

import com.mashiibing.jvm.bytecode.T;

import java.io.*;

public class T006_MSBClassLoader extends ClassLoader{
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        //E:\AAA_STU\ideaSpace2\JVM\src\main\java\com\mashiibing\jvm\T.class
        System.out.println("name:"+name);

        try {
            File f = new File("E:/AAA_STU/ideaSpace2/JVM/src/main/java/com/mashiibing/jvm",name.replace(",","/").concat(".class"));
            FileInputStream fis = new FileInputStream(f);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            int b = 0;
            while((b = fis.read())!=0){
                baos.write(b);
            }
            byte[] bytes = baos.toByteArray();
            baos.close();
            fis.close();
            return defineClass(name,bytes,0,bytes.length);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return super.findClass(name);
    }

    public static void main(String[] args) {

        ClassLoader loader = new T006_MSBClassLoader();
        try {
            Class clazz = loader.loadClass("com.mashiibing.jvm.bytecode.T");
            Class clazz2 = loader.loadClass("com.mashiibing.jvm.bytecode.T");
            System.out.println(clazz == clazz2);
            T t  = (T) clazz.newInstance();
            t.m();
            System.out.println(loader.getClass().getClassLoader());
            System.out.println(loader.getParent());
            System.out.println(getSystemClassLoader().getClass().getClassLoader());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
