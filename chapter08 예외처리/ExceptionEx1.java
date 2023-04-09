public class ExceptionEx1 {
	public static void main(String[] args) {
		try {
			try { } catch (Exception e) { }
		} catch (Exception e) {
		//	try { } catch (Exception e) { } // 에러. 변수 e가 중복되었다.
	} // try - catch 끝
		
		try {
			
		} catch(Exception e) {
			
		} // try - catch의 끝
	} // main메서드의 끝
}