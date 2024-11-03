import java.util.Locale;
import java.util.Scanner;

public class clinica_Principal
{
    public static void main(String[] args)
    {
        Locale loc = new Locale("pt", "BR");

        Pacientes P1 = new Pacientes();
        P1.exibirDadosPac();

       //Saving patient
        Arquivo arquivo = new Arquivo();
        arquivo.salvarPaciente(P1);

        System.out.println("------------------------------------------");

        //Input Nome
        Scanner inputNomePac = new Scanner(System.in);
        System.out.println("Digite o nome do Paciente: ");
        P1.setNomePac(inputNomePac.nextLine());

        //Input Sexo
        Scanner inputSexoPac = new Scanner(System.in);
        System.out.println("Digite o sexo do Paciente (masculino, feminino ou outros): ");
        P1.setSexoPac(inputSexoPac.nextLine());

        //Input CPF
        Scanner inputCPFPac = new Scanner(System.in);
        System.out.println("Digite o CPF do Paciente (apenas números): ");
        P1.setCpfPac(inputCPFPac.nextLine());

        //Input Data Nascimento
        Scanner inputNascimento = new Scanner(System.in);
        System.out.println("Digite a data de nascimento do Paciente (DD/MM/YYYY): ");
        P1.setDataNascPac(inputNascimento.nextLine());

        //Input Telefone
        Scanner inputTelefone = new Scanner(System.in);
        System.out.println("Digite o telefone do Paciente (apenas números): ");
        P1.setTelefonePac(inputTelefone.nextLine());

        //Input Email
        Scanner inputEmail = new Scanner(System.in);
        System.out.println("Digite o email do Paciente: ");
        P1.setEmailPac(inputEmail.nextLine());

        //Input Altura
        Scanner inputAltura = new Scanner(System.in);
        System.out.println("Digite o altura do Paciente: ");
        P1.setAlturaPac(Double.parseDouble(inputAltura.nextLine()));

        //Input Peso
        Scanner inputPeso = new Scanner(System.in);
        System.out.println("Digite o peso do Paciente: ");
        P1.setPesoPac(Double.parseDouble(inputPeso.nextLine()));

        //Input Status do paciente
        Scanner inputStatus = new Scanner(System.in);
        System.out.println("Digite o status do Paciente (Ativo ou Inativo (A/I): ");
        P1.setStatusPac(inputStatus.nextLine());

        arquivo.salvarPaciente(P1);
        //Show now
        P1.exibirDadosPac();

        //Show Arquivo class
        System.out.println("------------------------------------------");
        arquivo.lerPacientes();
        //arquivo.excluirPaciente("null"); // Delete data using cpf

    }
}
