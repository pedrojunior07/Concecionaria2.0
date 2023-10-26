/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO.DATABASE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author Pedro
 */
public class Conexao {
    public  Connection getConnection() throws SQLException, ClassNotFoundException{
     Connection con;
 
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String url = "jdbc:MySQL://localhost:3306/concecionaria2.0";
            String user = "root";
            String pass = "";
            
         con = DriverManager.getConnection(url, user, pass);
           
            
           
             
     
  return con;       
    }                                      

  
}
