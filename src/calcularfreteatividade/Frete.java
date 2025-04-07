/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calcularfreteatividade;

/**
 *
 * @author Pedrovisk
 */
import java.util.ArrayList;
import java.util.List;

public class Frete {
    private Endereco endereco;
    private List<Carga> listCarga = new ArrayList<>();
    private double valor;
    private String observacao;
    private double distancia;

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setListCarga(List<Carga> listCarga) {
        this.listCarga = listCarga;
    }

    public List<Carga> getListCarga() {
        return listCarga;
    }

    public double getValor() {
        return valor;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getDistancia() {
        return distancia;
    }

    public void calcularValorFrete() {
        double pesoTotal = 0;
        for (Carga carga : listCarga) {
            pesoTotal += carga.getMassa();
        }
        valor = pesoTotal * distancia;
    }

    public void addListCarga(Carga carga) {
        listCarga.add(carga);
    }

    public boolean removeCarga(Carga carga) {
        return listCarga.remove(carga);
    }

    public List<Carga> exibirListCarga() {
        return listCarga;
    }
}

