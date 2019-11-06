package Modelos.DAO;
import Modelos.Cliente;
import java.util.ArrayList;
public class ClienteDAO {
    
     // Insere um cliente dentro do banco de dados
    public void insert(Cliente cliente){
        Banco.cliente.add(cliente);
    }
    
     // Atualiza um Objeto no banco de dados
    public boolean update(Cliente cliente){
        
        for (int i = 0; i < Banco.cliente.size(); i++) {
            if(idSaoIguais(Banco.cliente.get(i),cliente)){
                Banco.cliente.set(i, cliente);
                return true;
            }
        }
        return false;     
    }
    
     // Deleta um objeto do banco de dados pelo id do cliente passado
    public boolean delete(Cliente cliente){
        for (Cliente clienteLista : Banco.cliente) {
            if(idSaoIguais(clienteLista,cliente)){
                Banco.cliente.remove(clienteLista);
                return true;
            }
        }
        return false;
    }
    
     // Retorna um arraylist com todos os clientes do banco de dados
    public ArrayList<Cliente> selectAll(){
        return Banco.cliente;
    }
    
     // Compara se dois objetos tem a propriedade id igual
    private boolean idSaoIguais(Cliente cliente, Cliente clienteAComparar) {
        return (cliente.getCpf() == null ? clienteAComparar.getCpf() == null : cliente.getCpf().equals(clienteAComparar.getCpf()));
    } 
}
