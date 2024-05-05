package br.com.dio.desafio.view;

import br.com.dio.desafio.domain.*;

import java.time.LocalDate;

public class ExibirBootcmap {
    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setTitulo("JAVA");
        curso.setDescricao("Descricao curso de java");
        curso.setCargaHoraria(6);

        Curso curso2 = new Curso();
        curso2.setTitulo("ANGULAR");
        curso2.setDescricao("Descricao curso de angular");
        curso2.setCargaHoraria(6);


        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("ENSINO");
        mentoria.setDescricao("Ensino a EAD");
        mentoria.setData(LocalDate.now());



//        System.out.println(curso);
//        System.out.println(curso2 + "\n");
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("JAVA");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devGabriel = new Dev();
        devGabriel.setNome("Gabriel");
        devGabriel.inscreverBootcmap(bootcamp);

        System.out.println("Conteudos Inscritos " + devGabriel.getConteudosInscritos() + "]" );
        System.out.println("-");
        devGabriel.progredir();
        devGabriel.progredir();

        System.out.println("Conteudos Concluidos " + devGabriel.getConteudosConcluidos() + "]"  );
        System.out.println( "\n  [XP: " + devGabriel.calcularTotalXp() + "] \n");

        System.out.println("----------------");

        Dev devCamila = new Dev();
        devCamila.inscreverBootcmap(bootcamp);
        devCamila.setNome("Camila");
        System.out.println("Conteudos Inscritos " + devCamila.getConteudosInscritos()+ "]"  );
        System.out.println("-");

        devCamila.progredir();
        System.out.println("Conteudos Concluidos " + devCamila.getConteudosConcluidos()+ "]"  );
        System.out.println( "\n  [XP: " + devCamila.calcularTotalXp() + "] \n");
    }
}
