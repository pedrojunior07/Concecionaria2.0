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
    private  int numMotor;
    private int numeroDaVenda;
    private String dataDavenda, DataDaGarantia;
    private double precoDaVenda;
    private boolean estado;

    public int getNumMotor() {
        return numMotor;
    }

    public void setNumMotor(int numMotor) {
        this.numMotor = numMotor;
    }

    public String getDataDavenda() {
        return dataDavenda;
    }

    public void setDataDavenda(String dataDavenda) {
        this.dataDavenda = dataDavenda;
    }

    public String getDataDaGarantia() {
        return DataDaGarantia;
    }

    public void setDataDaGarantia(String DataDaGarantia) {
        this.DataDaGarantia = DataDaGarantia;
    }

  

    public int getNumeroDaVenda() {
        return numeroDaVenda;
    }

    public void setNumeroDaVenda(int numeroDaVenda) {
        this.numeroDaVenda = numeroDaVenda;
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
