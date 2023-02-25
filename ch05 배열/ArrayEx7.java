public class ArrayEx7 {
	public static void main(String[] args) {
		int[] numArr = new int[10];
		
		for(int i=0; i<numArr.length; i++) {
			numArr[i] = i; // 배열을 0~9의 숫자로 초기화
			System.out.print(numArr[i]);
		}
		System.out.println();
		
		for(int i=0; i<100; i++) {
			int n = (int)(Math.random()*10); // 0~9중의 한 값을 임의로 얻는다.
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		
		for(int i=0; i<numArr.length; i++) {
			System.out.print(numArr[i]);
		}
	} // main의 끝
}

// 처음 떠올린건 tmp에 numArr[0]의 값을 할당하고 랜덤 numArr[n]과 그 값을 스왑하는 예제의 방식이 아닌 아예
// numArr[(int)(Math.random()*10)] = numArr[(int)(Math.random()*10)]로 하려했다. 
// 그렇게 코드를 짜서 해봤는데 안되는건 아닌데 코드가 오히려 길어진다. 예제가 올바른 방법!