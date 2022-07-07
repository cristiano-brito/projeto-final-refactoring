package br.com.infnet.projetofinal.empresaAcme.validacao;

import br.com.infnet.projetofinal.empresaAcme.engenheiro.DadosEngenheiro;

public class ValidacaoService {

    public static void validaSeTemDoutora(final DadosEngenheiro entrada) {
        if (entrada.isTemDoutorado() && entrada.getNotaDoutorado() > 5) {
            entrada.setAprovado(true);
        }
    }

    public static void validaSeTemMestrado(final DadosEngenheiro entrada) {
        if (entrada.isTemMestrado() && entrada.getNotaMestrado() > 7) {
            entrada.setAprovado(true);
        }
    }

    public static boolean isFluenteEmIngles(final DadosEngenheiro entrada) {
        if (!entrada.isFluenteEmIngles()) {
            throw new RuntimeException("Reprovado");
        }
        return true;
    }
}
