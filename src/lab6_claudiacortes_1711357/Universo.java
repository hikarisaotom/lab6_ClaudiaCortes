/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_claudiacortes_1711357;

import java.util.ArrayList;

/**
 *
 * @author Claudia Cortes
 */
public class Universo {

    String Nombre;
    ArrayList<Seres> Seres_Vivos = new ArrayList();
    
    public String getNombre() {
        return Nombre;
    }
    
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public ArrayList<Seres> getSeres_Vivos() {
        return Seres_Vivos;
    }
    
    public void setSeres_Vivos(ArrayList<Seres> Seres_Vivos) {
        this.Seres_Vivos = Seres_Vivos;
    }

    public void Agregar_Seres_Vivos(Seres seres_vivos) {
        this.Seres_Vivos.add(seres_vivos);
    }
}
