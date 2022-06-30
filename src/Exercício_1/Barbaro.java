package Exercício_1;

import java.util.ArrayList;
import java.util.List;

public class Barbaro extends Personagem {
	
	private List<String> habilidades = new ArrayList<>();
	
	public Barbaro(String nome) {
		super(nome);
		setVida(1000);
		setInteligencia(15);
		setForca(50);
		
	}
	
	public Barbaro(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
		super(nome, vida, mana, xp, inteligencia, forca, level);
	}
	public List<String> getHabilidades11() {
		System.out.printf("(%s) Habilidades aprendidas: %s\n", getNome(), habilidades);
		return habilidades;
	}
	public List<String> getHabilidades1() {
		System.out.printf("(%s) Habilidades aprendidas: %s\n", getNome(), habilidades);
		return habilidades;
	}
	public void lvlUp() {
		setForca(getVida() + 20);
		setForca(getForca() + 20);
		super.lvlUp();
	}
	public void lvlUp1() {
		setForca(getVida() + 20);
		setForca(getForca() + 20);
		super.lvlUp();
	}
	public void aprenderHabilidade(String habilidade) {
		this.habilidades.add(habilidade);
	}


	public int getForca() {
		
		return 0;
	}

	public int getVida() {
		
		return 0;
	}


	public void setForca(int i) {
		
		
	}


	public void setInteligencia(int i) {
		
		
	}


	


	public static void main(String[] args) {
		

	}


	public List<String> getHabilidades() {
		return habilidades;
	}


	public void setHabilidades(List<String> habilidades) {
		this.habilidades = habilidades;
	}

}
