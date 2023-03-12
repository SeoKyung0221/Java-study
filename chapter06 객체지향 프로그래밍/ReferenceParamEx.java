// class Data { int x;}

public class ReferenceParamEx {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d); // change 메서드를 통해 x값 변경시도
		System.out.println("After change(d.x)"); 
		System.out.println("main() : x = " + d.x); // 하지만 값을 그저 복사만 했기 때문에 x의 값 변경안됨.
	}
	
	static void change(Data d) { // 기본형 매개변수
		d.x = 1000;
		System.out.println("change() : x = " + d.x);
	}
}
