package loja;

public class Produto {

    private String nome;
    private double preco;
    private int estoque;
    private Fornecedor fornecedor;

    // Construtor
    public Produto(String nome, double preco, int estoque, Fornecedor fornecedor) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
        this.fornecedor = fornecedor;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    // Venda sem desconto
    public void vender(int quantidade) {

        if (quantidade <= estoque) {
            estoque -= quantidade;
            System.out.println("Venda realizada com sucesso!");
        } else {
            System.out.println("Estoque insuficiente.");
        }

    }

    // Venda com desconto (sobrecarga)
    public void vender(int quantidade, double desconto) {

        if (quantidade <= estoque) {

            estoque -= quantidade;

            double total = (preco * quantidade) - desconto;

            System.out.println("Venda realizada com sucesso!");
            System.out.println("Desconto: R$ " + desconto);
            System.out.println("Total da venda: R$ " + total);

        } else {

            System.out.println("Estoque insuficiente.");

        }

    }

    // Repor estoque
    public void reporEstoque(int quantidade) {
        estoque += quantidade;
        System.out.println("Estoque atualizado.");
    }

    // Apresentar informações
    public void apresentar() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Estoque: " + estoque);
        fornecedor.apresentar();
    }
}