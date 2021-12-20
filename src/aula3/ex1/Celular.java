package aula3.ex1;

public class Celular implements Precedente<Celular> {
    private String numero;
    private String proprietario;

    public Celular(String numero, String proprietario) {
        this.numero = numero;
        this.proprietario = proprietario;
    }

    public String getNumero() {
        return this.numero;
    }

    @Override
    public int precedeA(Celular celular) {
        return this.numero.toLowerCase().compareTo(celular.getNumero().toLowerCase());
    }

    @Override
    public String toString() {
        return "Celular{" +
                "numero='" + this.numero + '\'' +
                ", proprietario='" + this.proprietario + '\'' +
                '}';
    }
}
