package Controle;

 
import Controle.Helper.LoginHelper;
import Modelos.DAO.FuncionarioDAO;
import Modelos.Funcionarios;
import Programa.TelaLogin;
import Programa.TelaPrincipal;

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
        Funcionarios funcionario = helpe.obterModelo();
        //Pesquisa de ususarios
        FuncionarioDAO userDAO = new FuncionarioDAO();
        Funcionarios funcionarioautenticado = userDAO.selectPorNomeESenha(funcionario);
        if(funcionarioautenticado != null){
            //abrir menu
            TelaPrincipal menu = new TelaPrincipal();
            //mostrar menu
            menu.setVisible(true);
            //remover tela de login
            this.view.dispose();
            //dizer quem fez o login
            System.out.println(funcionario.getNome()+" fez login!!");
        }else{
        view.exibeMensagem("Usuario ou senha invalidos");
        //avisar quem tentou fazer o login
        System.out.println(funcionario.getNome()+" tentou fazer login!!");
        }
    }
    public void tarefas(){
        System.out.println("Busca concluida!!");
        this.view.exibeMensagem("Bem vindo");
    }
}
