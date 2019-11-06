
package Modelos.DAO;

import Modelos.Serviços;
import java.util.ArrayList;

public class ServicoDAO {
    
     // Insere um servico dentro do banco de dados
    public void insert(Serviços servico){
        Banco.servico.add(servico);
    }
    
  //Atualiza um Objeto no banco de dados
    public boolean update(Serviços servico){
        
        for (int i = 0; i < Banco.servico.size(); i++) {
            if(idSaoIguais(Banco.servico.get(i),servico)){
                Banco.servico.set(i, servico);
                return true;
            }
        }
        return false;      

    }
    
   //Deleta um objeto do banco de dados pelo id do servico passado
    public boolean delete(Serviços servico){
        for (Serviços servicoLista : Banco.servico) {
            if(idSaoIguais(servicoLista,servico)){
                Banco.servico.remove(servicoLista);
                return true;
            }
        }
        return false;
    }
    
    //Retorna um arraylist com todos os servicos do banco de dados
    public ArrayList<Serviços> selectAll(){
        return Banco.servico;
    }
    
    //Compara se dois objetos tem a propriedade id igual
    private boolean idSaoIguais(Serviços servico, Serviços servicoAComparar) {
        return servico.getId() ==  servicoAComparar.getId();
    }
    
}
