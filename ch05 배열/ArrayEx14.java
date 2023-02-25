public class ArrayEx14 {
	public static void main(String[] args) {
		String src = "ABCDE";
		
		for(int i=0; i<src.length(); i++) {
			char ch = src.charAt(i); // src의 i번째 문자를 ch에 저장
			System.out.println("src.charAt("+i+"):"+ ch);
		}
		// String을 char[]로 변환
		char[] chArr = src.toCharArray(); // 이건 도대체 왜 to'C'har일까 왜 대문자지? charAt만 해도 소문자인데
		
		// char배열(char[])을 출력
		System.out.println(chArr); // 이건 그냥 일렬로 출력 아니면 .toString을 쓴다.
	}
}
