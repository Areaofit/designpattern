package com.areaofit.designpattern.creation.Singleton;

/**
 * 饿汉模式
 *
 * 优点：
 * 不用担心线程安全问题
 *
 * 缺点：
 * 类初始化就创建实例，当对象很大时，创建实例要时间和内存空间，响应性能
 */
public class HungrySingleton {

    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {
        System.out.println("饿汉模式");
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }
}
