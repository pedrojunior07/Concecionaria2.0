/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Calendar;

/**
 *
 * @author Pedro
 */
public class Gerente extends Funcionario {

    private String especialidade;

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Calendar getCalendario() {
        return calendario;
    }

    public void setCalendario(Calendar calendario) {
        this.calendario = calendario;
    }
    
    
    
    
    
    
    
    
    
    
    Calendar calendario = Calendar.getInstance();

    //Esse Metodo retorna o salario do gerente
   

    @Override
    public int getIdade(int anoNascimento) {
        return calendario.getWeekYear() - anoNascimento;
    }
//Esse Metodo Retorna 

    @Override
    public int tempoNaEmpresa(int anoDeEntrada) {
        return calendario.getWeekYear() - anoDeEntrada;
    }

}
