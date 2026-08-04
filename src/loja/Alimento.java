package loja;

public class Alimento extends Produto {

    private String validade;

    public Alimento(String nome, double preco, int estoque, String validade) {
        super(nome, preco, estoque);
        this.validade = validade;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public void verificarValidade() {
        System.out.println("Validade: " + validade);
    }

    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("Validade: " + validade);
    }
}