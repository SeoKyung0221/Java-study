public class OperatorEx26 {
	public static void main(String[] args) {
		int a = 5;
		int b = 0;
		
		System.out.printf("a=%d, b=%d%n", a, b);
		System.out.printf("a!=0 || ++b!=0 = %b%n", a!=0 || ++b!=0); // true�ΰ� ���ʿ�
		System.out.printf("a=%d, b=%d%n", a, b); // ++b���� b�� ���� 1�����Ͽ��� ������
		// b=0���� ��µȴ�. �� �����ڴ� ������ ���ǽĸ����� �ٷ� �Ǻ��� �����ؼ� �ڿ� ++b�� ������� ���� ���̴�.
		System.out.printf("a==0 && ++b!=0 = %b%n",  a==0 && ++b!=0); // false�ΰ� ���ʿ�
		// ���� ���� ++b�� ������ ���� �ʾҴ�.
		System.out.printf("a=%d, b=%d%n", a, b);
	} // main�� ��
}
