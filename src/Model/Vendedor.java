
package Model;

import java.util.Calendar;

/**
 *
 * @author Pedro
 */
public class Vendedor extends Funcionario {
    private int numeroDeVendas;

    public Vendedor() {
       
    }

    
    
    
    
    
    
    
    public int getNumeroDeVendas() {
        return numeroDeVendas;
    }

    public void setNumeroDeVendas(int numeroDeVendas) {
        this.numeroDeVendas = numeroDeVendas;
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
    public double getSalario() {
        return 0;
    }
    //Esse Metodo Retorna a idade Do Gerente

    @Override
    public int getIdade(int anoNascimento) {
        return calendario.getTime().getYear() - anoNascimento;
    }
//Esse Metodo Retorna 

    @Override
    public int tempoNaEmpresa(int anoDeEntrada) {
        return calendario.getWeekYear() - anoDeEntrada;
    }

}
