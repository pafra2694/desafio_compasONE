import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion = 1;
        Scanner sc = new Scanner(System.in);

        while (opcion == 1){
            System.out.println("continuar? 1.Sí 0.No");
            opcion = sc.nextInt();

            if (opcion != 0 && opcion != 1){
                System.out.println("Opción incorrecta");
                opcion = 1;
            }
        }
    }
}
