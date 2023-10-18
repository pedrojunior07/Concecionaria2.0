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
        
        a.setNome("cARRALHO");
        a.setNaturalidade("hj");
        a.setAcessoNivel1(true);
        a.setAcessoNivel2(true);
        a.setAcessoNivel3(true);
        a.setApelido("mANJATE");
        a.setDataDeNascimento(new Date(2003, 2, 6));
        a.setDataDoContrato(new Date(1999, 4, 6));
        a.setEspecialidade("ghdhs");
        a.setEstado(true);
        a.setEstadocivil("ghdgh");
        a.setIdade(0);
        a.setIdentidade("uiiui");
        a.setNumeroDeVendas(32);
        a.setSalario(323.23);
        a.setSenha("yiytiy");
        a.setSexo("yuty");
        a.setSexo("sdfsd");
        a.setTelefone(245345);
        a.seteMail("djfhdkjfh");
        Conexao c = new Conexao();
      //  c.getConnection();
        
        VendedorDAO f = new VendedorDAO(  c.getConnection());
        f.insertBaseDedados(a);
        
    }
    
}
