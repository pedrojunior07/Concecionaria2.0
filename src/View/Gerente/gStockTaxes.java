/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View.Gerente;

import DAO.StockTaxasDao;
import Model.StockeTaxas;
import java.util.ArrayList;

/**
 *
 * @author Pedro
 */
public class gStockTaxes extends javax.swing.JPanel {

    /**
     * Creates new form gStrockTaxes
     */
    public gStockTaxes() {
        initComponents();
        StockTaxasDao dao = new StockTaxasDao();
        ArrayList<StockeTaxas> openFile = dao.openFile();
       txImposto.setText( String.valueOf(openFile.get(0).getImposto()) );
       txBus.setText(String.valueOf(openFile.get(0).getQntCarrosBus()));
       txPicUp.setText(String.valueOf(openFile.get(0).getQntCarrosPickUp()));
       txPromo.setText(String.valueOf(openFile.get(0).getPromoDisconto()));
       txQntTotal.setText(String.valueOf(openFile.get(0).getQntToTalCarros()));
       txSuv.setText(String.valueOf(openFile.get(0).getQntCarrosSuv()));
       txTaxaAdd12.setText(String.valueOf(openFile.get(0).getTaxaMensal12()));
       txTaxaAdd18.setText(String.valueOf(openFile.get(0).getTaxaMansal18()));
       txTaxaAdd6.setText(String.valueOf(openFile.get(0).getTaxaMensal6()));
       txTruck.setText(String.valueOf(openFile.get(0).getQntCarrosTruck()));
      
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txPromo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txImposto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txTaxaAdd6 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txTaxaAdd12 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txTaxaAdd18 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txTruck = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txSuv = new javax.swing.JTextField();
        txPicUp = new javax.swing.JTextField();
        txBus = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txQntTotal = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        btGuardar = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txPromo.setEditable(false);
        add(txPromo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 110, 42));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Imposto (%)");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 210, 40));

        jLabel2.setText("Promocao / Discontos (%)");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 220, 45));

        txImposto.setEditable(false);
        add(txImposto, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 110, 42));

        jLabel3.setText("Taxa Adicional 6 meses de Prestacao(%)");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, 45));

        txTaxaAdd6.setEditable(false);
        txTaxaAdd6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txTaxaAdd6ActionPerformed(evt);
            }
        });
        add(txTaxaAdd6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 110, 42));

        jLabel4.setText("Taxa Adicional 12 meses de Prestacao(%)");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 220, 45));

        txTaxaAdd12.setEditable(false);
        add(txTaxaAdd12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 110, 42));

        jLabel5.setText("Taxa Adicional 18 meses de Prestacao(%)");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 220, 45));

        txTaxaAdd18.setEditable(false);
        add(txTaxaAdd18, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 110, 42));

        jLabel6.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Capacidade Do Parque");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, 280, 30));

        jLabel7.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Taxas");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 280, 30));

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel8.setText("%");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, 20, 40));

        jLabel9.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel9.setText("%");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 20, 40));

        jLabel10.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel10.setText("%");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 20, 40));

        jLabel11.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel11.setText("%");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 20, 40));

        jLabel12.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel12.setText("%");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 20, 40));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Carros Tipo Truck");
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 120, 40));

        txTruck.setEditable(false);
        txTruck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txTruckActionPerformed(evt);
            }
        });
        add(txTruck, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 270, 80, 40));

        jLabel14.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel14.setText("Unidades");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 340, 60, 40));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Carros Tipo Suv");
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, 130, 40));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Carros Tipo PicUp(4x4)");
        jLabel16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, 120, 40));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Carros Tipo Bus");
        jLabel17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, 120, 40));

        txSuv.setEditable(false);
        add(txSuv, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 120, 80, 40));

        txPicUp.setEditable(false);
        txPicUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txPicUpActionPerformed(evt);
            }
        });
        add(txPicUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 170, 80, 40));

        txBus.setEditable(false);
        txBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txBusActionPerformed(evt);
            }
        });
        add(txBus, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 220, 80, 40));

        jLabel18.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel18.setText("Unidades");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 120, 60, 40));

        jLabel19.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel19.setText("Unidades");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 170, 60, 40));

        jLabel20.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel20.setText("Unidades");
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 220, 60, 40));

        jLabel21.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Total De Carros :");
        jLabel21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, 160, 40));

        txQntTotal.setEditable(false);
        txQntTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txQntTotalActionPerformed(evt);
            }
        });
        add(txQntTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 340, 50, 40));

        jLabel22.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel22.setText("Unidades");
        add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 270, 60, 40));

        btGuardar.setText("Guardar as Alteracoes");
        btGuardar.setEnabled(false);
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });
        add(btGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 490, 340, 60));

        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });
        add(btEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, 270, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void txTaxaAdd6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txTaxaAdd6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txTaxaAdd6ActionPerformed

    private void txTruckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txTruckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txTruckActionPerformed

    private void txPicUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txPicUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txPicUpActionPerformed

    private void txBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txBusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txBusActionPerformed

    private void txQntTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txQntTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txQntTotalActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
       txBus.setEditable(true);
       txImposto.setEditable(true);
       txPicUp.setEditable(true);
       txPromo.setEditable(true);
       txQntTotal.setEditable(false);
       txSuv.setEditable(true);
       txTaxaAdd12.setEditable(true);
       txTaxaAdd18.setEditable(true);
       txTaxaAdd6.setEditable(true);
       txTruck.setEditable(true);
       btGuardar.setEnabled(true);
    }//GEN-LAST:event_btEditarActionPerformed

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
      StockeTaxas tax = new StockeTaxas();
       tax.setImposto(Double.parseDouble(txImposto.getText()));
       tax.setPromoDisconto(Double.parseDouble(txPromo.getText()));
       tax.setQntCarrosBus(Integer.parseInt(txBus.getText()));
       tax.setQntCarrosPickUp(Integer.parseInt(txPicUp.getText()));
       tax.setQntCarrosSuv(Integer.parseInt(txSuv.getText()));
       tax.setQntCarrosTruck(Integer.parseInt(txTruck.getText()));
       tax.setQntToTalCarros(Integer.parseInt(txBus.getText())+Integer.parseInt(txPicUp.getText())+Integer.parseInt(txSuv.getText())+Integer.parseInt(txTruck.getText()));
       tax.setTaxaMansal18(Double.parseDouble(txTaxaAdd18.getText()));
       tax.setTaxaMensal6(Double.parseDouble(txTaxaAdd6.getText()));
       tax.setTaxaMensal12(Double.parseDouble(txTaxaAdd12.getText()));
        StockTaxasDao dao = new StockTaxasDao();
        dao.InsertTax(tax);
        
        
        txBus.setEditable(false);
       txImposto.setEditable(false);
       txPicUp.setEditable(false);
       txPromo.setEditable(false);
       txQntTotal.setEditable(false);
       txSuv.setEditable(false);
       txTaxaAdd12.setEditable(false);
       txTaxaAdd18.setEditable(false);
       txTaxaAdd6.setEditable(false);
       txTruck.setEditable(false);
       btGuardar.setEnabled(false);
        
      
        ArrayList<StockeTaxas> openFile = dao.openFile();
       txImposto.setText( String.valueOf(openFile.get(0).getImposto()) );
       txBus.setText(String.valueOf(openFile.get(0).getQntCarrosBus()));
       txPicUp.setText(String.valueOf(openFile.get(0).getQntCarrosPickUp()));
       txPromo.setText(String.valueOf(openFile.get(0).getPromoDisconto()));
       txQntTotal.setText(String.valueOf(openFile.get(0).getQntToTalCarros()));
       txSuv.setText(String.valueOf(openFile.get(0).getQntCarrosSuv()));
       txTaxaAdd12.setText(String.valueOf(openFile.get(0).getTaxaMensal12()));
       txTaxaAdd18.setText(String.valueOf(openFile.get(0).getTaxaMansal18()));
       txTaxaAdd6.setText(String.valueOf(openFile.get(0).getTaxaMensal6()));
       txTruck.setText(String.valueOf(openFile.get(0).getQntCarrosTruck()));
      
    }//GEN-LAST:event_btGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txBus;
    private javax.swing.JTextField txImposto;
    private javax.swing.JTextField txPicUp;
    private javax.swing.JTextField txPromo;
    private javax.swing.JTextField txQntTotal;
    private javax.swing.JTextField txSuv;
    private javax.swing.JTextField txTaxaAdd12;
    private javax.swing.JTextField txTaxaAdd18;
    private javax.swing.JTextField txTaxaAdd6;
    private javax.swing.JTextField txTruck;
    // End of variables declaration//GEN-END:variables
}
