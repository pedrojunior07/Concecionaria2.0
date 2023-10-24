/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.DATABASE.Conexao;
import DAO.DATABASE.GerenteDao;
import DAO.DATABASE.VendedorDAO;
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
public class AdminController {
    JFrame frame;
    public AdminController(JFrame frame) {
   
    this.frame = frame;
    }
    
    public void insertVendedor(Vendedor user) throws SQLException, ClassNotFoundException{
        Conexao connection = new Conexao();
        VendedorDAO d= new VendedorDAO(connection.getConnection());
     d.insertBaseDedados(user);
        
        
        
    }
    
    
    public void insertGerente(Gerente user) throws SQLException, ClassNotFoundException{
        Conexao connection = new Conexao();
        GerenteDao d= new GerenteDao(connection.getConnection());
     d.insertGerente(user);
        
        
        
    }
    
    
    public ArrayList<Funcionario> sellectAllFuncionario() throws SQLException, ClassNotFoundException{
     Conexao connection = new Conexao();
     ArrayList<Funcionario> lista = new ArrayList<Funcionario>();
     
     
     VendedorDAO d= new VendedorDAO(connection.getConnection());
       GerenteDao f= new GerenteDao(connection.getConnection());
     
        ArrayList<Gerente> selectAll1 = f.selectAll();
        ArrayList<Vendedor> selectAll = d.selectAll();
        for(int i=0; i<selectAll.size();i++){
        lista.add(selectAll.get(i));
        }
        
        for(int i=0; i<selectAll1.size();i++){
        lista.add(selectAll1.get(i));
        }
        return lista;
    }
    public void bud(){
        System.out.println("bug");
    }
}
