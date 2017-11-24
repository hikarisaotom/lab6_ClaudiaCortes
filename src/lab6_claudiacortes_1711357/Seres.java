/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_claudiacortes_1711357;

/**
 *
 * @author Claudia Cortes
 */
public class Seres {
    String Nombre_Raza;
    int Ki;
    int Max_anos;
    String Planeta;

    public Seres() {
    }

    public Seres(String Nombre_Raza, int Ki, int Max_anos, String Planeta) {
        this.Nombre_Raza = Nombre_Raza;
        this.Ki = Ki;
        this.Max_anos = Max_anos;
        this.Planeta = Planeta;
    }

    public String getNombre_Raza() {
        return Nombre_Raza;
    }

    public void setNombre_Raza(String Nombre_Raza) {
        this.Nombre_Raza = Nombre_Raza;
    }

    public int getKi() {
        return Ki;
    }

    public void setKi(int Ki) {
        this.Ki = Ki;
    }

    public int getMax_anos() {
        return Max_anos;
    }

    public void setMax_anos(int Max_anos) {
        this.Max_anos = Max_anos;
    }

    public String getPlaneta() {
        return Planeta;
    }

    public void setPlaneta(String Planeta) {
        this.Planeta = Planeta;
    }

    @Override
    public String toString() {
        return Nombre_Raza;
    }
    
}
