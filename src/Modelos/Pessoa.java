//Classe mãe
package Modelos;

abstract public  class Pessoa {
   protected String nome;
   protected String cpf;
   protected String contato;
   protected int idade;
   protected String sexo;
   //Metodo para criar pessoa 1
  public Pessoa(String nome, String cpf, String contato, int idade, String sexo) {
        this.nome = nome;
        this.cpf = cpf;
        this.contato = contato;
        this.idade = idade;
        this.sexo = sexo;
    }
//Metodo para criar pessoa 2 (sem sexo)
    public Pessoa(String nome, String cpf, String contato, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.contato = contato;
        this.idade = idade;
    }

    public String getNome() {
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
   
}
