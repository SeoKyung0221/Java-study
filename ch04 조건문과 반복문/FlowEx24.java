public class FlowEx24 {
	public static void main(String[] args) {
		int i = 11;
		
		System.out.println("카운트 다운을 시작합니다.");
		
		while(i--!=0) {
			System.out.println(i);
			
			for(int j=0; j<2_000_000_000; j++) { // for문으로 약간의 시간을 지연시켜 카운트 다운
				;	 // 빈문장					 // 근데 컴속도가 빨라서 의미가 없다.ㅎ
			}
		}
		System.out.println("GAME OVER");
	}
}
