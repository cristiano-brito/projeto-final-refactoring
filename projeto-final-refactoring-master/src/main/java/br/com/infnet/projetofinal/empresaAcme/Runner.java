package br.com.infnet.projetofinal.empresaAcme;

import br.com.infnet.projetofinal.empresaAcme.engenheiro.EntradaDeDadosEngenheiro;
import br.com.infnet.projetofinal.empresaAcme.vendedor.EntradaDeDadosVendedor;

public class Runner {
    public static void main(String[] args) {
        EntradaDeDadosEngenheiro engenheiro = new EntradaDeDadosEngenheiro();
        engenheiro.startEngenheiro();

        EntradaDeDadosVendedor vendedor = new EntradaDeDadosVendedor();
        vendedor.startVendedor();
    }

}
