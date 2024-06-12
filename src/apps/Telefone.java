package apps;

public class Telefone {
    private int ligar;

    public int getLigar() {
        return ligar;
    }
    public void setLigar(int numero) {
        this.ligar = numero;
    }

    public void atender() {
        System.out.println("ATENDENDO A LIGAÇÃO");
    }

    public void iniciarCorreioVoz() {
        System.out.println("OUVINDO AS GRAVAÇÕES DE VOZ");
    }

}
