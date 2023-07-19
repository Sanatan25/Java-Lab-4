import java.util.*;
public class q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int rand;
		int n;
		do {
			System.out.println("Enter the number");
			 n = sc.nextInt();
			 rand = 1+(int)(Math.random()*10-1+1);
			System.out.println(rand);
			if(n > rand) {
				System.out.println("high");
			}else if(n < rand) {
				System.out.println("low");
			}else if(n == rand) {
				System.out.println("correct");
				break;
			}

			
		}
		while(n!= rand);
		
	}

}
