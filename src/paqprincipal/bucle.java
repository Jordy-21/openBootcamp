package paqprincipal;

import java.util.Scanner;

public class bucle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        System.out.println("----------Elija una Opción del Ejemplo de Bucles--------");
        System.out.println("[1] Bucle If");
        System.out.println("[2] Bucle While");
        System.out.println("[3] Bucle Do While");
        System.out.println("[4] Bucle for");
        System.out.println("[5] Bucle Switch");
        System.out.println("--------------------------------------------------------");

        opcion= scanner.nextInt();

        switch (opcion){
            case 1:
                bucle_if();
                break;
            case 2:
                bucle_while();
                break;
            case 3:
                bucle_dowhile();
                break;
            case 4:
                bucle_for();
                break;
            case 5:
                bucle_switch();
                break;
                default:
                    System.out.println("Ingresa una Opción Correcta, vuelve a intentarlo...");
        }
    }
    static void bucle_if(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("----Caso If----");
        System.out.println("Digite el númeroIf");
        int numeroIf = scanner.nextInt();

        if(numeroIf>0){
            System.out.println("Es Positivo");
        }else if (numeroIf==0){
            System.out.println("Es igual a Cero");
        }else {
            System.out.println("Es Negativo");
        }
    }

    static void bucle_while(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("----Caso While----");
        System.out.println("Digite el númeroWhile");
        System.out.println("Este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3");
        System.out.println("------------------");
        int numWhile = scanner.nextInt();

        while (numWhile<3){
            System.out.println(numWhile);
            numWhile++;
        }
    }

    static void bucle_dowhile(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("----Caso Do While----");
        System.out.println("Digite el númeroWhile");
        System.out.println("Este bucle crea la misma estructura que en el While, pero solo se debe ejecutar una vez");
        System.out.println("------------------");
        int doWhile = scanner.nextInt();

        do {
            System.out.println(doWhile);
            doWhile++;
        }
        while (doWhile<3);
    }

    static void bucle_for(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("----Caso For----");
        System.out.println("Digite el númeroFor");
        System.out.println("su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute");
        int numFor = scanner.nextInt();

        for (numFor = 0; numFor <=3; numFor++){
            System.out.println(numFor);
        }
    }

    static void bucle_switch(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("----Caso Switch----");
        System.out.println("Ingrese 1 de las 4 estaciones del año");
        System.out.println("----Opciones:------");
        System.out.println("VERANO");
        System.out.println("PRIMAVERA");
        System.out.println("OTOÑO");
        System.out.println("INVIERNO");
        String estacion = scanner.next().toUpperCase();

        switch (estacion) {
            case ("VERANO"):
                System.out.println("Usted se encuentra en la Estación " + estacion);
                break;

            case ("PRIMAVERA"):
                System.out.println("Usted se encuentra en la Estación " + estacion);
                break;

            case ("OTOÑO"):
                System.out.println("Usted se encuentra en la Estación " + estacion);
                break;

            case ("INVIERNO"):
                System.out.println("Usted se encuentra en la Estación " + estacion);
                break;
            default:
                System.out.println("No es una Estación, vuelve a intentarlo...");
        }
    }
}
