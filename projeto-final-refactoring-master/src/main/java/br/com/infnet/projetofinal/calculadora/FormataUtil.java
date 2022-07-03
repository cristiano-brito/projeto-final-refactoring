package br.com.infnet.projetofinal.calculadora;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class FormataUtil {
    public String formatarDistancia(double distancia) {
        NumberFormat formatter = new DecimalFormat("#0.0000");
        return formatter.format(distancia);
    }
}
