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
public class OutrosFuncionarios extends Funcionario {
    
    private String especialidade;
   
    Calendar calendario = Calendar.getInstance();

   
    
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
    
    //Esse Metodo retorna o salario do gerente
   
    //Esse Metodo Retorna a idade Do Gerente

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
