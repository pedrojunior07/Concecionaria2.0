/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.ImagemDirectorios;
import Model.Vendedor;
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
public class ImagemDirectorioDAO {
    
      public void insert(ImagemDirectorios user, String file) {
        ArrayList<ImagemDirectorios> usuario = openFile(file);
        usuario.add(user);
        closeFile(usuario, file);
            JOptionPane.showMessageDialog(null, "Imagem Guardada com sucesso", "Ficheiro de Imagens",
                    JOptionPane.INFORMATION_MESSAGE);  
    }
 
     public void closeFile(ArrayList<ImagemDirectorios> usuario, String file) {
        
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
    
    
      public ArrayList<ImagemDirectorios> openFile(String file) {
        
        ArrayList<ImagemDirectorios> users = new ArrayList<>();
        try {
           // File files = new File(file);
            FileInputStream meuFicheiro = new FileInputStream(file);
            ObjectInputStream in = new ObjectInputStream(meuFicheiro);
            
            ImagemDirectorios vic = null;
            while ((vic = (ImagemDirectorios) in.readObject()) != null) {
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
