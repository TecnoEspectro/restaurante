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
    int suma = 0;
    int mas = 0;
    int menos = 100;
    int totalMas = 0;
    int totalMenos = 0;
    String masDia;
    String menosDia;
    int sumaTotal = 0;
    int restaTotal = 0;
    String totDia;
    String menDia;
    int sumaFinal = 0;
    int prom = 0;
    int promFinal = 0;
    Platos arrayObjetos[];
    
    public void crearMenu(int cantity){
   
        arrayObjetos = new Platos[cantity];
        
        Platos obj=new Platos();
        
        int i =0;
        while(i<cantity){
        
            obj.setNombre(JOptionPane.showInputDialog("Nombre del plato"));
            obj.setPrecio(Integer.parseInt("Precio del plato"));
            
            
        }

        

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
    
    public void analizarDatos(){
    
        System.out.println("Mostrar platos vendidos individualmente ");
        System.out.println("Plato 1");
        sumaFinal=0;
        for(int c=0; c<platos.length; c++){
        suma=0;
        mas=0;
        menos=100;
            for(int f=0; f<6; f++){
                
                if(mas<datos[f][c]){masDia=dias[f];}
                if(menos>datos[f][c]){menosDia=dias[f];}
                if(mas<datos[f][c]){sumaTotal=datos[f][c];}
                if(menos>datos[f][c]){restaTotal=datos[f][c];}
                if(mas<datos[f][c]){totDia=dias[f];}
                if(menos>datos[f][c]){menDia=dias[f];}
                if(mas<datos[f][c]){mas=datos[f][c];}
                if(menos>datos[f][c]){menos=datos[f][c];}
                suma+=datos[f][c];
                
            }
            prom = suma/6;
            totalMas+=sumaTotal;
            totalMenos+=restaTotal;
            sumaFinal+=suma;
            
                 JOptionPane.showMessageDialog(null, "Ventas totales del plato " + platos[c] + " en la semana es de " + suma);
                 JOptionPane.showMessageDialog(null, "La mayor venta del plato fue de "+ mas + " en el dia " + masDia + " y la menor venta del plato fue de " + menos + " en el dia " + menosDia);
                 JOptionPane.showMessageDialog(null, "Promedio de ventas del plato en la semana fue de "+ prom);
                 
        }
        promFinal = sumaFinal/6;
        JOptionPane.showMessageDialog(null, "La mayor venta de los platos fue de "+ sumaTotal + " en el dia " + totDia + " y la menor venta de los platos fue de " + restaTotal + " en el dia " + menDia);
        JOptionPane.showMessageDialog(null, "Sumando los dias de mayor venta de los platos, la venta maxima fue "+ totalMas + " y sumando los dias de menor venta, las ventas minimas fueron " + totalMenos);
        JOptionPane.showMessageDialog(null, "La venta total entre todos los platos fue de "+ sumaFinal);
        JOptionPane.showMessageDialog(null, "Promedio por ventas totales "+ promFinal);
        
    }
    
}
