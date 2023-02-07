public class OperatorEx9 {
	public static void main(String[] args) {
		long a=1_000_000 * 1_000_000; // 
		long b=1_000_000 * 1_000_000L; // 
		
		System.out.println("a="+a);
		System.out.println("b="+b);
	} // a와 b를 long으로 타입을 변환했지만 a의 경우에는 int형끼리의 곱으로 이미 오버플로우, b는 
	  // 하나가 float의 실수형이므로 자동 형변환되어 제대로 값이 출력된다.
}

