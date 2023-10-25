/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Pedro
 */
public abstract class Funcionario implements Serializable {
    private String nome,sexo, apelido, naturalidade, identidade, estadocivil, especialidade, eMail, senha;
    private int idade, Id, telefone;

    public void setSalario(double salario) {
        this.salario = salario;
    }
    private String dataDeNascimento, dataDoContrato;
    private double salario;
    private boolean estado,acessoNivel1, acessoNivel2, acessoNivel3;

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    
    
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getDataDoContrato() {
        return dataDoContrato;
    }

    public void setDataDoContrato(String dataDoContrato) {
        this.dataDoContrato = dataDoContrato;
    }

    public double getSalario() {
        return salario;
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
    
    
   
    public abstract int getIdade(int anoNascimento);
    public abstract int tempoNaEmpresa(int anoDeEntrada);
    
    
    
}
