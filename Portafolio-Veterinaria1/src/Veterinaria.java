public class Veterinaria {
    //Atributos
    private String nombre;

    //Constructor

    public Veterinaria(String nombre) {
        this.nombre = nombre;
    }

    //Getters

    public String getNombre() {
        return nombre;
    }

    //Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Dependencia
    public void registrarCita(Cita cita) {
        System.out.println("Veterinaria: " + nombre);
        cita.mostrarCita();
    }
}
