public class OverflowEx extends SpecialCharEx {
	public static void main(String[] args) {
		short sMin = -32768;
		short sMax = 32767; // short는 음수도 범위에 포함되므로 -3276~+32767
		char cMin = 0;
		char cMax = 65535; // char은 양수 범위만 나타나니까 0부터 범위 표현.
		
		System.out.println("sMin = " + sMin);
		System.out.println("sMin-1= " + (short)(sMin-1));
		System.out.println("sMax = " + sMax);
		System.out.println("sMax+1= " + (short)(sMax+1));
		System.out.println("cMin = " + (int)cMin);
		System.out.println("cMin-1= " + (int)--cMin);
		System.out.println("cMax = " + (int)cMax);
		System.out.println("cMax+1= " + (int)++cMax);
	}
}
