package contaNotasMoedas;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Contador {

	public static void main(String[] args) {

		int nota200 = 0;
		int nota100 = 0;
		int nota50 = 0;
		int nota20 = 0;
		int nota10 = 0;
		int nota5 = 0;
		int nota2 = 0;

		int totalNotas = 0;
		
		int moedas100 = 0;
		int moedas050 = 0;
		int moedas025 = 0;
		int moedas010 = 0;
		int moedas005 = 0;
		int moedas001 = 0;
		
		int totalMoedas = 0;

		String valor = JOptionPane.showInputDialog("Digite o valor a ser separado:");

		double valorDinheiro = Double.parseDouble(valor);

		while (valorDinheiro >= 200) {

			valorDinheiro = valorDinheiro - 200;
			nota200++;
			totalNotas++;
		}

		while (valorDinheiro >= 100) {

			valorDinheiro = valorDinheiro - 100;
			nota100++;
			totalNotas++;
		}

		while (valorDinheiro >= 50) {

			valorDinheiro = valorDinheiro - 50;
			nota50++;
			totalNotas++;
		}

		while (valorDinheiro >= 20) {

			valorDinheiro = valorDinheiro - 20;
			nota20++;
			totalNotas++;
		}

		while (valorDinheiro >= 10) {

			valorDinheiro = valorDinheiro - 10;
			nota10++;
			totalNotas++;
		}
		
		while (valorDinheiro >= 5) {
			
			valorDinheiro = valorDinheiro - 5;
			nota5++;
			totalNotas++;
		}
		
		while (valorDinheiro >= 2) {
			
			valorDinheiro = valorDinheiro - 2;
			nota2++;
			totalNotas++;
		}
		
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja saber das moedas?");
		
		if (resposta == 0) {
			
			while (valorDinheiro >= 1) {
				valorDinheiro = valorDinheiro - 1;
				moedas100++;
				totalMoedas++;
			}
			
			while (valorDinheiro >= 0.50) {
				valorDinheiro = valorDinheiro - 0.50;
				moedas050++;
				totalMoedas++;
			}
			
			while (valorDinheiro >= 0.25) {
				valorDinheiro = valorDinheiro - 0.25;
				moedas025++;
				totalMoedas++;
			}
			
			while (valorDinheiro >= 0.10) {
				valorDinheiro = valorDinheiro - 0.10;
				moedas010++;
				totalMoedas++;
			}
			
			while (valorDinheiro >= 0.05) {
				valorDinheiro = valorDinheiro - 0.05;
				moedas005++;
				totalMoedas++;
			}
			
			while (valorDinheiro >= 0.01) {
				valorDinheiro = valorDinheiro - 0.01;
				moedas001++;
				totalMoedas++;
			}
			
			JOptionPane.showMessageDialog(null, "Usou um total de " + totalNotas + " notas e " + totalMoedas + 
					" moedas" + "\n" + nota200 + " notas de R$200,00" + "\n" + nota100 + " notas de R$100,00" + "\n" 
					+ nota50 + " notas de R$50,00" + "\n" + nota20 + " notas de R$20,00" + "\n" + nota10 
					+ " notas de R$10,00" + "\n" + nota5 + " notas de R$5,00" + "\n" + nota2 + " notas de R$2,00"
					+ "\n" + moedas100 + " moedas de R$1,00" + "\n" + moedas050 + " moedas de R$0,50" + "\n" 
					+ moedas025 + " moedas de R$0,25" + "\n" + moedas010 + " moedas de R$0,10" + "\n" 
					+ moedas005 + " moedas de R$0,05" + "\n" + moedas001 + " moedas de R$0,01");
			
		}else {
			
			DecimalFormat decimalFormat = new DecimalFormat("0.00");
			//declarando variavel pra receber valor com formato decimal de duas casa, declarada entre parenteses
			String valorDindin = decimalFormat.format(valorDinheiro);
			//declarando como "STRING" apenas para exibição e não para cálculos
			
			JOptionPane.showMessageDialog(null, "Você optou por não contar as moedas!" + "\n" 
			+ "O total de notas foi de " + totalNotas + "\n"+ nota200 + " notas de R$200,00" + "\n" + nota100 
			+ " notas de R$100,00" + "\n" + nota50 + " notas de R$50,00" + "\n" + nota20 
			+ " notas de R$20,00" + "\n" + nota10 + " notas de R$10,00" + "\n" + nota5 + " notas de R$5,00" 
			+ "\n" + nota2 + " notas de R$2,00" + "\n" + " e sobraram R$" + valorDindin + " em moedas." );
			
		}
		
	}

}
