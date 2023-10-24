
package Model;

import java.io.Serializable;

/**
 *
 * @author Pedro
 */
public class Financas implements Serializable {
  private double saldo;
  private double dispesas;
  private double lucro;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getDispesas() {
        return dispesas;
    }

    public void setDispesas(double dispesas) {
        this.dispesas = dispesas;
    }

    public double getLucro() {
        return lucro;
    }

    public void setLucro(double lucro) {
        this.lucro = lucro;
    }
  
    
    
    
}
