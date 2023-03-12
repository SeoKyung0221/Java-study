class TvTest3 {
	public static void main(String args[]) {
		Tv t1 = new Tv(); // Tv t1; t1= new Tv();를 한문장으로 표현 가능
		Tv t2 = new Tv();
		
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
		
		t2 = t1; // t1이 저장하고 있는 값(주소)를 t2에 저장한다.
		t1.channel = 7; // 채널의 값을 7로 변경(t1의 멤버변수)
		System.out.println("t1의 channel값을 7로 변경하였습니다.");
		
		System.out.println("t1의 channel값은 "+ t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
	}
}

// t2가 t1의 인스턴스의 주소를 저장하기 때문에 본래 t2가 저장하고 있던 Tv의 인스턴스(객체)는 가비지 컬렉터에 의해
// 자동적으로 메모리에서 제거된다.