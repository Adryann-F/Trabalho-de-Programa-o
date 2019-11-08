package Controle;


import Programa.CadastroCliente;
import Programa.CadastroFuncionarios;
import Programa.TelaAgendamento;
import Programa.TelaPrincipal;
public class ControleTelaPrincipal {
    private final TelaPrincipal view;
    //Para criar um menu principal é necessario criar uma Tela view!!
    public ControleTelaPrincipal(TelaPrincipal view) {
        this.view = view;
    }

    public ControleTelaPrincipal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void irParaCadastroCliente(){
    CadastroCliente Ccliente = new CadastroCliente();
    Ccliente.setVisible(true);
    this.view.dispose();
    }
    public void irParaAgendamento(){
    TelaAgendamento agendar = new TelaAgendamento();
    agendar.setVisible(true);
    this.view.dispose();
    }
    public void irParaFuncionarios(){
    CadastroFuncionarios funcionario = new CadastroFuncionarios();
    funcionario.setVisible(true);
    this.view.dispose(); 
    }
}
