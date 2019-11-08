
package Controle.Helper;

import Modelos.Agendamento;
import Modelos.Cliente;
import Modelos.Serviços;
import Programa.TelaAgendamento;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Adryann
 */
public class AgendamentoHelper {
    private final TelaAgendamento view;

    public AgendamentoHelper(TelaAgendamento view) {
        this.view = view;
    }
        //preencher a tabela da TelaAgendamento
    public void preencherTabela(ArrayList<Agendamento> agendamentos) {
        //Pegar o conteudo da tabela
      DefaultTableModel tabelaModelo= (DefaultTableModel) view.getTabeladeAgendamentos().getModel();
      tabelaModelo.setNumRows(0);
        //Percorrer a lista e preencher
        for (Agendamento agendamento : agendamentos) {
            //Cada linha da tabela é um objeto por isso add novo objeto a linha
            tabelaModelo.addRow(new Object[]{
            agendamento.getId(),
            agendamento.getCliente().getNome(),
            agendamento.getServiço().getDescrição(),
            agendamento.getValor(),
            agendamento.getDataFormatada(),
            agendamento.getObservacao()
            });
        }
    }
    //preencher a clientes da TelaAgendamento
    public void preencherClientes(ArrayList<Cliente> clientes){
    DefaultComboBoxModel comboClientes = (DefaultComboBoxModel) view.getjComboBoxCliente().getModel();
        for (Cliente cliente : clientes) {
            comboClientes.addElement(cliente);
        }
    }
    //preencher a serviços da TelaAgendamento
    public void preencherServicos(ArrayList<Serviços> servicos){
    DefaultComboBoxModel comboServicos = (DefaultComboBoxModel) view.getjComboBoxservico().getModel();
        for (Serviços servico : servicos) {
          comboServicos.addElement(servico);
        }
    }
}
