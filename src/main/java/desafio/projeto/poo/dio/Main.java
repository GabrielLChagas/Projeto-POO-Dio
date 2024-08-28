package desafio.projeto.poo.dio;

import desafio.projeto.poo.dio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Cursos curso1 = new Cursos();
        curso1.setTitulo("Inicialização Java");
        curso1.setDescricao("Introdução a linguagem Java");
        curso1.setCargaHoraria(5);

        System.out.println(curso1);

        Cursos curso2 = new Cursos();
        curso2.setTitulo("Desenvolvimento SQL");
        curso2.setDescricao("Contrução de banco de dados usado SQL");
        curso2.setCargaHoraria(10);

        System.out.println(curso2);

        Mentorias mentoria1 = new Mentorias();
        mentoria1.setTitulo("");
        mentoria1.setDescricao("");
        mentoria1.setDataMentoria(LocalDate.now());

        System.out.println(mentoria1);
    }
}
