public class Veterinario {
    //Atributos
    private String nombre;
    private String especialidad;

    //Constructor

    public Veterinario(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    //Getters

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    //Método
    public void atenderMascota() {

        System.out.println(nombre + " está atendiendo una mascota.");

    }
}
