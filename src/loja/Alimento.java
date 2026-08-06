package loja;

public class Alimento extends Produto {

    private String validade;

    // Construtor
    public Alimento(String nome, double preco, int estoque,
                     String validade, Fornecedor fornecedor) {

        super(nome, preco, estoque, fornecedor);
        this.validade = validade;
    }

    // Getter
    public String getValidade() {
        return validade;
    }

    // Setter
    public void setValidade(String validade) {
        this.validade = validade;
    }

    // Método específico
    public void verificarValidade() {
        System.out.println("Validade: " + validade);
    }

    // Sobrescrita
    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("Validade: " + validade);
    }
}