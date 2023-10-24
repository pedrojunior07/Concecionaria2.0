
package DAO;

import DAO.DATABASE.CarroDao;
import DAO.DATABASE.Conexao;
import Model.Financas;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Pedro
 */
public class FinacasDao {
    
          public void insert(Financas user) {
        ArrayList<Financas> usuario = openFile();
        usuario.add(user);
        closeFile(usuario, "Financas");
            JOptionPane.showMessageDialog(null, "Confre Atualizado com sucesso", "Gerente Vendas",
                    JOptionPane.INFORMATION_MESSAGE);  
    }
          
 
          
          
     public void closeFile(ArrayList<Financas> usuario, String file) {
        
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
        
            
        } catch (Exception c) {
  // c.printStackTrace();
        }
        
    }
    
     
    
      public ArrayList<Financas> openFile() {
        
        ArrayList<Financas> users = new ArrayList<>();
        try {
           // File files = new File(file);
            FileInputStream meuFicheiro = new FileInputStream("Financas");
            ObjectInputStream in = new ObjectInputStream(meuFicheiro);
            
            Financas vic = null;
            while ((vic = (Financas) in.readObject()) != null) {
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
