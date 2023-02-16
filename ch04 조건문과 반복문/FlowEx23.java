public class FlowEx23 {
	public static void main(String[] args) {
		int i=5;
		
		while(i--!=0) {
			System.out.println(i+" - I can do it.");
		}
	} // main의 끝
}

// 만약 --i를 사용한다면 어떻게 될까?(i--대신) 아마 마지막 문장이 출력되지 않을 것이다.
// 왜냐하면 전위형의 경우 조건식에서 먼저 i의 감소가 된 후 0과 같은지 비교연산자가 실행될 것이기 때문이다.
