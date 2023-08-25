package ConversorMoedas;

import javax.swing.*;

public class Funcao {
    
    ConversorDeMoeda moedas = new ConversorDeMoeda();

    public void converterMoedas(double valorRecebido) {
        String opcao = (JOptionPane.showInputDialog(null,
        "Escolha para qual moeda você que converter seu dinheiro ","Moedas",JOptionPane.PLAIN_MESSAGE,null, new Object[]{"Dolar", "Euro", "Libras", "Pesos Argentinos"},"Escolha").toString());

        switch (opcao) {
            case "Dolar":
            moedas.converterReaisADolar(valorRecebido);
            break;

            case "Euro":
            moedas.converterReaisAEuro(valorRecebido);
            break;
        } 
        
    }
}
