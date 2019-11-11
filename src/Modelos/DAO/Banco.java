
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
    public static ArrayList<Funcionarios> usuariosuper;
    
    public static void inicia(){
    
        //Instanciar os objetos
        usuario = new ArrayList<>();
        cliente = new ArrayList<>();
        servico = new ArrayList<>();
        agendamento = new ArrayList<>();
        
        //criando funcionaios
        Funcionarios usuario1 = new Funcionarios("Victo", "64857945948", "9923683049", 34, "Rua Santa Maria c400", "M", "Segurança", "0123 49302 3222", 1500.00);                                               
        Funcionarios usuario2 = new Funcionarios("Ana", "949347567023", "9891447839", 37, "Rua das Flores c1025", "F", "Supervisora", "0343 64897 7896", 2500.49);
        Funcionarios usuario3 = new Funcionarios("Clara", "40659962730", "9881939485", 21, "Rua São Jose c254", "F", "Secretaria", "9643 46845 5792", 2124.99);
        
        
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
        usuario.add(usuario1);
        usuario.add(usuario2);
        usuario.add(usuario3);
        
        
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
    public static void BancoInicial(){
        usuariosuper = new ArrayList<>();

        Funcionarios usuario0 = new Funcionarios("super", null, null, 0, null, null, "Super Usuario", "admin"); 
        
        usuariosuper.add(usuario0);
    }
    
}
