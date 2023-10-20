/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.DATABASE.CarroDao;
import DAO.DATABASE.Conexao;
import Model.Carro;
import java.sql.SQLException;
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
    
}
