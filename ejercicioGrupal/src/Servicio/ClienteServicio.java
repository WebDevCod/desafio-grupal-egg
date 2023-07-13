package Servicio;

import java.util.Scanner;
import Entidad.Cliente;
import java.util.ArrayList;

public class ClienteServicio {

    Scanner leer = new Scanner(System.in);

    ArrayList<Cliente> clientes = new ArrayList<>();

    private static int nextId = 1;
    private int id_usuario;

    public void incrementoId() {
        id_usuario = nextId;
        nextId++;
    }

    public void registrarCliente() {

        Cliente c = new Cliente();

        incrementoId();
        c.setId(id_usuario);
        System.out.println("Nombre:");
        c.setNombre(leer.nextLine());
        System.out.println("Edad:");
        c.setEdad(leer.nextInt());
        leer.nextLine();
        System.out.println("Altura:");
        c.setAltura(leer.nextDouble());
        System.out.println("Peso:");
        c.setPeso(leer.nextDouble());
        leer.nextLine();
        System.out.println("Objetivo:");
        c.setObjetivo(leer.nextLine());

        clientes.add(c);

    }

    public void obtenerClientes() {
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println(clientes.get(i).toString());
        }
    }

    public void buscarCliente() {
        System.out.println("Ingresar nombre");
        String nombre_ingresado = leer.nextLine();
        for (int i = 0; i < clientes.size(); i++) {
            if (nombre_ingresado.equalsIgnoreCase(clientes.get(i).getNombre())) {
                System.out.println("Nombre nuevo");
                String nombre = leer.nextLine();
                System.out.println("Edad nueva");
                int edad = leer.nextInt();
                leer.nextLine();
                System.out.println("Altura nueva");
                double altura = leer.nextDouble();
                System.out.println("Peso nuevo");
                double peso = leer.nextDouble();
                leer.nextLine();
                System.out.println("Objetivo nuevo");
                String objetivo = leer.nextLine();

                actualizarCliente(clientes.get(i).getId(), nombre, edad, altura, peso, objetivo);
            }
            System.out.println("El usuario con ese nombre no aparece.");
        }

    }

    private void actualizarCliente(int id, String nombre, int edad, double altura, double peso, String objetivo) {

        Cliente cn = new Cliente(id, nombre, edad, altura, peso, objetivo);
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getId() == id) {
                clientes.set(i, cn);
            }
            obtenerClientes();
        }
    }

    public void eliminarCliente(int id) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getId() == id) {
                clientes.remove(i);
            } else {
                System.out.println("Usuario no encontrado.");
            }
        }

    }
}
