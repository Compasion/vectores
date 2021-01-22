/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej7;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class Ej7 {
//*************************Metodos*********************************************
//---------------------Generar Vector------------------------------------------

    static void generarNumeros(int v[]) {
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * 10) + 1;
        }
    }

    static void escribirVector(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " | ");
        }
        System.out.println("");
    }

//----------------Calcular Primera Posicion-------------------------------------
    static int posicion(int v[], int n) {
        int pos = -1;
        int i = 0;
        
        //Opción a)
//        for (i = 0; i < v.length; i++) {
//            if (v[i] == n) {
//                if (pos == -1) {
//                    pos = i;
//                }
//            }
//        }

        //Opción b)
        i = 0;
        while (i < v.length && pos == -1) {
            if (v[i] == n) {
                pos = i;
            }
            i++;
        }

        return pos;
    }

//*****************************************************************************
//-------------------------Principal-------------------------------------------
//*****************************************************************************
    public static void main(String[] args) {
        //Variables
        Scanner sc = new Scanner(System.in);
        int vector[] = new int[10];
        int num, pos;

        //Inicio
        System.out.println("Voy a generar un vector con números entre el 1 y el 100");
        generarNumeros(vector);
        escribirVector(vector);
        System.out.print("Dime un número y te digo la primera posicion en la que se encuentra --> ");
        num = sc.nextInt();
        pos = posicion(vector, num);
        if (pos != -1) {
            System.out.println("El número " + num + " se encuentra en la posicion " + pos);
        } else {
            System.out.println("El número no se ha encontrado");
        }

    }

}
