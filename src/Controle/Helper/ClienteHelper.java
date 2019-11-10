package Controle.Helper;

import Modelos.Cliente;
import Modelos.DAO.ClienteDAO;
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
       view.getjTextFieldPesquisarClienteCPF().setText(null);
       view.getjTextFieldPesquisarClienteNome().setText(null);
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

    public Cliente pesquisarCLiente() {
        //pegar nome e cpf
       String cpf = view.getjTextFieldPesquisarClienteCPF().getText();
       String nome = view.getjTextFieldPesquisarClienteNome().getText();
       //salvar em um objeto
       Cliente cliente = new Cliente(nome, cpf, "", 0);
       ArrayList<Cliente> clientes = new ClienteDAO().selectAll();
       //comparar e retornar o cliente
       cliente = compararClientes(clientes , cliente);
        return cliente;
    }
    
    private Cliente compararClientes(ArrayList<Cliente> clientes, Cliente cliente) {
        for (Cliente cliente1 : clientes) {
            if((view.getjTextFieldPesquisarClienteNome().getText() == null ? cliente1.getNome() == null : view.getjTextFieldPesquisarClienteNome().getText().equals(cliente1.getNome())) || 
                    (view.getjTextFieldPesquisarClienteCPF().getText() == null ? cliente1.getCpf() == null : view.getjTextFieldPesquisarClienteCPF().getText().equals(cliente1.getCpf()))){
            return cliente1;
            }}
            view.exibeMensagem("Dados incoerentes");
        return cliente;      
        }
   
    public void mostrarClienteTabela(Cliente cliente) {
      //Pegar o conteudo da tabela
      DefaultTableModel tabelaModelo= (DefaultTableModel) view.getjTabelaClientes().getModel();
      tabelaModelo.setNumRows(0);
      tabelaModelo.addRow(new Object[]{
               cliente.getNome(),
               cliente.getContato(),
               cliente.getCpf(),
               cliente.getIdade(),
               cliente.getSexo()

      });
      
      
    }

}
