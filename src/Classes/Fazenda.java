/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.ArrayList;

public class Fazenda {
    private String nome,localidade;
    private Double tamanho,poupanca;
    private ArrayList<Estoque> estoques;
    private ArrayList<Funcionario> funcionarios;
    private ArrayList<Terreno> terrenos;
    private ArrayList<Animal> animais; 
    private ArrayList<Plantacao> plantacoes;
    public Fazenda(String nome, String localidade, Double tamanho, Double poupanca) {
        this.nome = nome;
        this.localidade = localidade;
        this.tamanho = tamanho;
        this.poupanca = poupanca;
        this.animais = new ArrayList();
        this.estoques = new ArrayList();
        this.funcionarios = new ArrayList();
        this.terrenos = new ArrayList();
        
    }
    public String getNome() {
        return nome;
    }
       public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public Double getTamanho() {
        return tamanho;
    }

    public void setTamanho(Double tamanho) {
        this.tamanho = tamanho;
    }
    public Double getPoupanca() {
        return poupanca;
    }

    public void setPoupanca(Double poupanca) {
        this.poupanca = poupanca;
    }
    
    public void addEstoque(Estoque e){
        this.estoques.add(e);
    }
    
    public void addFuncionario(Funcionario f){
        this.funcionarios.add(f);
    }
    
    public void addEstoque(Terreno t){
        this.terrenos.add(t);
    }
    
    public void addAnimal(Animal a){
        this.animais.add(a);
    }

    public class AnimaisVacinados {
        public ArrayList<String> verAnimaisVacinados(String intervalo, int tempo) {
            ArrayList<String> animaisVacinados = new ArrayList<String>();
            
           //implementar lógica
            
            return animaisVacinados;
        }
    }
    
    public class AnimaisParaAbate {
    public ArrayList<String> verAnimaisParaAbate(String intervalo, int tempo) {
        ArrayList<String> animaisParaAbate = new ArrayList<String>();
        
        // implementar lógica
        
        return animaisParaAbate;
        }
    }
    
    public ArrayList<String> verAnimais() {
        ArrayList<String> listaAnimais = new ArrayList<String>();
        for (Animal animal : animais) {
            listaAnimais.add(String.valueOf(animal.getId())); 
        }
        // está considerando os animais pelo id
        return listaAnimais;
    }
    
    public ArrayList<String> verAnimaisQueReproduziram(String intervalo, int tempo) {
        ArrayList<String> animaisReproduzidos = new ArrayList<String>();
        
        // implementar lógica
        
        return animaisReproduzidos;
    }
    
     public ArrayList<String> verPlantacoesParaColheita() {
        ArrayList<String> plantacoesParaColheita = new ArrayList<>();
        
        //impelmentar código
        
       return plantacoesParaColheita;
       
    }
     
     
     public ArrayList<String> verPlantacoes() {
        ArrayList<String> todasPlantacoes = new ArrayList<>();
        for (Plantacao plantacao : plantacoes) {
            todasPlantacoes.add(plantacao.getTipoCultura());
        }
        return todasPlantacoes;
        
     }
     
     public void comprarTerreno(Terreno terreno) {
        terrenos.add(terreno);
     }
     
    public ArrayList<String> verFuncionarios()  {
        ArrayList<String> listaFuncionarios = new ArrayList<>();
        for (Funcionario funcionario : funcionarios) {
            String infoFuncionario = funcionario.getNome();              
        }
        return listaFuncionarios;
    }
    
    
    public ArrayList<String> verEstoques() {
        ArrayList<String> listaEstoques = new ArrayList<>();

        for (Estoque estoque : estoques) {
            String infoEstoque = estoque.getTipoProduto()+":"+ estoque.getQuantEstocado();

            listaEstoques.add(infoEstoque);
        }

        return listaEstoques;
    }
    
    public ArrayList<String> verPlantacoesPreparadas() {
    ArrayList<String> listaPlantacoesPreparadas = new ArrayList<>();
    
        // implementar a lógica) 
       // listaPlantacoesPreparadas.add();
        return listaPlantacoesPreparadas;
    }
    
    public ArrayList<String> AnalisarFuncionarios(String atributo, String intervalo) {
        ArrayList<String> funcionariosEncontrados = new ArrayList<>();
        
        // implementar lógica
        //funcionariosEncontrados.add(funcionario.getNome());
        return funcionariosEncontrados;
       }
    public ArrayList<String> AnalisarColheitasPeloTempo(String tipo, String intervaloDeTempo) {
        ArrayList<String> colheitasEncontradas = new ArrayList<>();
        //colheitasEncontradas.add(plantacao.getTipoCultura();
        return colheitasEncontradas;
    
    
    }
    
    
    public ArrayList<String> AnalisarVendasEstoque(String tipo, String intervalo) {
    ArrayList<String> estoquesVendidos = new ArrayList<>();
    
    //Implementar lógica
    return estoquesVendidos;
    }
    
    public ArrayList<String> animaisPeloTempo(String tipo, String intervaloDeTempo){
        
        //Implementar lógica
        ArrayList<String> animaisAnalisados = new ArrayList<>();
        return animaisAnalisados;
    }
    
 
}
