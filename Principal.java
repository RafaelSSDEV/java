package uninter;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();

        int opcao = 0;
        while (opcao != 5) {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar moedas");
            System.out.println("2. Remover moedas");
            System.out.println("3. Listar moedas");
            System.out.println("4. Calcular total convertido");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    adicionarMoeda(cofrinho, scanner);
                    break;
                case 2:
                    removerMoeda(cofrinho, scanner);
                    break;
                case 3:
                    cofrinho.listagemMoedas();
                    break;
                case 4:
                    double totalConvertido = cofrinho.totalConvertido();
                    System.out.println("Total convertido para Real: " + totalConvertido);
                    break;
                case 5:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opcao inválida.");
            }
        }

        scanner.close();
    }

    private static void adicionarMoeda(Cofrinho cofrinho, Scanner scanner) {
        System.out.print("Escolha o tipo de moeda (1 - Dolar, 2 - Euro, 3 - Real): ");
        int tipoMoeda = scanner.nextInt();

        System.out.print("Digite o valor da moeda: ");
        double valorMoeda = scanner.nextDouble();

        Moeda moeda;
        switch (tipoMoeda) {
            case 1:
                moeda = new Dolar(valorMoeda);
                break;
            case 2:
                moeda = new Euro(valorMoeda);
                break;
            case 3:
                moeda = new Real(valorMoeda);
                break;
            default:
                System.out.println("Tipo de moeda inválido. A moeda será considerada como Real.");
                moeda = new Real(valorMoeda);
        }

        cofrinho.adicionar(moeda);
    }

     static void removerMoeda(Cofrinho cofrinho, Scanner scanner) {
        cofrinho.listagemMoedas();
        System.out.print("Digite o índice da moeda que deseja remover: ");
        int indice = scanner.nextInt();

        if (indice >= 0 && indice < cofrinho.listaMoedas.size()) {
            Moeda moedaRemovida = cofrinho.listaMoedas.get(indice);
            cofrinho.remover(moedaRemovida);
        } else {
            System.out.println("Índice inválido.");
        }
    }
}
