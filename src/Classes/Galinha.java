/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

//classe extendida de animal
public class Galinha extends Animal{
    private String tipoProducao;
    
    //método construtor, sem polimorfismo
    public Galinha(int Id, int reproducao, boolean sexo, boolean vacinacao, double peso, double valor, double custo, String nascimento, String producao) {
        super(Id, reproducao, sexo, vacinacao, peso, valor, custo, nascimento,producao);
    }
    
    //métodos comuns, getters e setters
    public String getTipoProducao() {
        return tipoProducao;
    }

    public void setTipoProducao(String tipoProducao) {
        this.tipoProducao = tipoProducao;
    }
    
    //passa os dados como String
   @Override
    
    // método toString utilizado, usando interface, criado para exportação dos dados em txt
    public String toString() {
        return "ID: " + Id + ", Reprodução: " + reproducao + ", Sexo: " + sexo +
               ", Vacinado: " + vacinacao + ", Peso: " + peso + ", Valor: " + valor +
               ", Custo: " + custo + ", Data de Nascimento: " + nascimento + ", Produção: " + producao;
    }
}  
    
    

