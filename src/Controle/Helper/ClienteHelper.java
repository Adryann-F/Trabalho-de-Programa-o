package Controle.Helper;

import Modelos.Cliente;
import Programa.CadastroCliente;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Adryann
 */
public class ClienteHelper implements Helper{
    private final CadastroCliente view;

    public ClienteHelper(CadastroCliente view) {
       this.view = view;
    }

    @Override
    public Cliente obterModelo() {
       // buscar os clientes para salvar
    String Snome = view.getjTextFieldNomeCliente().getText();
    String Scpf = view.getjTextFieldCPFCliente().getText();
    String Scontato = view.getjTextFieldContatoCliente().getText();
    String iidade = view.getIdadeCliente().getText();
    //converter para int
    int idade = Integer.parseUnsignedInt(iidade);
    String Ssexo = view.getjTextFieldClienteSexo().getText();
    Cliente cliente = new Cliente(Snome, Scpf, Scontato, idade, Ssexo);
        return cliente;
    }
    @Override
     public void limparTela() {
       view.getjTextFieldNomeCliente().setText(null);
       view.getjTextFieldCPFCliente().setText(null);
       view.getjTextFieldContatoCliente().setText(null);
       view.getIdadeCliente().setText(null);
       view.getjTextFieldClienteSexo().setText(null);   
    }

    public void preencherTabela(ArrayList<Cliente> clientes) {
      //Pegar o conteudo da tabela
      DefaultTableModel tabelaModelo= (DefaultTableModel) view.getjTabelaClientes().getModel();
      tabelaModelo.setNumRows(0);
        //Percorrer a lista e preencher
        for (Cliente cliente : clientes) {
            //Cada linha da tabela é um objeto por isso add novo objeto a linha
            tabelaModelo.addRow(new Object[]{
               cliente.getNome(),
               cliente.getCpf(),
               cliente.getContato(),
               cliente.getIdade(),
               cliente.getSexo()
            });
        }
    }
}
