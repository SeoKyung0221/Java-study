public class FloatEx1 {
	public static void main(String[] args) {
		float f = 9.12345678901234567890f;
		float f2 = 1.2345678901234567890f;
		double d = 9.12345678901234567890d;
		
		System.out.printf("    123456789012345678901234%n");
		System.out.printf("f  : %f%n", f); // 소수점이하 6째자리까지 출력(float는 7자리까지니까)
		System.out.printf("f  : %24.20f%n", f); // 전체 자리수 24, 소수점 아래 20자리까지
		System.out.printf("f2 : %24.20f%n", f2);
		System.out.printf("d  : %24.20f%n", d);
	}
}
