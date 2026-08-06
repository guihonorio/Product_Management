package loja;

import java.util.Scanner;

public class Loja {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        // Fornecedor
        Fornecedor fornecedor = new Fornecedor(
                "Tech Foods Ltda.",
                "12.345.678/0001-99",
                "(11) 99999-9999"
        );

        // Produtos
        Alimento alimento = new Alimento(
                "Arroz", 30.50, 20,
                "10/12/2026", fornecedor);

        Eletronico eletronico = new Eletronico(
                "Notebook", 3500.00, 10,
                24, fornecedor);

        Smartphone smartphone = new Smartphone(
                "Galaxy S25", 4500.00, 15,
                12, "Samsung", 6.7, fornecedor);

        int produto;
        int opcao;

        do {

            System.out.println("\n===== ESCOLHA O PRODUTO =====");
            System.out.println("1 - Alimento");
            System.out.println("2 - Eletrônico");
            System.out.println("3 - Smartphone");
            System.out.println("4 - Sair");
            produto = leia.nextInt();

            if (produto == 4)
                break;

            do {

                System.out.println("\n1 - Apresentar informações");
                System.out.println("2 - Vender produto");
                System.out.println("3 - Repor estoque");

                if (produto == 1)
                    System.out.println("4 - Verificar validade");

                if (produto == 2 || produto == 3)
                    System.out.println("4 - Calcular garantia restante");

                System.out.println("5 - Voltar");

                opcao = leia.nextInt();

                switch (opcao) {

                    case 1 -> {
                        if (produto == 1)
                            alimento.apresentar();
                        else if (produto == 2)
                            eletronico.apresentar();
                        else
                            smartphone.apresentar();
                    }

                    case 2 -> {

                        System.out.print("Quantidade: ");
                        int venda = leia.nextInt();

                        System.out.print("Deseja aplicar desconto? (1-Sim / 2-Não): ");
                        int resposta = leia.nextInt();

                        if (resposta == 1) {

                            System.out.print("Valor do desconto: R$ ");
                            double desconto = leia.nextDouble();

                            if (produto == 1)
                                alimento.vender(venda, desconto);
                            else if (produto == 2)
                                eletronico.vender(venda, desconto);
                            else
                                smartphone.vender(venda, desconto);

                        } else {

                            if (produto == 1)
                                alimento.vender(venda);
                            else if (produto == 2)
                                eletronico.vender(venda);
                            else
                                smartphone.vender(venda);

                        }
                    }

                    case 3 -> {
                        System.out.print("Quantidade: ");
                        int repor = leia.nextInt();

                        if (produto == 1)
                            alimento.reporEstoque(repor);
                        else if (produto == 2)
                            eletronico.reporEstoque(repor);
                        else
                            smartphone.reporEstoque(repor);
                    }

                    case 4 -> {
                        if (produto == 1) {

                            alimento.verificarValidade();

                        } else {

                            System.out.print("Meses desde a compra: ");
                            int meses = leia.nextInt();

                            if (produto == 2)
                                eletronico.calcularGarantiaRestante(meses);
                            else
                                smartphone.calcularGarantiaRestante(meses);
                        }
                    }

                    default -> System.out.println("Opção inválida!");
                }

            } while (opcao != 5);

        } while (produto != 4);

        leia.close();
    }
}