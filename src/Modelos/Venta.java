/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.util.Date;

public class Venta {
    private int numeroContacto;
    private float monto;
    private int moneda;
    private Vehiculo vehiculo;
    private Date fechaOperacion;

    //Constructores

    public Venta() {
    }

    public Venta(int numeroContacto, float monto, int moneda, Vehiculo vehiculo, Date fechaOperacion) {
        this.numeroContacto = numeroContacto;
        this.monto = monto;
        this.moneda = moneda;
        this.vehiculo = vehiculo;
        this.fechaOperacion = fechaOperacion;
    }

    //Getters y Setters


    public int getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(int numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public int getMoneda() {
        return moneda;
    }

    public void setMoneda(int moneda) {
        this.moneda = moneda;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Date getFechaOperacion() {
        return fechaOperacion;
    }

    public void setFechaOperacion(Date fechaOperacion) {
        this.fechaOperacion = fechaOperacion;
    }
}

