//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Iphone iphone = new Iphone();

        iphone.ligar("98731235");
        iphone.iniciarCorreioVoz();

        iphone.selecionarMusica("Generica");

        iphone.exibirPagina("www.google.com.br");

    }
}