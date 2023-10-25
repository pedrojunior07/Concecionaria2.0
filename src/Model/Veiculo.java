/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author Pedro
 */
public abstract class  Veiculo implements Serializable  {
    int Id;
  private String categoria,  tipoDeComustivel, fabricante;
  private int anoDeFabrico, idProduto;
  private double preco;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

  
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTipoDeComustivel() {
        return tipoDeComustivel;
    }

    public void setTipoDeComustivel(String tipoDeComustivel) {
        this.tipoDeComustivel = tipoDeComustivel;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getAnoDeFabrico() {
        return anoDeFabrico;
    }

    public void setAnoDeFabrico(int anoDeFabrico) {
        this.anoDeFabrico = anoDeFabrico;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
  
  
  
  
  public abstract int getIdadeDoVeiculo(int anoDeFabrico );

 
    
}
