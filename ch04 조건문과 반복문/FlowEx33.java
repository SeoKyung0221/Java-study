public class FlowEx33 {
	public static void main(String[] args) {
		// for문에 Loop1이라는 이름 붙이기.
		Loop1 : for(int i=2; i<=9; i++) {
			for(int j =1; j<=9; j++) {
				if(j==5)
					break Loop1;
					// break;
					// continue Loop1;
				 	// continue;
				System.out.println(i+"*"+j+"="+i*j);
			} // for문의 끝
			System.out.println();
		} // Loop1의 끝
	}
}
