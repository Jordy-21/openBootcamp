package paqprincipal;

public class Principal {
    public static void main(String[] args){
        System.out.println("Prueba OpenBotcamp");

        int x = 4;
        int y = 7;
        int z = 12;
        var valor= suma(x, y, z);
        System.out.println("Suma de 3 números entre si: "+valor);

        coche miCoche = new coche();
        miCoche.incremetoPuerta();
        System.out.println("Número de puertas mas 1: "+miCoche.numPuertas);

    }
    public static int suma( int a, int b, int c){
        return a+b+c;
    }
}
class coche{
    public int numPuertas = 4;

    public void incremetoPuerta(){
        this.numPuertas++;
    }
}