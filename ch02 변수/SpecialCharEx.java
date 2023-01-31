public class SpecialCharEx {
	public static void main(String[] args) {
		System.out.println('\''); // '''처럼 할 수 없다. '문자 출력
		System.out.println("abc\t123\b456"); // \b에 의해 3이 지워진다. b가 backspace 
		System.out.println('\n'); // n은 new line, 이거는 약간 C++ 줄바꾸기랑 똑같다. 
		System.out.println("\"Hello\""); // 큰따옴표 ""를 포함해서 출력하려면 이렇게 한다. 
		System.out.println("c:\\"); 
	}
}

// 의문 println 괄호안에 "" 과 ''의 차이가 뭘까? 첫번째 문단 '\''을 "\'"로 바꿔도 실행결과가 안바뀌는데...