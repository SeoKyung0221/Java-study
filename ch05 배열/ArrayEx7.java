public class ArrayEx7 {
	public static void main(String[] args) {
		int[] numArr = new int[10];
		
		for(int i=0; i<numArr.length; i++) {
			numArr[i] = i; // �迭�� 0~9�� ���ڷ� �ʱ�ȭ
			System.out.print(numArr[i]);
		}
		System.out.println();
		
		for(int i=0; i<100; i++) {
			int n = (int)(Math.random()*10); // 0~9���� �� ���� ���Ƿ� ��´�.
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		
		for(int i=0; i<numArr.length; i++) {
			System.out.print(numArr[i]);
		}
	} // main�� ��
}

// ó�� ���ø��� tmp�� numArr[0]�� ���� �Ҵ��ϰ� ���� numArr[n]�� �� ���� �����ϴ� ������ ����� �ƴ� �ƿ�
// numArr[(int)(Math.random()*10)] = numArr[(int)(Math.random()*10)]�� �Ϸ��ߴ�. 
// �׷��� �ڵ带 ¥�� �غôµ� �ȵǴ°� �ƴѵ� �ڵ尡 ������ �������. ������ �ùٸ� ���!