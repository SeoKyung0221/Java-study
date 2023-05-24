import static java.lang.Math.*;
import static java.lang.System.*;

class MathEx3{
	public static void main(String args[]) {
		int x1 = 1, y1 = 1; // (1,1)
		int x2 = 2, y2 = 2; // (2,2)
		
		double c = sqrt(pow(x2-x1, 2) + pow(y2-y1, 2));
		double a = c * sin(PI/4); // PI/4 rad = 45 degree 걍 4/파이는 45도. 각도법 얘기
		double b = c * cos(PI/4);
		//double b = c* cos(toRadians(45)); // 45도를 toRadians 즉 호도법으로 바꾸었을 때 파이/4로 게산하는거.
		
		out.printf("a=%f%n",  a);
		out.printf("b=%f%n", b);
		out.printf("c=%f%n",  c);
		out.printf("angle=%f rad%n" , atan2(a,b)); // arctan 아크 탄젠트. 탄젠트 역함수
		out.printf("angle=%f degree%n%n",  atan2(a,b) * 180 / PI);
		//out.printf("angle=%f degree%n%n", toDegrees(atna2(a,b)));
		out.printf("24 * log10(2, args)=%f%n", 24 * log10(2)); // 7.224720 참고로 log10(2)는 밑이 10, 진수가 2인 것이다. 즉, 2^24에 대한 상용로그 계산!
		out.printf("53 * log10(2, args)=%f%n%n", 53 * log10(2)); // 15.954590 상용로그 진수계산에 따라 몇자리 숫자인지 몇번째 소수점숫자인지 확인가능!
		// 참고로 여기서 2^24와 2^53은 뭔지 눈치 챘는가? 바로 float와 double이다! 정확도가 각각 7, 15인걸 알 수 있다! (23+1), (52+1) 정규화를 통해 1씩 자리 확보가능.
	}
}