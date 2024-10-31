/*
    Autor: Murilo Fernandes
    Data: 29/10/2024
    Descrição: Cadastro de pacientes em uma clínica
*/

import br.com.caelum.stella.validation.CPFValidator;

public class Pacientes
{
    //Defining Variables
    private String nomePac;
    private String sexoPac;
    private String dataNascPac;
    private String cpfPac;
    private int telefonePac;
    private String emailPac;
    private double alturaPac;
    private double pesoPac;
    private String statusPac;

    //----------------------------------------------------------------//

    //Simple Construct
    public Pacientes()
    {
        System.out.println("Paciente Criado!");
        System.out.println("Sem valores atribuidos.");
    }

    //Essencial Construct
    public Pacientes(String nomePac, String sexoPac, String cpfPac,String dataNascPac, double alturaPac, double pesoPac, String statusPac)
    {
        this.nomePac = nomePac;
        this.sexoPac = sexoPac;
        this.cpfPac = cpfPac;
        this.dataNascPac = dataNascPac;
        this.alturaPac = alturaPac;
        this.pesoPac = pesoPac;
        this.statusPac = statusPac;
        System.out.println("Paciente Criado!");
        System.out.println("Valores atribuidos ao paciente: " + this.nomePac);
    }

    //----------------------------------------------------------------//

    //Getters of the pacient infos
    public String getNomePac() {
        return nomePac;
    }
    public String getSexoPac() {
        return sexoPac;
    }
    public String getDataNascPac() {
        return dataNascPac;
    }
    public String getCpfPac() {
        return cpfPac;
    }
    public int getTelefonePac() {
        return telefonePac;
    }
    public String getEmailPac() {
        return emailPac;
    }
    public double getAlturaPac() {
        return alturaPac;
    }
    public double getPesoPac() {
        return pesoPac;
    }
    public String getStatusPac() {
        return statusPac;
    }

    //----------------------------------------------------------------//

    //Setters of the pacient infos

    //setting nome with verifications
    public String setNomePac(String newNomePac) {
        if(newNomePac.matches("[a-zA-Z]*")) {

            this.nomePac = newNomePac.substring(0, 1).toUpperCase() +
                    newNomePac.substring(1).toLowerCase();
            return nomePac;
        } else {
            System.out.println("Dados inconsistentes. Corrija os erros e tente novamente. Nome informado: " + newNomePac);
            return null;
        }
    }
    //setting sexo with verifications
    public String setSexoPac(String newSexoPac) {
        newSexoPac = newSexoPac.substring(0, 1).toUpperCase() +
                newSexoPac.substring(1).toLowerCase();
        if (newSexoPac.equals("Masculino") ||
            newSexoPac.equals("Feminino") ||
            newSexoPac.equals("Outros")) {
            this.sexoPac = newSexoPac;
            System.out.println("Sexo " + sexoPac + " informado com sucesso.");
            return newSexoPac;
        }else{
            System.out.println("Dados inconsistentes. Corrija os erros e tente novamente. Os Sexos disponíveis são: Masculino, Feminino e Outros");
            return sexoPac;
        }
    }
    public String setDataNascPac(String newDataNascPac) {
        this.dataNascPac = newDataNascPac;
        return newDataNascPac;
    }
    public String setCpfPac(String newCpfPac) {
        if (newCpfPac.matches("\\d{11}")) {
            this.cpfPac = newCpfPac;
            return newCpfPac;
        } else {
            System.out.println("Dados inconsistentes. Corrija os erros e tente novamente.");
            return null;
        }
    }
    public int setTelefonePac(int newTelefonePac) {
        this.telefonePac = newTelefonePac;
        return newTelefonePac;
    }
    public String setEmailPac(String newEmailPac) {
        this.emailPac = newEmailPac;
        return newEmailPac;
    }
    public double setAlturaPac(double newAlturaPac) {
        this.alturaPac = newAlturaPac;
        return newAlturaPac;
    }
    public double setPesoPac(double newPesoPac) {
        this.pesoPac = newPesoPac;
        return newPesoPac;
    }
    public String setStatusPac(String newStatusPac) {
        this.statusPac = newStatusPac;
        return newStatusPac;
    }

    //----------------------------------------------------------------//

    //Displaying Data
    public void exibirDadosPac()
    {
        System.out.println("Nome: " + this.nomePac);
        System.out.println("Sexo: " + sexoPac);
        System.out.println("CPF: " + this.cpfPac);
        System.out.println("Data de Nascimento: " + this.dataNascPac);
        System.out.println("Altura: " + this.alturaPac);
        System.out.println("Peso: " + this.pesoPac);
        System.out.println("Status: " + this.statusPac);

        //Verificate if optional values are empty
        if (this.telefonePac != 0){
            System.out.println("Telefone: " + telefonePac);
        }
        if (this.emailPac != null){
            System.out.println("Email: " + emailPac);
        }

    }
}
