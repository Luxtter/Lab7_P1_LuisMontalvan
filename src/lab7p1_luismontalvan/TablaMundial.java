/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7p1_luismontalvan;

/**
 *
 * @author luism
 */
public class TablaMundial {
    public String [][] tabla;
    public String pais;
    public int golesLocal;
    public int golesVisita;

    public TablaMundial(int golesLocal, int golesVisita) {
        this.golesLocal = golesLocal;
        this.golesVisita = golesVisita;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public int getGolesVisita() {
        return golesVisita;
    }

    public void setGolesVisita(int golesVisita) {
        this.golesVisita = golesVisita;
    }

    

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String[][] getTabla() {
        return tabla;
    }

    public void setTabla(String[][] tabla) {
        this.tabla = tabla;
    }
    
    public TablaMundial(String[][] tabla, String pais) {
        this.tabla = tabla;
        this.pais = pais;
    }
    public void creador(){
        if(pais.equalsIgnoreCase("España")||pais.equalsIgnoreCase("Espana")){
            System.out.println(this.tabla[0][1]+" pertenece al a el "+this.tabla[0][0]+".\nSu director tecnico es "+this.tabla[0][2]+".\nTiene "+this.tabla[0][3]+" jugadores convocados.\n"+this.tabla[0][4]+" ha ganado un mundial.\nEsta de "+this.tabla[0][5]+" en el grupo.\n--Se ha creado exitosamente la seleccion de "+this.tabla[0][1]+"--");
        }else if(pais.equalsIgnoreCase("Alemania")){
            System.out.println(this.tabla[1][1]+" pertenece al a el "+this.tabla[1][0]+".\nSu director tecnico es "+this.tabla[1][2]+".\nTiene "+this.tabla[1][3]+" jugadores convocados.\n"+this.tabla[1][4]+" ha ganado un mundial.\nEsta de "+this.tabla[1][5]+" en el grupo.\n--Se ha creado exitosamente la seleccion de "+this.tabla[1][1]+"--");
        }else if(pais.equalsIgnoreCase("Costa Rica")){
            System.out.println(this.tabla[2][1]+" pertenece al a el "+this.tabla[2][0]+".\nSu director tecnico es "+this.tabla[2][2]+".\nTiene "+this.tabla[2][3]+" jugadores convocados.\n"+this.tabla[2][4]+" ha ganado un mundial.\nEsta de "+this.tabla[2][5]+" en el grupo.\n--Se ha creado exitosamente la seleccion de "+this.tabla[2][1]+"--");
        }else if(pais.equalsIgnoreCase("Japon")){
            System.out.println(this.tabla[3][1]+" pertenece al a el "+this.tabla[3][0]+".\nSu director tecnico es "+this.tabla[3][2]+".\nTiene "+this.tabla[3][3]+" jugadores convocados.\n"+this.tabla[3][4]+" ha ganado un mundial.\nEsta de "+this.tabla[3][5]+" en el grupo.\n--Se ha creado exitosamente la seleccion de "+this.tabla[3][1]+"--");
        }else if(pais.equalsIgnoreCase("Belgica")){
            System.out.println(this.tabla[4][1]+" pertenece al a el "+this.tabla[4][0]+".\nSu director tecnico es "+this.tabla[4][2]+".\nTiene "+this.tabla[4][3]+" jugadores convocados.\n"+this.tabla[4][4]+" ha ganado un mundial.\nEsta de "+this.tabla[4][5]+" en el grupo.\n--Se ha creado exitosamente la seleccion de "+this.tabla[4][1]+"--");
        }else if(pais.equalsIgnoreCase("Croacia")){
            System.out.println(this.tabla[5][1]+" pertenece al a el "+this.tabla[5][0]+".\nSu director tecnico es "+this.tabla[5][2]+".\nTiene "+this.tabla[5][3]+" jugadores convocados.\n"+this.tabla[5][4]+" ha ganado un mundial.\nEsta de "+this.tabla[5][5]+" en el grupo.\n--Se ha creado exitosamente la seleccion de "+this.tabla[5][1]+"--");
        }else if(pais.equalsIgnoreCase("Canada")){
            System.out.println(this.tabla[6][1]+" pertenece al a el "+this.tabla[6][0]+".\nSu director tecnico es "+this.tabla[6][2]+".\nTiene "+this.tabla[6][3]+" jugadores convocados.\n"+this.tabla[6][4]+" ha ganado un mundial.\nEsta de "+this.tabla[6][5]+" en el grupo.\n--Se ha creado exitosamente la seleccion de "+this.tabla[6][1]+"--");
        }else if(pais.equalsIgnoreCase("Marruecos")){
            System.out.println(this.tabla[7][1]+" pertenece al a el "+this.tabla[7][0]+".\nSu director tecnico es "+this.tabla[7][2]+".\nTiene "+this.tabla[7][3]+" jugadores convocados.\n"+this.tabla[7][4]+" ha ganado un mundial.\nEsta de "+this.tabla[7][5]+" en el grupo.\n--Se ha creado exitosamente la seleccion de "+this.tabla[7][1]+"--");
        }else{
            System.out.println("Pais no valida");
        }
            
    }
    
}

