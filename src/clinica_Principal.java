import java.util.Scanner;

public class clinica_Principal
{
    public static void main(String[] args)
    {
        Pacientes P1 = new Pacientes("Pedro", "Masculino" , "123123123", "10/10/2010", 1.80, 92.9, "Ativo");
        P1.exibirDadosPac();

        //Salvando paciente
        Arquivo arquivo = new Arquivo();
        arquivo.salvarPaciente(P1);

        System.out.println("------------------------------------------");

        //Input Nome
        Scanner inputNomePac = new Scanner(System.in);
        System.out.println("Digite o nome do Paciente: ");
        P1.setNomePac(inputNomePac.nextLine());

        //Input Sexo
        Scanner inputSexoPac = new Scanner(System.in);
        System.out.println("Digite o sexo do Paciente: ");
        P1.setSexoPac(inputSexoPac.nextLine());

        //Input CPF
        Scanner inputCPFPac = new Scanner(System.in);
        System.out.println("Digite o CPF do Paciente: ");
        P1.setCpfPac(inputCPFPac.nextLine());

        //Input Telefone
        Scanner inputTelefone = new Scanner(System.in);
        System.out.println("Digite o telefone do Paciente: ");
        P1.setTelefonePac(inputTelefone.nextLine());



        arquivo.salvarPaciente(P1);
        //Exibição atual
        P1.exibirDadosPac();

        //Exibição da classe Arquivo
        System.out.println("------------------------------------------");
        arquivo.lerPacientes(); // Apresentar pacientes armazenados
        //arquivo.excluirPaciente(""); // Excluir com base no número do cpf

    }
}
