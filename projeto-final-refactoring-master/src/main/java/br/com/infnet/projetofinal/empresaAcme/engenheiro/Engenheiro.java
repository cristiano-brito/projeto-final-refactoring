package br.com.infnet.projetofinal.empresaAcme.engenheiro;

import br.com.infnet.projetofinal.empresaAcme.Funcionario;
import br.com.infnet.projetofinal.empresaAcme.GrupoSanguineo;

import java.util.Date;

public class Engenheiro extends Funcionario implements Iengenheiro {
    private Long matricula;
    public String numeroConselho;

    public Engenheiro(GrupoSanguineo grupoSanguineo) {
        super(grupoSanguineo);
    }

    @Override
    public Double calculaBonus() {
        return getTempoDeServicoEMAnos() * 3.7;
    }

    @Override
    public String getNumeroConselho() {
        return numeroConselho + new Date().getYear();
    }

    public Integer verificaQualificacoesParaTrabalhoFora(Boolean temMestrado, Integer notaMestrado,
                                         boolean temDoutorado, Integer notaDoutorado, boolean ehMenorDe50Anos,
                                         boolean fluenteEmIngles){
        Integer aprovado = -1;

        if (fluenteEmIngles) {
            if(temMestrado){
                if(notaMestrado > 7){
                    aprovado = 1;
                }
            }else if(temDoutorado){
                if(notaDoutorado > 5){
                    aprovado = 1;
                }
            }
        } else {

        }
    return aprovado;
    }

}
