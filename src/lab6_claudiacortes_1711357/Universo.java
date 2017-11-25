/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_claudiacortes_1711357;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Claudia Cortes
 */
public class Universo {

    private File archivo = null;
    String Nombre;
    ArrayList<Seres> Seres_Vivos = new ArrayList();

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

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

    public void creararchivo(String path) {
        archivo = new File(path);
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Seres t : Seres_Vivos) {
                bw.write(t.getNombre_Raza() + "|");
                bw.write(t.getKi() + "|");
                bw.write(t.getMax_anos() + "|");
                bw.write(t.getPlaneta() + "|");
                bw.write("\n");
            }

            bw.flush();
        } catch (Exception e) {

        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        if (archivo.exists()) {
            System.out.println("ENTRO");
            Scanner sc = null;
            Seres_Vivos = new ArrayList();
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter("\\|");
                while (sc.hasNext()) {
                    String Nombre = sc.next();
                    int Num1 = sc.nextInt();
                    int num2 = sc.nextInt();
                    String N = sc.next();
                    System.out.println(Nombre + "-" + Num1 + " " + num2 + " " + N);
                    Seres_Vivos.add(new Seres(Nombre, Num1, num2, N));
                    System.out.println("LO CREA");
                }
                System.out.println("LO SERES CREADOS" + Seres_Vivos);
            } catch (Exception e) {
            }
            sc.close();
        }//Fin del if 
    }

    public String Abrir() {
        File fichero = null;
        FileReader fr = null;
        BufferedReader br = null;
        // tf_universo.setText("");
        String Texto = "";
        try {
            JFileChooser jfc = new JFileChooser();
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de texto", "txt");//CREAMOS EL FILTRO
            jfc.setFileFilter(filtro);//Lo agrega por defecto 

            int seleccion = jfc.showOpenDialog(null);
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                fichero = jfc.getSelectedFile();
                archivo = new File(jfc.getSelectedFile().getPath());
                fr = new FileReader(fichero);
                br = new BufferedReader(fr);
                String Linea;
                // tf_universo.setText("");
                Texto = "SERES VIVOS DEL PLANETA: \n";
                while ((Linea = br.readLine()) != null) {
                    // System.out.println(Linea);
                    Texto += Linea;

                    Texto += "\n";
                }
                return Texto;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            br.close();
            fr.close();
        } catch (IOException ex) {

        }
        return Texto;
    }

}
