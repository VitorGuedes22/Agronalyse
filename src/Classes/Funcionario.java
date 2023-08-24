/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Funcionario implements Serializable {
    //Atributos 
    private int idade;
    private String nome,setor;
    private Date admissao;
    private double salario;
    
    // Metodo Construtor
    public Funcionario(int idade, String nome, String setor, Date admissao, double salario) {
        this.idade = idade;
        this.nome = nome;
        this.setor = setor;
        this.admissao = admissao;
        this.salario = salario;
    }
    
    @Override
    public String toString() {
        return "Nome: "+ nome +", Idade: " + idade + ", Setor: " + setor + ", Admissao: " + getDateFormatString() + ", Salario:" +  salario + '}';
    }
    
    public String getDateFormatString() {
	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	String data = dateFormat.format(getAdmissao());
	return data;
    }
    
    
    //Metodos Especiais
    
    public void aumentarSalario(Double salario){
        setSalario(getSalario() + salario);
    }
    
    public void trocarSetor(String setor){
        setSetor(setor);
    }

    
    //Metodos getters e setters
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Date getAdmissao() {
        return admissao;
    }

    public void setAdmissao(Date admissao) {
        this.admissao = admissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    
}
