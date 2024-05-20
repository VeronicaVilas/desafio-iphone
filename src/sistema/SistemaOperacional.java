package sistema;

import sistema.iphone.Iphone;

public class SistemaOperacional {
    public static void main(String[] args) {
        Iphone IPhone = new Iphone();

        IPhone.tocar();
        IPhone.pausar();
        IPhone.selecionarMusica("It's My Life - Bon Jovi");

        IPhone.ligar("+55 (71) 123456789");
        IPhone.atender();
        IPhone.iniciarCorreioVoz();

        IPhone.exibirPagina("www.exemplo.com/iphone");
        IPhone.adicionarNovaAba();
        IPhone.atualizarPagina();
    }
}
