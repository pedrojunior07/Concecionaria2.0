/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO.DATABASE;
import Model.Cliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Celso Mongane
 */
public class ClienteDAO {
  

    
public void adicionarCliente(Cliente cliente) {
  PreparedStatement preparedStatement;
     preparedStatement = null;
               
            String sql = "INSERT INTO tbclientes (nome, sexo, apelido, naturalidade, identidade, estadocivil, especialidade, email,datanascimento) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?,?)";
    
               try {
            preparedStatement = ConexaoDAO.getConexao().prepareStatement(sql);
            preparedStatement.setString(1, cliente.getNome());
            preparedStatement.setString(2, cliente.getSexo());
            preparedStatement.setString(3, cliente.getApelido());
            preparedStatement.setString(4, cliente.getNaturalidade());
            preparedStatement.setString(5, cliente.getIdentidade());
            preparedStatement.setString(6, cliente.getEstadocivil());
           // preparedStatement.setString(7, cliente.getEspecialidade());
            preparedStatement.setString(8, cliente.geteMail());
            preparedStatement.setString(9, cliente.getDataNascimento() );
            
        preparedStatement.execute();
        preparedStatement.close();
        JOptionPane.showMessageDialog(null, "Adicionado Com sucesso! "+cliente.getNome());
    } catch (SQLException e) {
                   System.out.println(e+" ps");
    }
               
 
      

               }
        }











