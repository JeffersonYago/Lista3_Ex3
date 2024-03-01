package main;

import javax.swing.JOptionPane;

import controller.InverterController;

public class Principal {

	public static void main(String[] args) {
		InverterController inv = new InverterController();
		String palavra = JOptionPane.showInputDialog("insira uma palavra");
		int tamanho = palavra.length()-1;
		System.out.println(inv.Inverter(palavra, tamanho));
	}
	}

