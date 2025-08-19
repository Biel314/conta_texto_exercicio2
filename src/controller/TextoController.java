package controller;

public class TextoController {

	public TextoController() {
		super();
	}
	
	public void contaTexto(String phrase) {
		String[] arrWords = phrase.split(";");
		int f = arrWords.length;
		int i;
		
		System.out.println("\nSua frase divida é: ");
		for(i=0; i < f; i++) {
			System.out.print(arrWords[i] + " ");
		}
		
		System.out.println("\nA frase possui " + i + " palavras!");
	}

	
}
