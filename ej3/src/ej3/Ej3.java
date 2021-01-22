/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class Ej3 {
//*************************Metodos*********************************************

    static void rellenarVector(float v[]) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < v.length; i++) {
            System.out.print("Dame la nota " + i + " --> ");
            v[i] = sc.nextFloat();
        }

    }

    static float calcMedia(float v[]) {
        float suma = 0, media = 0;

        for (int i = 0; i < v.length; i++) {
            suma = suma + v[i];
        }
        media = suma / v.length;

        return media;
    }

//*****************************************************************************
//-------------------------Principal-------------------------------------------
//*****************************************************************************
    public static void main(String[] args) {
        //Variables
        float vector[] = new float[10];
        float media;

        //Inicio
        rellenarVector(vector);
        media = calcMedia(vector);
        
        System.out.println("La media es --> " + media);
        System.out.printf("La media es --> %.2f\n", media);
    }

}
