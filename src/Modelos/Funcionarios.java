//Cadastro de funcionario
package Modelos;
public class Funcionarios extends Pessoa {
private String cargo;
private int senha; 

    public Funcionarios(String cargo, int senha, String nome, String cpf, String contato, int idade, String sexo) {
        super(nome, cpf, contato, idade, sexo);
        this.cargo = cargo;
        this.senha = senha;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

}
