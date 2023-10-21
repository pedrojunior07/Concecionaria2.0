
package Model;

import java.io.Serializable;


public class StockeTaxas implements Serializable {
    private int qntToTalCarros, qntCarrosSuv, qntCarrosPickUp,qntCarrosTruck, qntCarrosBus;
    private double imposto, taxaMensal6,taxaMensal12,taxaMansal18,promoDisconto;
    
    
    


    public int getQntToTalCarros() {
        return qntToTalCarros;
    }

    public void setQntToTalCarros(int qntToTalCarros) {
        this.qntToTalCarros = qntToTalCarros;
    }

    public int getQntCarrosSuv() {
        return qntCarrosSuv;
    }

    public void setQntCarrosSuv(int qntCarrosSuv) {
        this.qntCarrosSuv = qntCarrosSuv;
    }

    public int getQntCarrosPickUp() {
        return qntCarrosPickUp;
    }

    public void setQntCarrosPickUp(int qntCarrosPickUp) {
        this.qntCarrosPickUp = qntCarrosPickUp;
    }

    public int getQntCarrosTruck() {
        return qntCarrosTruck;
    }

    public void setQntCarrosTruck(int qntCarrosTruck) {
        this.qntCarrosTruck = qntCarrosTruck;
    }

    public int getQntCarrosBus() {
        return qntCarrosBus;
    }

    public void setQntCarrosBus(int qntCarrosBus) {
        this.qntCarrosBus = qntCarrosBus;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public double getTaxaMensal6() {
        return taxaMensal6;
    }

    public void setTaxaMensal6(double taxaMensal6) {
        this.taxaMensal6 = taxaMensal6;
    }

    public double getTaxaMensal12() {
        return taxaMensal12;
    }

    public void setTaxaMensal12(double taxaMensal12) {
        this.taxaMensal12 = taxaMensal12;
    }

    public double getTaxaMansal18() {
        return taxaMansal18;
    }

    public void setTaxaMansal18(double taxaMansal18) {
        this.taxaMansal18 = taxaMansal18;
    }

    public double getPromoDisconto() {
        return promoDisconto;
    }

    public void setPromoDisconto(double promoDisconto) {
        this.promoDisconto = promoDisconto;
    }
}