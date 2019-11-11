/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle.Helper;

import Modelos.DAO.FuncionarioDAO;
import Modelos.Funcionarios;
import Programa.CadastroFuncionarios;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Adryann
 */
public class FuncionarioHelper implements Helper{
       private final CadastroFuncionarios view;

    public FuncionarioHelper(CadastroFuncionarios view) {
        this.view = view;
    }
       
    @Override
    public Funcionarios obterModelo() {
        //buscas funcinarios para salvar
      String nome = view.getjTextFieldNomeFuncio().getText();
      String cpf = view.getjTextFieldCPFFuncio().getText();
      String  contato = view.getjTextFieldContFuncio().getText();
      String cargo = view.getjTextFieldCargoFuncio().getText();
      String endereco = view.getjLabelFuncionarioEndereco().getText();
      String  sexo = view.getjTextFieldFuncionarioSexo().getText();
      String senha = view.getjTextFieldContaFuncio().getText();
      String Ssalario = view.getjTextFieldSalarioFuncio().getText();
      //conversão de salario
      double salario = Double.parseDouble(Ssalario);
      String Sidade = view.getjTextFieldIdadeFuncio().getText();
      //conversão de idade
      int idade = Integer.parseInt(Sidade);
      Funcionarios funcionario = new Funcionarios(nome, cpf, contato, idade, senha, sexo, cargo, senha, salario);  
        return funcionario;
    }

    @Override
    public void limparTela() {
       view.getjLabelFuncionarioEndereco().setText(null);
       view.getjTextFieldFuncionarioSexo().setText(null);
       view.getjTextFieldCPFFuncio().setText(null);
       view.getjTextFieldCargoFuncio().setText(null);
       view.getjTextFieldContFuncio().setText(null);
       view.getjTextFieldContaFuncio().setText(null);
       view.getjTextFieldIdadeFuncio().setText(null);
       view.getjTextFieldNomeFuncio().setText(null);
       view.getjTextFieldSalarioFuncio().setText(null);
       view.getjTextFieldPesquisarFuncionarioCPF().setText(null);
       view.getjTextFieldPesquisarFuncionarioNome().setText(null);
    }

    public void preencherTabela(ArrayList<Funcionarios> funcionarios) {
        //pegar conteudo
        DefaultTableModel tabelaModelo = (DefaultTableModel) view.getjTableFuncionarios().getModel();
        tabelaModelo.setNumRows(0);
        //Percorrer a lista
        for (Funcionarios funcionario: funcionarios) {
            tabelaModelo.addRow(new Object[]{
            funcionario.getNome(), 
            funcionario.getCpf(),
            funcionario.getContato(),
            funcionario.getCargo(),
            funcionario.getIdade(),
            funcionario.getSalario(),
            funcionario.getSenha()
            });
                
        }
    }

    public Funcionarios pesquisarFuncionario() {
        //pegar nome e cpf da view
        String nome = view.getjTextFieldPesquisarFuncionarioNome().getText();
        String cpf = view.getjTextFieldPesquisarFuncionarioCPF().getText();
        //salvar em um objeto 
        Funcionarios funcionario = new Funcionarios(nome, cpf, null, 0, null, null, null, null);
        ArrayList<Funcionarios> funcionarios = new FuncionarioDAO().selectAll();
        funcionario = compararFuncionarios(funcionarios, funcionario);
           return funcionario;
    }

    private Funcionarios compararFuncionarios(ArrayList<Funcionarios> funcionarios, Funcionarios funcionario) {
        for (Funcionarios funcionario1 : funcionarios) {
if(view.getjTextFieldPesquisarFuncionarioNome().getText() == null ? funcionario1.getNome() == null : view.getjTextFieldPesquisarFuncionarioNome().getText().equals(funcionario1.getNome()) ||
 (view.getjTextFieldPesquisarFuncionarioCPF().getText() == null ? funcionario1.getCpf() == null : view.getjTextFieldPesquisarFuncionarioCPF().getText().equals(funcionario1.getCpf()))){
            return funcionario1;
            }
        }
         view.exibeMensagem("Funcionario não encontrado");
           return funcionario;
    }

    public void mostrarFuncionarioTabela(Funcionarios funcionario) {
        DefaultTableModel tabelaModelo = (DefaultTableModel) view.getjTableFuncionarios().getModel();
        tabelaModelo.setNumRows(0);
        tabelaModelo.addRow(new Object[]{
            funcionario.getNome(),
            funcionario.getCpf(),
            funcionario.getContato(),
            funcionario.getCargo(),
            funcionario.getIdade(),
            funcionario.getSalario()
        });    
    }
    
   


    
}
