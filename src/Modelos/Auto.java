/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

public class Auto extends Vehiculo {
    private int cantPuertas;
    static int autosVend;

    //Constructores

    public Auto() {
       
    }

    public Auto(int nroChasis, int nroMotor, int anio, String color, String marca, String modelo, int cantPuertas) {
        super(nroChasis, nroMotor, anio, color, marca, modelo);
        this.cantPuertas = cantPuertas;
    }

    //Getters y Setters

    public int getCantPuertas() {
        return cantPuertas;
    }

    public void setCantPuertas(int cantPuertas) {
        this.cantPuertas = cantPuertas;
    }

    public static int getAutosVend() {
        return autosVend;
    }

    public static void setAutosVend(int autosVend) {
        Auto.autosVend = autosVend;
    }
}

