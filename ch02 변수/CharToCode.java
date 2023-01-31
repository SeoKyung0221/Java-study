public class CharToCode {
	public static void main(String[] args) {
		char ch = 'A'; // char ch = 65; (유니코드)
		int code = (int)ch; // ch에 저장된 값을 int타입으로 형변환 저장.
		
		System.out.printf("%c=%d(%#X)%n", ch, code, code);
		
		char hch = '가'; // char hch = 0xAC00; (유니코드?)
		System.out.printf("%c=%d(%#X)%n", hch, (int)hch, (int)hch);
	}
}
