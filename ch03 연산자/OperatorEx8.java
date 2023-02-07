public class OperatorEx8 {
	public static void main(String[] args) {
		int a=1_000_000; // 1백만
		int b=2_000_000; // 2백만
		
		long c=a*b; // a*b=2,000,000,000,000 
		
		System.out.println(c); // a와 b를 곱하면 int형의 값인데 int형은 2000000000000을 표현 못한다.
	}
}
