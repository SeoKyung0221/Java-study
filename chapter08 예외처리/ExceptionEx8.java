public class ExceptionEx8 {
	public static void main(String args[]) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0); // 예외 발생
			System.out.println(4); // 예외가 발생하여 실행되지 않음.
		} catch(ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println("예외 메시지 : "+ae.getMessage()); // "/ by zero"
		} // try - catch의 끝.
		System.out.println(6);
	}
}

/* 실행 시 java.lang.ArithmeticException: / by zero
	at ExceptionEx8.main(ExceptionEx8.java:7)
가 출력된다. 이게 아마 printStackTrace()로 인해 출력된 문장이라고 예상
*/