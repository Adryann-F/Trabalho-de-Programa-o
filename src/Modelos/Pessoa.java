//Classe mãe
package Modelos;

 public abstract class Pessoa {
   protected String nome;
   protected String cpf;
   protected String contato;
   protected int idade;
   protected String sexo;
   private String cargo;
    private String senha;
   //Metodo para criar funcionario
    public Pessoa(String nome, String cpf, String contato, int idade, String sexo, String cargo, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.contato = contato;
        this.idade = idade;
        this.sexo = sexo;
        this.cargo = cargo;
        this.senha = senha;
    }
//Metodo para criar cliente
    public Pessoa(String nome, String cpf, String contato, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.contato = contato;
        this.idade = idade;
    }

    public Pessoa(String nome, String cpf, String contato, int idade, String sexo) {
        this.nome = nome;
        this.cpf = cpf;
        this.contato = contato;
        this.idade = idade;
        this.sexo = sexo;
    }
    

    public  String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

   
   
}
