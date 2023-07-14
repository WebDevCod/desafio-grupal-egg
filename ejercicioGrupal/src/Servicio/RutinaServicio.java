package Servicio;

import Entidad.Rutina;
import java.util.ArrayList;
import java.util.Scanner;

public class RutinaServicio {

    Scanner leer = new Scanner(System.in);

    ArrayList<Rutina> rutinas = new ArrayList<>();

    private static int nextId = 1;
    private int id_rutina;

    public void incrementoId() {
        id_rutina = nextId;
        nextId++;
    }

    public void crearRutina(Rutina r) {

        incrementoId();

        r.setId(id_rutina);

        System.out.println("Nombre:");
        r.setNombre(leer.nextLine());

        System.out.println("Duración:");
        r.setDuracion(leer.nextInt());
        leer.nextLine();

        System.out.println("Nivel de dificultad:");
        r.setNivelDeDificultad(leer.next());
        leer.nextLine();

        System.out.println("Descripción:");
        r.setDescripcion(leer.nextLine());

        rutinas.add(r);

    }

    public void obtenerRutinas() {
        System.out.println(rutinas);
    }

    public void buscarRutina() {
        System.out.println("Ingresar nombre");
        String nombre_ingresado = leer.nextLine();
        boolean bandera = false;
        for (int i = 0; i < rutinas.size(); i++) {
            if (nombre_ingresado.equalsIgnoreCase(rutinas.get(i).getNombre())) {
                bandera = true;
                System.out.println("Nombre nuevo");
                String nombre = leer.nextLine();
                System.out.println("Duración nueva");
                int duracion = leer.nextInt();
                leer.nextLine();
                System.out.println("Nivel de dificultad nueva");
                String nivDif = leer.nextLine();
                leer.nextLine();
                System.out.println("Descripción nueva");
                String descripcion = leer.nextLine();
                leer.nextLine();

                actualizarRutina(rutinas.get(i).getId(), nombre, duracion, nivDif, descripcion);
            }
        }
        if (!bandera) {
            System.out.println("La rutina con ese nombre no aparece.");
        }
    }

    public void actualizarRutina(int id, String nombre, int duracion, String nivelDeDificultad, String descripcion) {
        Rutina rn = new Rutina(id, nombre, duracion, nivelDeDificultad, descripcion);
        for (int i = 0; i < rutinas.size(); i++) {
            if (rutinas.get(i).getId() == id) {
                rutinas.set(i, rn);
            }
            obtenerRutinas();
        }
    }

    public void eliminarRutina(int id) {
        boolean bandera = false;
        for (int i = 0; i < rutinas.size(); i++) {
            if (rutinas.get(i).getId() == id) {
                bandera = true;
                rutinas.remove(i);
                System.out.println("Rutina eliminada");
            }
        }
        if (!bandera) {
            System.out.println("Rutina no encontrada.");

        }
    }
}
