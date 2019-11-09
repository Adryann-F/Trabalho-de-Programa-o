package Controle;
import Controle.Helper.ClienteHelper;
import Modelos.Cliente;
import Modelos.DAO.ClienteDAO;
import Programa.CadastroCliente;
import java.util.ArrayList;

public class ControleCCliente {
    public final ClienteHelper helper;
    public final CadastroCliente view;

    public ControleCCliente(CadastroCliente view) {
        this.view = view;
        //passar a view como paramentro
        this.helper = new ClienteHelper(view);
    }

    public void salvar() {
        //pegar o cliente
         Cliente cliente = helper.obterModelo();
         //salvar o cliente no banco
         new ClienteDAO().insert(cliente);
         atualizaTabela();
         helper.limparTela();
    }
   
     public void atualizaTabela(){
    //buscar lista
    ClienteDAO clienteD = new ClienteDAO();
        ArrayList<Cliente> clientes = clienteD.selectAll();
     //Mostrar a lista
     helper.preencherTabela(clientes);
    }
     
     //limpar tudo para se fazer um novo cadastro
     public void novo(){
     helper.limparTela();
     }
}
