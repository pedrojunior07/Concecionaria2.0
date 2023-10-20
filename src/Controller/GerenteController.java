/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.DATABASE.CarroDao;
import DAO.DATABASE.Conexao;
import DAO.DATABASE.FornecedorDao;
import DAO.DATABASE.GerenteDao;
import DAO.DATABASE.VendedorDAO;
import Model.Carro;
import Model.Fornecedor;
import Model.Funcionario;
import Model.Gerente;
import Model.Vendedor;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author Pedro
 */
public class GerenteController {

    private   JFrame frame;

    public GerenteController(JFrame frame) {
        this.frame = frame;
    }

    public void insertCarrro(Carro user) throws SQLException, ClassNotFoundException{
        Conexao connection = new Conexao();
        
        CarroDao dao = new CarroDao(connection.getConnection());
        dao.insertBaseDedados(user);
        
    }
    
    public void insertFornecedor(Fornecedor user) throws SQLException, ClassNotFoundException{
    
    
     Conexao connection = new Conexao();
     
        FornecedorDao dao = new FornecedorDao(connection.getConnection());
      dao.insert(user);
        
    }
    
     public ArrayList<Fornecedor> sellectAllFornecedors() throws SQLException, ClassNotFoundException{
     Conexao connection = new Conexao();
     ArrayList<Fornecedor> lista = new ArrayList<Fornecedor>();
     
     
     
       FornecedorDao f= new FornecedorDao(connection.getConnection());
     
        ArrayList<Fornecedor> selectAll1 = f.selectAll();
       
      
        
        for(int i=0; i<selectAll1.size();i++){
        lista.add(selectAll1.get(i));
        }
        return lista;
    }
    
    
       public ArrayList<Carro> sellectAllCarros() throws SQLException, ClassNotFoundException{
     Conexao connection = new Conexao();
     ArrayList<Carro> lista = new ArrayList<Carro>();
     
     
     
       CarroDao f= new CarroDao(connection.getConnection());
     
        ArrayList<Carro> selectAll1 = f.selectAll();
       
      
        
        for(int i=0; i<selectAll1.size();i++){
        lista.add(selectAll1.get(i));
        }
        return lista;
    }
    
}
