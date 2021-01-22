/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1;

/**
 *
 * @author Alejandro
 */
public class Ej1 {
//*************************Metodos*********************************************

    static void rellenarVector(int v[]) {
        for (int i = 0; i < v.length; i++) {
            v[i] = -1;
        }
    }
    
    static void mostrarVector(int v[]) {
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
    }

//*****************************************************************************
//-------------------------Principal-------------------------------------------
//*****************************************************************************
    public static void main(String[] args) {
        //Variables
        int vector[] = new int[10];

        //Inicio
        
        rellenarVector(vector);
        mostrarVector(vector);
    }
    
}
