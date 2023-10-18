
package View.Admin;


import DAO.ImagemDirectorioDAO;
import Model.Funcionario;
import Model.ImagemDirectorios;
import Model.Vendedor;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author Pedro
 */
public class ProcurarFuncionario extends javax.swing.JPanel {
    JFrame frame;
    String teste;
    ArrayList<Vendedor> user;
    
    
    public ProcurarFuncionario(JFrame frame,ArrayList<Vendedor> user) {
        this.frame = frame;
        this.user = user;
        initComponents();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txEmail = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        lb = new javax.swing.JLabel();
        Foto = new View.Admin.ImageAvatar();
        lIdade = new javax.swing.JLabel();
        LEspecialidade = new javax.swing.JLabel();
        lId = new javax.swing.JLabel();
        LnomeComleto = new javax.swing.JLabel();
        lSalario = new javax.swing.JLabel();
        lNumdevendas = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        lEmail = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(txEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 41, 451, 40));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboard/icon/searchEmployee.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(919, 41, 54, 40));

        lb.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        lb.setText("E-Mail :");
        add(lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 44, 66, 32));

        Foto.setGradientColor1(new java.awt.Color(0, 0, 255));
        Foto.setGradientColor2(new java.awt.Color(51, 204, 0));
        Foto.setImage(new javax.swing.ImageIcon(getClass().getResource("/dashboard/icon/user.png"))); // NOI18N
        add(Foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 127, 180, 192));

        lIdade.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        add(lIdade, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 249, 30));

        LEspecialidade.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        add(LEspecialidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 249, 28));

        lId.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        add(lId, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 80, 40));

        LnomeComleto.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        add(LnomeComleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 249, 28));

        lSalario.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        add(lSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 249, 28));

        lNumdevendas.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        add(lNumdevendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 249, 28));

        jButton2.setText("Alterar o Salario");
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 450, 130, 50));

        jButton3.setText("Promover");
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, 130, 50));

        jButton4.setText("Ver Actividade");
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 450, 130, 50));

        jButton5.setText("Demitir");
        add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 450, 130, 50));
        add(lEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, 250, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
        teste = new String();
        for (Vendedor funcionario : user) {
            if(funcionario.geteMail().equalsIgnoreCase(txEmail.getText())){
            lId.setText("ID: "+funcionario.getId());
            LnomeComleto.setText(funcionario.getNome()+" "+funcionario.getApelido());
            lIdade.setText("Idade :  "+funcionario.getIdade());
            LEspecialidade.setText("Especialidade: "+funcionario.getEspecialidade());
            lSalario.setText("Salario: "+funcionario.getSalario());
            lNumdevendas.setText("Numero De Vendas "+funcionario.getNumeroDeVendas() );
             lEmail.setText(" Identidade : "+funcionario.getIdentidade());
           teste = funcionario.getIdentidade();
            }
            
            ImagemDirectorioDAO img = new ImagemDirectorioDAO();
            ArrayList<ImagemDirectorios> openFile = img.openFile("Imagens");
              for (int i=0; i<openFile.size();i++){
                  
              if(teste.equalsIgnoreCase(openFile.get(i).getIdentidade())){
              Foto.setImage(openFile.get(i).getIcon());
                  
              }
                  }
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private View.Admin.ImageAvatar Foto;
    private javax.swing.JLabel LEspecialidade;
    private javax.swing.JLabel LnomeComleto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel lEmail;
    private javax.swing.JLabel lId;
    private javax.swing.JLabel lIdade;
    private javax.swing.JLabel lNumdevendas;
    private javax.swing.JLabel lSalario;
    private javax.swing.JLabel lb;
    private javax.swing.JFormattedTextField txEmail;
    // End of variables declaration//GEN-END:variables
}
