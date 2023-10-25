
package DAO;

import Model.Notificacao;
import Model.Venda;
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
public class NotificacoesDAO {
       public void insert(Notificacao user) {
        ArrayList<Notificacao> usuario = openFile();
        usuario.add(user);
        closeFile(usuario, "Notificacao");
            JOptionPane.showMessageDialog(null, "Noti", "Gerente Vendas",
                    JOptionPane.INFORMATION_MESSAGE);  
    }
 
     public void closeFile(ArrayList<Notificacao> usuario, String file) {
        
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
    
    
      public ArrayList<Notificacao> openFile() {
        
        ArrayList<Notificacao> users = new ArrayList<>();
        try {
           // File files = new File(file);
            FileInputStream meuFicheiro = new FileInputStream("Notificacao");
            ObjectInputStream in = new ObjectInputStream(meuFicheiro);
            
            Notificacao vic = null;
            while ((vic = (Notificacao) in.readObject()) != null) {
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
