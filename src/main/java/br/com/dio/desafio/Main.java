package br.com.dio.desafio;

import br.com.dio.desafio.domain.Curso;
import br.com.dio.desafio.domain.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setTitulo("JAVA");
        curso.setDescricao("Descricao curso de java");
        curso.setCargaHoraria(6);

        Curso curso2 = new Curso();
        curso2.setTitulo("ANGULAR");
        curso2.setDescricao("Descricao curso de angular");
        curso2.setCargaHoraria(6);

        System.out.println(curso);
        System.out.println(curso2 + "\n");

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("ENSINO");
        mentoria.setDescricao("Ensino a EAD");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);
    }
}
