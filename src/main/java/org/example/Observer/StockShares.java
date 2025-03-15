package org.example;

import java.util.ArrayList;
import java.util.List;

public class StockShares {
    private int id;
    private String name;
    private double price;

    List<Shareholder> shareholders;

    public StockShares(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
        shareholders = new ArrayList<>();
    }

    public void Add (Shareholder shareholder){
        shareholders.add(shareholder);
    }

    public void changePrice (Double newPrice){
        price = newPrice;
        notifitations();
    }

    public void notifitations(){
        for(Shareholder shareholder:shareholders){
           shareholder.update(price);
        }
    }
}
