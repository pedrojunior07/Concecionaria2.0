/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;



import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatGitHubIJTheme;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.awt.BorderLayout;
import java.awt.geom.FlatteningPathIterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import AppPackage.AnimationClass;
import Model.Funcionario;
import View.Admin.AddFuncionario;
import View.Admin.mess;
import View.Gerente.AddCarro;
import View.Gerente.AdicionarFornecedor;
import View.Gerente.ListarPesquisarCarro;
import View.Gerente.gStockTaxes;
import com.sun.mail.handlers.message_rfc822;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import pedro.glasspanepopup.GlassPanePopup;

import raven.toast.Notifications;

/**
 *
 * @author Pedro
 */


public class GerenteFrame extends javax.swing.JFrame {
ImageIcon icon;
Funcionario funcionrio;


    public GerenteFrame(ImageIcon icon, Funcionario funcionrio) {
        // UIManager.put( "Button.arc" , 999 );
         this.icon = icon;
         this.funcionrio= funcionrio;
          initComponents();
          noti.setBackground(btListarCarro.getBackground());
          Messagem.setBackground(btListarCarro.getBackground());
        // UIManager.put( "Button.arc" , 999 );
        imagem.setImage(icon);
        lbNome.setText(funcionrio.getNome()+" "+funcionrio.getApelido());
    
          GlassPanePopup.install(this);
       
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        imagem = new View.Admin.ImageAvatar();
        Messagem = new com.pedro.swing.win_button.ButtonBadges();
        noti = new com.pedro.swing.win_button.ButtonBadges();
        jButton9 = new javax.swing.JButton();
        btListarCarro = new javax.swing.JButton();
        Acao2 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        lbNome = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        contente = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(imagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 180, 140));

        Messagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboard/icon/message.png"))); // NOI18N
        jPanel1.add(Messagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 80, 70));

        noti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboard/icon/noti.png"))); // NOI18N
        jPanel1.add(noti, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 70));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboard/icon/4.png"))); // NOI18N
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 70, 90));

        btListarCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboard/icon/cars.png"))); // NOI18N
        jPanel1.add(btListarCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 70, 90));

        Acao2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/expense.png"))); // NOI18N
        jPanel1.add(Acao2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 70, 90));

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboard/icon/5.png"))); // NOI18N
        jPanel1.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 70, 90));

        lbNome.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        lbNome.setText("Nome Completo");
        jPanel1.add(lbNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 170, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 190, 630));

        jToggleButton1.setText(">>>");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, -1));
        getContentPane().add(contente, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 1000, 620));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
      AnimationClass painl = new AnimationClass();
           GlassPanePopup.showPopup(new mess(this));
           
      
      
      
      
      
      
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    public static void main(String args[]) {
      
      try {
            FlatIntelliJLaf.registerCustomDefaultsSource("style");

            UIManager.setLookAndFeel(new FlatIntelliJLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(LoginP.class.getName()).log(Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            //    new GerenteFrame().setVisible(true);
            }
        });
    }

    public JPanel getContente() {
        return contente;
    }

    public void setContente(JPanel contente) {
        this.contente = contente;
    }

    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Acao2;
    private com.pedro.swing.win_button.ButtonBadges Messagem;
    private javax.swing.JButton btListarCarro;
    private javax.swing.JPanel contente;
    private View.Admin.ImageAvatar imagem;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lbNome;
    private com.pedro.swing.win_button.ButtonBadges noti;
    // End of variables declaration//GEN-END:variables
}
