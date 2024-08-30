package desafio.projeto.poo.dio.dominio;

public class Cursos extends Conteudos {


    private static double xp = 0d;
    private String titulo;
    private String descricao;
    private Integer cargaHoraria;

    public String getTitulo() {
        return titulo;}

    public void setTitulo(String titulo) {
        this.titulo = titulo;}
    public String getDescricao() {
        return descricao;}

    public void setDescricao(String descricao) {
        this.descricao = descricao;}
    public Integer getCargaHoraria() {
        return cargaHoraria;}

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;}

    public static double getXp() {
        return xp;}
    public void setXp(double xp) {
        Cursos.xp = xp;}


    @Override
    public String toString() {
        return "{" +
                "titulo:'" + titulo + '\'' +
                ", descricao:'" + descricao + '\'' +
                ", cargaHoraria:" + cargaHoraria +
                "}\n";
    }

    @Override
    public double calcularXP() {
        return xp += xpBase;
    }
}
