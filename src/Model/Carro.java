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
public class Carro extends Veiculo implements carrosMetodos {
private String modelo, tracao;
private int numMotor, numChassi, quilometosPercoridos;
private boolean vendido, operacional;
private int fornecedorId;
private Fornecedor fornecedor;

    public int getFornecedorId() {
        return fornecedorId;
    }

    public void setFornecedorId(int fornecedorId) {
        this.fornecedorId = fornecedorId;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTracao() {
        return tracao;
    }

    public void setTracao(String tracao) {
        this.tracao = tracao;
    }

    public int getNumMotor() {
        return numMotor;
    }

    public void setNumMotor(int numMotor) {
        this.numMotor = numMotor;
    }

    public int getNumChassi() {
        return numChassi;
    }

    public void setNumChassi(int numChassi) {
        this.numChassi = numChassi;
    }

    public int getQuilometosPercoridos() {
        return quilometosPercoridos;
    }

    public void setQuilometosPercoridos(int quilometosPercoridos) {
        this.quilometosPercoridos = quilometosPercoridos;
    }

    public boolean isVendido() {
        return vendido;
    }

    public void setVendido(boolean vendido) {
        this.vendido = vendido;
    }

    public boolean isOperacional() {
        return operacional;
    }

    public void setOperacional(boolean operacional) {
        this.operacional = operacional;
    }

    
    
    
    
    
    
    
    
    
    @Override
    public int getIdadeDoVeiculo(int anoDeFabrico) {
      Calendar c = Calendar.getInstance(); 
    return c.getWeekYear()- anoDeFabrico;
    }

    @Override
    public String estadoDoVeiculo(int quilometosPercoridos) {
    if(quilometosPercoridos>0)  { return "usado";}else
        return "novo";
    }
    
}
