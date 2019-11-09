/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle.Helper;

import Modelos.Funcionarios;
import Programa.CadastroFuncionarios;

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
    public Object obterModelo() {
        //buscas funcinarios para salvar
      String nome = view.getjTextFieldNomeFuncio().getText();
      String cpf = view.getjTextFieldCPFFuncio().getText();
      String  contato = view.getjTextFieldContFuncio().getText();
      String cargo = view.getjTextFieldCargoFuncio().getText();
      String endereco = view.getjLabelFuncionarioEnd().getText();
      String  sexo = view.getjLabelFuncionarioSexo().getText();
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
        throw new UnsupportedOperationException("Not supported yet."); 
//To change body of generated methods, choose Tools | Templates.
    }
    
}
