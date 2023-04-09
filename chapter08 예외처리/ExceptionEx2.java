public class ExceptionEx2 {
	public static void main(String args[]) {
		int number = 100;
		int result = 0;
		
		for(int i = 0; i < 10; i++) {
			result = number / (int)(Math.random()*10); // 7번째 라인
			System.out.println(result);
		}
	}
}
// 정수를 0으로 나누는 랜덤값이 발생하면 예외가 발생해 멈춤! ArithmeticException