public class OperatorEx22 {
	public static void main(String[] args) {
		float f = 0.1f;
		double d = 0.1;
		double d2 = (double)f;
		
		System.out.printf("10 == 10.0f \t %b%n", 10==10.0f); // true
		System.out.printf("0.1==0.1f %b%n", 0.1==0.1f); // false �Ǽ��� ��Ȯ���� �Ҽ��� ������ ���� ���� �Ǽ���
		// 0.1��ü�� ����Ǵ� �͵� ������ ������ 2������ ��ȯ�ϴ� ���������� ������ �߻��Ѵ�.
		System.out.printf("f =%19.17f%n", f); // f=0.10000000149011612
		System.out.printf("d =%19.17f%n", d); // d=0.10000000000000000
		System.out.printf("d2=%19.17f%n", d2); // d2=0.100000000149011612
		System.out.printf("d==f %b%n", d==f); // false
		System.out.printf("d==d2 %b%n", d==d2); // false
		System.out.printf("d2==f %b%n", d2==f); // true
		System.out.printf("(float)d==f %b%n", (float)d==f); // true
	} // ���⼭ �ϳ� �ް����� �ȵǴ� ��. �����ڸ� ����ϸ� �� ū ������ ���� ������ ����ȯ�� �ڵ����� �̷������ ���
}     // ��ǰ� double���� float���� ���� �� float������ ����ȯ �� ���ؾ��Ѵٴ� ��� �ΰ��� ȥ������ ����!
