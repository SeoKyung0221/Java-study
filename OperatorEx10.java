public class OperatorEx10 {
	public static void main(String[] args) {
		int a=1000000;
		
		int result1=a*a/a; // 백만 * 백만 / 백만 -> 오버플로우가 발생하고 나누기라서 다른 결과!
		int result2=a/a*a; // 백만 / 백만 * 백만 -> 이건 정상 결과
		
		System.out.printf("%d * %d / %d=%d%n", a, a, a, result1);
		System.out.printf("%d / %d * %d=%d%n", a, a, a, result2);
	}
}
