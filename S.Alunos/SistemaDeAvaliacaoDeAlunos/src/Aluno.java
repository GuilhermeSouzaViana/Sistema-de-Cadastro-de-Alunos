public class Aluno extends Pessoa{


    public Aluno(String nome, String cpf, String rg,String rgm,
                 Double exercicios,Double avaliacaoParcial, Double avaliacaoRegimental) {

        super(nome, cpf, rg);
        this.rgm=rgm;
        this.exercicios=exercicios;
        this.avaliacaoParcial=avaliacaoParcial;
        this.avaliacaoRegimental=avaliacaoRegimental;
    }

    public String getRgm() {
        return rgm;
    }

    public void setRgm(String rgm) {
        this.rgm = rgm;
    }

    public Double getExercicios() {
        return exercicios;
    }

    public void setExercicios(Double exercicios) {
        this.exercicios = exercicios;
    }

    public Double getAvaliacaoParcial() {
        return avaliacaoParcial;
    }

    public void setAvaliacaoParcial(Double avaliacaoParcial) {
        this.avaliacaoParcial = avaliacaoParcial;
    }

    public Double getAvaliacaoRegimental() {
        return avaliacaoRegimental;
    }

    public void setAvaliacaoRegimental(Double avaliacaoRegimental) {
        this.avaliacaoRegimental = avaliacaoRegimental;
    }

    String rgm;
   Double   exercicios;
    Double  avaliacaoParcial;
    Double  avaliacaoRegimental;

}
