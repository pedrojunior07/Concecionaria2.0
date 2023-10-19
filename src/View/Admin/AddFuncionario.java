/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View.Admin;

import Controller.AdminController;
import DAO.ImagemDirectorioDAO;
import Model.ImagemDirectorios;
import Model.Vendedor;
import View.ADMFrame;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.ui.FlatRoundBorder;
import com.formdev.flatlaf.ui.FlatTextBorder;
import java.awt.Color;
import static java.awt.SystemColor.text;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.border.Border;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import jnafilechooser.api.JnaFileChooser;

/**
 *
 * @author Pedro
 */
public class AddFuncionario extends javax.swing.JPanel {

    /*    /**
    * Creates new form AddFuncionario
    */
    public JFrame frame;
    ImageIcon icone;
 JnaFileChooser jnaCh; 
    public AddFuncionario(JFrame frame) {
        this.frame = frame;
        initComponents();
        dateChooser1.setTextRefernce(txData);
          jnaCh = new JnaFileChooser();
        //---------------------------------------------------
        Border f = new FlatRoundBorder();
        pTxEmail1.setBorder(f);
        Border E = new FlatTextBorder();
        this.setBorder(E);
        
        
//---------------------------------Validacao de textField
//        AbstractDocument doc = (AbstractDocument) txSalario.getDocument();
//        doc.setDocumentFilter(new DocumentFilter() {
//            @Override
//            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
//                String newText = fb.getDocument().getText(0, fb.getDocument().getLength()) + text;
//                if (newText.matches("\\d*")) { // Verifica se newText contém apenas dígitos
//                    super.replace(fb, offset, length, text, attrs);
//                } else {
//                    // Se o texto não for numérico, não faça nada
//                    Toolkit.getDefaultToolkit().beep(); // Emita um som de erro
//                }
//            }
//        });
        
        
        //--------------------------------------------------------------------
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooser1 = new com.raven.datechooser.DateChooser();
        jLabel3 = new javax.swing.JLabel();
        pTxEmail1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        txData = new javax.swing.JTextField();
        txNome = new textfield.TextField();
        txApelido = new textfield.TextField();
        txSalario = new textfield.TextField();
        txContacto = new textfield.TextField();
        txEmail = new textfield.TextField();
        cSexo = new javax.swing.JComboBox<>();
        cNacinalidade = new javax.swing.JComboBox<>();
        cECivil = new javax.swing.JComboBox<>();
        cCategoria = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        imagePerfil = new pedro.swing.ImageAvatar();
        jLabel1 = new javax.swing.JLabel();
        btChooser = new javax.swing.JButton();
        txIdentidade = new textfield.TextField();

        setForeground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setText("Dados Pessoais :");
        jLabel3.setToolTipText("");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, 30));

        pTxEmail1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        pTxEmail1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 50, 30));

        txData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txDataActionPerformed(evt);
            }
        });
        pTxEmail1.add(txData, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 30));
        txData.getAccessibleContext().setAccessibleName("");

        add(pTxEmail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 290, 50));

        txNome.setToolTipText("Nome");
        txNome.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        txNome.setLabelText("Nome");
        add(txNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 290, 50));

        txApelido.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        txApelido.setLabelText("Apelido");
        add(txApelido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 290, -1));

        txSalario.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txSalario.setLabelText("Salario");
        txSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txSalarioActionPerformed(evt);
            }
        });
        add(txSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 290, -1));

        txContacto.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txContacto.setLabelText("Contacto :");
        txContacto.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                txContactoComponentShown(evt);
            }
        });
        txContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txContactoActionPerformed(evt);
            }
        });
        add(txContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 290, -1));

        txEmail.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txEmail.setLabelText("E-Mail");
        add(txEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 290, -1));

        cSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sexo", "Masculino", "Feminino" }));
        add(cSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 290, 50));

        cNacinalidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nacionalidade", "Abecásia", "Afeganistão", "África do Sul", "Albânia", "Alemanha", "Andorra", "Angola", "Antígua e Barbuda", "Arábia Saudita", "Argélia", "Argentina", "Armênia", "Austrália", "Áustria", "Azerbaijão", "Bahamas", "Bahrein (ou Barein, ou Barém)", "Bangladesh", "Barbados", "Bélgica", "Belize", "Benim", "Bielorrússia", "Bolívia", "Bósnia e Herzegovina", "Botswana (ou Botsuana)", "Brasil", "Brunei", "Bulgária", "Burkina Faso (ou Burquina Faso)", "Burundi", "Butão", "Cabo Verde", "Camarões", "Camboja", "Canadá", "Catar (ou Qatar)", "Cazaquistão", "Chade", "Chile", "China", "Chipre", "Cingapura (ou Singapura)", "Colômbia", "Comores", "Congo", "Coreia do Norte", "Coreia do Sul", "Costa do Marfim", "Costa Rica", "Croácia", "Cuba", "Dinamarca", "Djibouti (ou Djibuti)", "Dominica", "Egito", "El Salvador", "Emirados Árabes Unidos", "Equador", "Eritreia", "Escócia", "Eslováquia", "Eslovênia", "Espanha", "Estados Federados da Micronésia", "Estados Unidos da América", "Estônia", "Eswatini (ou Essuatíni, ou Suazilândia)", "Etiópia", "Fiji", "Filipinas", "Finlândia", "França", "Gabão", "Gâmbia", "Gana", "Geórgia", "Granada", "Grécia", "Guatemala", "Guiana", "Guiné", "Guiné-Bissau", "Guiné Equatorial", "Haiti", "Holanda", "Honduras", "Hungria", "Iêmen", "Índia", "Indonésia", "Inglaterra", "Irã (ou Irão)", "Iraque", "Irlanda do Norte", "Irlanda", "Islândia", "Israel", "Itália", "Jamaica", "Japão", "Jordânia", "Kiribati (ou Quiribati)", "Kosovo", "Kuwait", "Laos", "Lesoto", "Letônia", "Líbano", "Libéria", "Líbia", "Liechtenstein (ou Listenstaine)", "Lituânia", "Luxemburgo", "Macedônia do Norte", "Madagascar (ou Madagáscar)", "Malásia", "Malawi (ou Malauí)", "Maldivas", "Mali", "Malta", "Marrocos", "Marshall", "Maurícia", "Mauritânia", "México", "Mianmar", "Micronésia", "Moçambique", "Moldávia", "Mônaco", "Mongólia", "Montenegro", "Namíbia", "Nauru", "Nepal", "Nicarágua", "Níger", "Nigéria", "Noruega", "Nova Zelândia", "Omã", "Ossétia do Sul", "País de Gales", "Países Baixos", "Palau", "Palestina", "Panamá", "Papua-Nova Guiné", "Paquistão", "Paraguai", "Peru", "Polônia", "Portugal", "Qatar (ou Catar)", "Quênia", "Quirguistão", "Quiribati (ou Kiribati)", "Reino Unido", "República Árabe Saaraui Democrática", "República Centro-Africana", "República Democrática do Congo", "República do Congo", "República Dominicana", "República Tcheca (ou Tchéquia)", "República Turca de Chipre do Norte", "Romênia", "Ruanda", "Rússia", "Salomão", "Samoa", "San Marino (ou São Marinho)", "Santa Lúcia", "São Cristóvão e Névis (ou São Cristóvão e Neves)", "São Tomé e Príncipe", "São Vicente e Granadinas", "Senegal", "Serra Leoa", "Sérvia", "Seychelles (ou Seicheles)", "Singapura (ou Cingapura)", "Síria", "Somália", "Sri Lanka", "Suazilândia (ou Eswatini, ou Essuatíni)", "Sudão do Sul", "Sudão", "Suécia", "Suíça", "Suriname", "Tailândia", "Taiwan", "Tajiquistão (ou Tadjiquistão)", "Tanzânia", "Tchéquia (ou República Tcheca)", "Timor-Leste", "Togo", "Tonga", "Trinidad e Tobago", "Tunísia", "Turcomenistão (ou Turquemenistão)", "Turquia", "Tuvalu", "Ucrânia", "Uganda", "Uruguai", "Uzbequistão", "Vanuatu", "Vaticano", "Venezuela", "Vietnã (ou Vietname)", "Zâmbia", "Zimbábue" }));
        cNacinalidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cNacinalidadeActionPerformed(evt);
            }
        });
        add(cNacinalidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 282, 290, 50));

        cECivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estado Civil", "Casado/a ", "Solteiro/a", "Viuvo/a", "Divorciado/a" }));
        add(cECivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 290, 50));

        cCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Categoria", "Gerente", "Vendedor", "Outro", " ", " " }));
        add(cCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 290, 50));

        jButton2.setText("Salvar");
        jButton2.setBorder(new FlatRoundBorder());
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, 180, -1));
        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, -1, -1));

        imagePerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboard/icon/user.png"))); // NOI18N
        add(imagePerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 80, 110, 100));

        jLabel1.setText("Foto");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 190, 30, -1));

        btChooser.setText("Escolher");
        btChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btChooserActionPerformed(evt);
            }
        });
        add(btChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 220, 110, 30));

        txIdentidade.setEnabled(false);
        txIdentidade.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        txIdentidade.setLabelText("Numero De Identidade");
        add(txIdentidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 290, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
dateChooser1.showPopup();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txDataActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int p = JOptionPane.showConfirmDialog(this, "Salvar?");

      if(cCategoria.getSelectedItem().toString().equalsIgnoreCase("vendedor")){
          Vendedor a = new Vendedor();
       a.setNome(txNome.getText());
        a.setNaturalidade(cNacinalidade.getSelectedItem().toString());
        a.setAcessoNivel1(false);
        a.setAcessoNivel2(true);
        a.setAcessoNivel3(false);
        a.setApelido(txApelido.getText());
        int ano=    dateChooser1.getSelectedDate().getYear();
        int mes =  dateChooser1.getSelectedDate().getMonth();
        int dia = dateChooser1.getSelectedDate().getDay();
        a.setDataDeNascimento(dateChooser1.getSelectedDate().toString());
          Calendar b = Calendar.getInstance();
       // a.setDataDoContrato(new Date(b.getTime().getYear(),b.getTime().getMonth()),b.getTime().getDate());
        a.setEspecialidade(cCategoria.getSelectedItem().toString());
        a.setEstado(true);
        a.setEstadocivil(cECivil.getSelectedItem().toString());
        a.setIdade(2023-dateChooser1.getSelectedDate().getYear());
        a.setIdentidade(txIdentidade.getText());
        a.setNumeroDeVendas(0);
        a.setSalario(Double.parseDouble(txSalario.getText()));
        a.setSenha("12345");
        a.setSexo(cSexo.getSelectedItem().toString());
        a.setTelefone(Integer.parseInt(txContacto.getText()));
        a.seteMail(txEmail.getText());
          System.out.println(a.getSalario()+txSalario.getText());
          AdminController cc = new AdminController(frame);
          
          ImagemDirectorios icon = new ImagemDirectorios();
          icon.setIdentidade(txIdentidade.getText());
          icon.setIcon(icone);
          ImagemDirectorioDAO imDir = new ImagemDirectorioDAO();
         imDir.insert(icon, "Imagens");
            
         
         try {
                cc.insertVendedor(a);
            } catch (SQLException ex) {
                Logger.getLogger(AddFuncionario.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AddFuncionario.class.getName()).log(Level.SEVERE, null, ex);
            }
        
         
        
      }else if(cCategoria.getSelectedItem().toString().equalsIgnoreCase("gerente")){
      
      }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txContactoComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_txContactoComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_txContactoComponentShown

    private void btChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btChooserActionPerformed
         
        boolean save = jnaCh.showOpenDialog(frame);
        if (save) {
           // System.out.println(jnaCh.getSelectedFile());
           icone = new ImageIcon(jnaCh.getSelectedFile().toString());
           imagePerfil.setIcon(icone);
           
        }
    }//GEN-LAST:event_btChooserActionPerformed

    private void cNacinalidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cNacinalidadeActionPerformed
     if(cNacinalidade.getSelectedItem().toString().equalsIgnoreCase("Moçambique")){
         txIdentidade.setLabelText("BI");
         txIdentidade.setEnabled(true);
     }else{
      txIdentidade.setLabelText("DIR");
      txIdentidade.setEnabled(true);
     }
    }//GEN-LAST:event_cNacinalidadeActionPerformed

    private void txContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txContactoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txContactoActionPerformed

    private void txSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txSalarioActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btChooser;
    private javax.swing.JComboBox<String> cCategoria;
    private javax.swing.JComboBox<String> cECivil;
    private javax.swing.JComboBox<String> cNacinalidade;
    private javax.swing.JComboBox<String> cSexo;
    private com.raven.datechooser.DateChooser dateChooser1;
    private pedro.swing.ImageAvatar imagePerfil;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel pTxEmail1;
    private textfield.TextField txApelido;
    private textfield.TextField txContacto;
    private javax.swing.JTextField txData;
    private textfield.TextField txEmail;
    private textfield.TextField txIdentidade;
    private textfield.TextField txNome;
    private textfield.TextField txSalario;
    // End of variables declaration//GEN-END:variables
public  Color a ;

}
