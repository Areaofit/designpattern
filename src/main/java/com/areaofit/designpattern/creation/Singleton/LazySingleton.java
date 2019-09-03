package com.areaofit.designpattern.creation.Singleton;

/**
 * 懒汉模式
 *
 * 优点：
 * 只有在需要用到的时候才会被实例化，提高了性能
 *
 * 缺点：
 * 当多个线程同时获取实例过程中容易引起线程安全问题
 */
public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    /**
     * 私有的构造器，不对外暴露，只能自己内部实例化
     */
    private LazySingleton() {
        System.out.println("懒汉模式");
    }

    /**
     * 没有同步控制的方法，很容易引起线程安全问题
     * @return
     */
    public static LazySingleton getInstance() {
        if (null == lazySingleton) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

    /**
     * 有方法级别的同步控制，没有线程安全问题，但是当多个线程同时调用时，性能很低
     * @return
     */
    public static synchronized LazySingleton getInstanceBySync() {
        if (null == lazySingleton) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

    /**
     * 双重检查（double check）
     *
     * 这种方式也不是完美的！
     * 假设 A 线程执行到了第一个 if (null == lazySingleton) 时，它判断对象为 null，
     * 于是 A 线程执行 lazySingleton = new LazySingleton() 进行实例化对象，如果这个对象
     * 很大，构建比较耗时，这时 B 线程执行到了第一个 if (null == lazySingleton) ，这时变量
     * lazySingleton 已经不为 null 了，则会直接返回这个实例，但是这个实例不是完整的，会引起业务
     * 逻辑错误。
     *
     * 那么有没有什么更好的写法呢？有！这里又要提出一种新的模式——Initialization on Demand Holder.
     * <h>利用内部来类做延迟加载！！！</h>
     *
     * @return
     */
    public static LazySingleton getInstanceDoubleCheck() {
        if (null == lazySingleton) {
            synchronized (LazySingleton.class) {
                if (null == lazySingleton) {
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }
}
