public class Hospital {

    public static void main(String[] args) {
        operacoes();
    }

    public static void operacoes() {

        System.out.println("----------------------------------");
        System.out.println("------SELECIONE UMA OPERAÇÃO------\n");
        System.out.println("|    1 - Cadastrar Paciente      |");
        System.out.println("|    2 - Remover Paciente        |");
        System.out.println("|    3 - Atualizar Paciente      |");
        System.out.println("|    4 - Cadastrar Médicos       |"); // Prox. Feature
        System.out.println("|    5 - Sair                    |");

        int opc = input.nextInt();
        switch(opc) {
            case 1:
                triagem(cadastrarPaciente());
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
            case 4:
                listar();
                break;
            case 5:
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
        Pessoa paciente = new Paciente(nome, cpf, idade, nivelDor, "", 0, 0);
        System.out.println("Paciente cadastrado com sucesso.");
        return (Paciente) paciente;
    }

    public static void triagem(Paciente paciente) {
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
                consulta();
            }
        } else {
            consulta();
        }
    }
}
