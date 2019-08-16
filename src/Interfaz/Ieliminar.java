/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Veronica
 */
public class Ieliminar extends javax.swing.JFrame {
    
    private Connection conector;
    private Statement sentenciador;

    /**
     * Creates new form Ieliminar
     */
    public Ieliminar() {
        initComponents();
        conectarDB();
        setLocationRelativeTo(null);
        setTitle("Eliminar contacto");
        setSize(600,500);
    }
    
    private void conectarDB() {
        try {
            conector = DriverManager.getConnection("jdbc:derby://localhost:1527/AgendaDigital", "usuario", "12345");
            sentenciador = conector.createStatement();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, "ERROR DE CONEXION!\n" + e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        guiTFced = new javax.swing.JTextField();
        GUItxtEliminar = new java.awt.TextArea();
        GUIvolver1 = new javax.swing.JButton();
        guiBTNborrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Ingresar el número de cédula que desea eliminar: ");

        GUIvolver1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        GUIvolver1.setText("Volver a Menú");
        GUIvolver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GUIvolver1ActionPerformed(evt);
            }
        });

        guiBTNborrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        guiBTNborrar.setText("Eliminar");
        guiBTNborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guiBTNborrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(guiTFced)
                            .addGap(52, 52, 52)
                            .addComponent(guiBTNborrar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(GUItxtEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(GUIvolver1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(guiTFced)
                    .addComponent(guiBTNborrar, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addComponent(GUItxtEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GUIvolver1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GUIvolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GUIvolver1ActionPerformed
        volverMenuPrincipal();
    }//GEN-LAST:event_GUIvolver1ActionPerformed

    private void guiBTNborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guiBTNborrarActionPerformed
        int ced = Integer.parseInt(guiTFced.getText());
        try{
                sentenciador.executeUpdate("DELETE FROM Datosagenda WHERE cedula= "+ced+"");
                
                /*
                AQUI DEBE IR EL MÉTODO ELIMINAR AL ARCHIVO
                GONZALO
                */
                
                GUItxtEliminar.setText("ELIMINADO CORRECTAMENTE!");
                
            }catch(SQLException e){
                JOptionPane.showMessageDialog(rootPane, "ERROR DE DELETE!\n" + e);
            }
    }//GEN-LAST:event_guiBTNborrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.TextArea GUItxtEliminar;
    private javax.swing.JButton GUIvolver1;
    private javax.swing.JButton guiBTNborrar;
    private javax.swing.JTextField guiTFced;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
private void volverMenuPrincipal() {
        IMenu ventana = new IMenu();
        ventana.setVisible(true);
        this.setVisible(false);
}
}
