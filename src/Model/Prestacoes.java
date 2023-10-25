
package Model;

import java.io.Serializable;
import javax.swing.JOptionPane;

/**
 *
 * @author Pedro
 */
public class Prestacoes implements Serializable{
    Venda venda;
  boolean status;
  private double valorPago, valorAPagar;

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public double getValorPago() {
        return valorPago;
    }
    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }
    public double getValorAPagar() {
        return valorAPagar;
    }
    public void setValorAPagar(double valorAPagar) {
        this.valorAPagar = valorAPagar;
    }
    
    
    
    public double percentagemPago(){
    return ((100*(valorPago/venda.getPrecoDaVenda())));
    }
    
    public void pagarPrestacao(double cash ){
    valorAPagar = valorAPagar- cash;
    valorPago = valorPago + cash;
    if(cash<=valorAPagar){
     valorAPagar = valorAPagar- cash;
    valorPago = valorPago + cash;
    
    }else if(cash>valorAPagar){
    
     valorAPagar = valorAPagar- valorAPagar;
    valorPago = valorPago + (valorAPagar);
        JOptionPane.showConfirmDialog(null, "Valor a mais Troco = "+(cash-valorAPagar));
    }
    
    }
    
}
