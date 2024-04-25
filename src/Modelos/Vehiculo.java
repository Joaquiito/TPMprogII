/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

public abstract class Vehiculo {
    private int nroChasis, nroMotor, anio;
    private String color, marca, modelo;

    //Contructores

    public Vehiculo() {
    }

    public Vehiculo(int nroChasis, int nroMotor, int anio, String color, String marca, String modelo) {
        this.nroChasis = nroChasis;
        this.nroMotor = nroMotor;
        this.anio = anio;
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
    }

    //Getters y Setters

    public int getNroChasis() {
        return nroChasis;
    }

    public void setNroChasis(int nroChasis) {
        this.nroChasis = nroChasis;
    }

    public int getNroMotor() {
        return nroMotor;
    }

    public void setNroMotor(int nroMotor) {
        this.nroMotor = nroMotor;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}

