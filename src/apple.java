import java.util.Scanner;

public class apple {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		
		int N = 100; //Кількість школярів
		int K = 325; //Кількість яблук
		System.out.println("Кожному школяру дістанеться = " +K/N + " яблука");
		System.out.println("У кошику залишеться = " +K%N + " яблук" );
		
	}
}
