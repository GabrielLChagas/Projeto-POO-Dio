package desafio.projeto.poo.dio.dominio;

import java.time.LocalDate;

public class Mentorias extends Conteudos {

    private String titulo;
    private String descricao;
    private LocalDate dataMentoria;

    public String getTitulo() {
        return titulo;}

    public void setTitulo(String titulo) {
        this.titulo = titulo;}
    public String getDescricao() {
        return descricao;}

    public void setDescricao(String descricao) {
        this.descricao = descricao;}
    public LocalDate getDataMentoria() {
        return dataMentoria;}

    public void setDataMentoria(LocalDate dataMentoria) {
        this.dataMentoria = dataMentoria;}
    @Override
    public String toString() {
        return "{" +
                "titulo:'" + titulo + '\'' +
                ", descricao:'" + descricao + '\'' +
                ", dataMentoria:" + dataMentoria +
                "}\n";
    }

    @Override
    public double calcularXP() {
        return 0;
    }
}