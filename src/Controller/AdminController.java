/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.DATABASE.Conexao;
import DAO.DATABASE.VendedorDAO;
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
    
    public void insert(Vendedor user) throws SQLException, ClassNotFoundException{
        Conexao connection = new Conexao();
        VendedorDAO d= new VendedorDAO(connection.getConnection());
     d.insertBaseDedados(user);
        
        
        
    }
    
    public ArrayList<Vendedor> sellectAllFuncionario() throws SQLException, ClassNotFoundException{
     Conexao connection = new Conexao();
        VendedorDAO d= new VendedorDAO(connection.getConnection());
        
        return d.selectAll();
    }
    
}
