public class OperatorEx9 {
	public static void main(String[] args) {
		long a=1_000_000 * 1_000_000; // 
		long b=1_000_000 * 1_000_000L; // 
		
		System.out.println("a="+a);
		System.out.println("b="+b);
	} // a�� b�� long���� Ÿ���� ��ȯ������ a�� ��쿡�� int�������� ������ �̹� �����÷ο�, b�� 
	  // �ϳ��� float�� �Ǽ����̹Ƿ� �ڵ� ����ȯ�Ǿ� ����� ���� ��µȴ�.
}

