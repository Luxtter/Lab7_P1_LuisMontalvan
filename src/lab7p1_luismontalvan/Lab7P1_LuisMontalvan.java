/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab7p1_luismontalvan;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author luism
 */
public class Lab7P1_LuisMontalvan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        menu();
    }

    public static void menu() {

        Scanner pochita = new Scanner(System.in);
        Scanner lelouch = new Scanner(System.in);
        OUTER:
        do {
            System.out.print("Menu-----\n1)El calamar Pablo\n2)Torre de control\n3)Salir\nPorfavor elija una opcion: ");
            int opc = pochita.nextInt();
            switch (opc) {
                case 1:
                    Outer:
                    System.out.print("El calamar Pablo-----\nDesea...\n1)Crear una seleccion\n2)Predecir resultados\n3)Salir\nElija una opcion: ");
                    int opc2 = pochita.nextInt();
                    Outer:
                    do {
                        switch (opc2) {
                            case 1:
                                int fila = 8;
                                int columna = 7;
                                String[][] tabla = generarTabla(fila, columna);
                                tabla = llenarTabla(tabla);
                                System.out.print("Ingrese el nombre de la seleccion: ");
                                String pais = lelouch.nextLine();
                                TablaMundial tablaTerminada = new TablaMundial(tabla, pais);
                                tablaTerminada.creador();
                                break Outer;
                            case 2:
                                int golesLocal=0;
                                int golesVisita=0;
                                golesLocal=new Random().nextInt((4-0)+1);
                                golesVisita=new Random().nextInt((2-0)+1);
                                System.out.println("Juega Japon conta Costa Rica\n|Japon  "+golesLocal+"||Costa Rica  "+golesVisita+"|");
                                TablaMundial goles= new TablaMundial(golesLocal,golesVisita);
                                golesLocal=new Random().nextInt((4-0)+1);
                                golesVisita=new Random().nextInt((2-0)+1);
                                System.out.println("Juega Belgica conta Marruecos\n|Belgica  "+golesLocal+"||Marruecos  "+golesVisita+"|");
                                goles= new TablaMundial(golesLocal,golesVisita);
                                golesLocal=new Random().nextInt((4-0)+1);
                                golesVisita=new Random().nextInt((2-0)+1);
                                System.out.println("Juega Croacia conta Canada\n|Croacia  "+golesLocal+"||Canada  "+golesVisita+"|");
                                goles= new TablaMundial(golesLocal,golesVisita);
                                golesLocal=new Random().nextInt((4-0)+1);
                                golesVisita=new Random().nextInt((2-0)+1);
                                System.out.println("Juega Espana conta Alemania\n|Espana  "+golesLocal+"||Alemania  "+golesVisita+"|");
                                goles= new TablaMundial(golesLocal,golesVisita);
                                break Outer;
                            case 3:
                                break Outer;
                            default:
                                break;
                        }
                    } while (true);
                    break;
                case 2:
                    String avion1= "";
                    String avion2= "";
                    String avion3= "";
                    
                    TorreControl datos= new TorreControl(avion1, avion2, avion3);
                    for (int i = 0; i < 3; i++) {
                        switch(i){
                            case 0:
                                System.out.print("--Bienvenido al nuevo sistema de torre de control--\nIngrese el modelo del avion: ");
                                avion1 = lelouch.nextLine();
                                datos= new TorreControl(avion1, avion2, avion3);
                                break;
                            case 1:
                                System.out.print("--Bienvenido al nuevo sistema de torre de control--\nIngrese el modelo del avion: ");
                                avion2 = lelouch.nextLine();
                                datos= new TorreControl(avion1, avion2, avion3);
                                break;
                            case 2:
                                System.out.print("--Bienvenido al nuevo sistema de torre de control--\nIngrese el modelo del avion: ");
                                avion3 = lelouch.nextLine();
                                datos= new TorreControl(avion1, avion2, avion3);
                                break;
                        }
                        
                        System.out.print("Ingrese el codigo: ");
                        String codigo = lelouch.nextLine();
                        System.out.print("Ingrese el ano de fabricaion: ");
                        int ano = pochita.nextInt();
                        System.out.print("Ingrese la capacidad maxima de pasajeros: ");
                        int pasajeros = pochita.nextInt();
                        System.out.print("Ingrese el peso del avion: ");
                        int peso = pochita.nextInt();
                        System.out.print("Ingrese el nombre de la aerolinia: ");
                        String aerolinia = lelouch.nextLine();
                        System.out.println("--Se ha agregado el avion exitosamente--");
                        
                        
                    }
                    datos.disponibilidad();
                    break;
                case 3:
                    break OUTER;
                default:
                    break;
            }

        } while (true);
    }

    public static String[][] generarTabla(int fila, int columna) {
        String[][] tabla = new String[fila][columna];
        return tabla;
    }

    public static String[][] llenarTabla(String[][] tabla) {

        int goles = 0;
        for (int i = 0; i < 8; i++) {
            tabla[i][6] = "";
            if (i < 4) {
                tabla[i][0] = "Grupo E";
            } else {
                tabla[i][0] = "Grupo F";
            }
            if (i < 2) {
                tabla[i][4] = "Si";
            } else {
                tabla[i][4] = "No";
            }
            tabla[i][3] = "26";
            tabla[i][6] += goles;
        }
        tabla[0][1] = "Espana";
        tabla[1][1] = "Alemania";
        tabla[2][1] = "Costa Rica";
        tabla[3][1] = "Japon";
        tabla[4][1] = "Belgica";
        tabla[5][1] = "Croacia";
        tabla[6][1] = "Canada";
        tabla[7][1] = "Marruecos";
        tabla[0][2] = "Luis Enrique";
        tabla[1][2] = "Hansi Flick";
        tabla[2][2] = "Luis Fernando Suarez";
        tabla[3][2] = "Hajime Moriyasu";
        tabla[4][2] = "Roberto Martinez";
        tabla[5][2] = "Zlatko Dalic";
        tabla[6][2] = "John Herdman";
        tabla[7][2] = "Walid Regragui";
        tabla[0][5] = "Primero";
        tabla[1][5] = "Tercero";
        tabla[2][5] = "Cuarto";
        tabla[3][5] = "Segundo";
        tabla[4][5] = "Primero";
        tabla[5][5] = "Segundo";
        tabla[6][5] = "Cuarto";
        tabla[7][5] = "Tercero";

        return tabla;
    }

    public static void imprimirTabla(String[][] tabla) {
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print("[" + tabla[i][j] + "]");
            }
            System.out.println("");
        }
    }
}
