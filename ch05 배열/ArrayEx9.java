import java.util.*; // Arrays.toString()을 쓰기위해

public class ArrayEx9 {
	public static void main(String[] args) {
		int[] code = {-4, -1, 3, 6, 11}; // 불연속적인 값들로 구성된 배열
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			int tmp = (int)(Math.random()*code.length);
			arr[i] = code[tmp];
		}
		
		System.out.println(Arrays.toString(arr));
	} // main의 끝
}
// 매우 간단 예제를 작성하기 전 떠오르기도 쉬웠던 사항. 다만 불연속적인 범위의 값들로 채워라라는걸 상상을 따로 못했다.