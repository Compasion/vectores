/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class Ej4 {
//*************************Metodos*********************************************

    static void rellenarVector(float v[]) {
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) ((Math.random() * 10) + 1);
        }
    }
    
    static void mostrarVector(float v[]) {
        for (int i = 0; i < v.length; i++) {
            System.out.println("[" + i + "]=" + v[i]);
        }
    }

    static int calculaMayor(float v[]) {
        float max = v[0];
        int pmax = 0;

        for (int i = 0; i < v.length; i++) {
            if (v[i] >= max) {
                max = v[i];
                pmax = i;
            }
        }
        return pmax;
    }

//*****************************************************************************
//-------------------------Principal-------------------------------------------
//*****************************************************************************
    public static void main(String[] args) {
        //Variables
        float v[] = new float[10];
        int p;

        //Inicio
        rellenarVector(v);
        mostrarVector(v);
        p = calculaMayor(v);
        System.out.println("El Máximo número es --> " + v[p] + " y se almacena en la pos " + p);
    }

}
