import java.util.Scanner;

public class NextNumber {
	public static void main(String args[]) {
		
	//	int a = 1;
		System.out.println("Введіть число");
		Scanner sc = new Scanner(System.in);
		for (int b = sc.nextInt(); ; ) 
		if (b <= 10000 && b>0){
		System.out.println("The next number for the number " + Math.abs(b) + " is " + Math.abs(b+1));
		System.out.println("The next number for the number " + Math.abs(b) + " is " + Math.abs(b-1));
		break;
		}  else {
			System.out.println("Введіть позитивне число від 0 до 10000");
			b = sc.nextInt();
		}
			
		}

	}

