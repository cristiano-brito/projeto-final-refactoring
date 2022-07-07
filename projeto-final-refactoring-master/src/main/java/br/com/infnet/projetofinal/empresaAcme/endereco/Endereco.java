package br.com.infnet.projetofinal.empresaAcme.endereco;

public class Endereco {
    private final String logradouro;
    private final String cidade;
    private final String numero;
    private final String cep;
    private final String bairro;

    protected Endereco(EnderecoBuilder builder) {
        this.logradouro = builder.getLogradouro();
        this.cidade = builder.getCidade();
        this.numero = builder.getNumero();
        this.cep = builder.getCep();
        this.bairro = builder.getBairro();
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
