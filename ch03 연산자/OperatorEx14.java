public class OperatorEx14 {
	public static void main(String[] args) {
		char c='a';
		for(int i=0; i<26; i++) { // ��{} ���� ������ 26�� �ݺ��Ѵ�.
			System.out.print(c++); // 'a'���� 26���� ���ڸ� ����Ѵ�.
		}
		System.out.println(); // �ٹٲ��� �Ѵ�.
		
		c='A';
		for(int i=0; i<26; i++) {
			System.out.print(c++);
		}
		System.out.println();
		
		c='0';
		for(int i=0; i<10; i++) {
			System.out.print(c++);
		}
		System.out.println();
	}
}
