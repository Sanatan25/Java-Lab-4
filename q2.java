import java.util.*;
public class q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int sum = 0;
		
		while(n > 0) {
			int digit = n % 10;
			sum += digit;
			n/=10;
		}
		
		if(sum % 9 == 0) {
			System.out.println("yes");
		}else {
			System.out.println("NO");
			
		}

	}

}
