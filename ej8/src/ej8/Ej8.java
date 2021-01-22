/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej8;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class Ej8 {
//*************************Metodos*********************************************

    static void inicilizarVector(int v[]) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < v.length; i++) {
            System.out.print("Dame un número --> ");
            v[i] = sc.nextInt();
        }
    }

    static void invertirVector(int v1[], int v2[]) {
        int i2 = v2.length - 1;

        for (int i = 0; i < v1.length; i++) {
            v2[i2] = v1[i];
            i2--;
        }
    }

    static int[] invertirVector2(int v1[]) {
        int v2[] = new int[v1.length];
        int i2 = v2.length - 1;

        for (int i = 0; i < v1.length; i++) {
            v2[i2] = v1[i];
            i2--;
        }
        return v2;
    }
    
    static void mostrarVector(int v[]) {

        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " | ");
        }
        System.out.println(" ");
    }
//*****************************************************************************
//-------------------------Principal-------------------------------------------
//*****************************************************************************

    public static void main(String[] args) {
        //Variables
        int vectorNormal[] = new int[5];
        int vectorInvertido[] = new int[5];

        //Inicio
        inicilizarVector(vectorNormal);
        //invertirVector(vectorNormal, vectorInvertido);
        vectorInvertido = invertirVector2(vectorNormal);
        mostrarVector(vectorNormal);
        mostrarVector(vectorInvertido);
    }

}
