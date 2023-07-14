package ejerciciogrupal;

import Entidad.Rutina;
import Servicio.ClienteServicio;
import Servicio.RutinaServicio;
import java.util.Scanner;

public class EjercicioGrupal {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        ClienteServicio cs = new ClienteServicio();

        RutinaServicio rs = new RutinaServicio();

        int opcion;

        do {
            System.out.println("Selecciona una opción");
            System.out.println("1) Registrar cliente");
            System.out.println("2) Obtener clientes");
            System.out.println("3) Actualizar cliente");
            System.out.println("4) Eliminar cliente");
            System.out.println("=====================");
            System.out.println("5) Registrar rutina");
            System.out.println("6) Obtener rutina");
            System.out.println("7) Actualizar rutina");
            System.out.println("8) Eliminar rutina");
            System.out.println("9) Salir");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    cs.registrarCliente();
                    break;
                case 2:
                    cs.obtenerClientes();
                    break;
                case 3:
                    cs.buscarCliente();
                    break;
                case 4:
                    cs.obtenerClientes();
                    System.out.println("Ingresa el nro de id del cliente a eliminar");
                    int id_ingresado = leer.nextInt();
                    cs.eliminarCliente(id_ingresado);
                    break;
                case 5:
                    Rutina r = new Rutina();
                    rs.crearRutina(r);
                    break;
                case 6:
                    rs.obtenerRutinas();
                    break;
                case 7:
                    rs.buscarRutina();
                    break;
                case 8:
                    rs.obtenerRutinas();
                    System.out.println("Ingresa el nro de id de la rutina a eliminar");
                    int id_r = leer.nextInt();
                    rs.eliminarRutina(id_r);
                    break;
                case 9:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Error al seleccionar item de lista");
            }

        } while (opcion != 9);

    }

}
