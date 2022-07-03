package br.com.infnet.projetofinal.empresaAcme.endereco;

public class Endereco {
    private final String logradouro;
    private final String cidade;
    private final String numero;
    private final String cep;
    private final String bairro;

    protected Endereco(EnderecoBuilder builder) {
        this.logradouro = builder.logradouro;
        this.cidade = builder.cidade;
        this.numero = builder.numero;
        this.cep = builder.cep;
        this.bairro = builder.bairro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getNumero() {
        return numero;
    }

    public String getCep() {
        return cep;
    }

    public String getBairro() {
        return bairro;
    }

}
