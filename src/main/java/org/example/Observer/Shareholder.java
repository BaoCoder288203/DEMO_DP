package org.example;

public class Shareholder {
    private int id;
    private String name;
    private double sumOfProperty;

    public Shareholder(int id, String name, double sumOfProperty) {
        this.id = id;
        this.name = name;
        this.sumOfProperty = sumOfProperty;
    }

    public void update(Double price){
        System.out.println(name + " " + (sumOfProperty * price));
    }
}
