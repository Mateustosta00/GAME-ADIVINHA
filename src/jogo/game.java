package jogo;

import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class game {

	public static void main(String[] args) {

		PrintStream show = System.out;
		Random gerador = new Random();
		Scanner scan = new Scanner(System.in);
		int usuario = 0;
		int computador;
		int tentativas = 7;
		boolean acerto = false;

		show.println("EU irei escolher o número e você precisa adivinhar qual é. ");
		show.println("Qual o seu chute?");

		while (tentativas > 0 && acerto == false) {

			usuario = scan.nextInt();
			computador = gerador.nextInt(11);

			if (computador == usuario) {
				show.println("Acertou!");
				acerto = true;
			} else if (usuario < computador) {
				--tentativas;
				show.println("Errou! " + tentativas + " tentativas restantes");
			} else {
				--tentativas;
				System.out.println("Errou" + tentativas + "tentativas restantes");
			}
		}

	}
}
