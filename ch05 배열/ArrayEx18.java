public class ArrayEx18 {
	public static void main(String[] args) {
		int[][] score = {
				{100, 100, 100},
				{20, 20, 20},
				{30, 30, 30},
				{40, 40, 40}
		};
		int sum = 0;
		
		for(int i=0; i<score.length;i++) {
			for(int j=0; j<score[i].length;j++) {
				System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);
			}
		}
		
		for(int [] tmp : score) { // 향상된 for문
			for(int i : tmp) {
				sum += i;
			}
		}
		
		System.out.println("sum="+sum);
	}
}
// score의 2차원 배열의 모든 요소의 합을 구하고 출력하는 예제.