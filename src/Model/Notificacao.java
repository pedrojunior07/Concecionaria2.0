
package Model;

import java.io.Serializable;

/**
 *
 * @author Pedro
 */
public class Notificacao implements Serializable {
    private Venda  venda;
    private  boolean  status;

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
    
    
    
    
}
