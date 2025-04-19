package app;

import interfaces.AparelhoTelefonico;

public class Samsung implements AparelhoTelefonico{
    @Override
	public void ligar(String numero) {
		System.out.println("LIGANDO DO SAMSUNG PARA O NÚMERO "+numero);
		
	}

	@Override
	public void atender() {
		System.out.println("SAMSUNG ATENDENDO LIGAÇÃO");
		
	}

	@Override
	public void iniciarCorreioDeVoz() {
		System.out.println("SAMSUNG INICIANDO CORREIO DE VOZ...");
		
	}

}
