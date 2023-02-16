import java.util.*; // Scanner 클래스를 사용하기 위해 추가
public class FlowEx5 {
	public static void main(String[] args) {
		int score=0;
		char grade = ' ', opt = '0';
		
		System.out.print("점수를 입력해주세요.>");
		
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt(); // 화면을 통해 입력받은 점수를 score에 저장.
		
		System.out.printf("당신의 점수는 %d입니다.%n", score);
		
		if(score>=90) // 90점 이상이면 A학점
		{
			grade='A';
			if(score>=98) // 그 중에서도 98점 이상이면 A+
			{
				opt = '+'; // 순간 grade = 'A+'을 타이핑했는데 문자열이라 안되네! opt는 뭘까
			}
			else if(score<94) // 90점 이상 94점 미만은 A-
			{
				opt = '-';
			}
		}
		else if(score>=80) // score가 80점보다 같거나 크면 B
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
		else // 나머지는 C학점
		{
			grade = 'C';
		}
		System.out.printf("당신의 학점은 %c%c입니다.%n", grade, opt);
	}
}
