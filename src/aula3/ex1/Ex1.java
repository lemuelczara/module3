package aula3.ex1;

import java.util.*;

public class Ex1 {
    public static void main(String[] args) {
        /* Precedentes - Pessoa */
        Precedente p1 = new Pessoa("Zemuel", "487.569.278-19");
        Precedente p2 = new Pessoa("Yabriel", "133.982.391-88");
        Precedente p3 = new Pessoa("Aaria", "291.389.909-12");

        List<Precedente> grupoPessoa = new ArrayList<Precedente>();
        grupoPessoa.add(p1);
        grupoPessoa.add(p2);
        grupoPessoa.add(p3);

        Precedente<Pessoa> pessoas[] = SortUtil.sort(grupoPessoa.toArray(new Precedente[0]));

        Arrays.stream(pessoas).forEach(System.out::println);

        Precedente c1 = new Celular("997876822", "Lemuel");
        Precedente c2 = new Celular("912344321", "Pedro");
        Precedente c3 = new Celular("963456789", "João");

        /* Precedentes - Celular */
        List<Precedente> grupoCelular = new ArrayList<Precedente>();
        grupoCelular.add(c1);
        grupoCelular.add(c2);
        grupoCelular.add(c3);

        Precedente<Celular> celulares[] = SortUtil.sort(grupoCelular.toArray(new Precedente[0]));

        Arrays.stream(celulares).forEach(System.out::println);
    }
}
