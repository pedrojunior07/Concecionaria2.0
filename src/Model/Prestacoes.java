
package Model;

/**
 *
 * @author Pedro
 */
public class Prestacoes {
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
    return (100-(100*(valorAPagar/valorPago)));
    }
    
    
    
}
