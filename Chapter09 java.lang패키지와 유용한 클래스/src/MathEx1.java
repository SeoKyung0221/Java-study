import static java.lang.Math.*;
import static java.lang.System.*; // System. 생략
class MathEx1{
	public static void main(String args[]) {
		double val = 980.7552;
		out.println("round("+ val +")=" + round(val)); // 반올림
		
		val *= 100;
		out.println("round("+ val + ")=" + round(val)); // 반올림
		
		out.println("round("+ val + ")/100  =" + round(val)/100); // 반올림
		out.println("round("+ val + ")/100.0=" + round(val)/100); // 반올림
		out.println();
		out.printf("ceil(%3.1f, args)=%3.1f%n", 1.1, ceil(1.1)); // 올림
		out.printf("floor(%3.1f)=%3.1f%n", 1.5, floor(1.5)); // 버림
		out.printf("round(%3.1f)=%d%n", 1.1, round(1.1)); // 반올림
		out.printf("round(%3.1f)=%d%n", 1.5, round(1.5)); // 반올림
		out.printf("rint(%3.1f)=%f%n", 1.5, rint(1.5)); // rint도 round랑 똑같은 위치에서의 반올림이긴 한데 double을 반환한다. 또 정중앙값(1.5)와 같은 값이면
		// 가까운 짝수 정수값을 반환한다. 여기서는 2
		out.printf("round(%3.1f)=%d%n", -1.5, round(-1.5)); // 반올림, -1
		out.printf("rint(%3.1f)=%f%n", -1.5, rint(-1.5)); // 반올림, -2.0000
		out.printf("ceil(%3.1f)=%f%n", -1.5, ceil(-1.5)); // 올림
		out.printf("floor(%3.1f)=%f%n", -1.5, floor(-1.5)); // 버림
	}
}
