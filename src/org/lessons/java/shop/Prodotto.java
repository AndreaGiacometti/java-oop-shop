package org.lessons.java.shop;

import java.util.Random;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Prodotto {
	
//	Un prodotto è caratterizzato da: - codice (numero intero) - nome - descrizione - prezzo - iva
	private long codice;
	private String nome;
	private String descrizione;
	private double prezzo;
	private double iva;
	
	public Prodotto (int codice, String nome, String descrizione, double prezzo, double iva) {
		this.codice = generaCodice();
		this.setNome(nome);
		this.setDescrizione(descrizione);
		this.setPrezzo(prezzo);
		this.setIva(iva);
	}

	private long generaCodice() {
		Random rand = new Random();
		return rand.nextInt(10000000);
	}
	
//	GETTER CODICE
	public long getCodice() {
		return this.codice;
	}
	

//	GETTER E SETTER DI NOME
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

//	GETTER E SETTER DI DESCRIZIONE
	public String getDescrizione() {
		return this.descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

//	GETTER E SETTER DI PREZZO
	public double getPrezzo() {
		return this.prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

//	GETTER E SETTER DI IVA
	public double getIva() {
		return this.iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
	}
	
	private double calcoloIva() {
		return this.prezzo + (this.prezzo * this.iva);
	}
	
	public double getPrezzoIvato() {
		BigDecimal bigDecimal = BigDecimal.valueOf(calcoloIva());
	    BigDecimal rounded = bigDecimal.setScale(2, RoundingMode.HALF_UP);
		return rounded.doubleValue();
	}
	
	public String nomeProdotto() {
		return this.nome + " - " + this.descrizione;
	}
	
}	


