import java.util.*;
public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i < n; i++) {
			if(n % i == 0) {
				System.out.println("Factors are "+i);
				sum += i;
			}
		}
		
		System.out.println(sum);
		
		if(sum == n) {
			System.out.println("perfect");
		}
		else {
			System.out.println("not perfect");
		}

	}

}
