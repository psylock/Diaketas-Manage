/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Paneles.BolsaTrabajo;

import Vistas.Paneles.Beneficiario.*;
import java.awt.event.ActionListener;

/**
 *
 * @author psylock
 */
public class PanelBolsaTrabajoInicio extends javax.swing.JPanel {

    /**
     * Creates new form PanelBeneficiarioInicio
     */
    public PanelBolsaTrabajoInicio() {
        initComponents();
    }

    // LISTENERS

    public void anadirListenerbtBuscarBeneficiario(ActionListener listener){
        this.btBuscarBeneficiario.addActionListener(listener);
    }
    
    public void anadirListenerbtNuevoBeneficiario(ActionListener listener){
        this.btNuevoBeneficiario.addActionListener(listener);
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btNuevoBeneficiario = new javax.swing.JButton();
        btBuscarBeneficiario = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1000, 600));
        setMinimumSize(new java.awt.Dimension(1000, 600));

        btNuevoBeneficiario.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btNuevoBeneficiario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/ofertas.jpg"))); // NOI18N
        btNuevoBeneficiario.setActionCommand("nuevoBeneficiario");
        btNuevoBeneficiario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btNuevoBeneficiario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btNuevoBeneficiario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevoBeneficiarioActionPerformed(evt);
            }
        });

        btBuscarBeneficiario.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btBuscarBeneficiario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/demandas.jpg"))); // NOI18N
        btBuscarBeneficiario.setActionCommand("buscarBeneficiario");
        btBuscarBeneficiario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btBuscarBeneficiario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(126, 126, 126)
                .add(btNuevoBeneficiario, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 257, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 251, Short.MAX_VALUE)
                .add(btBuscarBeneficiario, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 257, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(109, 109, 109))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(163, 163, 163)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(btBuscarBeneficiario, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 231, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(btNuevoBeneficiario))
                .addContainerGap(206, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btNuevoBeneficiarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevoBeneficiarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btNuevoBeneficiarioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscarBeneficiario;
    private javax.swing.JButton btNuevoBeneficiario;
    // End of variables declaration//GEN-END:variables
}
