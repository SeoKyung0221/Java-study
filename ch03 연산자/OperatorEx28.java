public class OperatorEx28 {
	public static void main(String[] args) {
		int x = 0xAB, y = 0xF;

		System.out.printf("x = %#X \t\t%s%n", x, toBinaryString(x));
		System.out.printf("y = %#X \t\t%s%n", y, toBinaryString(y));
		System.out.printf("%#X | %#X = %#X \t%s%n" , x, y, x|y, toBinaryString(x|y));
		System.out.printf("%#X & %#X = %#X \t%s%n" , x, y, x&y, toBinaryString(x&y));
		System.out.printf("%#X ^ %#X = %#X \t%s%n" , x, y, x^y, toBinaryString(x^y));
		System.out.printf("%#X ^ %#X ^ %#X = %#X %s%n" , x, y, y, x^y^y,
				toBinaryString(x^y^y));
	} // main의 끝

	static String toBinaryString(int x) { // 10진 정수를 2진수로 변환하는 메서드
		String zero = "00000000000000000000000000000000";
		String tmp = zero + Integer.toBinaryString(x);
		return tmp.substring(tmp.length()-32);
	}
} // 사실 이 예제 28번이 어떻게 흘러가는지를 모르겠는건 아니다. 지금 책에서는 설명을 생략해서 딱히 설명이 없는데
// C++때랑 Java가 똑같다면 toBinaryString이라는 전역함수(메서드)를 새로 작성하여 사용한 것 같다.
// 근데 return되는 tmp.substring(tmp.length()-32) 이거는... tmp의 메서드를 이용한 것 같은데 모르겠다.
// 무슨 메서드인지 모르겠다! 나중에 알게되면 추가 작성하겠다.
