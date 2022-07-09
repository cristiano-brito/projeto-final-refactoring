package br.com.infnet.projetofinal.empresaAcme.engenheiro;

import br.com.infnet.projetofinal.empresaAcme.Funcionario;

public class DadosEngenheiro extends Funcionario {

    private boolean temMestrado;
    private Integer notaMestrado;
    private boolean temDoutorado;
    private Integer notaDoutorado;
    private boolean ehMenorDe50Anos;
    private boolean fluenteEmIngles;
    private boolean aprovado;

    public boolean isTemMestrado() {
        return temMestrado;
    }

    public void setTemMestrado(boolean temMestrado) {
        this.temMestrado = temMestrado;
    }

    public Integer getNotaMestrado() {
        return notaMestrado;
    }

    public void setNotaMestrado(Integer notaMestrado) {
        this.notaMestrado = notaMestrado;
    }

    public boolean isTemDoutorado() {
        return temDoutorado;
    }

    public void setTemDoutorado(boolean temDoutorado) {
        this.temDoutorado = temDoutorado;
    }

    public Integer getNotaDoutorado() {
        return notaDoutorado;
    }

    public void setNotaDoutorado(Integer notaDoutorado) {
        this.notaDoutorado = notaDoutorado;
    }

    public boolean isEhMenorDe50Anos() {
        return ehMenorDe50Anos;
    }

    public void setEhMenorDe50Anos(boolean ehMenorDe50Anos) {
        this.ehMenorDe50Anos = ehMenorDe50Anos;
    }

    public boolean isFluenteEmIngles() {
        return fluenteEmIngles;
    }

    public void setFluenteEmIngles(boolean fluenteEmIngles) {
        this.fluenteEmIngles = fluenteEmIngles;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    @Override
    public Double calculaBonus() {
        return getTempoDeServicoEMAnos() * 3.7;
    }
}
