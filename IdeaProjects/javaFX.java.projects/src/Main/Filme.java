package Main;

import Interface.Main;

public class Filme {

    private String titulo;
    private int duracao;
    private String dataLanc;
    private String sinopse;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getDataLanc() {
        return dataLanc;
    }

    public void setDataLanc(String dataLanc) {
        this.dataLanc = dataLanc;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }
}
