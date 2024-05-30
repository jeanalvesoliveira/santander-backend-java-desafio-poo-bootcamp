package br.com.jean.desafio.main;

import br.com.jean.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Conteudo curso1 = new Curso("Javascript Básico", "Desc 01", 10);
        Conteudo curso2 = new Curso("Java Básico", "Desc 02", 20);
        Conteudo curso3 = new Curso("PHP Básico", "Desc 03", 15);

        System.out.println("-------- CURSOS -------");
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(curso3);
        System.out.println("-----------------------");
        System.out.println();


        Conteudo ment1 = new Mentoria("Java", "DescM1", LocalDate.now());
        Conteudo ment2 = new Mentoria("Javascript", "DescM2", LocalDate.now());
        Conteudo ment3 = new Mentoria("PHP", "DescM3", LocalDate.now());

        System.out.println("------ MENTORIAS ------");
        System.out.println(ment1);
        System.out.println(ment2);
        System.out.println(ment3);
        System.out.println("-----------------------");
        System.out.println();


        Bootcamp bootcamp = new Bootcamp("Bootcamp1", "DescBoot1");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso3);
        bootcamp.getConteudos().add(ment1);
        bootcamp.getConteudos().add(ment2);

        Dev dev1 = new Dev("Dev1");
        Dev dev2 = new Dev("Dev2");


        dev1.inscreverBootcamp(bootcamp);
        dev2.inscreverBootcamp(bootcamp);

        System.out.println(bootcamp);

        System.out.println(dev1.calcularTotalXp());
        dev1.progredir();
        System.out.println(dev1.calcularTotalXp());

        System.out.println(bootcamp);
    }
}
