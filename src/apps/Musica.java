package apps;

public class Musica {
    public void tocar() {
        System.out.println("TOCANDO MÚSICA");
    }
 
    public void pausar() {
        System.out.println("PAUSANDO A MÚSICA");
    }

    private String selecionarMusica;
    
    public String getSelecionarMusica() {
        return selecionarMusica;
    }
    public void setSelecionarMusica(String musica) {
        this.selecionarMusica = musica;
    }

}
