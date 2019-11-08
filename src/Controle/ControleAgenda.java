package Controle;

import Controle.Helper.AgendamentoHelper;
import Modelos.Agendamento;
import Modelos.Cliente;
import Modelos.DAO.AgendamentoDAO;
import Modelos.DAO.ClienteDAO;
import Modelos.DAO.ServicoDAO;
import Modelos.Serviços;
import Programa.TelaAgendamento;
import java.util.ArrayList;
/**
 *
 * @author Adryann
 */
public class ControleAgenda {
    private final AgendamentoHelper helper;
    private final TelaAgendamento view;
    public ControleAgenda(TelaAgendamento view) {
        this.view = view;
        //Passar a view como parametro 
        this.helper = new AgendamentoHelper(view);
    }
    
    public void atualizaTabela(){
    //buscar lista
    AgendamentoDAO agendaD = new AgendamentoDAO();
        ArrayList<Agendamento> agendamentos = agendaD.selectAll();
     //Mostrar a lista
     helper.preencherTabela(agendamentos);
    }
    
    public void atualizaClientes(){
    //buscar clientes
    ClienteDAO clienteD = new ClienteDAO();
        ArrayList<Cliente> clientes = clienteD.selectAll();
    //Mostrar 
    helper.preencherClientes(clientes);
   
    }
    
    public void atualizaServiços(){
    //buscar serviços
    ServicoDAO servico = new ServicoDAO();
        ArrayList<Serviços> servicos = servico.selectAll();
     //Mostrar 
     helper.preencherServicos(servicos);
    }
}
