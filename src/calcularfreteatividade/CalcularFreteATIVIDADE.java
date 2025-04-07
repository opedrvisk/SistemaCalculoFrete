/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calcularfreteatividade;

/**
 *
 * @author Pedrovisk
 */
public class CalcularFreteATIVIDADE {
    public static void main(String[] args) {
        // Criando endereço
        Endereco enderecoFrete = new Endereco();
        enderecoFrete.setLogradouro("Rua Pleiades");
        enderecoFrete.setNumero("74");

        // Criando frete
        Frete frete = new Frete();
        frete.setEndereco(enderecoFrete);
        frete.setDistancia(15);
        frete.setObservacao("Tem que ser entregue em ate 15 horas");

        // Criando carga
        Carga carga1 = new Carga();
        carga1.setDescricao("Eletronicos");
        carga1.setMassa(10);
        carga1.setEndereco(enderecoFrete); // mesmo endereço do frete, exemplo

        Carga carga2 = new Carga();
        carga2.setDescricao("Roupas");
        carga2.setMassa(8);
        carga2.setEndereco(enderecoFrete);

        // Adicionando as cargas ao frete
        frete.addListCarga(carga1);
        frete.addListCarga(carga2);

        // Calcular valor
        frete.calcularValorFrete();

        // Exibir informações
        System.out.println("Endereco do frete: " + frete.getEndereco().getLogradouro() + ", " + frete.getEndereco().getNumero());
        System.out.println("Distancia: " + frete.getDistancia() + " km");
        System.out.println("Observacao: " + frete.getObservacao());
        System.out.println("Valor do frete: R$ " + frete.getValor());
        System.out.println("Cargas:");

        for (Carga carga : frete.exibirListCarga()) {
            System.out.println(" - " + carga.getDescricao() + " | " + carga.getMassa() + " kg");
        }
    }
}
