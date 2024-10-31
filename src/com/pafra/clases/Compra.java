package com.pafra.clases;

import java.util.HashMap;

public class Compra {
    private HashMap<String, Double> items = new HashMap<>();

    public HashMap<String, Double> getItems() {
        return items;
    }

    public void agregarItem(String producto, double costo){
        this.items.put(producto,costo);
    }
}
