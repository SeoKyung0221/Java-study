public class PrintEx1 {
	public static void main(String[] args) {
		byte b=1;
		short s=2;
		char c='A';
		
		int finger=10;
		long big =100_000_000_000L; // long big= 100000000000L;
		long hex=0xFFFF_FFFF_FFFF_FFFFL;
		
		int octNum=010; // 8진수 10, 10진수로는 8
		int hexNum=0x10; // 16진수 10, 10진수로는 16
		int binNum=0b10; // 2진수 10, 10진수로는 2
		
		System.out.printf("b=%d%n", b);
		System.out.printf("s=%d%n", s);
		System.out.printf("c=%c, %d %n", c, (int)c); // (int)를 제거하면 에러. 형변환을 위해 필요한 문
		System.out.printf("finger=[%5d]%n", finger);
		System.out.printf("finger=[%-5d]%n", finger);
		System.out.printf("finger=[%05d]%n", finger); // %d의 숫자는 출력될 값이 차지할 공간 즉, 5니까 OOO10 의 5칸
		System.out.printf("big=%d%n", big);
		System.out.printf("hex=%#x%n", hex); // '#'은 접두사(16진수 0x, 8진수 0)
		System.out.printf("octNum=%o, %d%n", octNum, octNum);
		System.out.printf("hexNum=%x, %d%n", hexNum, hexNum);
		System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum);
		
	}
}