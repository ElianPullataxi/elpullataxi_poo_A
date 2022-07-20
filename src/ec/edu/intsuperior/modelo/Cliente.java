/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author elian
 */
public class Cliente {

    Persona persona = new Persona();
    String telefono_contacto;

    public String getTelefono_contacto() {
        return telefono_contacto;
    }

    public void setTelefono_contacto(String telefono_contacto) {
        this.telefono_contacto = telefono_contacto;
    }

    public String mostrar(String nombre, int edad, String telefono_contacto) {
        return persona.mostrar(nombre, edad) + " " + telefono_contacto;
    }
}
