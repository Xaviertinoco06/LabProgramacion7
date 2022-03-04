
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author xavie
 */
public class Equipos extends javax.swing.JFrame {

    /**
     * Creates new form Equipos
     */
    public Equipos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Crear = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        JfCrear = new javax.swing.JFormattedTextField();
        Bcrear = new javax.swing.JButton();
        Modificar = new javax.swing.JFrame();
        jBModificar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        JModifircar = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Jcombo = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jCrear = new javax.swing.JMenuItem();
        Jmodificar = new javax.swing.JMenuItem();
        JCargar = new javax.swing.JMenuItem();
        JEliminar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        Crear.setMaximumSize(new java.awt.Dimension(600, 600));
        Crear.setPreferredSize(new java.awt.Dimension(250, 250));
        Crear.setSize(new java.awt.Dimension(250, 250));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel1.setText("Crear Equipo");

        JfCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JfCrearActionPerformed(evt);
            }
        });

        Bcrear.setText("crear");
        Bcrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcrearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CrearLayout = new javax.swing.GroupLayout(Crear.getContentPane());
        Crear.getContentPane().setLayout(CrearLayout);
        CrearLayout.setHorizontalGroup(
            CrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CrearLayout.createSequentialGroup()
                .addGroup(CrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CrearLayout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jLabel1))
                    .addGroup(CrearLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(JfCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CrearLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Bcrear)
                .addGap(208, 208, 208))
        );
        CrearLayout.setVerticalGroup(
            CrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CrearLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addComponent(JfCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(Bcrear)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        Modificar.setPreferredSize(new java.awt.Dimension(350, 350));
        Modificar.setSize(new java.awt.Dimension(350, 350));

        jBModificar.setText("Modificar");
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel2.setText("Modificar Equipo");

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel3.setText("Ingrese nuevo nombre");

        javax.swing.GroupLayout ModificarLayout = new javax.swing.GroupLayout(Modificar.getContentPane());
        Modificar.getContentPane().setLayout(ModificarLayout);
        ModificarLayout.setHorizontalGroup(
            ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ModificarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JModifircar, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ModificarLayout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(436, 436, 436))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ModificarLayout.createSequentialGroup()
                            .addComponent(Jcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(136, 136, 136)))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ModificarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ModificarLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(151, 151, 151))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ModificarLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(124, 124, 124))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ModificarLayout.createSequentialGroup()
                        .addComponent(jBModificar)
                        .addGap(222, 222, 222))))
        );
        ModificarLayout.setVerticalGroup(
            ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ModificarLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(14, 14, 14)
                .addComponent(Jcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(JModifircar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBModificar)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Cargar");

        jCrear.setText("Crear");
        jCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCrearActionPerformed(evt);
            }
        });
        jMenu1.add(jCrear);

        Jmodificar.setText("Modificar");
        Jmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmodificarActionPerformed(evt);
            }
        });
        jMenu1.add(Jmodificar);

        JCargar.setText("Cargar");
        jMenu1.add(JCargar);

        JEliminar.setText("Eliminar");
        jMenu1.add(JEliminar);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Partidos");

        jMenu3.setText("Tabla ");
        jMenu2.add(jMenu3);

        jMenuItem1.setText("Simular");
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 365, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 385, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmodificarActionPerformed
       Modificar.setLocationRelativeTo(this);
        Modificar.setVisible(true);
        Modificar.setAlwaysOnTop(true);
    }//GEN-LAST:event_JmodificarActionPerformed

    private void jCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCrearActionPerformed
      Crear.setLocationRelativeTo(this);
        Crear.setVisible(true);
        Crear.setAlwaysOnTop(true);
       
    }//GEN-LAST:event_jCrearActionPerformed

    private void BcrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcrearActionPerformed
      Equipo eq=new Equipo(JfCrear.getText());
      
      try{
          eq.AgregarEquipos(JfCrear.getText());
          
      }catch(IOException x){
          Logger.getLogger(Equipos.class.getName()).log(Level.SEVERE, null, x);
          
      }
    }//GEN-LAST:event_BcrearActionPerformed

    private void JfCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JfCrearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JfCrearActionPerformed

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
        // TODO add your handling code here:
      
        Equipo equipoModificar = getEquipo(String.valueOf(Jcombo.getSelectedItem()));
        String nuevoNombre = JModifircar.getText();
        Equipo equipoModificado = new Equipo(nuevoNombre);

            if(!existsInFile(nuevoNombre)){
                BufferedReader buffer;
            try {
                Scanner scan = new Scanner(equipoFile);
                String textoEntero = "";
                while(scan.hasNext()){
                    String linea=scan.nextLine();
                    Scanner scan = new Scanner(linea).useDelimiter(";");
                    String name1= scan.next();
                    if (name1.equals(equipoModificar.getNombre())){
                        textoEntero +=equipoModificado.toString()+"\n";
                    }else{
                       textoEntero +=linea+"\n"; 
                    }

            }
                FileWriter bw = new FileWriter (equipos,false);
                 bw.write(textoEntero);
                 bw.flush();
            } catch (IOException ex) {
                Logger.getLogger(Equipo.class.getName()).log(Level.SEVERE, null, ex);
            }
               Jcombo.removeAllItems();
               J.dispose();
                JOptionPane.showMessageDialog(null, "Equipo Modificado Exitosamente");
            }else{
                jt_nuevoNombre.setText("");
                jf_modificarEquipo.setAlwaysOnTop(false);
                JOptionPane.showMessageDialog(null, "¡ERROR!\nEl nombre del equipo ingresado ya existe");
                jf_modificarEquipo.setAlwaysOnTop(true);
                } 

    
           
    }//GEN-LAST:event_jBModificarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Equipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Equipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Equipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Equipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Equipos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bcrear;
    private javax.swing.JFrame Crear;
    private javax.swing.JMenuItem JCargar;
    private javax.swing.JMenuItem JEliminar;
    private javax.swing.JFormattedTextField JModifircar;
    private javax.swing.JComboBox<String> Jcombo;
    private javax.swing.JFormattedTextField JfCrear;
    private javax.swing.JMenuItem Jmodificar;
    private javax.swing.JFrame Modificar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JMenuItem jCrear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
