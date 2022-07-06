package br.com.infnet.projetofinal.calculadora.servico;

import br.com.infnet.projetofinal.calculadora.entrada.EntradaDeDados;
import br.com.infnet.projetofinal.calculadora.impressao.ImpressaoDeDados;

public class CalculadoraImpl implements Calculadora {

    @Override
    public void calcularDistancia() {
        EntradaDeDados entradaDeDados = new EntradaDeDados();
        entradaDeDados.start();

        final double resultado = calcular(entradaDeDados);

        final ImpressaoDeDados dados = new ImpressaoDeDados();
        dados.imprimirDistancia(resultado);
    }

    private double calcular(final EntradaDeDados entradaDeDados) {
        return Math.sqrt(Math.pow((entradaDeDados.getEixoFinalX() - entradaDeDados.getEixoInicialX()), 2)
                + Math.pow((entradaDeDados.getEixoFinalY() - entradaDeDados.getEixoInicialY()), 2));
    }
}
