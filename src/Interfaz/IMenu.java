/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

/**
 *
 * @author Veronica
 */
public class IMenu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public IMenu() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Menú principal");
        setSize(600,500);
    
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
        GUInuevo = new javax.swing.JButton();
        GUIver = new javax.swing.JButton();
        GUIEliminar = new javax.swing.JButton();
        GUIeliminar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));

        GUInuevo.setBackground(new java.awt.Color(255, 255, 255));
        GUInuevo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        GUInuevo.setText("Nuevo contacto");
        GUInuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GUInuevoActionPerformed(evt);
            }
        });

        GUIver.setBackground(new java.awt.Color(255, 255, 255));
        GUIver.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        GUIver.setText("Ver todos los contactos");
        GUIver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GUIverActionPerformed(evt);
            }
        });

        GUIEliminar.setBackground(new java.awt.Color(255, 255, 255));
        GUIEliminar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        GUIEliminar.setText("Eliminar contacto");
        GUIEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GUIEliminarActionPerformed(evt);
            }
        });

        GUIeliminar.setBackground(new java.awt.Color(255, 255, 255));
        GUIeliminar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        GUIeliminar.setText("Buscar Contacto ");
        GUIeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GUIeliminarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/interview.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(GUIver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GUInuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GUIEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GUIeliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(132, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(139, 139, 139)
                    .addComponent(jLabel3)
                    .addContainerGap(139, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(GUInuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(GUIver, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(GUIEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(GUIeliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(80, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(79, 79, 79)
                    .addComponent(jLabel3)
                    .addContainerGap(79, Short.MAX_VALUE)))
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

    private void GUInuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GUInuevoActionPerformed
        
        new IFormulario().setVisible(true);
        this.setVisible(false);
    
    }//GEN-LAST:event_GUInuevoActionPerformed

    private void GUIverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GUIverActionPerformed
       new IVertodo().setVisible(true);
        this.setVisible(false); 
    
    }//GEN-LAST:event_GUIverActionPerformed

    private void GUIeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GUIeliminarActionPerformed
        new IBuscar().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_GUIeliminarActionPerformed

    private void GUIEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GUIEliminarActionPerformed
       new Ieliminar().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_GUIEliminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GUIEliminar;
    private javax.swing.JButton GUIeliminar;
    private javax.swing.JButton GUInuevo;
    private javax.swing.JButton GUIver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
 }
