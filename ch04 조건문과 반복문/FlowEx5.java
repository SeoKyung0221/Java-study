import java.util.*; // Scanner Ŭ������ ����ϱ� ���� �߰�
public class FlowEx5 {
	public static void main(String[] args) {
		int score=0;
		char grade = ' ', opt = '0';
		
		System.out.print("������ �Է����ּ���.>");
		
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt(); // ȭ���� ���� �Է¹��� ������ score�� ����.
		
		System.out.printf("����� ������ %d�Դϴ�.%n", score);
		
		if(score>=90) // 90�� �̻��̸� A����
		{
			grade='A';
			if(score>=98) // �� �߿����� 98�� �̻��̸� A+
			{
				opt = '+'; // ���� grade = 'A+'�� Ÿ�����ߴµ� ���ڿ��̶� �ȵǳ�! opt�� ����
			}
			else if(score<94) // 90�� �̻� 94�� �̸��� A-
			{
				opt = '-';
			}
		}
		else if(score>=80) // score�� 80������ ���ų� ũ�� B
		{
			grade = 'B';
			if(score>=88)
			{
				opt = '+';
			}
			else if(score<84)
			{
				opt = '-';
			}
		}
		else // �������� C����
		{
			grade = 'C';
		}
		System.out.printf("����� ������ %c%c�Դϴ�.%n", grade, opt);
	}
}
