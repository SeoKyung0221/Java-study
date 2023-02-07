public class OperatorEx23 {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = new String("abc");
		
		System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc"=="abc"); // true
		System.out.printf(" str1==\"abc\" ? %b%n",  str1=="abc"); // true
		System.out.printf(" str2==\"abc\" ? %b%n",  str2=="abc"); // false ������ ������
		// ��°�� false�ΰ�? -> ���� �ٸ� ��ü�̱� ����.
		System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc")); // true
		System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc")); // true
		// equals�� ���� �ٸ� ��ü���� ���븸 ������ true�� ��ȯ�Ѵ�! �׷��� equals�� ���ڿ��� ���Ѵ�.
		System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC")); // false
		System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n",
				str1.equalsIgnoreCase("ABC")); // true
		// equalsIgonorecase�� ��ҹ��� ���о��� �����ش�.
	}
}
