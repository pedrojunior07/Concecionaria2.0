/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Pedro
 */
public abstract class Funcionario {
    private String nome, apelido, naturalidade, identidade, estadocivil;
    private int idade, anoNascimento, diaNascimento, mesNascimento, diaDoContrato,mesContrato,anoContrato;
    private double salario;
    private boolean estado,acessoNivel1, acessoNivel2, acessoNivel3;

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

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public int getDiaNascimento() {
        return diaNascimento;
    }

    public void setDiaNascimento(int diaNascimento) {
        this.diaNascimento = diaNascimento;
    }

    public int getMesNascimento() {
        return mesNascimento;
    }

    public void setMesNascimento(int mesNascimento) {
        this.mesNascimento = mesNascimento;
    }

    public int getDiaDoContrato() {
        return diaDoContrato;
    }

    public void setDiaDoContrato(int diaDoContrato) {
        this.diaDoContrato = diaDoContrato;
    }

    public int getMesContrato() {
        return mesContrato;
    }

    public void setMesContrato(int mesContrato) {
        this.mesContrato = mesContrato;
    }

    public int getAnoContrato() {
        return anoContrato;
    }

    public void setAnoContrato(int anoContrato) {
        this.anoContrato = anoContrato;
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
