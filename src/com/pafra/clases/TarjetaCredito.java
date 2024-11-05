package com.pafra.clases;

public class TarjetaCredito {
    private float saldo;

    public TarjetaCredito(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int retirarSaldo(float compra){
        if(compra>saldo){
            System.out.println("Saldo en tarjeta insuficiente!");
            return 0;
        }else if(compra==saldo) {
            this.saldo-=compra;
            System.out.println("Su saldo en tarjeta se ha agotado");
            return 1;
        }else {
            this.saldo-=compra;
            System.out.printf("Compra realizada exitosamente! su saldo en tarjeta: %.2f\n", this.saldo);
            return 2;
        }
    }
}
