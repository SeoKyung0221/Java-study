public class OperatorEx16 {
	public static void main(String[] args) {
		float pi=3.141592f;
		float shortPi=(int)(pi*1000) / 1000f; // pi*1000의 소수점 이하 숫자는 (int)형변환으로 버려진다. 
		System.out.println(shortPi);
	}
}
