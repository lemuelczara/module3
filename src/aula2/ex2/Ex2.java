package aula2.ex2;

import java.util.regex.Pattern;

public class Ex2 {
    public static void main(String[] args) {
        // Verficar se existe uma sequência de 4, 6 ou 8 números
        Pattern patternSenhaFraca = Pattern.compile("\\d{4}", Pattern.CASE_INSENSITIVE);
        Pattern patternSenhaMedia = Pattern.compile("\\d{6}", Pattern.CASE_INSENSITIVE);
        Pattern patternSenhaForte = Pattern.compile("\\d{8}", Pattern.CASE_INSENSITIVE);

        // pass
        SenhaFraca senhaFraca = new SenhaFraca(patternSenhaFraca);
        senhaFraca.setValue("8201");

        // failed
        SenhaMedia senhaMedia = new SenhaMedia(patternSenhaMedia);
        senhaMedia.setValue("18293");

        // failed
        SenhaForte senhaForte = new SenhaForte(patternSenhaForte);
        senhaForte.setValue("3325623");
    }
}
