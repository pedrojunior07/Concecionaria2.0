/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO.DATABASE;

import Model.Vendedor;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author Pedro
 */
public class NewClass {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Vendedor a = new Vendedor();
        
        a.setNome("Pedro");
        a.setNaturalidade("hj");
        a.setAcessoNivel1(true);
        a.setAcessoNivel2(true);
        a.setAcessoNivel3(true);
        a.setApelido("mANJATE");
        a.setDataDeNascimento("28/6/2003");
        a.setDataDoContrato("30/09/2020");
        a.setEspecialidade("gerente");
        a.setEstado(true);
        a.setEstadocivil("solteiro");
        a.setIdade(20);
        a.setIdentidade("32432423");
        a.setNumeroDeVendas(32);
        a.setSalario(323.23);
        a.setSenha("1234");
        a.setSexo("masculino");
        
        a.setTelefone(245345);
        a.seteMail("manjate@gmail.com");
        Conexao c = new Conexao();
      //  c.getConnection();
        
        VendedorDAO f = new VendedorDAO(  c.getConnection());
        f.insertBaseDedados(a);
        
    }
    
}
