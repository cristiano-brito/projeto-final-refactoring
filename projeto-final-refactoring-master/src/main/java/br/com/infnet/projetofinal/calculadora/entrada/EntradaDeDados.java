package br.com.infnet.projetofinal.calculadora.entrada;

import java.util.Scanner;

public class EntradaDeDados {

    private Integer eixoInicialX;
    private Integer eixoFinalX;
    private Integer eixoInicialY;
    private Integer eixoFinalY;

    public void start() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite eixo inicial x");
        eixoInicialX = entrada.nextInt();
        System.out.println("Digite eixo final x");
        eixoFinalX = entrada.nextInt();
        System.out.println("Digite eixo inicial y");
        eixoInicialY = entrada.nextInt();
        System.out.println("Digite eixo final y");
        eixoFinalY = entrada.nextInt();
    }

    public Integer getEixoInicialX() {
        return eixoInicialX;
    }

    public void setEixoInicialX(Integer eixoInicialX) {
        this.eixoInicialX = eixoInicialX;
    }

    public Integer getEixoFinalX() {
        return eixoFinalX;
    }

    public void setEixoFinalX(Integer eixoFinalX) {
        this.eixoFinalX = eixoFinalX;
    }

    public Integer getEixoInicialY() {
        return eixoInicialY;
    }

    public void setEixoInicialY(Integer eixoInicialY) {
        this.eixoInicialY = eixoInicialY;
    }

    public Integer getEixoFinalY() {
        return eixoFinalY;
    }

    public void setEixoFinalY(Integer eixoFinalY) {
        this.eixoFinalY = eixoFinalY;
    }
}
