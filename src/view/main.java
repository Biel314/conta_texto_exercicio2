package view;

import java.util.Scanner;
import controller.TextoController;

// Fazer uma aplicação Java em Eclipse que tenha uma operação que se permita entrar com um
// texto, conforme exemplo abaixo, por Scanner ou JOptionPane, divida o texto em partes, com
// split e exiba quantas partes aquele texto tem. A aplicação deve ter uma classe de controle
// com métodos para operações e uma classe de visão que instancie a classe de controle para
// a comunicação, A resposta da tarefa deve ser o print do console com as quantidades.

public class main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		TextoController textoController = new TextoController();
		
		System.out.println("Digite uma lista de alguma coisa separadas por ( ; ) e sem espaço"
				+ "\nExemplo: [acelga;alface;alho-poró;coentro;endívia;escarola;repolho;rúcula;agrião]\n");
		System.out.print("Sua frase: ");
		String phrase = in.next();
		
		textoController.contaTexto(phrase);
	}

}
