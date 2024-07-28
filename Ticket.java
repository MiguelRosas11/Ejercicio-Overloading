public class Ticket {
    private int dia;
    private int mes;
    private int ano;
    private int numero;

    public Ticket(int dia, int mes, int ano, int numero)
    {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.numero = numero;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public int getNumero() {
        return numero;
    }
}