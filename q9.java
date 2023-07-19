import java.util.*;
public class q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 System.out.print("Enter an integer: ");
	        int num = sc.nextInt();
	        int result = removeZeros(num);
	        System.out.println("Result: " + result);

	}
	public static int removeZeros(int num) {
        int result = 0;
        int multiplier = 1;
        while (num > 0) {
            int digit = num % 10;
            if (digit != 0) {
                result += digit * multiplier;
                multiplier *= 10;
            }
            num /= 10;
        }
        return result;
    }

}
