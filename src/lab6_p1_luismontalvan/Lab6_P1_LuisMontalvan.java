/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6_p1_luismontalvan;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author luism
 */
public class Lab6_P1_LuisMontalvan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        OUTER:
        do{
            Scanner pochita = new Scanner(System.in);
            System.out.print("Menu------------\n1)Juego de la vida\n2)iedra, papel, o...\n3)Blink-182\n4)Salir\nPorfavor elija una opcion: ");
            int opc = pochita.nextInt();
            switch(opc){
                case 1:
                    //opcion1
                    JuegoVida();
                    break;
                case 2:
                    //opcion2
                    piedraPapelO();
                    break;
                case 3:
                    //opcion 3
                    Blink182();
                    break;
                case 4:
                    //salir
                    break OUTER;
                case 5:
                    //repetir decision
                    break;
            } 
        }while(true);
        
    }
    public static int[][] generarMatriz(int fila, int columna){
        int [][] matriz = new int[fila][columna];
        return matriz;
    }
    public static String[][] generarMatriz2(int fila, int columna){
        String [][] matriz = new String[fila][columna];
        return matriz;
    }
    public static String[][] llenarMatriz(String[][]matriz,int fila, int columna){
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                if(i==0&&j==0){
                    matriz[0][0]="P";
                }else{
                    matriz[i][j]= "-";
                }
            }
 
        }
        return matriz;
    }
    public static void JuegoVida(){
        int codigo= 1;
        int fila= 8;
        int columna= 8;
        String[][] matriz= generarMatriz2(fila,columna);
        matriz = llenarMatriz(matriz,fila, columna);
        imprimirMatriz(matriz);
    }
    public static void piedraPapelO(){
       Scanner pochita= new Scanner(System.in);
       int codigo = 2;
       int fila= 5;
       int columna= 5;
       int[][] matriz= generarMatriz(fila,columna);
       System.out.print("1)Scissors\n2)Paper\n3)Rock\n4)Lizard\n5)Spock\nPorfavor elija una opcion: ");
       int eleccionJugador= (pochita.nextInt()-1);
       int eleccionComputadora= new Random().nextInt((4-0)+1);
       matriz = llenarMatriz(matriz,codigo,fila,columna);
       imprimirMatriz(matriz);
       int ganador= matriz[eleccionJugador][eleccionComputadora];
       
       switch(eleccionJugador){
           case 0:
               System.out.println("El Jugador eligio: Scissors");
               break;
           case 1:
               System.out.println("El Jugador eligio: Paper");
              break;
           case 2:
               System.out.println("El Jugador eligio: Rock");
               break;
           case 3:
               System.out.println("El Jugador eligio: Lizard");
               break;
           case 4:
               System.out.println("El Jugador eligio: Spock");
               break;
           default:
               System.out.println("Elija una opcion valida");
               break;    
       }
       
       switch(eleccionComputadora){
           case 0:
               System.out.println("La computadora eligio: Scissors");
               break;
           case 1:
               System.out.println("La computadora eligio: Paper");
              break;
           case 2:
               System.out.println("La computadora eligio: Rock");
               break;
           case 3:
               System.out.println("La computadora eligio: Lizard");
               break;
           case 4:
               System.out.println("La computadora eligio: Spock");
               break;
       }
       if(ganador==1){
           System.out.println("El jugador gana");
       }else if(ganador==0){
           System.out.println("La computadora gana");
       }else{
           System.out.println("Empate");
       }
       
    }
    public static void Blink182(){
    int codigo= 3;
    Scanner pochita= new Scanner(System.in);
    System.out.print("Ingrese el numero de filas que desea que tenga la matriz: ");
    int fila= pochita.nextInt();
    System.out.print("Ingrese el numero de columnas que desea que tenga la matriz: ");
    int columna= pochita.nextInt();
    int [][] matriz= generarMatriz(fila,columna);
    matriz = llenarMatriz(matriz,codigo,fila,columna);
    imprimirMatriz(matriz);
    
    
    }
    public static int[][] llenarMatriz(int[][]matriz,int codigo,int fila, int columna){
        switch(codigo){
            case 1:
                break;
            case 2:
                for (int i = 0; i < fila; i++) {
                    for (int j = 0; j < columna; j++) {
                        if(i==j){
                            matriz[i][j]= -1;
                        }else if(i==0){
                            matriz[i][1]= 1;
                            matriz[i][3]= 1;
                        }else if(i==1){
                            matriz[i][2]= 1;
                            matriz[i][4]= 1;
                        }else if(i==2){
                            matriz[i][0]= 1;
                            matriz[i][3]= 1;
                        }else if(i==3){
                            matriz[i][1]= 1;
                            matriz[i][4]= 1;
                        }else if(i==4){
                            matriz[i][0]= 1;
                            matriz[i][2]= 1;
                        }else{
                            matriz[i][j]= 2;
                        }
                    }
                    
                }
                break;
            case 3:
                int ranNum= new Random().nextInt(((122-97)+1)+97);
                for (int i = 0; i < fila; i++) {
                    
                    for (int j = 0; j < columna; j++) {
                        matriz[i][j]= ranNum;
                        ranNum= new Random().nextInt(((122-97)+1)+97);
                        
                    }
                    
                }
                break;
        }
        return matriz;
    }
    public static void imprimirMatriz(int [][] matriz){
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
              System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
    }
    public static void imprimirMatriz(String [][] matriz){
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
              System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
    }
    
}
