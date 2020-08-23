/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.clase2.clase02ejercicio02;

/**
 *
 * @author carlj
 */
public class ClaseMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
    profesor Profe = new profesor("Carlos", "Barrio el chile", "15/02/2002", "M", 18, "Ingeniero", "Programador");  
        System.out.println(Profe.toString());
 
        estudiante est = new estudiante("Jenny", "Chalate", "15/02/2002","F", 28, 1500, "Ing. en sistemas y computacion");
        System.out.println(est.toString());
    }
    
   
    

    
    
}
