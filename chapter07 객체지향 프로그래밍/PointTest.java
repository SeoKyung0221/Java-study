/*
class PointTest{

	public static void main(String args[]) {
		Point3D p3 = new Point3D(1,2,3);
	}
}

class Point{
	int x, y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	String getLocation() {
		return "x :" + x + ", y :" + y;
	}
}

class Point3D extends Point{
	int z;
	
	Point3D(int x, int y, int z){ // 자손 생성자에서 조상의 생성자를 발견하지 못함 -> 에러!
		// super() 자동적으로 생성됨! 그런데 super로 Point()의 생성자가 형성되는 것이기 때문에 이에 해당하는 Point의
		// 생성자가 없어 최종적으로 컴파일 에러가 발생한다. // super(x,y)라면 정상적으로 호출될 것이다.
		this.x = x;
		this.y = y;
		this.z = z;
	}
	String getLocation() { // 오버라이딩
		return "x :" + x + ", y :" + y + ", z :" + z;
	}
} // 에러 발생!
*/