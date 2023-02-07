public class OperatorEx27 {
	public static void main(String[] args) {
		boolean b = true;
		char ch = 'C';
		
		System.out.printf("b=%b%n", b); // true
		System.out.printf("!b=%b%n", !b); // false
		System.out.printf("!!b=%b%n", !!b); // true
		System.out.printf("!!!b=%b%n", !!!b); // false
		System.out.println();
		
		System.out.printf("ch=%c%n", ch);
		System.out.printf("ch < 'a' || ch > 'z'=%b%n", ch < 'a' || ch > 'z'); // true
		System.out.printf("!('a'<=ch && ch<='z')=%b%n", !('a'<=ch && ch<='z')); // true
		System.out.printf(" 'a'<=ch && ch<='z' =%b%n", 'a'<=ch && ch<='z'); // false
	} // mainÀÇ ³¡
}
