public class OperatorEx12 {
	public static void main(String[] args) {
		char c1='a'; // a�� �����ڵ�� 97
		char c2=c1; // c1�� ����Ǿ� �ִ� ���� c2�� ����ȴ�.
		char c3=' '; // c3�� �������� �ʱ�ȭ�Ѵ�.
		
		int i =c1+1; // 'a'+1 ->97+1=98�� ������ i�� �ʱ�ȭ�Ѵ�. �����ڿ��� �� int�� �ڵ�����ȯ!
		
		c3=(char)(c1+1); // (c1+1)�� ����� int������ �ڵ�����ȯ�ǹǷ� c3�� �Ҵ��ϱ� ���ؼ��� ����ȯ �ʿ�!
		c2++;
		c2++;
		
		System.out.println("i="+i);
		System.out.println("c2="+c2);
		System.out.println("c3="+c3);
	}
}

// ���׿����� c2++��ſ� c2=c2+1�� ����ϸ� �Ȱ��� ����� ���� �� ������ c2+1�� ��� �� ���� int������ ����ȯ���̴�
// ������ �߻��Ѵ�.