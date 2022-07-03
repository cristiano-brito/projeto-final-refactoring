package br.com.infnet.projetofinal.empresaAcme.vendedor;

import br.com.infnet.projetofinal.empresaAcme.Funcionario;
import br.com.infnet.projetofinal.empresaAcme.GrupoSanguineo;

import java.util.List;
import java.util.Map;

public class Vendedor extends Funcionario implements Ivendedor{
    private Long matricula;
    private Long quantidadeDeVendas;

    //Armazena um curso e sua nota;
    private List<Map<String, Integer>>cursos;

    public Vendedor(GrupoSanguineo grupoSanguineo) {
        super(grupoSanguineo);
    }


    @Override
    public Double calculaBonus() {
        return 0.0;
    }

    @Override
    public String getNumeroConselho() {
        return null;
    }

    public List<Map<String, Integer>> getCursos() {
        return cursos;
    }

    public void setCursos(List<Map<String, Integer>> cursos) {
        this.cursos = cursos;
    }

    public boolean isPlatinumEBateuMeta(Boolean metaBatida){
        return (quantidadeDeVendas > 35 && cursos.size() > 3 && metaBatida) ? true : false;
    }

    public Integer getQuantidadeEmpregadosFabrica(){
        return 34;
    }

}
