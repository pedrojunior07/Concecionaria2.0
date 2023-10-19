/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.DATABASE.ClienteDAO;
import Model.Cliente;
import ViwFuncionario.FormularioDoCliente;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Celso Mongane
 */
public class ClienteModel {
public void AdicionarCliente(String nome, String sexo, String apelido, String naturalidade, String identidade, String estadoCivil, String especialidade, String email,String data){
      Cliente  novoCliente = new Cliente();
      
      ClienteDAO novo = new ClienteDAO();
        novoCliente.setNome(nome);
        novoCliente.setSexo(sexo);
        novoCliente.setApelido(apelido);
        novoCliente.setNaturalidade(naturalidade);
        novoCliente.setIdentidade(identidade);
        novoCliente.setEstadocivil(estadoCivil);
        novoCliente.setEspecialidade(especialidade);
        novoCliente.seteMail(email);
        JOptionPane.showMessageDialog(null, "Add Com suceslo");
        //novoCliente.setDataNascimento(datadeNascimento);
        novo.adicionarCliente(novoCliente);
       
        
    }
    
}
