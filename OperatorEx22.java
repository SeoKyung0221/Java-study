public class OperatorEx22 {
	public static void main(String[] args) {
		float f = 0.1f;
		double d = 0.1;
		double d2 = (double)f;
		
		System.out.printf("10 == 10.0f \t %b%n", 10==10.0f); // true
		System.out.printf("0.1==0.1f %b%n", 0.1==0.1f); // false 실수형 정확히는 소수점 이하의 값을 가진 실수형
		// 0.1자체가 저장되는 것도 오차가 있지만 2진수로 변환하는 과정에서도 오차가 발생한다.
		System.out.printf("f =%19.17f%n", f); // f=0.10000000149011612
		System.out.printf("d =%19.17f%n", d); // d=0.10000000000000000
		System.out.printf("d2=%19.17f%n", d2); // d2=0.100000000149011612
		System.out.printf("d==f %b%n", d==f); // false
		System.out.printf("d==d2 %b%n", d==d2); // false
		System.out.printf("d2==f %b%n", d2==f); // true
		System.out.printf("(float)d==f %b%n", (float)d==f); // true
	} // 여기서 하나 햇갈리면 안되는 것. 연산자를 사용하면 더 큰 범위를 가진 형으로 형변환이 자동으로 이루어진다 라는
}     // 사실과 double형과 float형을 비교할 때 float형으로 형변환 후 비교해야한다는 사실 두개를 혼동하지 말자!
