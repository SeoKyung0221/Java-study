import java.util.*; // Scanner클래스를 사용하기 위해 추가

public class ScannerEx {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Scanner클래스의 객체를 생성
		
		System.out.print("두자리 정수를 하나 입력해주세요.>");
		String input = scanner.nextLine(); // C++에서는 cin역할. 여기서는 input에 입력값 저장.
		int num=Integer.parseInt(input); // 입력받은 문자열을 숫자로 변환
		
		System.out.println("입력내용 :"+input);
		System.out.printf("num=%d%n",  num);
	}
}
