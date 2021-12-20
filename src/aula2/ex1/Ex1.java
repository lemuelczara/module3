package aula2.ex1;

import java.time.LocalDate;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println("School Management");

        Turma primeiroColegial = new Turma();

        Disciplina[] disciplinas = new Disciplina[3];
        for (int i = 0; i < disciplinas.length; i++) {
            Disciplina d = new Disciplina();
            d.setNome("Disciplina " + i);

            disciplinas[i] = d;
        }

        Estudante[] estudantes = new Estudante[2];
        for (int i = 0; i < estudantes.length; i++) {
            Estudante e = new Estudante();
            e.setNumeroMatricula(i);
            e.setName("Estudante " + i);
            e.setDataDeNascimento(LocalDate.now());
            estudantes[i] = e;
        }

        primeiroColegial.setEstudantes(estudantes);
        primeiroColegial.setDisciplinas(disciplinas);

        System.out.println(primeiroColegial.getDisciplinas()[2].getNome());
        System.out.println(primeiroColegial.getEstudantes()[1].getName());
    }
}
