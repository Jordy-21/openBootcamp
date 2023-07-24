package paqprincipal;


public class main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setEdad(10);
        cliente.setNombre("Carlitos");
        cliente.setTelefono(98652136);
        cliente.setCredito(20);

        System.out.println(cliente.getEdad());
        System.out.println(cliente.getNombre());
        System.out.println(cliente.getTelefono());
        System.out.println(cliente.getCredito());


        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(2);
        trabajador.setNombre("Juan");
        trabajador.setTelefono(98632136);
        trabajador.setSalario(5500);

        System.out.println(trabajador.getEdad());
        System.out.println(trabajador.getNombre());
        System.out.println(trabajador.getTelefono());
        System.out.println(trabajador.getSalario());
    }
}
class Persona{
    private int edad;
    private String nombre;
    private int telefono;

    //GET Y SET DE EDAD
    public void  setEdad(int años){
        this.edad = años;
    }
    public int getEdad(){
        return this.edad;
    }

    //GET Y SET DE NOMBRE
    public void setNombre(String name){
        this.nombre = name;
    }
    public String getNombre(){
        return this.nombre;
    }

    //GET Y SET DE TELEFONO
    public void setTelefono(int fono){
        this.telefono = fono;
    }
    public int getTelefono(){
        return this.telefono;
    }

}

class Cliente extends Persona{
    private int credito;

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona{
    private float salario;

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}

