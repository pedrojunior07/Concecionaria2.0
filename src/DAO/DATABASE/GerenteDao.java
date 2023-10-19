/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO.DATABASE;

import Model.Gerente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Pedro
 */
public class GerenteDao {
    
    
     private final Connection connection;

    public GerenteDao(Connection connection) {
        this.connection = connection;
    }
    
    
    public void insertGerente(Gerente user) throws SQLException {
       
      
           String sql = "INSERT INTO gerente (nome, sexo, apelido, naturalidade, identidade, estadocivil, especialidade, eMail, senha, idade, telefone, Id, dataDeNascimento, dataDoContrato, estado, acessoNivel1, acessoNivel2, acessoNivel3) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

         
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
          
          
            preparedStatement.setString(1, user.getNome());
            preparedStatement.setString(2, user.getSexo());
            preparedStatement.setString(3, user.getApelido());
            preparedStatement.setString(4, user.getNaturalidade());
            preparedStatement.setString(5, user.getIdentidade());
            preparedStatement.setString(6, user.getEstadocivil());
            preparedStatement.setString(7, user.getEspecialidade());
            preparedStatement.setString(8, user.geteMail());
            preparedStatement.setString(9, user.getSenha());
            preparedStatement.setInt(10, user.getIdade());
            preparedStatement.setInt(11, user.getTelefone());
            preparedStatement.setInt(12, user.getId());
            preparedStatement.setString(13, user.getDataDeNascimento());
            preparedStatement.setString(14, user.getDataDoContrato());
            preparedStatement.setBoolean(15, user.isEstado());
            preparedStatement.setBoolean(16, user.isAcessoNivel1());
            preparedStatement.setBoolean(17, user.isAcessoNivel2());
            preparedStatement.setBoolean(18, user.isAcessoNivel3());
           
            
            preparedStatement.execute();}
    
    
    
    
    
      public boolean updateVendedor(Gerente user) throws SQLException {
        String sql = "UPDATE gerente SET nome=?, sexo=?, apelido=?, naturalidade=?, identidade=?, estadocivil=?, especialidade=?, eMail=?, senha=?, idade=?, telefone=?, dataDeNascimento=?, dataDoContrato=?, salario=?, estado=?, acessoNivel1=?, acessoNivel2=?, acessoNivel3=? WHERE id=?";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setString(1, user.getNome());
            preparedStatement.setString(2, user.getSexo());
            preparedStatement.setString(3, user.getApelido());
            preparedStatement.setString(4, user.getNaturalidade());
            preparedStatement.setString(5, user.getIdentidade());
            preparedStatement.setString(6, user.getEstadocivil());
            preparedStatement.setString(7, user.getEspecialidade());
            preparedStatement.setString(8, user.geteMail());
            preparedStatement.setString(9, user.getSenha());
            preparedStatement.setInt(10, user.getIdade());
            preparedStatement.setInt(11, user.getTelefone());
            preparedStatement.setString(12, user.getDataDeNascimento());
            preparedStatement.setString(13, user.getDataDoContrato());
            preparedStatement.setDouble(14, user.getSalario());
            preparedStatement.setBoolean(15, user.isEstado());
            preparedStatement.setBoolean(16, user.isAcessoNivel1());
            preparedStatement.setBoolean(17, user.isAcessoNivel2());
            preparedStatement.setBoolean(18, user.isAcessoNivel3());
            preparedStatement.setInt(19, user.getId());
            
             int rowsUpdated = preparedStatement.executeUpdate();
            return rowsUpdated > 0;
      
      }
      
          
public boolean DeleteGerente(Gerente user) throws SQLException {
        String sql = "UPDATE `gerente` SET `estado` = ? WHERE `id` = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setBoolean(1, false);
          

            int rowsUpdated = statement.executeUpdate();
            return rowsUpdated > 0;

}

public ArrayList<Gerente> selectAll() throws SQLException {
        String sql = "select * from  gerente";
        PreparedStatement statement = connection.prepareStatement(sql);
        return pesquisa(statement);
    }

    private ArrayList<Gerente> pesquisa(PreparedStatement statement) throws SQLException {
      ArrayList<Gerente> users = new ArrayList<Gerente>();
         statement.execute();
        ResultSet resultSet = statement.getResultSet();
        while (resultSet.next()) {
                Gerente user = new Gerente();
                user.setId(resultSet.getInt("id"));
                user.setNome(resultSet.getString("nome"));
                user.setSexo(resultSet.getString("sexo"));
                user.setApelido(resultSet.getString("apelido"));
                user.setNaturalidade(resultSet.getString("naturalidade"));
                user.setIdentidade(resultSet.getString("identidade"));
                user.setEstadocivil(resultSet.getString("estadocivil"));
                user.setEspecialidade(resultSet.getString("especialidade"));
                user.seteMail(resultSet.getString("eMail"));
                user.setSenha(resultSet.getString("senha"));
                user.setIdade(resultSet.getInt("idade"));
                user.setTelefone(resultSet.getInt("telefone"));
                user.setDataDeNascimento(resultSet.getString("dataDeNascimento"));
                user.setDataDoContrato(resultSet.getString("dataDoContrato"));
                user.setSalario(resultSet.getDouble("salario"));
                user.setEstado(resultSet.getBoolean("estado"));
                user.setAcessoNivel1(resultSet.getBoolean("acessoNivel1"));
                user.setAcessoNivel2(resultSet.getBoolean("acessoNivel2"));
                user.setAcessoNivel3(resultSet.getBoolean("acessoNivel3"));

                users.add(user);
            }
        
        return users;
    }
    
    
public Gerente selectPorId(int id)throws SQLException{ 
          String sql = "select * from gerente where  id = ? ";
    PreparedStatement statement = connection.prepareStatement(sql);
     statement.setInt(1,id);
         
  
   
   return  pesquisa(statement).get(0);
    
}
    
}
