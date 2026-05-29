public class Funcionario extends Pessoa {

    private String cargo;
    private double salario;

    public Funcionario(String nome, int idade, String cargo, double salario) {
        super(nome, idade);
        this.cargo = cargo;
        this.salario = salario;
    }

    // Getters
    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    // Setters
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void mostrarFuncionario() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario: R$ " + salario);
    }
}
