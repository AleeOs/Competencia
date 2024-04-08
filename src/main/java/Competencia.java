/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 1061017158
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

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
    
    
    public double binarySearch(ArrayList<Atleta> atletas, double Tiempo){
        //Collections.sort(atletas.c);
        double tiempo2=;
        
        Atleta campeon = atletas.get(0); 
        int left = 0;
        int right = atletas.size()-1;
        while (left <= right){
            int mid=left+(right-left)/2; //Indice de la mitad
            for (Atleta atleta : atletas){
                if(Tiempo == atleta.getTiempo()){
                    tiempo2=Tiempo;
                }
                
           }
         //Tomar el valor mid y preguntar si podemos buscamos a lado derecho
         if(atletas.get(mid)== atletas.get(tiempo2)){
             return mid;
         }

           }
            
            
                
        
    }
    
        public ArrayList<String> atletaPorPais (String Pais){
        ArrayList<String> atletaPorPais = new ArrayList<>();
        for (Atleta atleta : atletas){
            if (atleta.getNacionalida().equalsIgnoreCase(Pais)){
                atletaPorPais.add(atleta.getNombre());
      }//Finaliza el if
    }//Finaliza el for
        return atletaPorPais;
  }
        
        
    
    
}
