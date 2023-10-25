/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DAO.DATABASE.CarroDao;
import DAO.DATABASE.Conexao;
import Model.Venda;
import Model.vendas;
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
public class VendaDao {
    
          public void insert(Venda user) {
        ArrayList<Venda> usuario = openFile();
        usuario.add(user);
        closeFile(usuario, "venda");
            JOptionPane.showMessageDialog(null, "Pedido de venda !!!!!!!!!!!realizado com sucesso", "Gerente Vendas",
                    JOptionPane.INFORMATION_MESSAGE);  
    }
          
          
          public void  update(Venda user) throws SQLException, ClassNotFoundException{
              ArrayList<Venda> openFile = openFile();
              for(Venda v: openFile){
              if(v.getNumeroDaVenda()== user.getNumeroDaVenda()){
              openFile.remove(v);
              openFile.add(user);
                  closeFile(openFile, "venda");
                  Conexao conexao = new Conexao();
                  CarroDao dao = new CarroDao(conexao.getConnection());
                   dao.VenderCarro(user.getCarro());
              
              }
              }
              
          
          }
 
     public void closeFile(ArrayList<Venda> usuario, String file) {
        
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
    
    
      public ArrayList<Venda> openFile() {
        
        ArrayList<Venda> users = new ArrayList<>();
        try {
           // File files = new File(file);
            FileInputStream meuFicheiro = new FileInputStream("venda");
            ObjectInputStream in = new ObjectInputStream(meuFicheiro);
            
            Venda vic = null;
            while ((vic = (Venda) in.readObject()) != null) {
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
