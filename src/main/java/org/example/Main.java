package org.example;

import org.example.Singleton.ThreadSafe;


public class Main {
    public static void main(String[] args) {
//        Eager eager = Eager.getInstance();
//        System.out.println(eager);

//        StaticBlock staticBlock = StaticBlock.getInstance();
//        System.out.println(staticBlock.hashCode());

//        Lazy lazy = Lazy.getInstance();
//        System.out.println(lazy.hashCode());

        new Thread(()->{
            ThreadSafe thread = ThreadSafe.getInstance();
            System.out.println(thread.hashCode());
        }).start();
        new Thread(()->{
            ThreadSafe thread2 = ThreadSafe.getInstance();
            System.out.println(thread2.hashCode());
        }).start();

    }
}