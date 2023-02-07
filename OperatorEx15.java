public class OperatorEx15 {
	public static void main(String[] args) {
		char lowerCase='a';
		char upperCase=(char)(lowerCase-32); // a의 유니코드 97에서 32를 빼면 65로 A의 유니코드다.
		System.out.println(upperCase);
	}   
}
