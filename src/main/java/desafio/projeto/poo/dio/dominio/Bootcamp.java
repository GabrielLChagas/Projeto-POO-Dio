package desafio.projeto.poo.dio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;


public class Bootcamp {

    private String nome;
    private String descricao;
    private String dataDeCriao;
    private final LocalDate dataInicio = LocalDate.now();
    private final LocalDate dataTermino = dataInicio.plusDays(30);
    private Set<Devs> devsInscritos = new HashSet<>();
//    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public String getNome() {
        return nome;}
    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public String getDataDeCriao() {
        return dataDeCriao;
    }
    public void setDataDeCriao(String dataDeCriao) {
        this.dataDeCriao = dataDeCriao;
    }


    public LocalDate getDataInicio() {
        return dataInicio;
    }


    public LocalDate getDataTermino() {
        return dataTermino;
    }


    public void setDevsInscritos(Set<Devs> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }


//    public Set<Conteudo> getConteudos() {
//        return conteudos;
//    }
//
//    public void setConteudos(Set<Conteudo> conteudos) {
//        this.conteudos = conteudos;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return  Objects.equals(nome, bootcamp.nome) &&
                Objects.equals(descricao, bootcamp.descricao) &&
                Objects.equals(dataInicio, bootcamp.dataInicio) &&
                Objects.equals(dataTermino, bootcamp.dataTermino) &&
                Objects.equals(devsInscritos, bootcamp.devsInscritos);
//               && Objects.equals((conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicio, dataTermino, devsInscritos);
    }
}