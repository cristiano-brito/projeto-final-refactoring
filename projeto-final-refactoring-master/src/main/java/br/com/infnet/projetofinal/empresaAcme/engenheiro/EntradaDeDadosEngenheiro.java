package br.com.infnet.projetofinal.empresaAcme.engenheiro;

import java.util.Scanner;

public class EntradaDeDadosEngenheiro {

    public DadosEngenheiro start() {
        DadosEngenheiro engenheiro = new DadosEngenheiro();
        Scanner entrada = new Scanner(System.in);
        try {
            System.out.println("Digite (true)Tem mestrado      (false)Sem mestrado");
            engenheiro.setTemMestrado(entrada.nextBoolean());
            if (engenheiro.isTemMestrado()) {
                System.out.println("Qual a nota do mestrado?");
                engenheiro.setNotaMestrado(entrada.nextInt());
            }

            System.out.println("Digite (true)Tem doutorado     (false)Sem doutorado");
            engenheiro.setTemDoutorado(entrada.nextBoolean());
            if (engenheiro.isTemDoutorado()) {
                System.out.println("Qual a nota do doutorado?");
                engenheiro.setNotaDoutorado(entrada.nextInt());
            }

            System.out.println("(true)Menor de 50 anos de idade    (false)Maior de 50 anos de idade");
            engenheiro.setEhMenorDe50Anos(entrada.nextBoolean());

            System.out.println("(true)Fluente em ingles    (false)Nao fluente em ingles");
            engenheiro.setFluenteEmIngles(entrada.nextBoolean());
        } catch (Exception e) {
            System.out.println("Erro capturado: " + e.getMessage());
        } finally {
            entrada.close();
        }
        return engenheiro;
    }

}
