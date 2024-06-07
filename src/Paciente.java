public class Paciente implements Pessoa {

    private String nome;
    private String cpf;
    private int idade;
    private int nivelDor;

    private String pressao;
    private float altura;
    private float peso;

    public Paciente(String nome, String cpf, int idade, int nivelDor, String pressao, float altura, float peso) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.nivelDor = nivelDor;
        this.pressao = pressao;
        this.altura = altura;
        this.peso = peso;
    }

    public String getPressao() {
        return pressao;
    }
    public void setPressao(String pressao) {
        this.pressao = pressao;
    }

    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
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
