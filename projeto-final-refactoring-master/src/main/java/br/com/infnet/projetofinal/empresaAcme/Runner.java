package br.com.infnet.projetofinal.empresaAcme;

import br.com.infnet.projetofinal.empresaAcme.engenheiro.DadosEngenheiro;
import br.com.infnet.projetofinal.empresaAcme.engenheiro.EntradaDeDadosEngenheiro;
import br.com.infnet.projetofinal.empresaAcme.validacao.ValidacaoService;

public class Runner {
    public static void main(String[] args) {
        EntradaDeDadosEngenheiro dadoEngenheito = new EntradaDeDadosEngenheiro();
        final DadosEngenheiro entrada = dadoEngenheito.start();
        if (ValidacaoService.isFluenteEmIngles(entrada)) {
            ValidacaoService.validaSeTemMestrado(entrada);
            ValidacaoService.validaSeTemDoutora(entrada);
        }
        System.out.printf("Aprovado: %s", entrada.isAprovado());

    }

}
