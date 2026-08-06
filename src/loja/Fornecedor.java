package loja;

public class Fornecedor {

    private String nome;
    private String cnpj;
    private String telefone;

    public Fornecedor(String nome, String cnpj, String telefone) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.telefone = telefone;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void apresentar() {
        System.out.println("Fornecedor: " + nome);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Telefone: " + telefone);
    }
}