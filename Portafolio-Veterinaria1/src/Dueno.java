public class Dueno {
    //Atributos
    private String nombre;
    private String telefono;

    //Agregacion
    private Mascota mascota;

    //Constructor

    public Dueno(String nombre, String telefono, Mascota mascota) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.mascota = mascota;
    }

    //Getters

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public Mascota getMascota() {
        return mascota;
    }

    //Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    //Metodos
    public void mostrarDueno(){
        System.out.println("Dueño: " + nombre);
        System.out.println("Teléfono: " + telefono);

        mascota.mostrarMascota();
    }
}
