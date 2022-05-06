import java.util.Scanner;

public class atividade01 {
	public static void main (String[]args) {
		int n1a10, calc;
		int n1 = 0;
		Scanner receba = new Scanner(System.in);
		
		while (n1 > -1) {
			System.out.println("Digite qualquer valor inteiro para descobrir sua tabuada (0 ao 10).");
			n1 = receba.nextInt();
			if(n1>= 0) {
				for (n1a10=1; n1a10 <=10; n1a10++) {
					calc = n1 * n1a10;
					System.out.println(calc);
				}
		}else {
			System.out.println("até mais");
			break;
		}
	}
	}
}
