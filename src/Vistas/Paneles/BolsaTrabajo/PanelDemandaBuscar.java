/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Paneles.BolsaTrabajo;

import Vistas.Paneles.Beneficiario.*;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.JTextField;


/**
 *
 * @author psylock
 */
public class PanelDemandaBuscar extends javax.swing.JPanel {


    /**
     * Creates new form PanelBeneficiarioBuscar
     */
    public PanelDemandaBuscar() {
        initComponents();
    }

    public JButton getBTBuscar(){
        return BTBuscar3;
    }

    public JButton getBTEliminar(){
        return BTEliminar;
    }

    public JButton getBTModificar(){
        return BTEliminar;
    }

       public JComboBox getcbSector(){
        return cbSector;
   }

    public String getcbAntiguedad(){
        return cbAntiguedad.getSelectedItem().toString();
    }
    
    public String getTextoSector(){
        return cbSector.getSelectedItem().toString();
    }
    
    public JTable getTablaBusquedaDemandante(){
        return tablaBusquedaDemandante;
    }

    public String getTextBusquedaDemandanteDNI(){
        return textBusquedaDemandanteDNI.getText();
    }

    	public int getAntiguedad(){
		return cbAntiguedad.getSelectedIndex();
		
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane5 = new javax.swing.JScrollPane();
        tablaBusquedaDemandante = new javax.swing.JTable();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        textBusquedaDemandanteDNI = new javax.swing.JTextField();
        cbSector = new javax.swing.JComboBox();
        jLabel65 = new javax.swing.JLabel();
        cbAntiguedad = new javax.swing.JComboBox();
        BTEliminar = new javax.swing.JButton();
        BTModificar = new javax.swing.JButton();
        BTBuscar3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1000, 600));
        setMinimumSize(new java.awt.Dimension(1000, 600));

        tablaBusquedaDemandante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"12345678E", "Pepe Morillas Bonico", "Construccion", null}
            },
            new String [] {
                "DNI", "Nombre y Apellidos", "Sector", "Fecha Demanda"
            }
        ));
        jScrollPane5.setViewportView(tablaBusquedaDemandante);

        jLabel63.setText("Demandante");

        jLabel64.setText("Sector Busqueda");

        textBusquedaDemandanteDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textBusquedaDemandanteDNIActionPerformed(evt);
            }
        });

        cbSector.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Construccion", "Electricidad", "Carpinteria", "Fontaneria", " " }));

        jLabel65.setText("Antiguedad");

        cbAntiguedad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        BTEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/borrar.png"))); // NOI18N

        BTModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/modificar.png"))); // NOI18N

        BTBuscar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/buscar.png"))); // NOI18N
        BTBuscar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTBuscar3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 948, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel63)
                        .addGap(18, 18, 18)
                        .addComponent(textBusquedaDemandanteDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(jLabel64)
                        .addGap(18, 18, 18)
                        .addComponent(cbSector, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(jLabel65)
                        .addGap(18, 18, 18)
                        .addComponent(cbAntiguedad, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(BTBuscar3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BTModificar)
                        .addGap(18, 18, 18)
                        .addComponent(BTEliminar)
                        .addGap(389, 389, 389))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel63)
                        .addComponent(jLabel64)
                        .addComponent(textBusquedaDemandanteDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbSector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel65)
                        .addComponent(cbAntiguedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BTBuscar3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BTEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BTBuscar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTBuscar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTBuscar3ActionPerformed

    private void textBusquedaDemandanteDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textBusquedaDemandanteDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textBusquedaDemandanteDNIActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTBuscar3;
    private javax.swing.JButton BTEliminar;
    private javax.swing.JButton BTModificar;
    private javax.swing.JComboBox cbAntiguedad;
    private javax.swing.JComboBox cbSector;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable tablaBusquedaDemandante;
    private javax.swing.JTextField textBusquedaDemandanteDNI;
    // End of variables declaration//GEN-END:variables
}
