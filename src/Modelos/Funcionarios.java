//Cadastro de funcionario
package Modelos;
public class Funcionarios extends Pessoa {
    String End;
    float salario;
    
    public Funcionarios( String nome, String cpf, String contato, int idade, String End, String sexo, String cargo, String senha) {
        super(nome, cpf, contato, idade, sexo, cargo, senha);
        this.End = End;
    }
    //funcionario para agendamentos
    public Funcionarios(String End, float salario, String nome, String cpf, String contato, int idade, String sexo, String cargo, String senha) {
        super(nome, cpf, contato, idade, sexo, cargo, senha);
        this.End = End;
        this.salario = salario;
    }
    
}
