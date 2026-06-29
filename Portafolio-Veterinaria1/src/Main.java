import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Mascota mascota = new Mascota("Manchas", "Perro", 2);

        Dueno dueno = new Dueno("Ana Martinez", "12345678", mascota);

        Veterinario veterinario = new Veterinario("Ana Gómez", "Cirugía");

        Cita cita = new Cita("15/06/2026", veterinario, dueno);

        Veterinaria veterinaria = new Veterinaria("Patitas Felices");

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n========= MENÚ =========");
            System.out.println("1. Mostrar mascota");
            System.out.println("2. Mostrar dueño");
            System.out.println("3. Mostrar cita");
            System.out.println("4. Mostrar veterinario");
            System.out.println("0. Salir");
            System.out.print("Opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    mascota.mostrarMascota();
                    break;

                case 2:
                    dueno.mostrarDueno();
                    break;

                case 3:
                    cita.mostrarCita();
                    break;

                case 4:
                    System.out.println("Nombre: " + veterinario.getNombre());
                    System.out.println("Especialidad: " + veterinario.getEspecialidad());
                    break;

                case 0:
                    System.out.println("Hasta luego.");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);

        sc.close();
    }
}
