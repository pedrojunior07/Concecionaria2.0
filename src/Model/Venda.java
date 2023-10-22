
package Model;

import java.io.Serializable;



/**
 *
 * @author Pedro Manjate
 */
public class Venda implements Serializable, vendas{
    
    private Carro carro;

    public boolean isPedido() {
        return pedido;
    }

    public void setPedido(boolean pedido) {
        this.pedido = pedido;
    }

    public StockeTaxas getTaxes() {
        return taxes;
    }

    public void setTaxes(StockeTaxas taxes) {
        this.taxes = taxes;
    }
    private Cliente cliente;
    private int numeroDaVenda;
    private int mesDaVenda, anoDaVenda,diaDaVenda, mesDaGarantia, anoDaGarantia,diaDaGarantia;
    private double precoDaVenda;
    private boolean estado, pedido;
    private StockeTaxas taxes;

    public Venda(StockeTaxas taxes) {
        this.taxes = taxes;
    }

   
  
    
    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getMesDaVenda() {
        return mesDaVenda;
    }

    public void setMesDaVenda(int mesDaVenda) {
        this.mesDaVenda = mesDaVenda;
    }

    public int getAnoDaVenda() {
        return anoDaVenda;
    }

    public void setAnoDaVenda(int anoDaVenda) {
        this.anoDaVenda = anoDaVenda;
    }

    public int getDiaDaVenda() {
        return diaDaVenda;
    }

    public void setDiaDaVenda(int diaDaVenda) {
        this.diaDaVenda = diaDaVenda;
    }

    public int getMesDaGarantia() {
        return mesDaGarantia;
    }

    public void setMesDaGarantia(int mesDaGarantia) {
        this.mesDaGarantia = mesDaGarantia;
    }

    public int getAnoDaGarantia() {
        return anoDaGarantia;
    }

    public void setAnoDaGarantia(int anoDaGarantia) {
        this.anoDaGarantia = anoDaGarantia;
    }

    public int getDiaDaGarantia() {
        return diaDaGarantia;
    }

    public void setDiaDaGarantia(int diaDaGarantia) {
        this.diaDaGarantia = diaDaGarantia;
    }

    

  

  

    public int getNumeroDaVenda() {
        return numeroDaVenda;
    }

    public void setNumeroDaVenda(int numeroDaVenda) {
        this.numeroDaVenda = numeroDaVenda;
    }

   

    public double getPrecoDaVenda() {
        return precoDaVenda;
    }

    public void setPrecoDaVenda(double precoDaVenda) {
        this.precoDaVenda = precoDaVenda;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

   
   

    @Override
    public void AtulisarStock() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double precoFinalComPrestacoes(int i) {
     if(i==1){
         return (carro.getPreco()+ (carro.getPreco()*(taxes.getAcrescimo()/100))+ (carro.getPreco()*taxes.getImposto()/100)+(carro.getPreco()*taxes.getTaxaMensal6()/100)-((taxes.getPromoDisconto()/100)*carro.getPreco()));}else 
         if(i==2){
         return (carro.getPreco()+(carro.getPreco()*(taxes.getAcrescimo()/100))+(carro.getPreco()*(taxes.getImposto()/100))+((taxes.getTaxaMensal12()/100)*carro.getPreco())-((taxes.getPromoDisconto()/100)*carro.getPreco()));
         }else if(i==3){        return (carro.getPreco()+(carro.getPreco()*(taxes.getAcrescimo()/100))+(carro.getPreco()*(taxes.getImposto()/100))+((taxes.getTaxaMansal18()/100)*carro.getPreco())-((taxes.getPromoDisconto()/100)*carro.getPreco()));} 
     return 0;
      
    }

    @Override
    public double precoFinalSemPrestacoes() {
         return (carro.getPreco()+((taxes.getAcrescimo()/100)*carro.getPreco())+((taxes.getImposto()/100)*carro.getPreco())-(taxes.getPromoDisconto()*carro.getPreco()));
    }

}
