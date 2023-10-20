/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO.DATABASE;

import Model.Fornecedor;
import Model.Gerente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Pedro
 */
public class FornecedorDao {
      private final Connection connection;

    public FornecedorDao(Connection connection) {
        this.connection = connection;
    }
    
     public boolean insert(Fornecedor user) throws SQLException {
        String query = "INSERT INTO fornecedor (nomeDaEntidade, tipoDeComercio, email, numeroDoNegocio, contato, dataDoNegocio, precoDoNegocio, status) " +
                       "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

         PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, user.getNomeDaEntidade());
            preparedStatement.setString(2, user.getTipoDeComercio());
            preparedStatement.setString(3, user.getEmail());
            preparedStatement.setInt(4, user.getNumeroDoNegogio());
            preparedStatement.setInt(5, user.getContacto());
            preparedStatement.setString(6, user.getDataDoNegocio());
            preparedStatement.setDouble(7, user.getPrecoDoNegocio());
            preparedStatement.setBoolean(8, user.isStatus());

            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0; // Retorna true se pelo menos uma linha foi afetada
         }
    
     
     
      public boolean update(Fornecedor user) {
        String query = "UPDATE fornecedor " +
                       "SET nomeDaEntidade = ?, tipoDeComercio = ?, email = ?, " +
                       "numeroDoNegocio = ?, contato = ?, dataDoNegocio = ?, precoDoNegocio = ?, status = ? " +
                       "WHERE ID = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, user.getNomeDaEntidade());
            preparedStatement.setString(2, user.getTipoDeComercio());
            preparedStatement.setString(3, user.getEmail());
            preparedStatement.setInt(4, user.getNumeroDoNegogio());
            preparedStatement.setInt(5, user.getContacto());
            preparedStatement.setString(6, user.getDataDoNegocio());
            preparedStatement.setDouble(7, user.getPrecoDoNegocio());
            preparedStatement.setBoolean(8, user.isStatus());
            preparedStatement.setInt(9, user.getID()); // Atualize com base no ID

            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0; // Retorna true se pelo menos uma linha foi afetada
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
     
      
       public ArrayList<Fornecedor> selectAll() {
        ArrayList<Fornecedor> fornecedores = new ArrayList<>();
        String query = "SELECT * FROM fornecedor";

        try (PreparedStatement preparedStatement = connection.prepareStatement(query);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                Fornecedor user = new Fornecedor();
                user.setID(resultSet.getInt("ID"));
                user.setNomeDaEntidade(resultSet.getString("nomeDaEntidade"));
                user.setTipoDeComercio(resultSet.getString("tipoDeComercio"));
                user.setEmail(resultSet.getString("email"));
                user.setNumeroDoNegogio(resultSet.getInt("numeroDoNegocio"));
                user.setContacto(resultSet.getInt("contato"));
                user.setDataDoNegocio(resultSet.getString("dataDoNegocio"));
                user.setPrecoDoNegocio(resultSet.getDouble("precoDoNegocio"));
                user.setStatus(resultSet.getBoolean("status"));

                fornecedores.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return fornecedores;
    }
       
       
        public Fornecedor selectById(int id) {
        String query = "SELECT * FROM fornecedor WHERE ID = ?";
        Fornecedor user = null;

        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, id);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    user = new Fornecedor();
                    user.setID(resultSet.getInt("ID"));
                    user.setNomeDaEntidade(resultSet.getString("nomeDaEntidade"));
                    user.setTipoDeComercio(resultSet.getString("tipoDeComercio"));
                    user.setEmail(resultSet.getString("email"));
                    user.setNumeroDoNegogio(resultSet.getInt("numeroDoNegocio"));
                    user.setContacto(resultSet.getInt("contato"));
                    user.setDataDoNegocio(resultSet.getString("dataDoNegocio"));
                    user.setPrecoDoNegocio(resultSet.getDouble("precoDoNegocio"));
                    user.setStatus(resultSet.getBoolean("status"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }
    
}
