package Controle;

 
import Controle.Helper.LoginHelper;
import Modelos.Funcionarios;
import Programa.TelaLogin;

public class ControleLogin {
    //toda tela de login deve iniciar por aqui
    private final TelaLogin view;
    private LoginHelper helpe;
    public ControleLogin(TelaLogin view) {
        this.view = view;
        this.helpe = new LoginHelper(view);

    } 
    public void entradadosistema(){
        //pegar ususario
        Funcionarios funcionario = helpe.obterUsuario();
        
    }
    public void tarefas(){
        System.out.println("Busca concluida!!");
        this.view.exibeMensagem("Bem vindo");
    }
}
