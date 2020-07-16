package com.mashibing.jvm.c2_classloader;

import sun.applet.AppletClassLoader;
import sun.awt.HKSCS;
import sun.misc.Launcher;
import sun.net.spi.nameservice.dns.DNSNameService;

public class T002_ClassLoaderLevel {
    public static void main(String[] args) {
        System.out.println(String.class.getClassLoader());
        System.out.println(HKSCS.class.getClassLoader());
        System.out.println(DNSNameService.class.getClassLoader());
        System.out.println(T002_ClassLoaderLevel.class.getClassLoader());

        System.out.println(DNSNameService.class.getClassLoader().getClass().getClassLoader());
        System.out.println(T002_ClassLoaderLevel.class.getClassLoader().getClass().getClassLoader());
//        System.out.println(System.getProperty("java.class.path"));

        System.out.println( AppletClassLoader.class.getClassLoader());
    }
}
