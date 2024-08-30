package desafio.projeto.poo.dio;

import desafio.projeto.poo.dio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Cursos curso1 = new Cursos();
        curso1.setTitulo("Inicialização Java");
        curso1.setDescricao("Introdução a linguagem Java");
        curso1.setCargaHoraria(5);
        curso1.setXp(20d);

        System.out.println(curso1);

        Cursos curso2 = new Cursos();
        curso2.setTitulo("Desenvolvimento SQL");
        curso2.setDescricao("Contrução de banco de dados usado SQL");
        curso2.setCargaHoraria(10);
        curso2.setXp(50d);

        System.out.println(curso2);

        Mentorias mentoria1 = new Mentorias();
        mentoria1.setTitulo("Mentoria de introdução");
        mentoria1.setDescricao("Desenvolver o intendimento basíco");
        mentoria1.setDataMentoria(LocalDate.now());

        System.out.println(mentoria1);


        Bootcamp camp1 = new Bootcamp();
        camp1.setNome("");
        camp1.setDescricao("");
        camp1.getConteudos().add(curso1);
        camp1.getConteudos().add(curso2);
        camp1.getConteudos().add(mentoria1);

        System.out.println(camp1);


        Devs devTina = new Devs();
        devTina.setNome("Tina");
        devTina.inscreverBootcamp(camp1);
        devTina.concluirCurso();
        System.out.println("--");
        System.out.println("Conteúdo inscritos Tina: " + devTina.getConteudosInscritos());
        System.out.println("Conteúdo concluidos Tina: " + devTina.getConteudosConcluidos());
        System.out.println("XP: " + devTina.culculorXpTotal());
    }
}
