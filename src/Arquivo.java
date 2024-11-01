import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class Arquivo {
    private static final String FILE_NAME = "pacientes.txt";

    // Método para salvar dados de um paciente no arquivo
    public void salvarPaciente(Pacientes paciente) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write(paciente.getNomePac() + ";" + paciente.getCpfPac() + ";" + paciente.getSexoPac() + ";" + paciente.getDataNascPac() + ";" + paciente.getTelefonePac() + ";" + paciente.getEmailPac() + ";" + paciente.getAlturaPac() + ";" + paciente.getPesoPac() + ";" + paciente.getStatusPac() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//     Método para excluir dados de um paciente
    public void excluirPaciente(String cpf) {
        List<String> pacientes = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                if (!linha.contains(cpf)) {
                    pacientes.add(linha);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reescrever o arquivo sem o paciente excluído
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (String paciente : pacientes) {
                writer.write(paciente + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para ler todos os pacientes
    public void lerPacientes() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
