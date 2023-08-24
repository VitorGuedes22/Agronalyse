/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;


public class Terreno implements Serializable {
    //atributos
    private static List<Terreno> listaTerrenos = new ArrayList<>();
    private int Id;
    private double area;
    private String tipoUso;
    private boolean ocupado;
    
    
    @Override
    public String toString() {
        String ocup;
        if(ocupado){
            ocup = "Terreno em uso";
        }
        else{
            ocup = "Terreno livre";
        }
        return "Id: " + Id + " ; Area: " + area + "m2 ; Tipo de Uso: " + tipoUso +" ; "+ ocup + '}';
    }
    
    //construtor
    public Terreno(int Id, double area, String tipoUso, boolean ocupado) {
        this.Id = Id;
        this.area = area;
        this.tipoUso = tipoUso;
        this.ocupado = ocupado;
        adicionarTerreno(this);
    }

    //getters e setters
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getTipoUso() {
        return tipoUso;
    }

    public void setTipoUso(String tipoUso) {
        this.tipoUso = tipoUso;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
    
    public void venderTerreno(Double valorm2){
        Double valordavenda = getArea() * valorm2;
        //fazenda.SetPoupanca(Double valordavenda);
    }
    
    public void usarTerreno(String tipo){
        setOcupado(true);
        setTipoUso(tipo);
    }
    
        public void setAtualizaOcupado(boolean ocupado) {
            this.ocupado = ocupado;

            // Atualizar o arquivo dadosTerrenos.dat
            List<Terreno> listaTerrenos = getListaTerrenos();

            // Encontrar o terreno correspondente na lista
            for (int i = 0; i < listaTerrenos.size(); i++) {
                Terreno terreno = listaTerrenos.get(i);
                if (terreno.getId() == this.Id) { // Supondo que o id seja o identificador único do terreno
                    terreno.setOcupado(ocupado);
                    break;
                }
            }

            // Salvar a lista atualizada no arquivo
            try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("dadosTerrenos.dat"))) {
                outputStream.writeObject(listaTerrenos);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
      public static Terreno getTerrenoPorId(int id) {
        for (Terreno terreno : listaTerrenos) {
            if (terreno.getId() == id) {
                return terreno;
            }
        }
        return null; 
    }
    
        public static void carregarTerrenos() {
    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("dadosTerrenos.dat"))) {
        listaTerrenos = (List<Terreno>) ois.readObject();
    } catch (IOException | ClassNotFoundException e) {
        e.printStackTrace();
        listaTerrenos = new ArrayList<>();
    }
    }
    
       public static List<Terreno> getListaTerrenos() {
        return listaTerrenos;
    }
    
    private static void adicionarTerreno(Terreno terreno) {
        listaTerrenos.add(terreno);
    } 
    
}

