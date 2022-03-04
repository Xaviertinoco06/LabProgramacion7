
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class TablaP {

    private ArrayList<Equipo> futbol = new ArrayList();
    private File archivo = null;

    @Override
    public String toString() {
        return "ligaFutbol=" + futbol;
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Equipo op : futbol) {
                bw.write(op.getNombre() + ";");
                bw.write(op.getGanadas() + ";");
                bw.write(op.getGolafavor() + ";");
                bw.write(op.getGolcontra() + ";");
                bw.write(op.getPuntos() + ";");
                bw.write(op.getPerdidas() + ";");
                bw.write(op.getDiferencia() + ";");

            }
            bw.flush();
            
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void CargarArchivo() {
        Scanner sc = null;
        futbol = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    futbol.add(new Equipo(sc.next()));
                }
            } catch (Exception ex) {
            }
            sc.close();
        }
    }
}
