package com.pafra.clases;

public class Compra {
    private String item;
    private float costo;

    public Compra(String item, float costo) {
        this.item = item;
        this.costo = costo;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public void mostrarCompra(){
        System.out.printf("%s - %.2f\n",this.item,this.costo);;
    }

}
