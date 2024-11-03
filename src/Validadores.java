public class Validadores
{
        public boolean validarCpf(String cpf) {
                if (cpf == null || cpf.length() != 11) {
                    return false;
                }
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
        public boolean isValidEmailAddress(String email) {
            String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
            java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
            java.util.regex.Matcher m = p.matcher(email);
            return m.matches();
        }
}

