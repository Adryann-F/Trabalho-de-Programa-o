package Controle;

import Controle.Helper.FuncionarioHelper;
import Modelos.DAO.FuncionarioDAO;
import Modelos.Funcionarios;
import Programa.CadastroFuncionarios;
import java.util.ArrayList;

/**
 *
 * @author Adryann
 */
public class ControleFuncionario {
        private final FuncionarioHelper helper;
        private final CadastroFuncionarios view;

    public ControleFuncionario(CadastroFuncionarios view) {
        this.view = view;
        this.helper = new FuncionarioHelper(view);
    }

    public void atualizaTabela() {
        //buscar lista
       FuncionarioDAO funcionarioD = new FuncionarioDAO();
        ArrayList<Funcionarios> funcionarios = funcionarioD.selectAll();
        //mostrar lista
       helper.preencherTabela(funcionarios);
       
    }

    public void novo() {
        helper.limparTela();
    }

    public void salvar() {
        //pegar funcionario
     Funcionarios funcionario = helper.obterModelo();
        //salvar funcionario
        new FuncionarioDAO().inserir(funcionario);
        //atualizar a tabela
        atualizaTabela();
        helper.limparTela();
    }

    public void deletarFuncionario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    
    
}
