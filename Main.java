import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int opcion = 0;

        boolean ComidaPicada = false;
        boolean ComidaCocinada = false;
        boolean ComidaServida = false;

        //COnstructores
        Scanner sc = new Scanner(System.in);
        Acciones submenu = new Acciones();

        //Instancias
        MagnumOpus magnum = new MagnumOpus();
        Picador picador = new Picador();
        Cocinero cocinero = new Cocinero();

        while(opcion != 5) {
            System.out.println("\nSeleccione una opcion: ");
            System.out.println("1. Controlar a Magnum");
            System.out.println("2. Controlar al picador");
            System.out.println("3. Controlar al Cocinero");
            System.out.println("4. Finalizar proceso");
            System.out.println("5. Salir");
            opcion = sc.nextInt();

            switch(opcion) {
                case 1:
                    submenu.Menu();
                    opcion = sc.nextInt();
                    switch(opcion) {
                        case 1:
                            ComidaPicada = magnum.Picar();
                            break;
                        case 2:
                            ComidaCocinada = magnum.Cocinar();
                            break;
                        case 3:
                            ComidaServida = magnum.Servir();
                            break;
                    }
                    break;
                case 2:
                    submenu.Menu();
                    opcion = sc.nextInt();
                    switch(opcion) {
                        case 1:
                            ComidaPicada = picador.Picar();
                            break;
                        case 2:
                            ComidaCocinada = picador.Cocinar();
                            break;
                        case 3:
                            ComidaServida = picador.Servir();
                            break;
                    }
                    break;
                case 3:
                    submenu.Menu();
                    opcion = sc.nextInt();
                    switch(opcion) {
                        case 1:
                            ComidaPicada = cocinero.Picar();
                            break;
                        case 2:
                            ComidaCocinada = cocinero.Cocinar();
                            break;
                        case 3:
                            ComidaServida = cocinero.Servir();
                            break;
                    }
                    break;
                case 4:
                    if(ComidaPicada == true && ComidaCocinada == true && ComidaServida == true) {
                        System.out.println("\nLa comida ha sido preparada y servida con exito!");
                    } else {
                        System.out.println("Hiciste mal uso de un robot. Intentalo de nuevo");
                    }
                    break;
                case 5:
                    break;
            }
        }


    }
}