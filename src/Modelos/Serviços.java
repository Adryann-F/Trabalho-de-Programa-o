package Modelos;
public class Serviços {
private int id;
private String descrição;
private float valor;
    public Serviços(int id, String descrição, float valor) {
        this.id = id;
        this.descrição = descrição;
        this.valor = valor;
    }
    public int getId(){
        return id;
    }
    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

}
