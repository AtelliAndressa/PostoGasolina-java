/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package postogasolina;

/**
 *
 * @author Familia
 */
public class PostoGasolina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int limiteEstoque = 10000;        
        Combustivel gasolina = new Combustivel("Gasolina", limiteEstoque);
        
        int qtdAposReposicao = gasolina.reporEstoque(1000);
        System.out.println("Qtd após reposição: " + qtdAposReposicao + " litros.");
        
        int qtdRealmenteAbastecido1 = gasolina.abastecerVeiculo(51);
        System.out.println("Qtd abastecida 1: " + qtdRealmenteAbastecido1 + " litros.");
        
        int qtdRealmenteAbastecido2 = gasolina.abastecerVeiculo(10);
        System.out.println("Qtd abastecida 2: " + qtdRealmenteAbastecido2);
        
        System.out.println("Estoque de Gasolina: " + gasolina.mostrarEstoque());
        
    }    
}
