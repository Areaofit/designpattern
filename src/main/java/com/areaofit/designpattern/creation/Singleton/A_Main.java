package com.areaofit.designpattern.creation.Singleton;

public class A_Main {

    public static void main(String[] args) {
        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        LazySingleton lazySingleton2 = LazySingleton.getInstanceDoubleCheck();
        System.out.println(lazySingleton1 == lazySingleton2);
        System.out.println("\n");
        HungrySingleton hungrySingleton1 = HungrySingleton.getInstance();
        HungrySingleton hungrySingleton2 = HungrySingleton.getInstance();
        System.out.println(hungrySingleton1 == hungrySingleton2);
    }
}
