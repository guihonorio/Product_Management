package loja;

public class Eletronico extends Produto {

    private int garantia;

    public Eletronico(String nome, double preco, int estoque, int garantia) {
        super(nome, preco, estoque);
        this.garantia = garantia;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    public void calcularGarantiaRestante(int meses) {

        int restante = garantia - meses;

        if (restante > 0) {
            System.out.println("Garantia restante: " + restante + " meses.");
        } else {
            System.out.println("Garantia expirada.");
        }
    }

    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("Garantia: " + garantia + " meses");
    }
}

