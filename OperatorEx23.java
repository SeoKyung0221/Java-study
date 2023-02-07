public class OperatorEx23 {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = new String("abc");
		
		System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc"=="abc"); // true
		System.out.printf(" str1==\"abc\" ? %b%n",  str1=="abc"); // true
		System.out.printf(" str2==\"abc\" ? %b%n",  str2=="abc"); // false 내용은 같은데
		// 어째서 false인가? -> 서로 다른 객체이기 때문.
		System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc")); // true
		System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc")); // true
		// equals는 서로 다른 객체더라도 내용만 같으면 true를 반환한다! 그래서 equals로 문자열을 비교한다.
		System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC")); // false
		System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n",
				str1.equalsIgnoreCase("ABC")); // true
		// equalsIgonorecase는 대소문자 구분없이 비교해준다.
	}
}
