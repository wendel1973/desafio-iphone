package interfaces;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{
    public void ligar(String numero) {
		System.out.println("LIGANDO PARA O NÚMERO "+numero);
		
	}

	public void atender() {
		System.out.println("ATENDENDO A LIGAÇÃO");
		
	}

	public void iniciarCorreioDeVoz() {
		System.out.println("INCICIANDO CORREIO DE VOZ.");
		
	}

	public void exibirPagina(String url) {
		System.out.println("EXBINDO PÁGINA DA INTERNET.");
		
	}

	public void adicionarNovaAba() {
		System.out.println("ADICIONANDO NOVA ABA AO NAVEGADOR.");
		
	}

	public void atualizarPagina() {
		System.out.println("ATUALIZANDO A PÁGINA...");
		
	}

	public void pausar() {
		System.out.println("PAUSANDO A MÚSICA");
		
	}


	public void selecionarMusica(String musica) {
		System.out.println("MÚSICA SELECIONADA "+musica);
		
	}
	public void tocar() {
		System.out.println("TOCANDO...");
		
	}

}
