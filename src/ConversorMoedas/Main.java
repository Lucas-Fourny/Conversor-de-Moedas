package ConversorMoedas;

import javax.swing.JOptionPane;

public class Main{
    public static double URL;

    public static void main(String[] args) {
        
        String opcoes = JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu", JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Conversor de Moeda", "Conversor de Temperatura"}, "Escolha").toString();

        String input = JOptionPane.showInputDialog("Insira um valor");

        try {
            Double.valueOf(input);
        }catch (Exception e ){
            JOptionPane.showMessageDialog(null, "Digite apenas numeros","Caracteres invalidos", JOptionPane.ERROR_MESSAGE);
            Main.main(args);
        }

        Funcao funcao = new Funcao();

        switch (opcoes) {
            case "Conversor de Moeda":
            double valorRecebido = Double.parseDouble(input);
            funcao.converterMoedas(valorRecebido);
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
            if (resposta == JOptionPane.OK_OPTION) {
                System.out.println("Escolheu opção afirmativa");
                Main.main(args);
            } else {
                JOptionPane.showMessageDialog(null,"Programa finalizado");
            }
            break;

        }
    }
    
    
}