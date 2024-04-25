/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

public class Cliente {
    private long dni;
    private String nombreApellido, telefono, correoElectronico, cuil;


    //Constructores

    public Cliente() {
    }

    public Cliente(long dni, String nombreApellido, String telefono, String correoElectronico, String cuil) {
        this.dni = dni;
        this.nombreApellido = nombreApellido;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.cuil = cuil;
    }

    //Getters y Setters

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getCuil() {
        return cuil;
    }

    public void setCuil(String cuil) {
        this.cuil = cuil;
    }

}
