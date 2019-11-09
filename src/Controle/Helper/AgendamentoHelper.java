
package Controle.Helper;

import Modelos.Agendamento;
import Modelos.Cliente;
import Modelos.Serviços;
import Programa.TelaAgendamento;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Adryann
 */
public class AgendamentoHelper implements Helper{
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
    //Obter o valor dos serviços após escolher o serviço
    public Serviços obterServicos() {
       return (Serviços) view.getjComboBoxservico().getSelectedItem();
    }
        //Mostrar o valor dos servicos na Tela de agendamento
    public void mostrarValor(float valor) {
       view.getAValor().setText(valor+"");
//a string vazia é para poder permitir que o valor seja passado
    }
    public Cliente obterCliente() {
       return (Cliente) view.getjComboBoxCliente().getSelectedItem();
    }
    @Override
    public Agendamento obterModelo() {
        //buscar o modelo de agendamento para salvar
      //pegar id
     String idString =  view.getAId().getText();
     int id = Integer.parseInt(idString);
     //pegar cliente
     Cliente cliente = obterCliente();
     //pegar serviços
     Serviços serviço = obterServicos();
     //pegar valor 
     String vString = view.getAValor().getText();
     float valor = Float.parseFloat(vString);
     //pegar data
     String dataString = view.getAData().getText();
     SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yy");
       Date data = null;
        try {
            data = formatar.parse(dataString);
        } catch (ParseException ex) {
            Logger.getLogger(AgendamentoHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
     //pegar a observação
     String observacao = view.getAObservações().getText();
        Agendamento agendamento = new Agendamento(id, cliente, serviço, valor, data, observacao);
        return agendamento;
    }

    @Override
    public void limparTela() {
       view.getAId().setText(null);
       view.getAObservações().setText(null);
       view.getAData().setText(null);
       view.getAValor().setText(null);
       
        
    }
    
}
