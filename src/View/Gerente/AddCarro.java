/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View.Gerente;

import Controller.AdminController;
import Controller.GerenteController;
import DAO.ImagemDirectorioDAO;
import Model.Carro;
import Model.Fornecedor;
import Model.ImagemDirectorios;
import View.GerenteFrame;
import java.awt.BorderLayout;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import jnafilechooser.api.JnaFileChooser;
import raven.toast.Notifications;

/**
 *
 * @author Pedro
 */
public class AddCarro extends javax.swing.JPanel {
  public int count =0;
  public  GerenteFrame frame;
  DefaultComboBoxModel<String> model; 
    ArrayList<Fornecedor> sellectAllFornecedors;
    ArrayList<ImageIcon> imagens = new ArrayList<>();
    ImagemDirectorios  icons ;
  JnaFileChooser jnaCh; 

    public AddCarro(  GerenteFrame frame) throws SQLException, ClassNotFoundException {
        GerenteController cc = new GerenteController(frame);
       sellectAllFornecedors = cc.sellectAllFornecedors();
      
        model = new DefaultComboBoxModel<>();
         model.removeAllElements();
         model.addElement("Fornecedor");
        for(Fornecedor a : sellectAllFornecedors) {
           
          
      model.addElement(a.getNomeDaEntidade());
            
       
      
      }   initComponents();   
      
        jnaCh = new JnaFileChooser();
            this.frame = frame;
            icons = new ImagemDirectorios();
          

}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txMarca = new textfield.TextField();
        txModelo = new textfield.TextField();
        cTipCombus = new javax.swing.JComboBox<>();
        txKMPercoridos = new textfield.TextField();
        txAnoDeFabrico = new textfield.TextField();
        cCategoria = new javax.swing.JComboBox<>();
        cCambio = new javax.swing.JComboBox<>();
        txPreco = new textfield.TextField();
        txNumMotor = new textfield.TextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lbnum = new javax.swing.JLabel();
        txNumChassi = new textfield.TextField();
        cFornecedor = new javax.swing.JComboBox<>();

        setEnabled(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Addicionar    Carro");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 33, 131, -1));

        txMarca.setLabelText("Marca");
        add(txMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 208, -1));

        txModelo.setLabelText("Modelo");
        add(txModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 229, 208, -1));

        cTipCombus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo De Combustivel", "Gasolina ", "Disel", "Gas", "Eletrico", "Hibrido" }));
        add(cTipCombus, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 208, 48));

        txKMPercoridos.setLabelText("Kilometros Percoridos");
        add(txKMPercoridos, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, 220, -1));

        txAnoDeFabrico.setLabelText("Ano De Fabrico");
        add(txAnoDeFabrico, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 210, -1));

        cCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Categoria", "Suv", "Bus", "PickUp", "Truck" }));
        add(cCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 162, 220, 40));

        cCambio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cambio", "Manual", "Automatica" }));
        add(cCambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 230, 220, 40));

        txPreco.setLabelText("Preco De Aquisicao");
        add(txPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 210, -1));

        txNumMotor.setLabelText("Numero Do Motor");
        add(txNumMotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 220, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboard/icon/plus.png"))); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, 360, 190));

        jButton1.setText("Adicionar Imagens");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 380, 370, 30));

        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 430, 370, 30));

        lbnum.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        lbnum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbnum.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(lbnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, 230, 40));

        txNumChassi.setLabelText("Numero Do chassi");
        add(txNumChassi, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 220, -1));

        cFornecedor.setModel(model);
        cFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cFornecedorActionPerformed(evt);
            }
        });
        add(cFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 500, 210, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        
        if(!(txAnoDeFabrico.getText().isEmpty()||txKMPercoridos.getText().isEmpty()||txMarca.getText().isEmpty()||txModelo.getText().isEmpty()||txNumChassi.getText().isEmpty()||txNumMotor.getText().isEmpty()||txPreco.getText().isEmpty())){
        icons.setCarroImagens(imagens);
        Carro c= new Carro();
       c.setFabricante(txMarca.getText());
       c.setModelo(txModelo.getText());
       c.setTipoDeComustivel(cTipCombus.getSelectedItem().toString());
       c.setAnoDeFabrico(Integer.parseInt(txAnoDeFabrico.getText()));
       c.setPreco(Double.parseDouble(txPreco.getText()));
       c.setCategoria(cCategoria.getSelectedItem().toString());
       c.setTracao(cCambio.getSelectedItem().toString());
       c.setNumChassi(Integer.parseInt(txNumChassi.getText()));
       c.setNumMotor(Integer.parseInt(txNumMotor.getText())  );
       for(Fornecedor v : sellectAllFornecedors){
       if(cFornecedor.getSelectedItem().toString().equalsIgnoreCase(v.getNomeDaEntidade())){
       
       c.setFornecedor(v);
       c.setFornecedorId(v.getID());
       }
           
           }
        GerenteController cc = new GerenteController(frame);
       
          ImagemDirectorioDAO dao = new ImagemDirectorioDAO();
        
           icons.setChassi(Integer.parseInt(txNumChassi.getText()));
          
         dao.insert(icons, "Imagens");
      
        
      try {
          cc.insertCarrro(c);
      } catch (SQLException ex) {
          Logger.getLogger(AddCarro.class.getName()).log(Level.SEVERE, null, ex);
      } catch (ClassNotFoundException ex) {
          Logger.getLogger(AddCarro.class.getName()).log(Level.SEVERE, null, ex);
      }
       
     
      
        frame.getContente().setLayout(new BorderLayout());
        frame.getContente().removeAll();
       // contente.add(p1, BorderLayout.CENTER );
        frame.getContente().revalidate();
        frame.getContente().repaint();}else{
         
        Notifications.getInstance().show(Notifications.Type.ERROR
                , "Preencha Todos Campos");}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
   lbnum.setText("Numero De Imagens: "+imagens.size()+1);
  
       
        boolean save = jnaCh.showOpenDialog(frame);
        if (save) {
           // System.out.println(jnaCh.getSelectedFile());
         ImageIcon  icone = new ImageIcon(jnaCh.getSelectedFile().toString());
          imagens.add(icone);
           
        }       
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cFornecedorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cCambio;
    private javax.swing.JComboBox<String> cCategoria;
    private javax.swing.JComboBox<String> cFornecedor;
    private javax.swing.JComboBox<String> cTipCombus;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbnum;
    private textfield.TextField txAnoDeFabrico;
    private textfield.TextField txKMPercoridos;
    private textfield.TextField txMarca;
    private textfield.TextField txModelo;
    private textfield.TextField txNumChassi;
    private textfield.TextField txNumMotor;
    private textfield.TextField txPreco;
    // End of variables declaration//GEN-END:variables
}
