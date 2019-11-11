package Modelos.DAO;

import Modelos.Funcionarios;
import java.util.ArrayList;

public class FuncionarioDAO {
    
    /**
     * Insere um usuario dentro do banco de dados
     * @param usuario exige que seja passado um objeto do tipo usuario
     */
    public void inserir(Funcionarios usuario){
        Banco.usuario.add(usuario);
        Banco.usuariosuper.add(usuario);
    }
    
     // Atualiza um Objeto no banco de dados
    public boolean atualizarDados(Funcionarios usuario){
        
        for (int i = 0; i < Banco.usuario.size(); i++) {
            if(idSaoIguais(Banco.usuario.get(i),usuario)){
                Banco.usuario.set(i, usuario);
                return true;
            }
        }
        return false;      
    }
    
     // Deleta um objeto do banco de dados pelo id do usuario passado
    public boolean deletar(Funcionarios usuario){
        for (Funcionarios usuarioLista : Banco.usuario) {
            if(idSaoIguais(usuarioLista,usuario)){
                Banco.usuario.remove(usuarioLista);
                return true;
            }
        }
        return false;
    }
    
     // Retorna um arraylist com todos os usuarios do banco de dados
    public ArrayList<Funcionarios> selectAll(){
        return Banco.usuario;
    }
   
     // Retorna um Objeto do tipo usuario se a funcao encontrar o usuario passado como parâmetro no banco, para considerar sao usado nome e senha
    public Funcionarios selectPorNomeESenha(Funcionarios usuario){
        for (Funcionarios usuarioLista : Banco.usuariosuper) {
            if(nomeESenhaSaoIguais(usuarioLista,usuario)){
                return usuarioLista;
            }
        }
        return null;
    }

     // Recebe dois objetos e verifica se são iguais verificando o nome e senha
    private boolean nomeESenhaSaoIguais(Funcionarios usuario, Funcionarios usuarioAPesquisar) {
        return usuario.getNome().equals(usuarioAPesquisar.getNome()) && usuario.getSenha().equals(usuarioAPesquisar.getSenha());
    }

     // Compara se dois objetos tem a propriedade id igual
    private boolean idSaoIguais(Funcionarios usuario, Funcionarios usuarioAComparar) {
        return (usuario.getCpf() == null ? usuarioAComparar.getCpf() == null : usuario.getCpf().equals(usuarioAComparar.getCpf()));
    }
 
}
