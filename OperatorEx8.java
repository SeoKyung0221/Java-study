public class OperatorEx8 {
	public static void main(String[] args) {
		int a=1_000_000; // 1�鸸
		int b=2_000_000; // 2�鸸
		
		long c=a*b; // a*b=2,000,000,000,000 
		
		System.out.println(c); // a�� b�� ���ϸ� int���� ���ε� int���� 2000000000000�� ǥ�� ���Ѵ�.
	}
}
