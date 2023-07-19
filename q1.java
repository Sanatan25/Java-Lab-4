import java.util.*;
public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int a = sc.nextInt();
		System.out.println("Enter the 2nd number");
		int b = sc.nextInt();
		System.out.println("Enter the increament");
		int c = sc.nextInt();
		int sum = 0;
		
		for(int i = a; i <= b; i+=c) {
			System.out.println(i);
			sum +=i;
			
		}
		System.out.println("sum is "+sum);
		

	}

}
