package aula2.ex2;

import java.util.regex.Pattern;

public class Senha {
    public String value;
    public Pattern pattern;

    public Senha(Pattern pattern) {
        this.pattern = pattern;
    }

    public void setValue(String value) {
        try {
            if (pattern.matcher(value).find()) {
                this.value = value;
            } else {
                throw new Exception("Não foi possível validar a senha!");
            }
        } catch (Exception exception) {
            System.out.println(this.getClass().getName() + ": " + exception.getMessage());
        }
    }
}
