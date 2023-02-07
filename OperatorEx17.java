public class OperatorEx17 {
	public static void main(String[] args) {
		double pi=3.141592;
		double shortPi=(int)(pi*1000+0.5)/1000.0;
		
		System.out.println(shortPi);
	} // 예제 16번에서 소수점이하를 반올림 하는 방법. 0.5를 더해서 0.5이상의 소수점을 가진경우 (int)로 형변환시
	  // 버려지지 않고 일의자리에서 반올림되듯 1이 더해진다.
}
