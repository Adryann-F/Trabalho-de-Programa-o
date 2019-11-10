/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle.Helper;

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
      float salario = Float.parseFloat(Ssalario);
      String Sidade = view.getjTextFieldIdadeFuncio().getText();
      //conversão de idade
      int idade = Integer.parseInt(Sidade);
      Funcionarios funcionario = new Funcionarios(senha, salario, nome, cpf, contato, idade, sexo, cargo, senha);  
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
    }

    public void preencherTabela(ArrayList<Funcionarios> funcionarios) {
        //pegar conteudo
        DefaultTableModel tabelaModelo = (DefaultTableModel) view.getjTableFuncionarios().getModel();
        tabelaModelo.setNumRows(0);
        //Percorrer a lista
        for (Funcionarios funcionario : funcionarios) {
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
    
}
