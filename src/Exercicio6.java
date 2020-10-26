import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);

		System.out.print("Digite o valor A e B:");
		double a = ler.nextDouble();
		double b = ler.nextDouble();

		mcd mdc = new mcd();

		double resposta = mcd.mdc(a, b);
		String resultado = String.format("%.0f", resposta);
		System.out.println("O mdc entre os números informados é: " + resultado);

	}

}
