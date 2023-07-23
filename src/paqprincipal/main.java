package paqprincipal;


public class main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(26);
        persona.setNombre("Carlitos");
        persona.setTelefono(2345567);

        System.out.println(persona.getEdad());
        System.out.println(persona.getNombre());
        System.out.println(persona.getTelefono());
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
