import java.util.*; // ScannerŬ������ ����ϱ� ���� �߰�

public class ScannerEx {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // ScannerŬ������ ��ü�� ����
		
		System.out.print("���ڸ� ������ �ϳ� �Է����ּ���.>");
		String input = scanner.nextLine(); // C++������ cin����. ���⼭�� input�� �Է°� ����.
		int num=Integer.parseInt(input); // �Է¹��� ���ڿ��� ���ڷ� ��ȯ
		
		System.out.println("�Է³��� :"+input);
		System.out.printf("num=%d%n",  num);
	}
}
