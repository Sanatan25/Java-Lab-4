import java.util.*;
public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int x = sc.nextInt();
		System.out.println("Enter the 2nd number");
		int y = sc.nextInt();
		
		if(x % y ==0 ) {
			System.out.println(y);
		}else if(x == y) {
			System.out.println(x%y);
		}
	}

}
