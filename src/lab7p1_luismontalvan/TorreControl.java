/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7p1_luismontalvan;
import java.util.Scanner;
/**
 *
 * @author luism
 */
public class TorreControl {
    public String avion;
    public String codigo;
    public int ano;
    public int pasajeros;
    public int peso;
    public String aerolinia;
    public int bandera;
    public String avion1;
    public String avion2;
    public String avion3;


    public TorreControl(String avion1, String avion2, String avion3) {
        this.avion1 = avion1;
        this.avion2 = avion2;
        this.avion3 = avion3;
        
        
    }
    public void aviones(){
        if(this.bandera==0){
           this.avion1= avion;
        }else if(this.bandera==1){
            this.avion2= avion;
        }else if(this.bandera==2){
            this.avion3= avion;
        }
    }
    public void disponibilidad(){
        Scanner pochita= new Scanner(System.in);
        Scanner lelouch= new Scanner(System.in);
        int estado = 0;
        System.out.print("Desea cambiarle la disponibilidad a un avion [s/n]");
        String siONo= lelouch.next();
        if(siONo.equalsIgnoreCase("s")){
           System.out.print("Aviones Disponibles:\n1)"+this.avion1+"\n2)"+this.avion2+"\n3)"+this.avion3+"Ingrese el avion");
            int opc= pochita.nextInt(); 
            switch(opc){
                case 1:
                    System.out.print("---"+this.avion1+" ha sido elegido---\n\nEstados disponibles: 1.Despegando\n2.Aterrizando\n3.Estacionado\nEliga el nuevo estado: ");
                    estado = pochita.nextInt();
                    break;
                case 2:
                    System.out.print("---"+this.avion1+" ha sido elegido---\n\nEstados disponibles: 1.Despegando\n2.Aterrizando\n3.Estacionado\nEliga el nuevo estado: ");
                    estado = pochita.nextInt();
                    break;
                case 3:
                    System.out.print("---"+this.avion1+" ha sido elegido---\n\nEstados disponibles: 1.Despegando\n2.Aterrizando\n3.Estacionado\nEliga el nuevo estado: ");
                    estado = pochita.nextInt();
                    break;
                default:
                    System.out.print("Opcion no valida");
                    break;
            }
        }else if(siONo.equalsIgnoreCase("n")){
            
        }
        
        
        
    }
}
