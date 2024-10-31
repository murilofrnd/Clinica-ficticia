import java.util.Scanner;

public class clinica_Principal
{
    public static void main(String[] args)
    {
        Pacientes P1 = new Pacientes("Pedro", "Masculino" , "123123123", "10/10/2010", 1.80, 92.9, "Ativo");
        P1.exibirDadosPac();
        System.out.println("------------------------------------------");

        //Input Nome
        Scanner inputNomePac = new Scanner(System.in);
        System.out.println("Digite o nome do Paciente: ");
        P1.setNomePac(inputNomePac.nextLine());

        //input Sexo
        Scanner inputSexoPac = new Scanner(System.in);
        System.out.println("Digite o sexo do Paciente: ");
        P1.setSexoPac(inputSexoPac.nextLine());

        //Input CPF
        Scanner inputCPFPac = new Scanner(System.in);
        System.out.println("Digite o CPF do Paciente: ");
        P1.setCpfPac(inputCPFPac.nextLine());

        //Exibição
        P1.exibirDadosPac();


    }
}
