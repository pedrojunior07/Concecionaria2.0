/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Funcionario;
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
public class VendedorDao {
  
    
     public void update( Vendedor user, String file) {
        ArrayList<Vendedor> openFile = openFile(file);
        for(int i=0;i<openFile.size();i++){
        if(openFile.get(i).getId()==user.getId()){
        openFile.remove(i);
        openFile.add(user);
        }
        }
      
       closeFile(openFile, file);
            JOptionPane.showMessageDialog(null, "Vendedor Updated  com Sucesso", "Ficheiros",
                    JOptionPane.INFORMATION_MESSAGE);  
    }

    
    public void delete(int id, String file) {
        ArrayList<Vendedor> openFile = openFile(file);
        Vendedor search = search(id, file);
        for (int i =0 ;i< openFile.size();i++){
            if(openFile.get(i).getId()==search.getId()){
            openFile.remove(i);
            }
     //   trocar de Id 
            for (int j =0 ;j< openFile.size();j++){
           openFile.get(j).setId(j+1);
            }
        }
        closeFile(openFile, file);
            JOptionPane.showMessageDialog(null, "Vendedor Excluido com Sucesso", "Ficheiros",
                    JOptionPane.INFORMATION_MESSAGE);  
    }
    
    
     public Vendedor search(int id, String file) {
        ArrayList<Vendedor> users = openFile(file);
        Vendedor us = new Vendedor();
        int temp = -1;
        for ( int i = 0 ; i< users.size(); i++) {
            if (id == users.get(i).getId()) {
               temp = i;
            }
        }        
        return users.get(temp);        
    }
     public void insert(Vendedor user, String file) {
        ArrayList<Vendedor> usuario = openFile(file);
        usuario.add(user);
        closeFile(usuario, file);
            JOptionPane.showMessageDialog(null, "Vendedor Registrado com Sucesso", "DMI",
                    JOptionPane.INFORMATION_MESSAGE);  
    }
    
    public void closeFile(ArrayList usuario, String file) {
        
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
    
    
      public ArrayList<Vendedor> openFile(String file) {
        
        ArrayList<Vendedor> users = new ArrayList<>();
        try {
           // File files = new File(file);
            FileInputStream meuFicheiro = new FileInputStream(file);
            ObjectInputStream in = new ObjectInputStream(meuFicheiro);
            
            Vendedor vic = null;
            while ((vic = (Vendedor) in.readObject()) != null) {
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
