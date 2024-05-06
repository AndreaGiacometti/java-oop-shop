package org.lessons.java.shop;

public class Main {

	public static void main(String[] args) {

		Prodotto prodotto1 = new Prodotto(0, "Lavatrice", "8KG, Classe A+++, Selezione automatica del programma di lavaggio ", 235.45, 0.22);
		 System.out.println("Codice: " + prodotto1.getCodice());
	        System.out.println("Nome: " + prodotto1.getNome());
	        System.out.println("Descrizione: " + prodotto1.getDescrizione());
	        System.out.println("Prezzo: " + prodotto1.getPrezzo() + "€");
	        System.out.println("IVA: " + prodotto1.getIva());     
	        System.out.println("Prezzo Ivato: " + prodotto1.getPrezzoIvato() + "€");
	        System.out.println("Nome esteso: " + prodotto1.nomeProdotto());
	        
	        System.out.println(" ");
	        
	        Prodotto prodotto2 = new Prodotto(0, "Iphone 15S", "Fotocamera 436 GPX, caffè espresso in ogni momento, massaggi ", 3456.00, 0.22);
			 System.out.println("Codice: " + prodotto2.getCodice());
		        System.out.println("Nome: " + prodotto2.getNome());
		        System.out.println("Descrizione: " + prodotto2.getDescrizione());
		        System.out.println("Prezzo: " + prodotto2.getPrezzo() + "€");
		        System.out.println("IVA: " + prodotto2.getIva());     
		        System.out.println("Prezzo Ivato: " + prodotto2.getPrezzoIvato() + "€");
		        System.out.println("Nome esteso: " + prodotto2.nomeProdotto());
	}

}
