import java.util.ArrayList;
import java.util.Scanner;

public class Hospital {

    static Scanner input = new Scanner(System.in);
    static ArrayList<Paciente> arrayPacientes;
    static ArrayList<Medico> arrayMedicos;
    public static void main(String[] args) {
        arrayPacientes = new ArrayList<>();
        arrayMedicos = new ArrayList<>();
        operacoes();
    }

    public static void operacoes() {

        System.out.println("----------------------------------");
        System.out.println("------SELECIONE UMA OPERAÇÃO------\n");
        System.out.println("|    1 - Cadastrar Paciente      |");
        System.out.println("|    2 - Remover Paciente        |");
        System.out.println("|    3 - Atualizar Paciente      |");
        System.out.println("|    4 - Cadastrar Médicos       |"); // Prox. Feature
        System.out.println("|    5 - Listar                  |");
        System.out.println("|    6 - Sair                    |");

        int opc = input.nextInt();
        switch(opc) {
            case 1:
                triagem(null);
                break;
            case 2:
                excluirPaciente();
                break;
            case 3:
                atualizarPaciente();
                break;
            case 4:
                cadastrarMedico();
                break;
            case 5:
                listar();
                break;
            case 6:
                System.out.println("Encerrando programa.");
                System.exit(0);
                break;
            default:
                System.out.println("Opção inválida.");
                operacoes();
                break;
        }
    }

    public static Paciente cadastrarPaciente() {

        System.out.println("\nNome: ");
        String nome = input.next();
        System.out.println("\nCPF: ");
        String cpf = input.next();
        System.out.println("\nIdade: ");
        int idade = input.nextInt();
        System.out.println("\nNível de dor: \n1 - Sem dor\n2 - Dor leve\n3 - Dor moderada\n4 - Dor intensa\n5 - Dor insuportável\n");
        int nivelDor = input.nextInt();
        Paciente paciente = new Paciente(nome, cpf, idade, nivelDor, "", 0, 0);
        System.out.println("Paciente cadastrado com sucesso.");
        return paciente;
    }

    public static void cadastrarMedico(){
        System.out.println("\nNome: ");
        String nome = input.next();
        System.out.println("\nCPF: ");
        String cpf = input.next();
        System.out.println("\nCRM: ");
        int crm = input.nextInt();
        Medico medico = new Medico(nome, cpf, crm);
        arrayMedicos.add(medico);
        System.out.println("Médico cadastrado com sucesso.");
        operacoes();
    }

    public static void triagem(Paciente paciente) {
        if (!arrayMedicos.isEmpty()){
            paciente = cadastrarPaciente();
            if (paciente.getNivelDor() <= 3) {
                try {
                    System.out.println("\nPaciente encaminhado para a medição.");
                    System.out.println("\nPressão: ");
                    String pressao = input.next();
                    System.out.println("\nAltura: ");
                    float altura = input.nextFloat();
                    System.out.println("\nPeso: ");
                    float peso = input.nextFloat();
                    paciente.setPressao(pressao);
                    paciente.setAltura(altura);
                    paciente.setPeso(peso);
                } catch (Exception e) {
                    System.out.println("Erro ao cadastrar paciente.");
                } finally {
                    consulta(paciente, getRandomMedico());
                }
            } else {
                consulta(paciente, getRandomMedico());
            }
        } else {
            System.out.println("Não há médicos disponíveis.");
            System.out.println("Cadastre um médico para continuar.");
        }
        arrayPacientes.add(paciente);
        operacoes();
    }
    public static void consulta(Paciente paciente, Medico medico) {
        System.out.println("Consulta realizada com sucesso.");
        arrayPacientes.remove(paciente);
    }

    public static void excluirPaciente() {
        System.out.println("Digite o CPF do paciente que deseja excluir: ");
        String cpf = input.next();
        for (Paciente paciente : arrayPacientes) {
            if (paciente.getCpf().equals(cpf)) {
                arrayPacientes.remove(paciente);
                System.out.println("Paciente removido com sucesso.");
                break;
            }
        }
    }

    public static void atualizarPaciente() {
        System.out.println("\nDigite o CPF do paciente que deseja atualizar: ");
        String cpf = input.next();
        for (Paciente paciente : arrayPacientes) {
            if (paciente.getCpf().equals(cpf)) {
                System.out.println("\nDigite o novo nome: ");
                String nome = input.next();
                System.out.println("\nDigite a nova idade: ");
                int idade = input.nextInt();
                System.out.println("\nDigite o novo nível de dor: ");
                int nivelDor = input.nextInt();
                paciente.setNome(nome);
                paciente.setIdade(idade);
                paciente.setNivelDor(nivelDor);
                System.out.println("\nPaciente atualizado com sucesso.");
                operacoes();
            } else{
                System.out.println("Paciente não encontrado.");
            }
        }
        operacoes();
    }

    public static Medico getRandomMedico() {
        return arrayMedicos.get((int) (Math.random() * arrayMedicos.size()));
    }

    public static void listar(){
        System.out.println("Pacientes: ");
        for (Paciente paciente : arrayPacientes) {
            System.out.println("Nome: " + paciente.getNome() + " | CPF: " + paciente.getCpf() + " | Idade: " + paciente.getIdade() + " | Nível de dor: " + paciente.getNivelDor());
        }
        System.out.println("Médicos: ");
        for (Medico medico : arrayMedicos) {
            System.out.println("Nome: " + medico.getNome() + " | CPF: " + medico.getCpf() + " | CRM: " + medico.getCrm());
        }

        operacoes();
    }


}
