package Controle;


import Programa.CadastroCliente;
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
    
}
