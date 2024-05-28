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
                cadastrarPaciente();
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
}
