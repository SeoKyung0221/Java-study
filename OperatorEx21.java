public class OperatorEx21 {
	public static void main(String[] args) {
		System.out.printf("10 == 10.0f \t %b%n", 10==10.0f); // true
		System.out.printf("'0' == 0 \t %b%n", '0'==0); // false
		System.out.printf("'A' == 65 \t %b%n", 'A'==65); // true
		System.out.printf("'A'>'B' \t %b%n", 'A'>'B'); // false
		System.out.printf("'A'+1 != 'B' \t %b%n", 'A'+1 != 'B'); // false
	}
}
