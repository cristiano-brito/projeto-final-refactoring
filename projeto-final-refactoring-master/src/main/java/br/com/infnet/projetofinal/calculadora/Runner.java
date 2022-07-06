package br.com.infnet.projetofinal.calculadora;

import br.com.infnet.projetofinal.calculadora.servico.Calculadora;
import br.com.infnet.projetofinal.calculadora.servico.CalculadoraImpl;

public class Runner {

    public static void main(String[] args) {
        Calculadora calculadora = new CalculadoraImpl();
        calculadora.calcularDistancia();
    }
}
