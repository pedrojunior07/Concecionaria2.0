/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Prestacoes;
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
public class PrestacoesDAO {
    
    
  public void insert(Prestacoes  user) {
        ArrayList<Prestacoes> usuario = openFile();
        usuario.add(user);
        closeFile(usuario, "Prestacoes");
           JOptionPane.showMessageDialog(null, "Prestacoes", "Gerente Vendas",
                    JOptionPane.INFORMATION_MESSAGE);  
    }
  
  public void update(Prestacoes  user){
   ArrayList<Prestacoes> usuario = openFile();
   for(int i=0;i<usuario.size();i++){
   if(usuario.get(i).getVenda().getCarro().getId()==user.getVenda().getCarro().getId()){
       
       usuario.remove(i);
       
   }}
   usuario.add(user);
      closeFile(usuario, "Prestacoes");
   JOptionPane.showMessageDialog(null, "Prestacoes Paga com Sucesso", "Gerente Vendas",
                    JOptionPane.INFORMATION_MESSAGE); 
  }
 
     public void closeFile(ArrayList<Prestacoes> usuario, String file) {
        
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
    
    
      public ArrayList<Prestacoes> openFile() {
        
        ArrayList<Prestacoes> users = new ArrayList<>();
        try {
           // File files = new File(file);
            FileInputStream meuFicheiro = new FileInputStream("Prestacoes");
            ObjectInputStream in = new ObjectInputStream(meuFicheiro);
            
            Prestacoes vic = null;
            while ((vic = (Prestacoes) in.readObject()) != null) {
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
