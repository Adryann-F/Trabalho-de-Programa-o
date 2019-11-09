
package Controle.Helper;

import Modelos.Funcionarios;
import Programa.TelaLogin;
//controlar a interação das telas
public class LoginHelper implements Helper{
    //tela login
    private final TelaLogin view;
//construtor
    public LoginHelper(TelaLogin view) {
        this.view = view;
    }
    @Override
    public Funcionarios obterModelo(){
      //pegar o usuario, pesquisar no banco, sverificar os dados
    String nome = view.getjTextUsuario().getText();
    String senha = view.getjSenha().getText();
    Funcionarios Usuario = new Funcionarios(nome, "", "", 00, null, null, null, senha);
    return Usuario;
    }
    //pegar as informações
    public void setarUsuario(Funcionarios Usuario){
    String nome =Usuario.getNome();
    String senha = Usuario.getSenha();
    view.getjTextUsuario().setText(nome);
    view.getjSenha().setText(senha);
    }
    //limpar  tela
    @Override
    public void limparTela(){
    view.getjTextUsuario().setText(null);
    view.getjSenha().setText(null);
    }
}
