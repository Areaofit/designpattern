package com.areaofit.designpattern.creation.Singleton;

/**
 * 懒汉模式
 *
 * 利用内部类做延迟加载，避免了线程安全问题
 */
public class LazySingletonByInnerClass {

    public static class InnerClassHolder {
        public static final LazySingletonByInnerClass singleton = new LazySingletonByInnerClass();
    }

    public static LazySingletonByInnerClass getInstance() {
        return InnerClassHolder.singleton;
    }
}
