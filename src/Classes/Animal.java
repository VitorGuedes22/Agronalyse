/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.io.Serializable;

//classe abstrata
abstract class Animal implements Serializable{
    //atributos
    int Id;
    int reproducao;
    boolean sexo;
    boolean vacinacao;
    double peso;
    double valor;
    double custo;
    String nascimento;
    String producao;
    //método construtor
    public Animal(int Id, int reproducao, boolean sexo, boolean vacinacao, double peso, double valor, double custo, String nascimento, String producao) {
        this.Id = Id;
        this.reproducao = reproducao;
        this.sexo = sexo;
        this.vacinacao = vacinacao;
        this.peso = peso;
        this.valor = valor;
        this.custo = custo;
        this.nascimento = nascimento;
        this.producao = producao;
    }

    //método toString para exportação dos dados
    public String toString() {
        return "ID: " + Id + ", Reprodução: " + reproducao + ", Sexo: " + sexo +
               ", Vacinado: " + vacinacao + ", Peso: " + peso + ", Valor: " + valor +
               ", Custo: " + custo + ", Data de Nascimento: " + nascimento + ", Produção: " + producao;
    }
    
    //métodos comuns getters e setters
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getReproducao() {
        return reproducao;
    }

    public void setReproducao(int reproducao) {
        this.reproducao = reproducao;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public boolean isVacinacao() {
        return vacinacao;
    }
    
    public void setVacinacao(boolean vacinacao) {
        this.vacinacao = vacinacao;
    }
  public boolean isParaAbate() {
    return producao.equals("Carne");
}

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }
    
    
    
}
