package loja;

import java.util.Scanner;

public class Loja {

    public static void main(String[] args) {

        try (Scanner leia = new Scanner(System.in)) {
            Alimento alimento = new Alimento("Arroz", 30.50, 20, "10/12/2026");
            Eletronico eletronico = new Eletronico("Notebook", 3500, 10, 24);
            
            int produto;
            int opcao;
            
            do {
                
                System.out.println("\n===== ESCOLHA O PRODUTO =====");
                System.out.println("1 - Alimento");
                System.out.println("2 - Eletrônico");
                System.out.println("3 - Sair");
                produto = leia.nextInt();
                
                if (produto == 3)
                    break;
                
                do {
                    
                    System.out.println("\n1 - Apresentar informações");
                    System.out.println("2 - Vender produto");
                    System.out.println("3 - Repor estoque");
                    
                    if (produto == 1)
                        System.out.println("4 - Verificar validade");
                    
                    if (produto == 2)
                        System.out.println("4 - Calcular garantia restante");
                    
                    System.out.println("5 - Voltar");
                    
                    opcao = leia.nextInt();
                    
                    switch (opcao) {
                        
                        case 1 -> {
                            if (produto == 1)
                                alimento.apresentar();
                            else
                                eletronico.apresentar();
                        }
                            
                        case 2 -> {
                            System.out.print("Quantidade: ");
                            int venda = leia.nextInt();
                            
                            if (produto == 1)
                                alimento.vender(venda);
                            else
                                eletronico.vender(venda);
                        }
                            
                        case 3 -> {
                            System.out.print("Quantidade: ");
                            int repor = leia.nextInt();
                            
                            if (produto == 1)
                                alimento.reporEstoque(repor);
                            else
                                eletronico.reporEstoque(repor);
                        }
                            
                        case 4 -> {
                            if (produto == 1) {
                                
                                alimento.verificarValidade();
                                
                            } else {
                                
                                System.out.print("Meses desde a compra: ");
                                int meses = leia.nextInt();
                                eletronico.calcularGarantiaRestante(meses);
                                
                            }
                        }
                            
                    }
                    
                } while (opcao != 5);
                
            } while (produto != 3);
        }
    }
}