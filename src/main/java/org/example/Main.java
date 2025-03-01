package org.example;

import org.example.Singleton.Eager;

public class Main {
    public static void main(String[] args) {
        Eager eager = Eager.getInstance();
        System.out.println(eager);
    }
}