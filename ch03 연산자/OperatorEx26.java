public class OperatorEx26 {
	public static void main(String[] args) {
		int a = 5;
		int b = 0;
		
		System.out.printf("a=%d, b=%d%n", a, b);
		System.out.printf("a!=0 || ++b!=0 = %b%n", a!=0 || ++b!=0); // true인걸 왼쪽에
		System.out.printf("a=%d, b=%d%n", a, b); // ++b여서 b의 값이 1증가하여야 하지만
		// b=0으로 출력된다. 논리 연산자는 왼쪽의 조건식만으로 바로 판별이 가능해서 뒤에 ++b가 연산되지 않은 것이다.
		System.out.printf("a==0 && ++b!=0 = %b%n",  a==0 && ++b!=0); // false인걸 왼쪽에
		// 같은 논리로 ++b의 연산이 되지 않았다.
		System.out.printf("a=%d, b=%d%n", a, b);
	} // main의 끝
}
