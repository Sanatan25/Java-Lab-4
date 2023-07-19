import java.util.*;
public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N");
		int n = sc.nextInt();
		int sum = 0;
		int count = 0;
		
		do {
			int randomNumbers = (int)(Math.random()*n)+1;
			System.out.println("Random numbers are "+randomNumbers);
			sum += randomNumbers;
			count++;
		}
		while(count < n);
		
		double average = (double)sum/n;
		System.out.println(average);
	}

}
