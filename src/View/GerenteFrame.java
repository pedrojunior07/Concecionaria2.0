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
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.extras.FlatAnimatedLafChange;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatGitHubDarkIJTheme;
import com.sun.mail.handlers.message_rfc822;
import java.awt.EventQueue;
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
            FlatGitHubIJTheme.setup();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        contente = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        imagem = new View.Admin.ImageAvatar();
        jButton9 = new javax.swing.JButton();
        btListarCarro = new javax.swing.JButton();
        Acao2 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        lbNome = new javax.swing.JLabel();
        noti = new com.pedro.swing.win_button.ButtonBadges();
        Messagem = new com.pedro.swing.win_button.ButtonBadges();
        escuro = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToggleButton1.setText(">>>");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, -1));
        getContentPane().add(contente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1000, 620));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(imagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 180, 140));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboard/icon/stats.png"))); // NOI18N
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 70, 90));

        btListarCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboard/icon/Listar.png"))); // NOI18N
        jPanel1.add(btListarCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 70, 90));

        Acao2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboard/icon/sack-dollar.png"))); // NOI18N
        jPanel1.add(Acao2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 70, 90));

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboard/icon/gears.png"))); // NOI18N
        jPanel1.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 70, 90));

        lbNome.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        lbNome.setText("Nome Completo");
        jPanel1.add(lbNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 170, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 80, -1, 600));

        noti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboard/icon/noti.png"))); // NOI18N
        noti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notiActionPerformed(evt);
            }
        });
        getContentPane().add(noti, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 10, 50, 40));

        Messagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboard/icon/message.png"))); // NOI18N
        getContentPane().add(Messagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 10, 40, 40));

        escuro.setText("Modo Escuro");
        escuro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escuroActionPerformed(evt);
            }
        });
        getContentPane().add(escuro, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 20, 100, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
      AnimationClass painl = new AnimationClass();
           GlassPanePopup.showPopup(new mess(this));
           
      
      
      
      
      
      
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void notiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_notiActionPerformed

    private void escuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escuroActionPerformed
           if(escuro.isSelected()){
       EventQueue.invokeLater(new Runnable() {
           @Override
           public void run() {
                FlatAnimatedLafChange.showSnapshot();
                FlatGitHubDarkIJTheme.setup();
                 FlatLaf.updateUI();
                FlatAnimatedLafChange.hideSnapshotWithAnimation();
           
                //++++++++++++++++++++++++++++++++++++++++++
       
           }
       });
   }else{
   
    EventQueue.invokeLater(new Runnable() {
           @Override
           public void run() {
                FlatAnimatedLafChange.showSnapshot();
                  FlatGitHubIJTheme.setup();
                 FlatLaf.updateUI();
                FlatAnimatedLafChange.hideSnapshotWithAnimation();
           }
       });
    
    
   }
    }//GEN-LAST:event_escuroActionPerformed

    public static void main(String args[]) {
      
             FlatGitHubIJTheme.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             //   new ADMFrame().setVisible(true);
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
    private javax.swing.JRadioButton escuro;
    private View.Admin.ImageAvatar imagem;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lbNome;
    private com.pedro.swing.win_button.ButtonBadges noti;
    // End of variables declaration//GEN-END:variables
}
