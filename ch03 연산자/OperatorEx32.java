public class OperatorEx32 {
	public static void main(String[] args) {
		int x, y, z;
		int absX, absY, absZ;
		char signX, signY, signZ;
		
		x = 10;
		y = -5;
		z = 0;
		
		absX = x >=0 ? x : -x; // x의 값이 음수이면, 양수로 만든다.
		absY = y >=0 ? y : -y; 
		absZ = z >=0 ? z : -z;
		
		signX= x > 0 ? '+' : (x==0 ? ' ' : '-'); // 조건 연산자를 중첩한 세가지 선택지
		// 양수면 +, 0이면 공백, 음수면 -
		signY= y > 0 ? '+' : (y==0 ? ' ' : '-');
		signZ= z > 0 ? '+' : (z==0 ? ' ' : '-'); 
		
		System.out.printf("x=%c%d%n", signX, absX);
		System.out.printf("y=%c%d%n", signY, absY);
		System.out.printf("z=%c%d%n", signZ, absZ);
	}
} // 조건 연산자를 이용해서 변수의 절대값을 구한 후, 부호를 붙여 출력하는 예제.
