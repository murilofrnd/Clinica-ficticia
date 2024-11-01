public class Mascara {

    public String aplicarMascara(String str, String mascara, char specialChar) {

        // Conta quantos caracteres especiais existem na máscara
        int maskChCount = mascara.length() - mascara.replaceAll("[^" + specialChar + "]", "").length();

        // Conta apenas os números
        int strChCount = str.length() - str.replaceAll("\\d", "").length();

        // Exceção caso a string nao tenha números suficientes para completar a máscara
        if (strChCount < maskChCount) {
            throw new IllegalArgumentException("O número de caractéres na string não pode ser menor que o " +
                    "número de caractéres especiais na máscara");
        }

        char[] maskChars = mascara.toCharArray();
        char[] strChars = str.toCharArray();

        // Itera por todos os elementos da máscara
        for (int i = 0, j = 0; i < maskChars.length && j < strChars.length; i++) {
            char ch = maskChars[i];
            char sh = strChars[j];

            if (ch == specialChar) {
                /* Se achou o caractere especial, buscar o próximo elemento aceito da String e
                 substituí-lo no local do caractere especial */
                while (!Character.toString(sh).matches("\\d")) {
                    j++;
                    sh = strChars[j];
                }
                maskChars[i] = sh;
                j++;
            }
        }

        return new String(maskChars);
    }
}