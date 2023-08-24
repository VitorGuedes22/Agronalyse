/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;


public class Estoque implements Serializable{
    //Atributos
    private String tipoProduto;
    private Date dataCriacao;
    private Double quantEstocado,tamanhoEstoque,valorUnidade;

    //Metodo construtor, sem polimorfismo
    public Estoque(String tipoProduto, Date dataCriacao, Double quantEstocado, Double tamanhoEsotque, Double valorUnidade) {
        this.tipoProduto = tipoProduto;
        this.dataCriacao = dataCriacao;
        this.quantEstocado = quantEstocado;
        this.tamanhoEstoque = tamanhoEsotque;
        this.valorUnidade = valorUnidade;
    }
    
    //Método to string
    @Override
    public String toString() {
        return " Produto: " + tipoProduto 
                + "; Data de cadastro do estoque: " + getDateFormatString()
                + "; Quantidade armazenada: " + Double.toString(quantEstocado) 
                + "; Capacidade: " + Double.toString(tamanhoEstoque) 
                + "; Valor por unidade do produto: " + Double.toString(valorUnidade);
    }
    
    
    
    //Metodos especiais
    public String getDateFormatString() {
	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	String data = dateFormat.format(getDataCriacao());
	return data;
    }
    
    
    public void aumentarEstoque(Double aumento){
        if((getQuantEstocado() + aumento) <= getTamanhoEstoque()){
            setQuantEstocado(getQuantEstocado() + aumento);
        }else{
            JOptionPane.showMessageDialog(null, "O acrescimo excede a capacidade de armazenamento do estoque, "
                    + "modifique o tamanho ou crie um novo estoque que suporte a capacidade desejada",
                    "ERRO",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void venderProduto(Double quantVenda){
        setQuantEstocado(getQuantEstocado() - quantVenda);
    }
    
    public Double valorEstoque(Double porcentagem){
        Double valor = porcentagem * getValorUnidade();
        return valor;
    }

    //Meotodos getters e setters
    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Double getQuantEstocado() {
        return quantEstocado;
    }

    public void setQuantEstocado(Double quantEstocado) {
        this.quantEstocado = quantEstocado;
    }

    public Double getValorUnidade() {
        return valorUnidade;
    }

    public void setValorUnidade(Double valorUnidade) {
        this.valorUnidade = valorUnidade;
    }

    public Double getTamanhoEstoque() {
        return tamanhoEstoque;
    }

    public void setTamanhoEstoque(Double tamanhoEstoque) {
        this.tamanhoEstoque = tamanhoEstoque;
    }
  
}
