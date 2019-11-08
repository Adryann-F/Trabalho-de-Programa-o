package Modelos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Agendamento {
    private int id;
    private Cliente cliente;
    private Serviços serviço;
    private float valor;
    private Date data;
    private String observacao;

    public Agendamento(int id, Cliente cliente, Serviços serviço, float valor, String data) {
        this.id = id;
        this.cliente = cliente;
        this.serviço = serviço;
        this.valor = valor;
        try {
            this.data = new SimpleDateFormat("dd/MM/yyyy").parse(data);
        } catch (ParseException ex) {
            Logger.getLogger(Agendamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Agendamento(int id, Cliente cliente, Serviços serviço, float valor, Date data, String observacao) {
        this.id = id;
        this.cliente = cliente;
        this.serviço = serviço;
        this.valor = valor;
        this.data = data;
        this.observacao = observacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Serviços getServiço() {
        return serviço;
    }

    public void setServiço(Serviços serviço) {
        this.serviço = serviço;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }
    public String getDataFormatada(){
        
    return  new SimpleDateFormat("dd/MM/yyyy").format(data);
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
    
}

