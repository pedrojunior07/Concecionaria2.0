/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO.DATABASE;

import DAO.FinacasDao;
import Model.Carro;
import Model.Financas;
import Model.Vendedor;
import View.ADMFrame;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Pedro
 */
public class CarroDao {
      
    
    
    private final Connection connection;

    public CarroDao(Connection connection) {
        this.connection = connection;
    }
 
    public void insertBaseDedados(Carro user) throws SQLException {

        String sql ="INSERT INTO `carro` ( `modelo`, `tracao`, `categoria`, `fabricante`, `anoDeFabrico`, `numChassi`, `quilometosPercoridos`, `FornecedorID`, `preco`, `vendido`, `operacional`,`numMotor`, `tipoDeComustivel`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?,?)";

        PreparedStatement statement = connection.prepareStatement(sql);
    
    

       statement.setString(1, user.getModelo());
        statement.setString(2, user.getTracao());
        statement.setString(3,  user.getCategoria());
         statement.setString(4,  user.getFabricante());
          statement.setInt(5,  user.getAnoDeFabrico());
           statement.setInt(6,  user.getNumChassi());
            statement.setInt(7,  user.getQuilometosPercoridos());
             statement.setInt(8,  user.getFornecedor().getID());
              statement.setDouble(9,  user.getPreco());
               statement.setBoolean(10, user.isVendido());
                statement.setBoolean(11, user.isOperacional());
                statement.setInt(12, user.getNumMotor());
                 statement.setString(13, user.getTipoDeComustivel());
               
               
       statement.execute();
        connection.close();
        JOptionPane.showMessageDialog(null, "Carro Salvo  com Sucesso", "Base De Dados",
                    JOptionPane.INFORMATION_MESSAGE);  

    }
    
    
     public boolean updateVendedor(Carro user) throws SQLException {
        String sql = "UPDATE `carro` SET `modelo`=?, `tracao`=?, `categoria`=?, `fabricante`=?, `anoDeFabrico`=?, `numChassi`=?, " +
                     "`quilometosPercoridos`=?, `FornecedorID`=?, `preco`=?, `vendido`=?, `operacional`=?, `numMotor`=?, `tipoDeComustivel`=?, " +
                   
                     "WHERE `Id`=?";
     
      
      
            PreparedStatement statement = connection.prepareStatement(sql);
        

       statement.setString(1, user.getModelo());
       statement.setString(2, user.getTracao());
        statement.setString(3,  user.getCategoria());
         statement.setString(4,  user.getFabricante());
          statement.setInt(5,  user.getAnoDeFabrico());
           statement.setInt(6,  user.getNumChassi());
            statement.setInt(7,  user.getQuilometosPercoridos());
             statement.setInt(8,  user.getFornecedor().getID());
              statement.setDouble(9,  user.getPreco());
               statement.setBoolean(10, user.isVendido());
                statement.setBoolean(11, user.isOperacional());
                 statement.setInt(12, user.getNumMotor());
                  statement.setString(13, user.getTipoDeComustivel());
                   statement.setInt(14, user.getId());
                 
            int rowsUpdated = statement.executeUpdate();
            return rowsUpdated > 0;
       
    }
     
     public boolean VenderCarro(Carro user) throws SQLException {
        String sql = "UPDATE `carro` SET `vendido` = ? WHERE `Id` = ?";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setBoolean(1, true);
            statement.setInt(2, user.getId());
            int rowsUpdated = statement.executeUpdate();
           
        
            return rowsUpdated > 0;
           
            

}
     
     
     public ArrayList<Carro> selectAll() throws SQLException {
        String sql = "select * from  carro";
        PreparedStatement statement = connection.prepareStatement(sql);
        return pesquisa(statement);
    }
     
     
     private ArrayList<Carro> pesquisa(PreparedStatement statement1) throws SQLException {
        ArrayList<Carro> usuarios = new ArrayList<Carro>();
        statement1.execute();
        
     
        ResultSet resultSet = statement1.getResultSet();
         while (resultSet.next()) {

                Carro user = new Carro();
                user.setId(resultSet.getInt("Id"));
                user.setModelo(resultSet.getString("modelo"));
                user.setQuilometosPercoridos(resultSet.getInt("quilometosPercoridos"));
                user.setFornecedorId(resultSet.getInt("FornecedorID"));
                user.setTracao(resultSet.getString("tracao"));
                user.setCategoria(resultSet.getString("categoria"));
                user.setFabricante(resultSet.getString("fabricante"));
                user.setVendido(resultSet.getBoolean("vendido"));
                user.setOperacional(resultSet.getBoolean("operacional"));
                user.setNumMotor(resultSet.getInt("numMotor"));
                user.setAnoDeFabrico(resultSet.getInt("anoDeFabrico"));
                user.setTipoDeComustivel(resultSet.getString("tipoDeComustivel"));
                user.setNumChassi(resultSet.getInt("numChassi"));
                user.setPreco(resultSet.getDouble("preco"));
                
          usuarios.add(user);
         }
               
                
              
              
           

               
            
         return usuarios;
    }
      
     
     public Carro selectPorId(int id)throws SQLException{ 
          String sql = "select * from usuario where  Id = ? ";
    PreparedStatement statement = connection.prepareStatement(sql);
     statement.setInt(1,id);
         
  
   
   return  pesquisa(statement).get(0);
    
}
     
     
     
}
