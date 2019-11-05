
package Controle;

import Programa.TelaLogin;

public class ControleLogin {
    //toda tela de login deve iniciar por aqui
    private final TelaLogin view;
    public ControleLogin(TelaLogin view) {
        this.view = view;
    } 
    public void entradadosistema(){
    //pegar o usuario, pesquisar no banco, sverificar os dados
    
    }
    public void tarefas(){
        System.out.println("Busca concluida!!");
        this.view.exibeMensagem("Bem vindo");
    }
}
