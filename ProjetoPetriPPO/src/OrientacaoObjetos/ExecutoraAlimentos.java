package OrientacaoObjetos;

import java.util.Scanner;

public class ExecutoraAlimentos {
    public static void main(String[] args) {
        int opcao;
        Scanner scanner = new Scanner(System.in);

        Fruta fruta1 = new Fruta("Maçã", "Fruta", "Vermelha", "123456789", 7, "Geladeira", 3.0, true, true);
        Pao pao1 = new Pao("Pão de Forma", "Pão", "Branco", "987654321", 5, "Pão de forma", 0.5, true);
        Bebida bebida1 = new Bebida("Refrigerante", "Bebida", "Caramelo", "543216789", 365, "Geladeira", 2.0, true);

        Alimento alimentoCriado = null;

        while (true) {
            System.out.println("-----------------------MENU-------------------------");
            System.out.println("|---------------------------------------------------|");
            System.out.println("| 1 - Preparar fruta.              |");
            System.out.println("| 2 - Preparar pão.                |");
            System.out.println("| 3 - Abrir bebida.                |");
            System.out.println("| 4 - Exibir detalhes de alimento. |");
            System.out.println("| 0 - Sair.                        |");
            System.out.println("|---------------------------------------------------|");
            System.out.print("Digite uma opção válida: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    fruta1.lavar();
                    fruta1.descascar();
                    fruta1.cortar();
                    fruta1.saborear();
                    fruta1.verificarCascaComestivel();
                    break;

                case 2:
                    pao1.torrar();
                    pao1.passarManteiga();
                    pao1.rechear();
                    break;

                case 3:
                    bebida1.abrir();
                    bebida1.servir();
                    bebida1.gelar();
                    break;

                case 4:
                    System.out.print("Digite o número do alimento (1 - Fruta, 2 - Pão, 3 - Bebida): ");
                    int numeroAlimento = scanner.nextInt();
                    scanner.nextLine();

                    switch (numeroAlimento) {
                        case 1:
                            fruta1.mostrarInformacoes();
                            break;
                        case 2:
                            pao1.mostrarInformacoes();
                            break;
                        case 3:
                            bebida1.mostrarInformacoes();
                            break;
                        default:
                            System.out.println("Número de alimento inválido.");
                            break;
                    }
                    break;

                case 0:
                    System.out.println("Saindo do programa.");
                    return;
                default:
                    System.out.println("Opção inválida. Digite uma opção válida.");
                    break;
            }
        }
    }
}
