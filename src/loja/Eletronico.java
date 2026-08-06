package loja;

public class Eletronico extends Produto {

    private int garantia;

    // Construtor
    public Eletronico(String nome, double preco, int estoque,
                      int garantia, Fornecedor fornecedor) {

        super(nome, preco, estoque, fornecedor);
        this.garantia = garantia;
    }

    // Getter
    public int getGarantia() {
        return garantia;
    }

    // Setter
    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    // Método específico
    public void calcularGarantiaRestante(int meses) {

        int restante = garantia - meses;

        if (restante > 0) {
            System.out.println("Garantia restante: " + restante + " meses.");
        } else {
            System.out.println("Garantia expirada.");
        }
    }

    // Sobrescrita
    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("Garantia: " + garantia + " meses");
    }
}