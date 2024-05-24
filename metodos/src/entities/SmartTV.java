package entities;

//Classe criada para exercitar o conceito de métodos

public class SmartTV {

	private boolean ligada;
	private int canal;
	private int volume;

	public SmartTV() {
	}

	public SmartTV(boolean ligada, int canal, int volume) {
		this.ligada = ligada;
		this.canal = canal;
		this.volume = volume;
	}

	public boolean isLigada() {
		return ligada;
	}

	public int getCanal() {
		return canal;
	}

	public int getVolume() {
		return volume;
	}

	public void ligar() {
		if (ligada == false) {
			ligada = true;
			System.out.println("Ligou a TV");
		} else {
			System.out.println("A Tv já está ligada");
		}
	}

	public void desligar() {
		if (ligada == true) {
			ligada = false;
			System.out.println("Desligou a TV");
		} else {
			System.out.println("A Tv já está desligada");
		}
	}

	public void aumentarVolume() {
		if (ligada == true) {
			if (volume < 100) {
				volume++;
			} else {
				System.out.println("O volume está no máximo");
			}
		} else {
			System.out.println("Ligue a Tv para modificar o volume");
		}
	}

	public void diminuirVolume() {
		if (ligada == true) {
			if (volume > 0) {
				volume--;
			} else {
				System.out.println("O volume está no mínimo");
			}
		} else {
			System.out.println("Ligue a Tv para modificar o volume");
		}
	}

	public void mudarCanal(int canalSelecionado) {
		if (ligada == true) {
			if (canalSelecionado == 1) {
				this.canal++;
				System.out.println("Novo canal: " + canal);
			} else if (canalSelecionado == -1) {
				this.canal--;
				System.out.println("Novo canal: " + canal);
			} else {
				this.canal = canalSelecionado;
				System.out.println("Novo canal: " + canal);
			}
		} else {
			System.out.println("Ligue a TV para moodificar o canal");
		}
	}

}
