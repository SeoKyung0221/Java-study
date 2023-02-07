public class OperatorEx6 {
	public static void main(String[] args) {
		byte a=10;
		byte b=30;
		byte c = (byte)(a*b); // a, b가 연산되면서 int형으로 범위가 바뀌어 byte타입인 c로는 형변환으로 변환 후 저장.
		System.out.println(c);
	}
}
