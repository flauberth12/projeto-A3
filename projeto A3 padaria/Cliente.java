public class Cliente extends Pessoa {

    private String endereco;
    private String telefone;

    public Cliente(String nome, int idade, String endereco, String telefone) {
        super(nome, idade);
        this.endereco = endereco;
        this.telefone = telefone;
    }

    // Getters
    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    // Setters
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void mostrarCliente() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Endereco: " + endereco);
        System.out.println("Telefone: " + telefone);
    }
}
