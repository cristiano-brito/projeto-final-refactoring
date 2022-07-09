package br.com.infnet.projetofinal.empresaAcme.engenheiro;

import br.com.infnet.projetofinal.empresaAcme.validacao.ValidacaoService;

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

            System.out.println("Digite o tempo de servico em anos");
            engenheiro.setTempoDeServicoEMAnos(entrada.nextDouble());
        } catch (Exception e) {
            System.out.println("Erro capturado: " + e.getMessage());
        }
        return engenheiro;
    }

    public void imprimirDados(final DadosEngenheiro entrada) {
        System.out.println("Tempo de servico em anos: " + entrada.getTempoDeServicoEMAnos());
        System.out.println("Aprovado: " + entrada.isAprovado());
    }

    public void startEngenheiro() {
        EntradaDeDadosEngenheiro engenheiro = new EntradaDeDadosEngenheiro();
        final DadosEngenheiro entrada = engenheiro.start();
        if (ValidacaoService.isFluenteEmIngles(entrada)) {
            ValidacaoService.validaSeTemMestrado(entrada);
            ValidacaoService.validaSeTemDoutora(entrada);
        }
        imprimirDados(entrada);
    }
}
