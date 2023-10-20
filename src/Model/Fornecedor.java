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
public class Fornecedor {
   private String nomeDaEntidade, tipoDeComercio, email;
   private int numeroDoNegogio, contacto,ID;
   
  private String         dataDoNegocio;
   private double precoDoNegocio;
   boolean status;

    public String getDataDoNegocio() {
        return dataDoNegocio;
    }

    public void setDataDoNegocio(String dataDoNegocio) {
        this.dataDoNegocio = dataDoNegocio;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNomeDaEntidade() {
        return nomeDaEntidade;
    }

    public void setNomeDaEntidade(String nomeDaEntidade) {
        this.nomeDaEntidade = nomeDaEntidade;
    }

    public String getTipoDeComercio() {
        return tipoDeComercio;
    }

    public void setTipoDeComercio(String tipoDeComercio) {
        this.tipoDeComercio = tipoDeComercio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumeroDoNegogio() {
        return numeroDoNegogio;
    }

    public void setNumeroDoNegogio(int numeroDoNegogio) {
        this.numeroDoNegogio = numeroDoNegogio;
    }

    public int getContacto() {
        return contacto;
    }

    public void setContacto(int contacto) {
        this.contacto = contacto;
    }

   

    public double getPrecoDoNegocio() {
        return precoDoNegocio;
    }

    public void setPrecoDoNegocio(double precoDoNegocio) {
        this.precoDoNegocio = precoDoNegocio;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
   
   
}
