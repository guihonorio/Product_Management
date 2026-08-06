package loja;

public class Smartphone extends Eletronico {

    private String marca;
    private double tamanhoTela;

    // Construtor
    public Smartphone(String nome, double preco, int estoque,
                      int garantia, String marca,
                      double tamanhoTela, Fornecedor fornecedor) {

        super(nome, preco, estoque, garantia, fornecedor);

        this.marca = marca;
        this.tamanhoTela = tamanhoTela;
    }

    // Getters
    public String getMarca() {
        return marca;
    }

    public double getTamanhoTela() {
        return tamanhoTela;
    }

    // Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTamanhoTela(double tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }

    // Sobrescrita
    @Override
    public void apresentar() {

        super.apresentar();

        System.out.println("Marca: " + marca);
        System.out.println("Tamanho da tela: " + tamanhoTela + " polegadas");
    }
}