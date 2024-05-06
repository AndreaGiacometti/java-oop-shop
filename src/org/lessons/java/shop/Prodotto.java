package org.lessons.java.shop;

import java.util.Random;

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
		return codice;
	}
	

//	GETTER E SETTER DI NOME
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

//	GETTER E SETTER DI descrizione
	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

//	GETTER E SETTER DI PREZZO
	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

//	GETTER E SETTER DI IVA
	public double getIva() {
		return iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
	}
	
//	- alla creazione di un nuovo prodotto il codice sia valorizzato con un numero random 
//		con un metodo creaNuovoProdotto da usare all'interno del main mi verrà restituito un prodotto con codice random:
	
//	Il prodotto potrebbe essere creato chiedendo all'utente il nome di un prodotto che si vuole creare.
	
	
//	- il codice prodotto sia accessibile solo in lettura
//		per fare questo dovrò usare il metodo getter
//	- gli altri attributi siano accessibili sia in lettura che in scrittura
//		in questo caso dovrò invece usare un metodo setter
//	- il prodotto esponga un metodo per avere il prezzo base
		
//	- il prodotto esponga un metodo per avere il prezzo comprensivo di iva 
//	- il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome 
//	Nello stesso package aggiungete una classe Main con metodo main nella quale testate tutte le funzionalità della classe Prodotto.
}

