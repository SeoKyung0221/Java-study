public class OperatorEx7 {
	public static void main(String[] args) {
		byte a=10;
		byte b=30;
		byte c = (byte)(a+b); // 형변환이 없으면 에러
		System.out.println(c);
	}
}
