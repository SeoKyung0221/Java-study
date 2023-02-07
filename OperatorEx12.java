public class OperatorEx12 {
	public static void main(String[] args) {
		char c1='a'; // a의 유니코드는 97
		char c2=c1; // c1에 저장되어 있는 값이 c2에 저장된다.
		char c3=' '; // c3를 공백으로 초기화한다.
		
		int i =c1+1; // 'a'+1 ->97+1=98의 값으로 i를 초기화한다. 연산자에서 다 int로 자동형변환!
		
		c3=(char)(c1+1); // (c1+1)의 결과는 int형으로 자동형변환되므로 c3에 할당하기 위해서는 형변환 필요!
		c2++;
		c2++;
		
		System.out.println("i="+i);
		System.out.println("c2="+c2);
		System.out.println("c3="+c3);
	}
}

// 단항연산자 c2++대신에 c2=c2+1을 사용하면 똑같은 결과가 나올 것 같지만 c2+1의 경우 그 값이 int형으로 형변환없이는
// 오류가 발생한다.