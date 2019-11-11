//Cadastro de funcionario
package Modelos;
public class Funcionarios extends Pessoa {
    String End;
    double salario;
    
    public Funcionarios( String nome, String cpf, String contato, int idade, String End, String sexo, String cargo, String senha) {
        super(nome, cpf, contato, idade, sexo, cargo, senha);
        this.End = End;
    }
    //funcionario para agendamentos
    public Funcionarios(String nome, String cpf, String contato, int idade, String End, String sexo, String cargo, String senha, double salario) {
        super(nome, cpf, contato, idade, sexo, cargo, senha);
        this.End = End;
        this.salario = salario;
    }

    public String getEnd() {
        return End;
    }

    public void setEnd(String End) {
        this.End = End;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
