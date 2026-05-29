import java.util.Scanner;

public class Padaria {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        Cliente[] clientes = new Cliente[20];
        Funcionario[] funcionarios = new Funcionario[20];
        Produto[] produtos = new Produto[20];

        int qtdClientes = 0;
        int qtdFuncionarios = 0;
        int qtdProdutos = 0;

        int opcao;

        do {

            System.out.println("\n===== PADARIA =====");

            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Cadastrar Funcionario");
            System.out.println("3 - Cadastrar Produtos");
            System.out.println("4 - Ver Clientes");
            System.out.println("5 - Ver Funcionarios");
            System.out.println("6 - Ver Produto");
            System.out.println("7 - Fazer pedidos");

            System.out.println("0 - Sair");

            opcao = ler.nextInt();
            ler.nextLine();

            switch(opcao) {

                case 1:

                    System.out.println("Nome:");
                    String nome = ler.nextLine();

                    System.out.println("Idade:");
                    int idade = ler.nextInt();
                    ler.nextLine();

                    System.out.println("Endereco:");
                    String endereco = ler.nextLine();

                    System.out.println("Telefone:");
                    String telefone = ler.nextLine();

                    clientes[qtdClientes] =
                        new Cliente(nome,
                                    idade,
                                    endereco,
                                    telefone);

                    qtdClientes++;

                    System.out.println("Cliente cadastrado!");

                    break;

                case 2:

                    System.out.println("Nome:");
                    String nomeFunc = ler.nextLine();

                    System.out.println("Idade:");
                    int idadeFunc = ler.nextInt();
                    ler.nextLine();

                    if(idadeFunc < 18 || idadeFunc > 70) {

                        System.out.println("Funcionario invalido!");
                        break;
                    }

                    System.out.println("Cargo:");
                    String cargo = ler.nextLine();

                    System.out.println("Salario:");
                    double salario = ler.nextDouble();

                    funcionarios[qtdFuncionarios] =
                        new Funcionario(nomeFunc,
                                        idadeFunc,
                                        cargo,
                                        salario);

                    qtdFuncionarios++;

                    System.out.println("Funcionario cadastrado!");

                    break;

                case 3:

                    System.out.println("Nome do produto:");
                    String nomeProduto = ler.nextLine();

                    System.out.println("Preco do produto:");
                    double precoProduto = ler.nextDouble();

                    produtos[qtdProdutos] =
                        new Produto(nomeProduto,
                                    precoProduto);

                    qtdProdutos++;

                    System.out.println("Produto cadastrado!");

                    break;

                case 4:

                    System.out.println("\n===== CLIENTES =====");

                    for(int i = 0; i < qtdClientes; i++) {

                        clientes[i].mostrarCliente();

                        System.out.println("--------------");
                    }

                    break;

                case 5:

                    System.out.println("\n===== FUNCIONARIOS =====");

                    for(int i = 0; i < qtdFuncionarios; i++) {

                        funcionarios[i].mostrarFuncionario();

                        System.out.println("--------------");
                    }

                    break;

                case 6:

                    System.out.println("\n===== PRODUTOS =====");

                    for(int i = 0; i < qtdProdutos; i++) {

                        produtos[i].mostrarProduto();

                        System.out.println("--------------");
                    }

                    break;

                    case 7:

                    if(qtdProdutos == 0) {
                
                        System.out.println("Nenhum produto cadastrado!");
                        break;
                    }
                
                    double total = 0;
                
                    int pedido;
                
                    do {
                
                        System.out.println("\n===== MENU =====");
                
                        for(int i = 0; i < qtdProdutos; i++) {
                
                            System.out.println(
                                i + " - " +
                                produtos[i].nome +
                                " | R$ " +
                                produtos[i].preco
                            );
                        }
                
                        System.out.println("Digite o numero do produto");
                        System.out.println("Digite -1 para finalizar");
                
                        pedido = ler.nextInt();
                
                        if(pedido >= 0 && pedido < qtdProdutos) {
                
                            total += produtos[pedido].preco;
                
                            System.out.println(
                                produtos[pedido].nome +
                                " adicionado ao pedido!"
                            );
                        }
                
                        else if(pedido != -1) {
                
                            System.out.println("Produto invalido!");
                        }
                
                    } while(pedido != -1);
                
                    System.out.println("Total do pedido: R$ " + total);
                
                    break;    

                case 0:

                    System.out.println("Saindo...");
                    break;

                default:

                    System.out.println("Opcao invalida!");
            }

        } while(opcao != 0);

        ler.close();
    }
}