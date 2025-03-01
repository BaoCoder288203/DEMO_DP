package org.example;

import org.example.Singleton.Eager;
import org.example.Singleton.StaticBlock;

public class Main {
    public static void main(String[] args) {
//        Eager eager = Eager.getInstance();
//        System.out.println(eager);

        StaticBlock staticBlock = StaticBlock.getInstance();
        System.out.println(staticBlock.hashCode());
    }
}