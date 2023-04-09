public class ExceptionEx11 {
	public static void main(String[] args) {
		throw new RuntimeException(); // RuntimeException을 고의로 발생시킨다.
	}
} // RuntimeException예외 클래스들은 컴파일은 되는데 실행결과 비정상적으로 종료된다.
