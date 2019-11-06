
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
        
        //criando elementos
                                                       
        Funcionarios usuario1 = new Funcionarios("Ana", "30364033454", "986873546", 23, "F", "Atendente", "admin");
        Funcionarios usuario2 = new Funcionarios("João", "40480434544", "986373564", 24, "M", "Estagiario", "admin");
         //(String nome, String cpf, String contato, int idade, String sexo)
        Cliente cliente1 = new Cliente("Pedro", "605244334", "9988123454", 37, "M");
        Cliente cliente2 = new Cliente("Paula", "605534534", "998846537", 21, "F");
        Cliente cliente3 = new Cliente("JP", "607556556", "988155667", 19, "M");
        Cliente cliente4 = new Cliente("Clara", "6086556565", "981276245", 27, "F");
        Cliente cliente5 = new Cliente("Vitor", "60543022202", "992551020", 45, "M");
        Cliente cliente6 = new Cliente("Maria", "7049547392", "935346789", 40, "F");
        Cliente cliente7 = new Cliente("Sandra", "39394493934", "912211934", 35, "F");
        
        
        Serviços servico1 = new Serviços(1, "Pernoite", 18);
        Serviços servico2 = new Serviços(2, "Diaria", 30);
        Serviços servico3 = new Serviços(3, "Refeições", 15);
        Serviços servico4 = new Serviços(4, "Sala principal", 25);
        Serviços servico5 = new Serviços(5, "Café", 10);
        Serviços servico6 = new Serviços(6, "Camareira", 3);

        Agendamento agendamento1 = new Agendamento(1, cliente1, servico2, 30, "14/07/2020 09:30");
        Agendamento agendamento2 = new Agendamento(2, cliente3, servico4, 40, "14/07/2020 10:00");
        Agendamento agendamento3 = new Agendamento(3, cliente4, servico1, 18, "14/07/2020 10:30");
        
        //Adiciona Elementos na lista
        usuario.add(usuario1);
        usuario.add(usuario2);
        
        cliente.add(cliente1);
        cliente.add(cliente2);
        cliente.add(cliente3);
        cliente.add(cliente4);
        cliente.add(cliente5);
        cliente.add(cliente6);
        cliente.add(cliente7);
    
        
        servico.add(servico1);
        servico.add(servico2);
        servico.add(servico3);
        servico.add(servico4);
        servico.add(servico5);
        servico.add(servico6);
        
        agendamento.add(agendamento1);
        agendamento.add(agendamento2);
        agendamento.add(agendamento3);
        
    }
    
    
}
