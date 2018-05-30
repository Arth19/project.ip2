package Model.Interface;

import java.util.Date;

public interface Cliente {


    public abstract void setLimiteDeCredito();
    public abstract void setLimiteDeFilmes();
    public abstract void setLimiteDeTempo();


    public abstract int getQtdFilmes();

    public abstract void setQtdFilmes(int qtdFilmes);

    public abstract double getCredito();

    public abstract void setCredito(double credito);

    public abstract void compraCredito(double dinheiro);

    public abstract String getEmail();
    public abstract String getLogin();
    public abstract String getNome();
    public abstract Date getDataAniv();


}