package Model;

public class ClienteComum extends Cliente {
    public ClienteComum(int qtdFilmes, double credito, String nome, int idade, String cpf, String dataAniv, Endereco endereco, String login, String senha) {
        super(qtdFilmes, credito, nome, idade, cpf, dataAniv, endereco, login, senha);
    }
    //TODO Pensar nas desvantagens de ser um Cliente Comum
}