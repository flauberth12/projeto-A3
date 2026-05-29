public class Funcionario extends Pessoa {

    String cargo;
    double salario;

    public Funcionario(String nome,
                       int idade,
                       String cargo,
                       double salario) {

        super(nome, idade);

        this.cargo = cargo;
        this.salario = salario;
    }

    public void mostrarFuncionario() {

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario: R$ " + salario);
    }
}