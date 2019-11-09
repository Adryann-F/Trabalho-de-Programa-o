
package Modelos.DAO;

import Modelos.Agendamento;
import Modelos.Cliente;
import Modelos.Serviços;
import Modelos.Funcionarios;
import java.util.ArrayList;

public class Banco {
    
    public static ArrayList<Funcionarios> usuario;
    public static ArrayList<Cliente> cliente;
    public static ArrayList<Serviços> servico;
    public static ArrayList<Agendamento> agendamento;
    
    
    public static void inicia(){
    
        //Instanciar os objetos
        usuario = new ArrayList<>();
        cliente = new ArrayList<>();
        servico = new ArrayList<>();
        agendamento = new ArrayList<>();
        
        //criando funcionaios
        Funcionarios usuario0 = new Funcionarios("super", null, null, 0, null, null, "Super Usuario", "admin");                                               
        
         //criar clientes
        Cliente cliente1 = new Cliente("Pedro", "605244334", "9988123454", 37, "M");
        Cliente cliente2 = new Cliente("Paula", "605534534", "998846537", 21, "F");
        Cliente cliente3 = new Cliente("JP", "607556556", "988155667", 19, "M");
        
        
        Serviços servico1 = new Serviços(1, "Pernoite", 20);
        Serviços servico2 = new Serviços(2, "Diaria", 30);
        Serviços servico3 = new Serviços(3, "Refeições", 15);
        Serviços servico4 = new Serviços(4, "Sala principal", 25);
        Serviços servico5 = new Serviços(5, "Café", 10);
        Serviços servico6 = new Serviços(6, "Camareira", 3);

         
        //Adiciona Elementos na lista
        usuario.add(usuario0);
        
        
        cliente.add(cliente1);
        cliente.add(cliente2);
        cliente.add(cliente3);
  
    
        
        servico.add(servico1);
        servico.add(servico2);
        servico.add(servico3);
        servico.add(servico4);
        servico.add(servico5);
        servico.add(servico6);
        
    
        
    }
    
    
}
