/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2;

/**
 *
 * @author Alejandro
 */
public class Ej2 {
//*************************Metodos*********************************************

    static void vecPares(int v[]) {
        int c = 0;
        for (int i = 0; i < v.length; i++) {
            v[i] = c;
            c += 2;
        }
    }

    static void vecImp(int v[]) {
        int c = 1;
        for (int i = 0; i < v.length; i++) {
            v[i] = c;
            c += 2;
        }
    }

    static void mostrarVector(int v[]) {
        for (int i = 0; i < v.length; i++) {
            System.out.println("[" + i + "]=" + v[i]);
        }
    }

//*****************************************************************************
//-------------------------Principal-------------------------------------------
//*****************************************************************************
    public static void main(String[] args) {
        //Variables
        int vectorp[] = new int[10];
        int vectori[] = new int[10];
        //Inicio

        vecPares(vectorp);
        mostrarVector(vectorp);
        System.out.println("------");
        vecImp(vectori);
        mostrarVector(vectori);
    }

}
