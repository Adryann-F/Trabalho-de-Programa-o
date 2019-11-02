//Tests cadatro clientes
package Modelos;

public class Cliente extends Pessoa{
    public Cliente(String nome, String cpf, String contato, int idade, String sexo) {
        super(nome, cpf, contato, idade, sexo);
    }

    public Cliente(String nome, String cpf, String contato, int idade) {
        super(nome, cpf, contato, idade);
    }
   
   
}
