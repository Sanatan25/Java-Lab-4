import java.util.*;
public class q6 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base");
		int a = sc.nextInt();
		System.out.println("Enter the power");
		int b = sc.nextInt();
		int value = 1;
		for(int i = 1; i <= b; i++) {
			 value = value*a;
			
		}
		System.out.println(a+" to the power "+b+" is "+value);
	}

}
	