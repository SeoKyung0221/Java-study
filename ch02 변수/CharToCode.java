public class CharToCode {
	public static void main(String[] args) {
		char ch = 'A'; // char ch = 65; (�����ڵ�)
		int code = (int)ch; // ch�� ����� ���� intŸ������ ����ȯ ����.
		
		System.out.printf("%c=%d(%#X)%n", ch, code, code);
		
		char hch = '��'; // char hch = 0xAC00; (�����ڵ�?)
		System.out.printf("%c=%d(%#X)%n", hch, (int)hch, (int)hch);
	}
}
