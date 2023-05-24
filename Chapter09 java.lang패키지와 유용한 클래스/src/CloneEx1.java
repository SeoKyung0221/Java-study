class Point implements Cloneable{ // cloneable인터페이스를 구현한 클래스에서만 clone()를 호출할 수 있다.
	int x, y;                     // 이 인터페이스를 구현하지 않고 clone()를 호출하면 예외가 발생한다.
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "x=" + x + ", y=" + y;
	}
	
	public Object clone() { // public으로 변경해야 상속 관계없는 다른 클래스에서도 호출 가능.
		Object obj = null;
		try {
			obj = super.clone(); // clone()은 반드시 예외처리를 해주어야 한다!!
		} catch(CloneNotSupportedException e) {}
		return obj;
	}
}

class CloneEx1 {
	public static void main(String[] args) {
		Point original = new Point(3,5);
		Point copy = (Point)original.clone(); // 복제(clone)해서 새로운 객체를 생성
		System.out.println(original);
		System.out.println(copy);
		
	}
}

