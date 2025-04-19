package app;

import interfaces.Iphone;

public class IphoneUsuario {
    public static void main(String[] args) {
		Iphone iphone = new Iphone();
		
		iphone.tocar();
		iphone.selecionarMusica("hino");
		iphone.atender();
		iphone.iniciarCorreioDeVoz();
		
		iphone.ligar("123456");
		
		iphone.exibirPagina("www.dio.com.br");
		iphone.atualizarPagina();
		iphone.adicionarNovaAba();
		System.out.println("------------------");
		System.out.println("OPERAÇÕES SANSUNG");
		Samsung samsung = new Samsung();
		samsung.ligar("98765433");
		samsung.atender();
		samsung.iniciarCorreioDeVoz();
	}


}
