public class ExceptionEx6 {
	public static void main(String args[]) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0); // 예외 발생
			System.out.println(4); // 예외가 발생하여 실행되지 않음.
		} catch(Exception e) { // ArithmeticException의 조상.
			System.out.println(5); // 예외가 있어서 실행.
		} // try - catch의 끝.
		System.out.println(6);
	} // main메서드의 끝
}
