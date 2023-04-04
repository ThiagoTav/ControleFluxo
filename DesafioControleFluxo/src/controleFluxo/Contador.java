package controleFluxo;
import java.util.Scanner;

public class Contador {
	
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		} catch (ParametrosInvalidosException e) {
			System.err.println(e.getMessage());
		} catch (ArithmeticException e) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
		}
		
	}
	
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroDois < parametroUm) {
			throw new ParametrosInvalidosException(2);
		}
		
		
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
		for(int i = parametroUm; i < parametroDois; i++){
			 if(i == parametroDois - 1){
			        System.out.print(i);
			    } else {
			        System.out.print(i + ", ");
			    }
		}
		System.out.print(".");
	}
}
