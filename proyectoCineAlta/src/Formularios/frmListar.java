/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Entidades.Persona;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import operaciones.Operaciones;

/**
 *
 * @author lauta
 */
public class frmListar extends javax.swing.JInternalFrame {
    Operaciones oper;
    /**
     * Creates new form frmListar
     */
    public frmListar() {
        initComponents();
        oper=new Operaciones();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tbListado = new javax.swing.JTable();
        btnListar = new javax.swing.JButton();

        tbListado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellido", "Edad"
            }
        ));
        tbListado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbListadoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbListado);

        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btnListar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnListar)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        DefaultTableModel modelo = new DefaultTableModel();
        tbListado.setModel(modelo);
        
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Edad");
        
        List datos=oper.Listar();
        
        Iterator iter=datos.iterator();
        
        while(iter.hasNext()){
        Persona user=(Persona)iter.next();
        
        Object[] fila= new Object[4];
        fila[0]=user.getId();
        fila[1]=user.getNombre();
        fila[2]=user.getApellido();
        fila[3]=user.getEdad();
        
        modelo.addRow(fila);
    }
        
    }//GEN-LAST:event_btnListarActionPerformed

    private void tbListadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbListadoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbListadoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnListar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbListado;
    // End of variables declaration//GEN-END:variables
}
