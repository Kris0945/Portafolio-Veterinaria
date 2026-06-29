public class Cita {
    //Atributos
    private String fecha;

    //Agregacion
    private Veterinario veterinario;
    private Dueno dueno;

    //Constructor

    public Cita(String fecha, Veterinario veterinario, Dueno dueno) {
        this.fecha = fecha;
        this.veterinario = veterinario;
        this.dueno = dueno;
    }

    //Getters

    public String getFecha() {
        return fecha;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public Dueno getDueno() {
        return dueno;
    }

    //Setters

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public void setDueno(Dueno dueno) {
        this.dueno = dueno;
    }

    //Metodo
    public void mostrarCita(){
        System.out.println("Fecha: " + fecha);
        System.out.println("Veterinario: " + veterinario.getNombre());
        System.out.println("Dueño: " + dueno.getNombre());
    }
}
