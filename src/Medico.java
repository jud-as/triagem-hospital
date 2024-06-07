public class Medico implements Pessoa {


    private String nome;
    private String cpf;
    private int crm;

    public Medico(String nome, String cpf, int crm) {
        this.nome = nome;
        this.cpf = cpf;
        this.crm = crm;
    }

    public int getCrm() {
        return crm;
    }
    public void setCrm(int crm) {
        this.crm = crm;
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
