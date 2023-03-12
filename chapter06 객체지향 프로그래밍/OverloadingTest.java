public class OverloadingTest {
	public static void main(String[] args) {
		MyMath3 mm = new MyMath3();
		System.out.println("mm.add(3, 3) ���:" + + mm.add(3,3));
		System.out.println("mm.add(3L, 3) ���: " + + mm.add(3L,3));
		System.out.println("mm.add(3, 3L) ���: " + + mm.add(3,3L));
		System.out.println("mm.add(3L, 3L) ���: " + + mm.add(3L,3L));
		
		int[] a = {100, 200, 300};
		System.out.println("mm.add(a) ���: " + mm. add(a));
	}
} // main �Լ��� ����� ����� ù��° ���常 ���캸��.
// int add(int a, int b) - mm.add(3, 3) ���:6
// ���������δ� println�� "mm.add(3, 3) ���:"�� ���� ��µǰ� add�� print�� ���� �;� �� �� ������ ������ �ڹٲ���.
// �׷��� ��� println�� �Էµ� ��� ���� ����ϱ� ���ؼ��� mm.add�� ���� �������� ���� �־�� �Ѵ�.
// ��, �� ������ ���� ����Ǿ��� ������ add�� print �Է¹����� �켱���� ���� �� �� println�� ������ �� ���̴�.

class MyMath3 {
	int add(int a, int b) {
		System.out.print("int add(int a, int b) - ");
		return a+b;
	}
	
	long add(int a, long b) {
		System.out.print("long add(int a, long b) - ");
		return a+b;
	}
	
	long add(long a, int b) {
		System.out.print("long add(long, int b) - ");
		return a+b;
	}
	
	long add(long a, long b) {
		System.out.print("long add(long a, long b) - ");
		return a+b;
	}
	long add(int[] a) { // �迭�� ��� ����� ���� ����� �����ش�.
		System.out.print("int add(int[] a - ");
		int result = 0;
		for(int i = 0; i < a.length; i++)
			result+=a[i];
		return result;
	}
}
