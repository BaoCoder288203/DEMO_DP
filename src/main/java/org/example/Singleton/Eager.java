package org.example.Singleton;
public class Eager {
    private static final Eager instance = new
            Eager();

    //private constructor to avoid client applications to use constructor
    private Eager(){}
    public static Eager getInstance(){
        return instance;
    }
}
