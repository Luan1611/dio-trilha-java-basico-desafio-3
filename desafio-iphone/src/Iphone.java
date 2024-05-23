public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("A música " + musica + " foi selecionada");

    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void tocar() {
        System.out.println("Música em execução");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Carregando a página da url " + url);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Chamada atendida");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }


}