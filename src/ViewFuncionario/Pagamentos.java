/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ViewFuncionario;

import DAO.StockTaxasDao;
import Model.Carro;
import Model.Cliente;
import Model.Funcionario;
import Model.StockeTaxas;
import Model.Venda;
import Model.vendas;
import java.awt.BorderLayout;
import java.util.ArrayList;
import org.netbeans.lib.awtextra.AbsoluteLayout;

/**
 *
 * @author Celso Mongane
 */
public class Pagamentos extends javax.swing.JPanel {
    Carro carro;
    Funcionario funcionario;
    Cliente cliente;
    Venda venda;
    public Pagamentos(Funcionario funcionario,Carro carro, Cliente cliente) {
        this.cliente = cliente;
        this.funcionario =funcionario;
        this.carro = carro;
        
        initComponents();
        marcaModeloAno.setText(carro.getFabricante()+" "+ carro.getModelo()+" "+carro.getAnoDeFabrico());
        cambioTipoDeCombustivel1.setText("Cambio "+carro.getTracao()+" "+" Motor a "+ carro.getTipoDeComustivel());
        TermosCondicoesPrestacoes.setVisible(false);
        StockTaxasDao std = new StockTaxasDao();
        ArrayList<StockeTaxas> openFile = std.openFile();
        
        
        venda= new Venda(openFile.get(0));
        venda.setCarro(carro);
            }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BaseLocal = new javax.swing.JPanel();
        BasePagamento = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Avista = new javax.swing.JRadioButton();
        precoPorMes = new javax.swing.JLabel();
        Prestacoes = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        Cartao = new javax.swing.JRadioButton();
        numerario = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        ComboPrestacoes = new javax.swing.JComboBox<>();
        Avancar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        marcaModeloAno = new javax.swing.JLabel();
        cambioTipoDeCombustivel1 = new javax.swing.JLabel();
        precoApagar = new javax.swing.JLabel();
        TermosCondicoesPrestacoes = new javax.swing.JButton();
        lbPrestacoes = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        BaseLocal.setLayout(new java.awt.BorderLayout());

        BasePagamento.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel6.setText("Formulario De Pagamento");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        BasePagamento.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 6, 223, 28));

        Avista.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        Avista.setText("Avista");
        Avista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AvistaActionPerformed(evt);
            }
        });
        BasePagamento.add(Avista, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 132, -1, -1));

        precoPorMes.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        BasePagamento.add(precoPorMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 290, 40));

        Prestacoes.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        Prestacoes.setText("Prestacoes");
        Prestacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrestacoesActionPerformed(evt);
            }
        });
        BasePagamento.add(Prestacoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel3.setText("Forma de Pagamento");
        BasePagamento.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 205, -1, -1));

        Cartao.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        Cartao.setText("Cartao");
        Cartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CartaoActionPerformed(evt);
            }
        });
        BasePagamento.add(Cartao, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 234, -1, -1));

        numerario.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        numerario.setText("Numerario");
        numerario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numerarioActionPerformed(evt);
            }
        });
        BasePagamento.add(numerario, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 262, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel4.setText("Prestacoes");
        BasePagamento.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 290, 129, 28));

        ComboPrestacoes.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        ComboPrestacoes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6   meses", "12 meses ", "18 meses", " " }));
        ComboPrestacoes.setEnabled(false);
        ComboPrestacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboPrestacoesActionPerformed(evt);
            }
        });
        BasePagamento.add(ComboPrestacoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 324, 129, 31));

        Avancar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        Avancar.setText("Avancar");
        Avancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AvancarActionPerformed(evt);
            }
        });
        BasePagamento.add(Avancar, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 428, 112, 33));

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel5.setText("Tipo de Pagamento");
        BasePagamento.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 96, 129, 28));

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel7.setText("Detalhes do veiculo");
        BasePagamento.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 105, 260, 28));

        marcaModeloAno.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        BasePagamento.add(marcaModeloAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 290, 40));

        cambioTipoDeCombustivel1.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        BasePagamento.add(cambioTipoDeCombustivel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 290, 40));

        precoApagar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        BasePagamento.add(precoApagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 290, 40));

        TermosCondicoesPrestacoes.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        TermosCondicoesPrestacoes.setText("Termos & Condicoes");
        BasePagamento.add(TermosCondicoesPrestacoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 180, -1));

        lbPrestacoes.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        BasePagamento.add(lbPrestacoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 250, 50));

        BaseLocal.add(BasePagamento, java.awt.BorderLayout.CENTER);

        add(BaseLocal, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void PrestacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrestacoesActionPerformed
if(Prestacoes.isSelected()){
Avista.setSelected(false);

precoApagar.setText(" ");
}     

ComboPrestacoes.setEnabled(true);
TermosCondicoesPrestacoes.setVisible(true);
    }//GEN-LAST:event_PrestacoesActionPerformed

    private void AvistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AvistaActionPerformed
          if(Avista.isSelected()){
              Prestacoes.setSelected(false);
              
              precoApagar.setText("Valor "+ venda.precoFinalSemPrestacoes()+" MZN");

        }
          ComboPrestacoes.setEnabled(false);
TermosCondicoesPrestacoes.setVisible(false);
    }//GEN-LAST:event_AvistaActionPerformed

    private void ComboPrestacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboPrestacoesActionPerformed
      if(ComboPrestacoes.getSelectedIndex()==0){
      precoApagar.setText("Valor "+ venda.precoFinalComPrestacoes(1)+" MZN");
      lbPrestacoes.setText(" Vai pagar "+venda);
      }else if(ComboPrestacoes.getSelectedIndex()==1){
      precoApagar.setText("Valor "+ venda.precoFinalComPrestacoes(2)+" MZN");
      }else if(ComboPrestacoes.getSelectedIndex()==2){
      precoApagar.setText("Valor "+ venda.precoFinalComPrestacoes(3)+" MZN");
      }
        
    }//GEN-LAST:event_ComboPrestacoesActionPerformed

    private void AvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AvancarActionPerformed
      
        g
        
    }//GEN-LAST:event_AvancarActionPerformed

    private void CartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CartaoActionPerformed
     if(Cartao.isSelected()){
     numerario.setSelected(false);
    }
    }//GEN-LAST:event_CartaoActionPerformed

    private void numerarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numerarioActionPerformed
       if(numerario.isSelected()){
       Cartao.setSelected(false);
       }
    }//GEN-LAST:event_numerarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Avancar;
    private javax.swing.JRadioButton Avista;
    private javax.swing.JPanel BaseLocal;
    private javax.swing.JPanel BasePagamento;
    private javax.swing.JRadioButton Cartao;
    private javax.swing.JComboBox<String> ComboPrestacoes;
    private javax.swing.JRadioButton Prestacoes;
    private javax.swing.JButton TermosCondicoesPrestacoes;
    private javax.swing.JLabel cambioTipoDeCombustivel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lbPrestacoes;
    private javax.swing.JLabel marcaModeloAno;
    private javax.swing.JRadioButton numerario;
    private javax.swing.JLabel precoApagar;
    private javax.swing.JLabel precoPorMes;
    // End of variables declaration//GEN-END:variables
}
