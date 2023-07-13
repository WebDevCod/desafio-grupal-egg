package ejerciciogrupal;

import Servicio.ClienteServicio;
import java.util.Scanner;

public class EjercicioGrupal {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        ClienteServicio cs = new ClienteServicio();

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

//                break;
//                case 1:
//
//                break;
//                case 1:
//
//                break;
//                case 1:
//
//                break;
//                case 1:
//
//                break;
//                case 1:
//
//                break;
                default:
                    System.out.println("Error al seleccionar item de lista");
            }

        } while (opcion != 9);

    }

}
