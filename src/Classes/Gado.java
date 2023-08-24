/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

//classe extendida de animal
public class Gado extends Animal{
    
    //método construtor, sem polimorfismo
    public Gado(int Id, int reproducao, boolean sexo, boolean vacinacao, double peso, double valor, double custo, String nascimento, String producao) {
        super(Id, reproducao, sexo, vacinacao, peso, valor, custo, nascimento,producao);
    }
    
    //passa os dados como String,utilizando interface, criado para a exportação dos dados em txt
   @Override
    public String toString() {
        return "ID: " + Id + ", Reprodução: " + reproducao + ", Sexo: " + sexo +
               ", Vacinado: " + vacinacao + ", Peso: " + peso + ", Valor: " + valor +
               ", Custo: " + custo + ", Data de Nascimento: " + nascimento + ", Produção: " + producao;
    }
}    
    

