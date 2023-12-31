/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View.Gerente;

import Controller.AdminController;
import Controller.GerenteController;
import DAO.ImagemDirectorioDAO;
import Model.Fornecedor;
import Model.Gerente;
import Model.ImagemDirectorios;
import Model.Vendedor;
import View.Admin.AddFuncionario;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import jnafilechooser.api.JnaFileChooser;
import raven.toast.Notifications;

/**
 *
 * @author Pedro
 */
public class AdicionarFornecedor extends javax.swing.JPanel {

    ImageIcon icone =new ImageIcon();
    JnaFileChooser jnaCh = new JnaFileChooser();
    JFrame frame;
    
    
    public AdicionarFornecedor(JFrame frame) {
         initComponents();
        this.frame = frame;
        
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txNomeEntidade = new textfield.TextField();
        txEntidadeEmail = new textfield.TextField();
        cMercadoria = new javax.swing.JComboBox<>();
        txTelefone = new textfield.TextField();
        perfil = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txNomeEntidade.setLabelText("Nome Da Entidade 'Empresa'");
        add(txNomeEntidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 126, 236, -1));

        txEntidadeEmail.setLabelText("Email 'da Entidade'");
        add(txEntidadeEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 251, 236, -1));

        cMercadoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo De Mercategoria", "Carros Suv", "Carros Truck", "Carros Bus", "Carros Pick Up", "Varios" }));
        add(cMercadoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 190, 236, 49));

        txTelefone.setLabelText("Contacto 'Telefone'");
        txTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txTelefoneActionPerformed(evt);
            }
        });
        add(txTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 240, -1));

        perfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboard/icon/galery_image_phot.png"))); // NOI18N
        add(perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 300, 240));

        jButton1.setText("Adicionar Foto Da Empresa ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, 300, 30));

        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 250, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void txTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txTelefoneActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        
     //   int p = JOptionPane.showConfirmDialog(this, "Salvar?");

    if(txEntidadeEmail.getText().isEmpty()||txNomeEntidade.getText().isEmpty()|| txTelefone.getText().isEmpty()){
    
     
        Notifications.getInstance().show(Notifications.Type.ERROR
                , "Preencha Todos Campos");}else{
          ImagemDirectorios icon = new ImagemDirectorios();
         
          icon.setIdentidade(txTelefone.getText());
          icon.setIcon(icone);
          ImagemDirectorioDAO imDir = new ImagemDirectorioDAO();
         imDir.insert(icon, "Imagens");
            
         Fornecedor fn = new Fornecedor();
         fn.setNomeDaEntidade(txNomeEntidade.getText());
         fn.setEmail(txEntidadeEmail.getText());
         fn.setContacto(Integer.parseInt(txTelefone.getText()));
         fn.setStatus(true);
         fn.setTipoDeComercio(cMercadoria.getSelectedItem().toString());
         fn.setPrecoDoNegocio(0);
         fn.setNumeroDoNegogio(0);
         fn.setDataDoNegocio("");
         
         GerenteController cc = new   GerenteController(frame);
          
        try {
            cc.insertFornecedor(fn);
        } catch (SQLException ex) {
            Logger.getLogger(AdicionarFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdicionarFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       boolean save = jnaCh.showOpenDialog(frame);
        if (save) {
           // System.out.println(jnaCh.getSelectedFile());
           icone = new ImageIcon(jnaCh.getSelectedFile().toString());
           perfil.setIcon(icone);
           
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cMercadoria;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel perfil;
    private textfield.TextField txEntidadeEmail;
    private textfield.TextField txNomeEntidade;
    private textfield.TextField txTelefone;
    // End of variables declaration//GEN-END:variables
}
