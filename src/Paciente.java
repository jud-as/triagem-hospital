public class Paciente implements Pessoa {

    private String nome;
    private String cpf;
    private int idade;
    private int nivelDor;

    public Paciente(String nome, String cpf, int idade, int nivelDor) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.nivelDor = nivelDor;
    }


    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNivelDor() {
        return nivelDor;
    }
    public void setNivelDor(int nivelDor) {
        this.nivelDor = nivelDor;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
    }

    @Override
    public String getCpf() {
        return cpf;
    }

    @Override
    public void setCpf(String cpf) {
    }
}
