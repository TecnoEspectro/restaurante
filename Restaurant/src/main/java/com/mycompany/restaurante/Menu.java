/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.restaurante;

import javax.swing.JOptionPane;
import java.util.Arrays;
/**
 *
 * @author SCIS2-13
 */
public class Menu {
    
    String platos[];
    int datos[][];
    String dias[]=new String[]{"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado"};
    
    public void crearMenu(int cantity){
    
        platos=new String[cantity];
        
        int i =0;
        while(i<cantity){
        
            platos[i]=JOptionPane.showInputDialog("Diga el nombre del plato " + (i+1));
            i++;
            
        }
        
    }
    
    public void consultarMenu(){
    
        for(int i=0; i<platos.length;i++){
        JOptionPane.showMessageDialog(null, "Platos: "+ platos[i]);
        }
        
    }
    
    public void ingresarDatos(){
    
        datos=new int[6][platos.length];
        
        for(int f=0; f<6; f++){
        
            for(int c=0; c<platos.length; c++){
        
                datos[f][c]=Integer.parseInt(JOptionPane.showInputDialog("Ventas para el dia: "+dias[f]+ " Plato: " + platos[c]));
            
            }
        
        }
        
    }
    
}
