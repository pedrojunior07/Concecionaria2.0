/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ViewFuncionario;

import Model.Funcionario;
import Model.Vendedor;
import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.FlatPropertiesLaf;
import com.formdev.flatlaf.extras.FlatAnimatedLafChange;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatGitHubDarkIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatGitHubIJTheme;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.UIManager;
import pedro.glasspanepopup.GlassPanePopup;

/**
 *
 * @author Celso Mongane
 */
public class Base extends javax.swing.JFrame {
       private EfectuarVenda painel1;
       public Funcionario funcionario;

    public JPanel getBase2() {
        return Base2;
    }

    public void setBase2(JPanel Base2) {
        this.Base2 = Base2;
    }
       
  
    public Base(ImageIcon icon, Funcionario vendedor  ) {
        this.funcionario = vendedor;
        UIManager.put("Button.arc", 999);
        initComponents();
        GlassPanePopup.install(this);
        jLabel1.setText(vendedor.getNome()+" "+vendedor.getApelido());
        imageAvatar2.setImage(icon);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jColorChooser1 = new javax.swing.JColorChooser();
        Butons = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        Estatisticas = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        EfectuarVenda = new javax.swing.JButton();
        VisualizarFuncio = new javax.swing.JButton();
        imageAvatar2 = new View.Admin.ImageAvatar();
        escuro = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        Base2 = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Butons.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 153)));
        Butons.setPreferredSize(new java.awt.Dimension(120, 493));
        Butons.setLayout(null);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Butons.add(jButton1);
        jButton1.setBounds(50, 410, 80, 50);

        Estatisticas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboard/icon/4.png"))); // NOI18N
        Estatisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstatisticasActionPerformed(evt);
            }
        });
        Butons.add(Estatisticas);
        Estatisticas.setBounds(50, 470, 80, 50);

        jButton5.setText("jButton1");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        Butons.add(jButton5);
        jButton5.setBounds(50, 600, 80, 50);

        EfectuarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ViewFuncionario/Carrinho.png"))); // NOI18N
        EfectuarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EfectuarVendaActionPerformed(evt);
            }
        });
        Butons.add(EfectuarVenda);
        EfectuarVenda.setBounds(50, 350, 80, 50);

        VisualizarFuncio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ViewFuncionario/comercial1.png"))); // NOI18N
        VisualizarFuncio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisualizarFuncioActionPerformed(evt);
            }
        });
        Butons.add(VisualizarFuncio);
        VisualizarFuncio.setBounds(50, 540, 80, 50);

        imageAvatar2.setGradientColor1(new java.awt.Color(242, 242, 242));
        imageAvatar2.setGradientColor2(new java.awt.Color(242, 242, 242));
        imageAvatar2.setImage(new javax.swing.ImageIcon(getClass().getResource("/dashboard/icon/user.png"))); // NOI18N
        Butons.add(imageAvatar2);
        imageAvatar2.setBounds(0, 40, 200, 180);

        escuro.setText("Modo Escuro");
        escuro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escuroActionPerformed(evt);
            }
        });
        Butons.add(escuro);
        escuro.setBounds(0, 0, 93, 21);
        Butons.add(jLabel1);
        jLabel1.setBounds(20, 250, 170, 30);

        getContentPane().add(Butons, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 680));

        Base2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(Base2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 1000, 680));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
//        Pagamentos p = new Pagamentos();
//        Base2.removeAll();
//        Base2.add(p,BorderLayout.CENTER);
//        Base2.revalidate();
//        Base2.repaint();
//        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void EstatisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstatisticasActionPerformed
        EstatisticasVendas c = new EstatisticasVendas();
        Base2.removeAll();
        c.setSize(1000,620);
        Base2.add(c,BorderLayout.CENTER);
        Base2.revalidate();
        Base2.repaint();
    }//GEN-LAST:event_EstatisticasActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void EfectuarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EfectuarVendaActionPerformed
           try {
               painel1  = new  EfectuarVenda(this, funcionario);
           } catch (SQLException ex) {
               Logger.getLogger(Base.class.getName()).log(Level.SEVERE, null, ex);
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(Base.class.getName()).log(Level.SEVERE, null, ex);
           }
        Base2.setLayout(new BorderLayout());
        Base2.removeAll();
        Base2.add(painel1, BorderLayout.CENTER);
        Base2.revalidate();
        Base2.repaint();
    }//GEN-LAST:event_EfectuarVendaActionPerformed

    private void VisualizarFuncioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisualizarFuncioActionPerformed
        // TODO add your handling code here:
        Base2.add(this);
    }//GEN-LAST:event_VisualizarFuncioActionPerformed

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

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatGitHubIJTheme());
            }catch (Exception e) {
}
        
run();
    }
    
            public static void run() {
              //  new Base().setVisible(true);
            }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Base2;
    private javax.swing.JPanel Butons;
    private javax.swing.JButton EfectuarVenda;
    private javax.swing.JButton Estatisticas;
    private javax.swing.JButton VisualizarFuncio;
    private javax.swing.JRadioButton escuro;
    private View.Admin.ImageAvatar imageAvatar2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    // End of variables declaration//GEN-END:variables
}
