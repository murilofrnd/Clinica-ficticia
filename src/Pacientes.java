/*
    Autor: Murilo Fernandes
    Data: 29/10/2024
    Descrição: Cadastro de pacientes em uma clínica
*/

public class Pacientes
{
    //Defining Variables
    private String nomePac;
    private String sexoPac;
    private String dataNascPac;
    private String cpfPac;
    private String telefonePac;
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
    public String getTelefonePac() {
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
            throw new IllegalArgumentException("Dados inconsistentes. Corrija os erros e tente novamente.");
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
            throw new IllegalArgumentException("Dados inconsistentes. Corrija os erros e tente novamente.");
        }
    }

    //setting cpf with all the validations (amount of numbers and the last 2 validators)
    public String setCpfPac(String newCpfPac) {
        if (verificador(newCpfPac)) {
            this.cpfPac = newCpfPac;
            return newCpfPac;
        } else {
            throw new IllegalArgumentException("Dados inconsistentes. Corrija os erros e tente novamente.");
        }
    }

    public String setDataNascPac(String newDataNascPac) {
        this.dataNascPac = newDataNascPac;
        return newDataNascPac;
    }

    //boolean to verify the cpf
    private boolean verificador(String cpf) {
        // Calculate the first validator number
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += (10 - i) * (cpf.charAt(i) - '0');
        }
        int primeiroDigito = 11 - (soma % 11);
        if (primeiroDigito >= 10) primeiroDigito = 0;
        if (primeiroDigito != (cpf.charAt(9) - '0')) {
            return false; // First validator digit invalid
        }

        // Calculate the second validator number
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += (11 - i) * (cpf.charAt(i) - '0');
        }
        int segundoDigito = 11 - (soma % 11);
        if (segundoDigito >= 10) segundoDigito = 0;
        if (segundoDigito != (cpf.charAt(10) - '0')) {
            return false; // Second validator digit invalid
        }

        return true;
    }



    //setting phone with the correct format
    public String setTelefonePac(String newTelefonePac) {

        String str = newTelefonePac.replaceAll("[^\\d]", "");

        if (str.charAt(0) == '0') {
            if (str.charAt(1) == '0') {
                str = str.substring(2);
            } else {
                str = str.substring(1);
            }
        }
        // Apllying mask format
        Mascara mascara = new Mascara();
        String telefoneFormatado;
        switch (str.length()) {
            case 8:
                telefoneFormatado = mascara.aplicarMascara(str, "AAAA-AAAA", 'A');
                break;
            case 9:
                telefoneFormatado = mascara.aplicarMascara(str, "AAAAA-AAAA", 'A');
                break;
            case 10:
                telefoneFormatado = mascara.aplicarMascara(str, "(AA) AAAA-AAAA", 'A');
                break;
            case 11:
                telefoneFormatado = mascara.aplicarMascara(str, "(AA) AAAAA-AAAA", 'A');
                break;
            default:
                throw new IllegalArgumentException("Dados inconsistentes. Corrija os erros e tente novamente.");
        }
        this.telefonePac = telefoneFormatado;
        return telefoneFormatado;
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
        if (this.telefonePac != null){
            System.out.println("Telefone: " + telefonePac);
        }
        if (this.emailPac != null){
            System.out.println("Email: " + emailPac);
        }

    }
}
