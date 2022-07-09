package br.com.infnet.projetofinal.empresaAcme.vendedor;

import br.com.infnet.projetofinal.empresaAcme.Funcionario;
import br.com.infnet.projetofinal.empresaAcme.GrupoSanguineo;

import java.util.List;
import java.util.Map;

public class DadosVendedor extends Funcionario {
    private Long matricula;
    private Long quantidadeDeVendas;
    private boolean metaBatida;
    private Double bonus = 0D;
    private List<Map<String, Integer>> cursos;

    public DadosVendedor(GrupoSanguineo grupoSanguineo) {
        super(grupoSanguineo);
    }

    public DadosVendedor() {
        super();
    }

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public Long getQuantidadeDeVendas() {
        return quantidadeDeVendas;
    }

    public void setQuantidadeDeVendas(Long quantidadeDeVendas) {
        this.quantidadeDeVendas = quantidadeDeVendas;
    }

    public List<Map<String, Integer>> getCursos() {
        return cursos;
    }

    public void setCursos(List<Map<String, Integer>> cursos) {
        this.cursos = cursos;
    }

    public Double getBonus() {
        return bonus;
    }

    public boolean isPlatinumEBateuMeta(Boolean metaBatida) {
        this.metaBatida = quantidadeDeVendas > 35 && cursos.size() >= 1 && metaBatida;
        return metaBatida;
    }

    public Double calculaBonus() {
        bonus = metaBatida ? quantidadeDeVendas * 0.05 : 0.0;
        return bonus;
    }
}
