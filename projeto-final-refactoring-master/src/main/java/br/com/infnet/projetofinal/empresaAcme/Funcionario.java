package br.com.infnet.projetofinal.empresaAcme;

import br.com.infnet.projetofinal.empresaAcme.endereco.Endereco;

public abstract class Funcionario {
    private String id;
    private String nome;
    private String sobrenome;
    private Long tempoDeServicoEMAnos;
    private Endereco endereco;
    private GrupoSanguineo grupoSanguineo;
    public Funcionario(GrupoSanguineo grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public Long getTempoDeServicoEMAnos() {
        return tempoDeServicoEMAnos;
    }

    public void setTempoDeServicoEMAnos(Long tempoDeServicoEMAnos) {
        this.tempoDeServicoEMAnos = tempoDeServicoEMAnos;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public abstract Double calculaBonus();


}
