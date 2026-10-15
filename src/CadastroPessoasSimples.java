import java.util.Scanner;

// Programa de console que cadastra nomes em um array de 10 posições via menu
public class CadastroPessoasSimples {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] pessoas = new String[10];
        pessoas[0] = "João";
        pessoas[1] = "Davi";
        pessoas[2] = "Maria";
        boolean menu = true;
        int opcao;


        // loop do menu; definir menu = false encerra o programa
        while (menu) {

            System.out.println();
            System.out.println("===== Cadastro de Pessoas (simples) =====");
            System.out.println("1) Adicionar pessoa");
            System.out.println("2) Ver lista de pessoas");
            System.out.println("3) Sair");
            System.out.print("Escolha uma opção (1-3) → ");
            opcao = sc.nextInt();
            // limpa o Enter pendente do nextInt()
            sc.nextLine();

            switch (opcao) {
                case 1:
                    // confere se ainda tem vaga antes de pedir o nome
                    boolean temVaga = false;
                    for (int i = 0; i < pessoas.length; i++) {
                        if (pessoas[i] == null) {
                            temVaga = true;
                            break;
                        }
                    }
                    if (!temVaga) {
                        System.out.println("Lista cheia!");
                        break;
                    }
                    for (int i = 0; i < pessoas.length; i++) {
                        // posição vazia no array é representada por null — cadastrar aqui
                        if (pessoas[i] == null) {
                            System.out.print("Nome → ");
                            pessoas[i] = sc.nextLine();
                            System.out.println("Pessoa adicionada: " + pessoas[i] + " (posição " + i + ")");

                            // considera 'listaCheia' true, até encontrar uma posição vazia
                            boolean listaCheia = true;

                            // verifica se tem alguma vaga
                            for (int j = 0; j < pessoas.length; j++) {
                                if (pessoas[j] == null) {
                                    listaCheia = false;
                                    break;
                                }
                            }
                            if (listaCheia) {
                                System.out.println("Lista cheia!");
                                break;
                            }
                            System.out.print("Deseja adicionar mais? [S/N] → ");
                            String resultado = sc.nextLine();

                            if (resultado.equalsIgnoreCase("N")) {
                                System.out.println("Retornando ao menu principal...\n");
                                // este break sai do for (volta ao menu)
                                break;
                            }
                        }
                    }
                    // este break encerra o case 1 (sai do switch)
                    break;
                case 2:
                    System.out.println("-- Pessoas cadastradas --");
                    // mostra apenas as posições preenchidas (não imprime null)
                    for (int i = 0; i < pessoas.length; i++) {
                        if (pessoas[i] != null) {
                            System.out.println("[" + i + "] " + pessoas[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Saindo do programa... Até mais!");
                    menu = false;
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, digite 1, 2 ou 3.");
                    break;
            }
        }
        sc.close();
    }
}

