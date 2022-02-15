import java.util.Scanner;

public class javaProjectVoto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int gas = 0;
		int etanol = 0;
		int diesel = 0;
		
		System.out.println("VOTE");
		System.out.println("PRODUTO DE SUA PREFERENCIA : ");
		System.out.println("====================================================: ");
		System.out.println("TECLE: [1]GASOLINA, [2]ETANOL, [3]DIESEL e [4]FINALIZAR.");
		System.out.println("====================================================: ");

		int tipo = sc.nextInt();

		while (tipo != 4) {
			switch (tipo) {
			case 1:
				gas += + 1;
				System.out.print("CONTINUAR VOTANDO? [4]FINALIZAR : ");
				tipo = sc.nextInt();

				break;
			case 2:
				etanol += + 1;
				System.out.print("CONTINUAR VOTANDO? [4]FINALIZAR : ");
				tipo = sc.nextInt();
				break;
			case 3:
				diesel += + 1;
				System.out.print("CONTINUAR VOTANDO? [4]FINALIZAR : ");
				tipo = sc.nextInt();
				break;
			default:
				System.out.println("* NUMERO INVALIDO. *");
				System.out.print("CONTINUAR VOTANDO? [4]FINALIZAR : ");
				tipo = sc.nextInt();

				break;
			}
		}
		System.out.println("==========================");
		System.out.println("       OBRIGADO! ");
		System.out.println("==========================");
		System.out.println("RESULTADO DOS SEUS VOTOS: ");
		System.out.println();
		System.out.println("GASOLINA: " + gas);
		System.out.println("ETANOL: " + etanol);
		System.out.println("DIESEL: " + diesel);

		sc.close();
	}
}