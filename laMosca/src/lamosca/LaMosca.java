/*
 *la mosca
 */
package lamosca;

import java.util.Scanner;

/**
 *
 * @author Jonathan
 */
public class LaMosca {

    static void moverTablero(char[] tablero) {
        int mosca = (int) (Math.random() * 5);
        tablero[mosca] = 'M';
        for (int i = 0; i < tablero.length; i++) {
            if (i != mosca) {
                tablero[i] = '-';
            }
        }
    }

    static void mostarVector(char[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println("");
    }

    static boolean laHasMatado(int golpeo, char[] tablero) {
        boolean estaMuerta = false;
        if (tablero[golpeo]=='M'){
            estaMuerta = true;
        }        
        /*for (int i = 0; i < tablero.length; i++) {
            if (golpeo == i) {
                if (tablero[i] == 'M') {
                    estaMuerta = true;
                }
            }
        }*/
        return estaMuerta;
    }

    static boolean seMovio(int golpeo, char[] tablero) {
        boolean seMovio = false;
        
            if (golpeo == 0) {
                if (tablero[golpeo + 1] == 'M') {
                    seMovio = true;
                }
            }
            if (golpeo == (tablero.length - 1)) {
                if (tablero[golpeo - 1] == 'M') {
                    seMovio = true;
                }
            }
            if (golpeo != 0 && golpeo != (tablero.length - 1)) {
                if (tablero[golpeo - 1] == 'M' || tablero[golpeo + 1] == 'M') {
                    seMovio = true;
                }
            }
        
        return seMovio;
    }

    public static void main(String[] args) {
        //variables
        int golpeo;
        int cont = 0;
        boolean estaMuerta = false;
        boolean seHaMovido = false;
        Scanner escaner = new Scanner(System.in);
        char[] tablero = new char[5];

        // inicio
        moverTablero(tablero);
        //mostarVector(tablero);
        //while (estaMuerta==false && cont<5)
        while (!estaMuerta && cont < 5) {
            System.out.println("Donde golpeas?");
            System.out.println("0-1-2-3-4");
            golpeo = escaner.nextInt();
            estaMuerta = laHasMatado(golpeo, tablero);

            if (estaMuerta) {
                System.out.println("Mosca Muerta");
                System.out.println("Conseguido en: " + cont + " intentos.");
            } else {
                seHaMovido = seMovio(golpeo, tablero);
                cont++;
                if (seHaMovido) {
                    System.out.println("Estaba cerca! Pero se ha movido");
                    moverTablero(tablero);
                    //mostarVector(tablero);
                } else {
                    System.out.println("Ni se ha inmutado");
                }
            }
        }
        System.out.println("Estaba aqui");
        mostarVector(tablero);
        //fin
    }

}
