/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;


import View.Gerente.AdicionarCarro;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatGitHubIJTheme;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.awt.BorderLayout;
import java.awt.geom.FlatteningPathIterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Pedro
 */
public class GerenteFrame extends javax.swing.JFrame {

    /**
     * Creates new form GerenteFrame
     */
    public GerenteFrame() {
        // UIManager.put( "Button.arc" , 999 );
         
          initComponents();
        // UIManager.put( "Button.arc" , 999 );
        initComponents();
        
          
       
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contente = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        imageAvatar1 = new View.Admin.ImageAvatar();
        Messagem = new com.pedro.swing.win_button.ButtonBadges();
        buttonBadges2 = new com.pedro.swing.win_button.ButtonBadges();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        Acao2 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        lbNome = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        contente.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 180, 30));

        getContentPane().add(contente, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 1000, 620));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(imageAvatar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 180, 140));

        Messagem.setText("mess");
        jPanel1.add(Messagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 80, 70));

        buttonBadges2.setText("Noti");
        jPanel1.add(buttonBadges2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 70));

        jButton9.setText("Acao3");
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, -1, 90));

        jButton10.setText("Acao 1");
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, 90));

        Acao2.setText("Acao2");
        jPanel1.add(Acao2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, -1, 90));

        jButton12.setText("Acao4");
        jPanel1.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, -1, 90));

        lbNome.setText("Nome Completo");
        jPanel1.add(lbNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 170, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 190, 630));

        jButton1.setText("jButton1");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 40, 30));

        jButton2.setText("jButton1");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, 40));

        jButton3.setText("jButton1");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, 40));

        jButton4.setText("jButton1");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, 40));

        jButton5.setText("jButton1");
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, -1, 40));

        jButton6.setText("jButton1");
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, -1, 40));

        jButton7.setText("jButton1");
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, -1, 40));

        jButton8.setText("jButton1");
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 10, -1, 40));

        jButton11.setText("jButton1");
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, -1, 40));

        jButton13.setText("jButton1");
        getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, -1, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
      
      try {
            FlatIntelliJLaf.registerCustomDefaultsSource("style");

            UIManager.setLookAndFeel(new FlatIntelliJLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenteFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Acao2;
    private com.pedro.swing.win_button.ButtonBadges Messagem;
    private com.pedro.swing.win_button.ButtonBadges buttonBadges2;
    private javax.swing.JPanel contente;
    private View.Admin.ImageAvatar imageAvatar1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbNome;
    // End of variables declaration//GEN-END:variables
}
