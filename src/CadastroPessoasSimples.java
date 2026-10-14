import java.util.Scanner;

public class CadastroPessoasSimples {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] pessoas = new String[10];
        pessoas[0] = "João";
        pessoas[1] = "Davi";
        pessoas[2] = "Maria";
        boolean menu = true;
        int opcao;


        while (menu) {

            System.out.println();
            System.out.println("===== Cadastro de Pessoas (simples) =====");
            System.out.println("1) Adicionar pessoa");
            System.out.println("2) Ver lista de pessoas");
            System.out.println("3) Sair");
            System.out.print("Escolha uma opção (1-3) → ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    boolean cadastrou = false;
                    for (int i = 0; i < pessoas.length; i++) {
                        if (pessoas[i] == null) {
                            System.out.print("Nome → ");
                            pessoas[i] = sc.nextLine();
                            System.out.println("Pessoa adicionada: " + pessoas[i] + " (posição " + i + ")");
                            cadastrou = true;
                            System.out.print("Deseja adicionar mais? (S/N) → ");
                            String resultado = sc.nextLine();
                            if (resultado.equalsIgnoreCase("N")) {
                                System.out.println("Retornando ao menu principal...\n");
                                break;
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.println("-- Pessoas cadastradas --");
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

