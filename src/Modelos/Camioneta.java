/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

public class Camioneta extends Vehiculo {
    private boolean cabinaDoble;
    private boolean traccionDoble;
    static int camionetasVend;

    //Constructores

    public Camioneta() {
        camionetasVend++;
    }

    public Camioneta(int nroChasis, int nroMotor, int anio, String color, String marca, String modelo, boolean cabinaDoble, boolean traccionDoble) {
        super(nroChasis, nroMotor, anio, color, marca, modelo);
        this.cabinaDoble = cabinaDoble;
        this.traccionDoble = traccionDoble;
        camionetasVend++;
    }

    //Getters y Setter

    public boolean isCabinaDoble() {
        return cabinaDoble;
    }

    public void setCabinaDoble(boolean cabinaDoble) {
        this.cabinaDoble = cabinaDoble;
    }

    public boolean isTraccionDoble() {
        return traccionDoble;
    }

    public void setTraccionDoble(boolean traccionDoble) {
        this.traccionDoble = traccionDoble;
    }

    public static int getcamionetasVend() {
        return camionetasVend;
    }

    public static void setcamionetasVend(int camionetasVend) {
        Camioneta.camionetasVend = camionetasVend;
    }
}

