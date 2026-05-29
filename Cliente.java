public class Cliente extends Pessoa {

    String endereco;
    String telefone;

    public Cliente(String nome,
                   int idade,
                   String endereco,
                   String telefone) {

        super(nome, idade);

        this.endereco = endereco;
        this.telefone = telefone;
    }

    public void mostrarCliente() {

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Endereco: " + endereco);
        System.out.println("Telefone: " + telefone);
    }
}