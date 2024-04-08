/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 1061017158
 */
import java.util.ArrayList;

public class Competencia {
    private ArrayList <Atleta> atletas;

    public Competencia (){
        atletas = new ArrayList<>();
    }
    public void registrarAtleta(String Nombre, String Nacionalidad, double Tiempo){
        Atleta nuevoAtleta = new Atleta (Nombre, Nacionalidad, Tiempo);
        atletas.add(nuevoAtleta);
    }
    
    public Atleta encontarCampeon (){
       Atleta campeon = atletas.get(0); 
       for (Atleta atleta : atletas){
           if (atleta.getTiempo() < campeon.getTiempo()){
               campeon=atleta;
           }
       }
       return campeon;
       }

    
    
}
