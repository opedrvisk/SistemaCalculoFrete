/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calcularfreteatividade;

/**
 *
 * @author Pedrovisk
 */
public class Carga {
    private String descricao;
    private double massa;
    private Endereco endereco;

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public double getMassa() {
        return massa;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }
}
