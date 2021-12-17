package aula2;

import java.time.LocalDate;

public class Disciplina {
    public String nome;
    public LocalDate cargaHoraria;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getCargaHoraria() {
        return this.cargaHoraria;
    }

    public void setCargaHoraria(LocalDate cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
