/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej6;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class Ej6 {
//*************************Metodos*********************************************
//---------------------Generar Vector------------------------------------------

    static void generarNumeros(int v[]) {
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * 10) + 1;
        }
    }
    
    static void escribirVector(int []v){
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " | ");
        }
        System.out.println("");
    }

//----------------Repeticiones-------------------------------------------------

    static int repeticiones(int v[], int n) {
        int veces = 0;

        for (int i = 0; i < v.length; i++) {
            if (v[i] == n) {
                veces++;
            }
        }

        return veces;
    }
//*****************************************************************************
//-------------------------Principal-------------------------------------------
//*****************************************************************************

    public static void main(String[] args) {
        //Variables
        Scanner sc = new Scanner(System.in);
        int vector[] = new int[10];
        int num;

        //Inicio
        System.out.println("Voy a generar un vector con números entre el 1 y el 100");
        generarNumeros(vector);
        escribirVector(vector);
        System.out.print("Dime un número y te digo las veces que se repite --> ");
        num = sc.nextInt();
        System.out.println("Se repite " + repeticiones(vector, num) + " veces");
    }

}
