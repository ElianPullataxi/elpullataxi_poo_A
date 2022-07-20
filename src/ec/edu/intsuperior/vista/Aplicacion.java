package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.*;
import java.util.Scanner;

/**
 *
 * @author elian
 */
public class Aplicacion {

    public static void main(String[] args) {
        /* ========== OBJETOS ========== */
        Scanner sn = new Scanner(System.in);
        Persona persona = new Persona();
        Cliente cliente = new Cliente();
        Empleado empleado = new Empleado();
        Directivo directivo = new Directivo();
        Empresa empresa = new Empresa();

        /* ========== VARIABLES ========== */
        System.out.println("INGRESE EL TELEFONO DE CONTACTO DEL CLIENTE");
        String telefonoCliente = sn.next();
        cliente.setTelefono_contacto(telefonoCliente);
        System.out.println("INGRESE EL NOMBRE DEL CLIENTE DE LA PERSONA");
        String nombreCliente = sn.next();
        System.out.println("INGRESE LA EDAD DEL CLIENTE");
        Integer edadCliente = sn.nextInt();
        System.out.println("INGRESE EL NOMBRE DEL EMPLEADO");
        String nombreEmpleado = sn.next();
        System.out.println("INGRESE LA EDAD DEL EMPLEADO");
        Integer edadEmpleado = sn.nextInt();
        System.out.println("INGRESE EL SUELDO DEL EMPLEADO");
        Integer sueldoEmpleado = sn.nextInt();
        System.out.println("INGRESE EL NOMBRE DE LA EMPRESA");
        String nombreEmpresa = sn.next();

        System.out.println("===================");
        System.out.println(cliente.mostrar(nombreCliente, edadCliente, telefonoCliente));
        System.out.println(empleado.mostrar(nombreEmpleado, edadEmpleado, sueldoEmpleado));
        System.out.println(empleado.mostrar(nombreEmpleado, edadEmpleado, sueldoEmpleado));
        System.out.println(empresa.mostrar(nombreEmpresa));
        System.out.println("===================");
//
//        persona.getNombre();
//        persona.getEdad();
//        persona.setNombre("Elian");
//        persona.setEdad(18);
//        persona.mostrar("Elian", 18);
//        cliente.getTelefono_contacto();
//        cliente.setTelefono_contacto("0987963202");
//        cliente.mostrar("Alan", 58, "0987963202");
//        empleado.getSueldo_bruto();
//        empleado.setSueldo_bruto(Double.MIN_NORMAL);
//        empleado.mostrar("David", 18, 1500);
//        directivo.getCategoria();
//        directivo.setCategoria("Administrador");
//        directivo.mostrar("Erik", 45, 2600, "Administrador");
//        empresa.getNombre();
//        empresa.getNombre();
//        empresa.mostrar("Lego");
    }
}
