/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 1061017158
 */
public class Atleta {
   //Atributos
    private String Nombre;
    private String Nacionalida;
    private double Tiempo;
    //CP
    public Atleta(String Nombre, String Nacionalida, double Tiempo) {
        this.Nombre = Nombre;
        this.Nacionalida = Nacionalida;
        this.Tiempo = Tiempo;
    }
    //CNP
    public Atleta() {
    }
    //Getters
    public String getNombre() {
        return Nombre;
    }

    public String getNacionalida() {
        return Nacionalida;
    }

    public double getTiempo() {
        return Tiempo;
    }
    
}
