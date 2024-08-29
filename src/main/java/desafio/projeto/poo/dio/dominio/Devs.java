package desafio.projeto.poo.dio.dominio;

import java.util.*;

public class Devs {

    public String nome;
    Set<Conteudos> conteudosInscritos = new LinkedHashSet<>();
    Set<Conteudos> conteudosConcluidos = new LinkedHashSet<>();


    public void inscreverBootcamp (Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void concluirCurso () {
        Optional<Conteudos> conteudos = this.conteudosInscritos.stream().findFirst();
        if (conteudos.isPresent()) {
            this.conteudosConcluidos.add(conteudos.get());
            this.conteudosInscritos.remove((conteudos.get()));
        } else {
            System.out.println("Voçê não esta matriculado em nenhum curso\n");}
    }

    public double culculorXpTotal() {
        Iterator<Conteudos> interator = this.conteudosConcluidos.iterator();
        double total = 0;
        while (interator.hasNext()){
            double next = interator.next().calcularXP();
            total += next;
        }
        return total;
    }

    public String getNome() {
        return nome;}
    public void setNome(String nome) {
        this.nome = nome;}

    public Set<Conteudos> getConteudosInscritos() {
        return conteudosInscritos;}
    public void setConteudosInscritos(Set<Conteudos> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;}

    public Set<Conteudos> getConteudosConcluidos() {
        return conteudosConcluidos;}
    public void setConteudosConcluidos(Set<Conteudos> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;}


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Devs devs = (Devs) o;
        return Objects.equals(nome, devs.nome) &&
                Objects.equals(conteudosInscritos, devs.conteudosInscritos) &&
                Objects.equals(conteudosConcluidos, devs.conteudosConcluidos);

    }
}