/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Admin;
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
public class AdminDao {
     public void insert(Admin user) {
        ArrayList<Admin> usuario = openFile();
        usuario.add(user);
        closeFile(usuario, "Admin");
         
    }
     
     
     public void upDate (Admin user){
         ArrayList<Admin> openFile = openFile();
       for(int i=0; i<openFile.size();i++){
       if(openFile.get(i).getE_mail().equalsIgnoreCase(user.getE_mail())){
       openFile.remove(i);
       openFile.add(user);
       
       }
       
       }
         closeFile(openFile, "Admin");
     
     }
 
     public void closeFile(ArrayList<Admin> usuario, String file) {
        
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
            JOptionPane.showMessageDialog(null, "sucess");
            
        } catch (Exception c) {
  // c.printStackTrace();
        }
        
    }
    
    
      public ArrayList<Admin> openFile() {
        
        ArrayList<Admin> users = new ArrayList<>();
        try {
           // File files = new File(file);
            FileInputStream meuFicheiro = new FileInputStream("Admin");
            ObjectInputStream in = new ObjectInputStream(meuFicheiro);
            
            Admin vic = null;
            while ((vic = (Admin) in.readObject()) != null) {
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
