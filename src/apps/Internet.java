package apps;

public class Internet {
    private String exibirPagina;

    public String getExibirPagina() {
        return exibirPagina;
    }
    public void setExibirPagina(String url) {
        this.exibirPagina = url;
    }

    public void adicionarNovaAba() {
        System.out.println("ABRINDO NOVA ABA");
    }

    public void atualizarPagina() {
        System.out.println("ATUALIZANDO A PÁGINA");
    }
}
