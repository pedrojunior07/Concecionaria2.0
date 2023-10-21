
package DAO;

import Model.ImagemDirectorios;
import Model.StockeTaxas;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Pedro
 */
public class StockTaxasDao {
  
    
    public void InsertTax(StockeTaxas usser){
ArrayList<StockeTaxas> tx = new ArrayList<StockeTaxas>();
tx.add(usser);
        closeFile(tx, "taxas");

}
    
      public void closeFile(ArrayList<StockeTaxas> usuario, String file) {
        
        try {
            // Cria o ficheiro div.dat para armazenar os objetos
            FileOutputStream meuFicheiro = new FileOutputStream(file);
            
            ObjectOutputStream os = new ObjectOutputStream(meuFicheiro);

            // Gravando os objetos no ficheiro
            for (int i = 0; i < usuario.size(); i++) {
                os.writeObject(usuario.get(i));
            }

            // fechando os ficheiros abertos meuFicheiro.flush();
            meuFicheiro.close();
            
            os.flush();
            os.close();
            JOptionPane.showMessageDialog(null, "Taxas e Stock Atualisados com sucesso", file, JOptionPane.INFORMATION_MESSAGE);
            
        } catch (Exception c) {
  // c.printStackTrace();
        }
        
    }
    
    
      public ArrayList<StockeTaxas> openFile() {
        
        ArrayList<StockeTaxas> users = new ArrayList<>();
        try {
           // File files = new File(file);
            FileInputStream meuFicheiro = new FileInputStream("taxas");
            ObjectInputStream in = new ObjectInputStream(meuFicheiro);
            
            StockeTaxas vic = null;
            while ((vic = (StockeTaxas) in.readObject()) != null) {
                users.add(vic);
            }
            meuFicheiro.close();
            in.close();

            /*
				 * Nao existe nenhuma necessidade de fazermos uso do metodo flush() aqui por ser
				 * util apenas na escrita dos dados no * ficheiro
             */
        } catch (Exception b) {
          //  JOptionPane.showMessageDialog(null, b.getMessage());
        }
        return users;
    }
    
    
}
