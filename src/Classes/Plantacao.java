/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;
import java.io.Serializable;

public class Plantacao  implements Serializable{
    
    //atributos
    private String tipoCultura,dataPlantacao,dataColheita,expectativaColheita;
    private double areaPlantada,quanColheita;
    private boolean produtosQuimicos;
    private Terreno terreno;
    
    //método construtor, sem polimorfismo
    public Plantacao(String tipoCultura, String dataPlantacao, String dataColheita, String expectativaColheita, double areaPlantada, double quanColheita, boolean produtosQuimicos, Terreno terreno) {
        this.tipoCultura = tipoCultura;
        this.dataPlantacao = dataPlantacao;
        this.dataColheita = dataColheita;
        this.expectativaColheita = expectativaColheita;
        this.areaPlantada = areaPlantada;
        this.quanColheita = quanColheita;
        this.produtosQuimicos = produtosQuimicos;
        this.terreno = terreno;
    }
    
    //métodos comuns getters e setters
    //métodos especiais
    
    public String getTipoCultura() {
        return tipoCultura;
    }

    public void setTipoCultura(String tipoCultura) {
        this.tipoCultura = tipoCultura;
    }

    public String getDataPlantacao() {
        return dataPlantacao;
    }

    public void setDataPlantacao(String dataPlantacao) {
        this.dataPlantacao = dataPlantacao;
    }

    public String getDataColheita() {
        return dataColheita;
    }

    public void setDataColheita(String dataColheita) {
        this.dataColheita = dataColheita;
    }

    public String getExpectativaColheita() {
        return expectativaColheita;
    }

    public void setExpectativaColheita(String expectativaColheita) {
        this.expectativaColheita = expectativaColheita;
    }

    public double getAreaPlantada() {
        return areaPlantada;
    }

    public void setAreaPlantada(double areaPlantada) {
        this.areaPlantada = areaPlantada;
    }

    public double getQuanColheita() {
        return quanColheita;
    }

    public void setQuanColheita(double quanColheita) {
        this.quanColheita = quanColheita;
    }

    public boolean isProdutosQuimicos() {
        return produtosQuimicos;
    }

    public void setProdutosQuimicos(boolean produtosQuimicos) {
        this.produtosQuimicos = produtosQuimicos;
    }

    public Terreno getTerreno() {
        return terreno;
    }

    public void setTerreno(Terreno terreno) {
        this.terreno = terreno;
    }
    
    public void colher(String data, double quant){
        //estoque1.setQuantEstocado(tamanhoEstoque+quant);
        terreno.setOcupado(false);
    }
    
    public void aplicarAgrotoxico(double quant){
        setProdutosQuimicos(true);
    }
    
    public void vender(String data, double quant, double preco){
    }
}