package ConversorMoedas;

import javax.swing.*;

public class ConversorDeMoeda {

    public void converterReaisADolar(double valor) {
        double moedaDolar = valor/5.23;
        moedaDolar = (double) Math.round(moedaDolar * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem R$ " + moedaDolar + " em Dolar");
    }


    public void converterReaisAEuro(double valor) {
        double moedaEuro = valor/5.52;
        moedaEuro = (double) Math.round(moedaEuro * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem R$ " + moedaEuro + " em Euro");
    }


    
}
