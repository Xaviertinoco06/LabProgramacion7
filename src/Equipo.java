
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author xavie
 */
public class Equipo {
 static ArrayList <Equipo> equipo1= new ArrayList();
    private String nombre;
    private int puntos;
    private int ganadas;
    private int perdidas;
   private int  golafavor;
   private int golcontra;
   private int diferencia;
  private int empates;
   private File equipos;

    public Equipo(String nombre) {
        this.nombre = nombre;
        puntos=0;
        ganadas=0;
        perdidas=0;
        golafavor=0;
        golcontra=0;
        diferencia=0;
        empates=0;
        equipos = new File("Equipo.txt");
        
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getGanadas() {
        return ganadas;
    }

    public void setGanadas(int ganadas) {
        this.ganadas = ganadas;
    }

    public int getPerdidas() {
        return perdidas;
    }

    public void setPerdidas(int perdidas) {
        this.perdidas = perdidas;
    }

    public int getGolafavor() {
        return golafavor;
    }

    public void setGolafavor(int golafavor) {
        this.golafavor = golafavor;
    }

    public int getGolcontra() {
        return golcontra;
    }

    public void setGolcontra(int golcontra) {
        this.golcontra = golcontra;
    }

    public int getDiferencia() {
        return diferencia;
    }

    public void setDiferencia(int diferencia) {
        this.diferencia = diferencia;
    }

    public File getEquipos() {
        return equipos;
    }

    public void setEquipos(File equipos) {
        this.equipos = equipos;
    }

    @Override
    public String toString() {
         return nombre + ";" + ganadas + ";" + empates + ";" + perdidas + ";" + golafavor + ";" + golcontra + ";" + diferencia + ";" + puntos + "\n";
    }
    
    public void AgregarEquipos(String nombre)throws IOException{
        FileWriter escribir=new FileWriter(equipos);
        Equipo eq=new Equipo(nombre);
        equipo1.add(eq);
        escribir.write(toString()+"\n");
        escribir.flush();
    
    }
    
  
    
    
   
   
}
