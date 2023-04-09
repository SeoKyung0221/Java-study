public class ExceptionEx7 {
	public static void main(String args[]) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0); // 예외 발생
			System.out.println(4); // 예외가 발생하여 실행되지 않음.
		} catch (ArithmeticException ae) {
			if(ae instanceof ArithmeticException)
				System.out.println("true");
			System.out.println("ArithmeticException");
		} catch (Exception e){ // ArithmeticException을 제외한 모든 예외를 처리.
			System.out.println("Exception");
		} // try - catch의 끝
		System.out.println(6);
	} // main메서드의 끝
}
