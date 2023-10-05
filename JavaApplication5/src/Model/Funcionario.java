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
public abstract class Funcionario {
    private String nome, apelido, naturalidade, identidade, estadocivil;
    private int idade;
    private Calendar dataDeNascimento, dataDoContrato;
    private double salario;
    private boolean estado,acessoNivel1, acessoNivel2, acessoNivel3;

    public Calendar getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Calendar dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public Calendar getDataDoContrato() {
        return dataDoContrato;
    }

    public void setDataDoContrato(Calendar dataDoContrato) {
        this.dataDoContrato = dataDoContrato;
    }

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    public String getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean isAcessoNivel1() {
        return acessoNivel1;
    }

    public void setAcessoNivel1(boolean acessoNivel1) {
        this.acessoNivel1 = acessoNivel1;
    }

    public boolean isAcessoNivel2() {
        return acessoNivel2;
    }

    public void setAcessoNivel2(boolean acessoNivel2) {
        this.acessoNivel2 = acessoNivel2;
    }

    public boolean isAcessoNivel3() {
        return acessoNivel3;
    }

    public void setAcessoNivel3(boolean acessoNivel3) {
        this.acessoNivel3 = acessoNivel3;
    }
    
    
    public abstract double getSalario();
    public abstract int getIdade(int anoNascimento);
    public abstract int tempoNaEmpresa(int anoDeEntrada);
    
    
    
}
