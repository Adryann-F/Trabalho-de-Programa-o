//Testes dos comandos!!
package Programa;
//IMportação da classe serviços
import Modelos.Agendamento;
import Modelos.Cliente;
import Modelos.Funcionarios;
import Modelos.Serviços;
public class Testes {
public static void main(String[]args){
Serviços clientes = new Serviços(1,"serviço", 12);
Cliente c = new Cliente("Adryann", "60484472305","991551020", 18);
Funcionarios f = new Funcionarios("Cargo",1234 , "nome", "cpf", "contato", 18,"Sexo");
    System.out.println(c);
    System.out.println(f);
 Agendamento age = new Agendamento(12, c, clientes, 15, "02/11/2019");
    System.out.println(age.getCliente().getNome());
    System.out.println(age.getData());
}    
}
