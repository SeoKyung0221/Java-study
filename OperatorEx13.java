public class OperatorEx13 {
	public static void main(String[] args) {
		char c1='a';
		
//      char c2=c1+1; // 라인 5: 컴파일 에러발생!!! Ex12에서도 언급했던 형변환 없음.
		char c2 = 'a'+1; // 라인 6: 컴파일 에러없음 -> 왜?
		
		System.out.println(c2);
	}
}
