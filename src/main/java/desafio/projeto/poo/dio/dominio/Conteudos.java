package desafio.projeto.poo.dio.dominio;

public abstract class Conteudos {

    private static final double xP = 10d;
    private String titulo;
    private String descricao;

    public abstract double calcularXP();

    public String getTitulo() {
        return titulo;}
    public void setTitulo(String titulo) {
        this.titulo = titulo;}

    public String getDescricao() {
        return descricao;}
    public void setDescricao(String descricao) {
        this.descricao = descricao;}
}
