/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author Pedro
 */
public class Venda {
    private  Carro carro;
    private int numeroDaVenda;
    private Date dataDavenda, DataDaGarantia;
    private double precoDaVenda;
    private boolean estado;

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public int getNumeroDaVenda() {
        return numeroDaVenda;
    }

    public void setNumeroDaVenda(int numeroDaVenda) {
        this.numeroDaVenda = numeroDaVenda;
    }

    public Date getDataDavenda() {
        return dataDavenda;
    }

    public void setDataDavenda(Date dataDavenda) {
        this.dataDavenda = dataDavenda;
    }

    public Date getDataDaGarantia() {
        return DataDaGarantia;
    }

    public void setDataDaGarantia(Date DataDaGarantia) {
        this.DataDaGarantia = DataDaGarantia;
    }

    public double getPrecoDaVenda() {
        return precoDaVenda;
    }

    public void setPrecoDaVenda(double precoDaVenda) {
        this.precoDaVenda = precoDaVenda;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

}
