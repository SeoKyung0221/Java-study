public class OverloadingTest {
	public static void main(String[] args) {
		MyMath3 mm = new MyMath3();
		System.out.println("mm.add(3, 3) 결과:" + + mm.add(3,3));
		System.out.println("mm.add(3L, 3) 결과: " + + mm.add(3L,3));
		System.out.println("mm.add(3, 3L) 결과: " + + mm.add(3,3L));
		System.out.println("mm.add(3L, 3L) 결과: " + + mm.add(3L,3L));
		
		int[] a = {100, 200, 300};
		System.out.println("mm.add(a) 결과: " + mm. add(a));
	}
} // main 함수를 출력한 결과의 첫번째 문장만 살펴보자.
// int add(int a, int b) - mm.add(3, 3) 결과:6
// 순서상으로는 println의 "mm.add(3, 3) 결과:"가 먼저 출력되고 add의 print가 먼저 와야 할 것 같은데 순서가 뒤바꼈다.
// 그런데 사실 println이 입력된 모든 것을 출력하기 위해서는 mm.add에 의한 연산결과가 먼저 있어야 한다.
// 즉, 이 연산이 먼저 시행되었기 때문에 add의 print 입력문장이 우선으로 오고 그 후 println의 문장이 온 것이다.

class MyMath3 {
	int add(int a, int b) {
		System.out.print("int add(int a, int b) - ");
		return a+b;
	}
	
	long add(int a, long b) {
		System.out.print("long add(int a, long b) - ");
		return a+b;
	}
	
	long add(long a, int b) {
		System.out.print("long add(long, int b) - ");
		return a+b;
	}
	
	long add(long a, long b) {
		System.out.print("long add(long a, long b) - ");
		return a+b;
	}
	long add(int[] a) { // 배열의 모든 요소의 합을 결과로 돌려준다.
		System.out.print("int add(int[] a - ");
		int result = 0;
		for(int i = 0; i < a.length; i++)
			result+=a[i];
		return result;
	}
}
