import apps.Internet;
import apps.Musica;
import apps.Telefone;

public class Iphone {
    public static void main(String[] args) {
        Musica musica = new Musica();
        Telefone telefone = new Telefone();
        Internet internet = new Internet();
        
        musica.tocar();
        musica.pausar();
        musica.setSelecionarMusica("Sertanejo");
        System.out.println("Música selecionada: " + musica.getSelecionarMusica());

        telefone.setLigar(962395454);
        System.out.println("Chamando o número: " + telefone.getLigar());
        telefone.atender();
        telefone.iniciarCorreioVoz();

        internet.setExibirPagina("dio.me");
        System.out.println("Acessando o site: " + internet.getExibirPagina());
        internet.adicionarNovaAba();
        internet.atualizarPagina();
    }
}
