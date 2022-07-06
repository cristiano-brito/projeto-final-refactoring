package br.com.infnet.projetofinal.calculadora.impressao;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class ImpressaoDeDados implements Impressao{
    @Override
    public void imprimirDistancia(double resultado) {
        NumberFormat formatter = new DecimalFormat("#0.0000");
        System.out.println(formatter.format(resultado));
    }
}
