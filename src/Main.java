import com.pafra.clases.Compra;
import com.pafra.clases.TarjetaCredito;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion = 1;
        Scanner sc = new Scanner(System.in);
        float limiteTarjeta;
        ArrayList<Compra> listaCompras;
        System.out.println("Escriba el límite de la tarjeta:");
        limiteTarjeta = sc.nextFloat();
        sc.nextLine();
        TarjetaCredito tarjeta = new TarjetaCredito(limiteTarjeta);
        listaCompras = new ArrayList<Compra>();
        Compra compra;

        while (opcion == 1){
            System.out.println("Escriba la desripción de la compra:");
            String descripcion = sc.nextLine();
            System.out.println("Escriba el valor de la compra:");
            float valor = sc.nextFloat();
            sc.nextLine();
            compra = new Compra(descripcion,valor);

            switch (tarjeta.retirarSaldo(compra.getCosto())){
                case 0: //Saldo insuficiente
                    opcion = 0;
                    break;
                case 1: //saldo ya se agotó después de compra
                    listaCompras.add(compra);
                    opcion = 0;
                    break;
                case 2: //saldo retirado y aún disponible
                    listaCompras.add(compra);
                    System.out.println("continuar? 1.Sí 0.No");
                    opcion = sc.nextInt();
                    sc.nextLine();
                    if (opcion != 0 && opcion != 1){
                        System.out.println("Opción incorrecta");
                        opcion = 1;
                    }
                    break;
            }
        }
        listaCompras.sort(Comparator.comparing(Compra::getCosto));
        System.out.println("*******************************");
        System.out.println("COMPRAS REALIZADAS:\n");
        for(int i=0; i<listaCompras.size(); i++){
            listaCompras.get(i).mostrarCompra();
        }
        System.out.println("\n*******************************");

    }
}
