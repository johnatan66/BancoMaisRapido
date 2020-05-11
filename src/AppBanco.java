import java.util.HashMap;
import java.util.Scanner;
import model.conta;

public class AppBanco {
	public static void main(String args[]) {
		HashMap<Integer, conta> contas;
		Scanner teclado = new Scanner(System.in);
		
		//geradno as contas e adicionando no mapa
		
		contas = new HashMap<Integer, conta>();
		
		// gerando varias contas e inserindo no mapa de acordo com o numero da conta como criterio de identificacao
		for (int i = 1; i < 9; i++) {
			conta c = new conta("111.222.333-"+i+i, 10000+i, 1000+(i*100));
			
			contas.put(c.getNumeroConta(), c);
		}
		// como fazer pra recuperar?
		System.out.println("Digite o numero da conta para recuperar");
		int numero = teclado.nextInt();
		conta consulta = contas.get(numero);
		if(consulta == null) {
			System.out.println("Conta nao existente");
		}
		else {
			System.out.println(consulta.exibirInfo());
		}
	}

}
