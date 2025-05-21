public class Endereco {
    private String logradouro, cidade, bairro;


    
    public Endereco(String logradouro, String cidade, String bairro) {
        this.logradouro = logradouro;
        this.cidade = cidade;
        this.bairro = bairro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }


    

}
