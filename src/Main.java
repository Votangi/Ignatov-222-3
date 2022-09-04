import java.util.Scanner;

public class Main {


	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Обчислення довжини гіпотенузи:" );
		System.out.println("Введіть перший катет трикутника");
		int a1 = sc.nextInt();

		System.out.println("Введіть другий катет трикутника");
		int b1 = sc.nextInt();

		System.out.println("Гіпотенуза = " + Math.sqrt(Math.pow(a1, 2)+Math.pow(b1, 2)));

		}

}
	
	
		 
		
		  
	





/*System.out.println("Введи число");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int sum = 0;
for (int i = 1; i <= n; i++) {
	  sum = sum + i;
}
System.out.println(sum);
0*/



	/*  Scanner sc = new Scanner(System.in);
	  System.out.println("1ая сторона");
	  if (sc.hasNextInt()) {
		  
		  
	  int a1 = sc.nextInt();
	  System.out.println("Введите меньше 1000");
	  }


	  System.out.println("2ая сторона");
	   int b1 = sc.nextInt();
	   
//  for (;a1<=1000;);
		 			   System.out.println(a1 + b1);
		 	*/