package br.com.infnet.projetofinal.empresaAcme.endereco;

public class EnderecoBuilder {
    private String logradouro;
    private String cidade;
    private String numero;
    private String cep;
    private String bairro;

    public EnderecoBuilder logradouro(String logradouro) {
        this.logradouro = logradouro;
        return this;
    }
    public EnderecoBuilder cidade(String cidade) {
        this.cidade = cidade;
        return this;
    }
    public EnderecoBuilder numero(String numero) {
        this.numero = numero;
        return this;
    }
    public EnderecoBuilder cep(String cep) {
        this.cep = cep;
        return this;
    }
    public EnderecoBuilder bairro(String bairro) {
        this.bairro = bairro;
        return this;
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

    public Endereco build() {
        return new Endereco(this);
    }
}
