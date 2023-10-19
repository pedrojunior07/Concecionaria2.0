/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO.DATABASE;

import Model.Veiculo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Model.Vendedor;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Pedro
 */
public class VendedorDAO {
     private final Connection connection;

    public VendedorDAO(Connection connection) {
        this.connection = connection;
    }
    
     public void insertBaseDedados(Vendedor user) throws SQLException {

        String sql ="INSERT INTO `vendedor` ( `Apelido`, `Identidade`, `EstadoCivil`, `Especialidade`, `E-mail`, `Senha`, `Idade`, `Nome`, `Telefone`, `DataNascimento`, `DataContrato`, `estado`, `salario`, `acessoNivel1`, `acessoNivel2`, `acessoNivel3`, `naturalidade`, `numeroVendas`, `sexo`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement statement = connection.prepareStatement(sql);
    
      
     // java.sql.Date sqlDate1 = new java.sql.Date(utilDate.getTime());

       statement.setString(1, user.getApelido());
        statement.setString(2, user.getIdentidade());
        statement.setString(3,  user.getEstadocivil());
         statement.setString(4,  user.getEspecialidade());
          statement.setString(5,  user.geteMail());
           statement.setString(6,  user.getSenha());
            statement.setInt(7,  user.getIdade());
             statement.setString(8,  user.getNome());
              statement.setInt(9,  user.getTelefone());
               statement.setString(10, user.getDataDeNascimento());
                statement.setString(11, user.getDataDoContrato());
               
                  statement.setBoolean(12,  user.isEstado());
                   statement.setDouble( 13,  user.getSalario());
                   System.out.println(user.getSalario());
                     statement.setBoolean(14,  user.isAcessoNivel1());
                      statement.setBoolean(15,  user.isAcessoNivel2());
                       statement.setBoolean(16,  user.isAcessoNivel3());
                        statement.setString(17,  user.getNaturalidade());
                         statement.setInt(18,  user.getNumeroDeVendas());
                          statement.setBoolean(19,  user.isEstado());
       statement.execute();
        connection.close();
        JOptionPane.showMessageDialog(null, "Usuario Salvo  com Sucesso", "Base De Dados",
                    JOptionPane.INFORMATION_MESSAGE);  

    }
     
       public boolean updateVendedor(Vendedor user) throws SQLException {
        String sql = "UPDATE `vendedor` SET `Apelido`=?, `Identidade`=?, `EstadoCivil`=?, `Especialidade`=?, `E-mail`=?, `Senha`=?, " +
                     "`Idade`=?, `Nome`=?, `Telefone`=?, `DataNascimento`=?, `DataContrato`=?, `estado`=?, `salario`=?, " +
                     "`acessoNivel1`=?, `acessoNivel2`=?, `acessoNivel3`=?, `naturalidade`=?, `numeroVendas`=?, `sexo`=? " +
                     "WHERE `id`=?";
        
        
      
      
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, user.getApelido());
            statement.setString(2, user.getIdentidade());
            statement.setString(3, user.getEstadocivil());
            statement.setString(4, user.getEspecialidade());
            statement.setString(5, user.geteMail());
            statement.setString(6, user.getSenha());
            statement.setInt(7, user.getIdade());
            statement.setString(8, user.getNome());
            statement.setInt(9, user.getTelefone());
            statement.setString(10, user.getDataDeNascimento());
            statement.setString(11, user.getDataDeNascimento());
            statement.setBoolean(12, user.isEstado());
            statement.setDouble(13, user.getSalario());
            statement.setBoolean(14, user.isAcessoNivel1());
            statement.setBoolean(15, user.isAcessoNivel2());
            statement.setBoolean(16, user.isAcessoNivel3());
            statement.setString(17, user.getNaturalidade());
            statement.setInt(18, user.getNumeroDeVendas());
            statement.setString(19, user.getSexo());
            statement.setInt(20, user.getId()); // Substitua pelo ID do usuário que deseja atualizar

            int rowsUpdated = statement.executeUpdate();
            return rowsUpdated > 0;
       
    }

    
public boolean DeleteVendedor(Vendedor user) throws SQLException {
        String sql = "UPDATE `vendedor` SET `estado` = ? WHERE `id` = ?";

    

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setBoolean(1, false);
          

            int rowsUpdated = statement.executeUpdate();
            return rowsUpdated > 0;

}
   public ArrayList<Vendedor> selectAll() throws SQLException {
        String sql = "select * from  vendedor";
        PreparedStatement statement = connection.prepareStatement(sql);
        return pesquisa(statement);
    }
private ArrayList<Vendedor> pesquisa(PreparedStatement statement1) throws SQLException {
        ArrayList<Vendedor> usuarios = new ArrayList<Vendedor>();
        statement1.execute();
        ResultSet resultSet = statement1.getResultSet();
         while (resultSet.next()) {
              
                Vendedor user = new Vendedor();
                user.setId(resultSet.getInt("id"));
                user.setApelido(resultSet.getString("Apelido"));
                user.setIdentidade(resultSet.getString("Identidade"));
                user.setEstadocivil(resultSet.getString("EstadoCivil"));
                user.setEspecialidade(resultSet.getString("Especialidade"));
                user.seteMail(resultSet.getString("E-mail"));
                user.setSenha(resultSet.getString("Senha"));
                user.setIdade(resultSet.getInt("Idade"));
                user.setNome(resultSet.getString("Nome"));
                user.setTelefone(resultSet.getInt("Telefone"));
                user.setDataDeNascimento( resultSet.getString("DataNascimento"));
                user.setDataDoContrato(resultSet.getString("DataContrato"));
               
                user.setEstado(resultSet.getBoolean("estado"));
                user.setSalario(resultSet.getDouble("salario"));
                user.setAcessoNivel1(resultSet.getBoolean("acessoNivel1"));
                user.setAcessoNivel2(resultSet.getBoolean("acessoNivel2"));
                user.setAcessoNivel3(resultSet.getBoolean("acessoNivel3"));
                user.setNaturalidade(resultSet.getString("naturalidade"));
                user.setNumeroDeVendas(resultSet.getInt("numeroVendas"));
                user.setSexo(resultSet.getString("sexo"));

                usuarios.add(user);
            }
         return usuarios;
    }
       

public Vendedor selectPorId(int id)throws SQLException{ 
          String sql = "select * from usuario where  id = ? ";
    PreparedStatement statement = connection.prepareStatement(sql);
     statement.setInt(1,id);
         
  
   
   return  pesquisa(statement).get(0);
    
}

}
