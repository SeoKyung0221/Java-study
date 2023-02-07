public class OperatorEx5 {
	public static void main(String[] args) {
		int a=10;
		int b=4;
		
		System.out.printf("%d + %d = %d%n", a, b, a+b);
		System.out.printf("%d - %d = %d%n", a, b, a-b);
		System.out.printf("%d * %d = %d%n", a, b, a*b);
		System.out.printf("%d / %d = %d%n", a, b, a/b);
		System.out.printf("%d / %f = %f%n", a, (float)b, a/(float)b);
	} // 사칙연산자 +-*/ 연산 예시, 마지막의 경우 b를 float로 형변환해서 소수점까지 값을 표기!
	// 정수형 / 계산의 경우 소수점 이하 값이 버려짐.
}
