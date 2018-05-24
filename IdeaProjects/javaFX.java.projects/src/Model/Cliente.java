package Model;

import java.lang.*;
import java.util.ArrayList;

public abstract class Cliente extends Pessoa {

    private int qtdFilmes;
    private double credito;

    public Cliente(int qtdFilmes, double credito, String nome, int idade, String cpf, String dataAniv, Endereco endereco, String login, String senha) {
        super(nome,idade, cpf,dataAniv, endereco, login, senha);
        this.qtdFilmes = qtdFilmes;
        this.credito = credito;

    }

    public int getQtdFilmes() {
        return qtdFilmes;
    }

    public void setQtdFilmes(int qtdFilmes) {
        this.qtdFilmes = qtdFilmes;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public void compraCredito(double dinheiro){
        this.credito += dinheiro*(dinheiro/4);
    }

    public boolean cadastraCliente(Cliente cliente){
        //TODO TERMINAR DE IMPLEMENTAR METODO DE CADASTRAR CLIENTE
        getClientes().add(cliente);

        return true; //retorno provisório
    }
    public boolean removeCliente(Cliente cliente){
        //TODO TERMINAR DE IMPLEMENTAR METODO DE REMOVER CLIENTE
        getClientes().remove(cliente);

        return true; //retorno provisório
    }
    public boolean atualizaCliente(Cliente c, Cliente d){
        //TODO TERMINAR DE IMPLEMENTAR METODO DE ATUALIZAR CADASTRO DO CLIENTE

        getClientes().remove(c);
        getClientes().add(d);

        return true; //retorno provisório
    }
    public static ArrayList<Cliente> getClientes(){
        ArrayList<Cliente> clientes = new ArrayList<>();

        return clientes;
    }


}