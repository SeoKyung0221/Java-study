class RepairableTest{
	public static void main(String[] args) {
		Tank tank = new Tank();
		Dropship dropship = new Dropship();
		
		Marine marine = new Marine();
		SCV scv = new SCV();
		scv.repair(tank);
		scv.repair(dropship);
		// scv.repair(marine); <-에러! SCV는 마린에 적용할 수 없다. 마린 클래스는
		// 구현하고 Repairable의 인터페이스를 구현하고 있지 않음.
	}
}

interface Repairable {} // 내용이 없는 인터페이스를 만듦으로서 공통점 만들기.

class Unit{ // 최고 조상
	int hitPoint;
	final int MAX_HP;
	Unit(int hp){
		MAX_HP = hp;
	}
	//...
}

class GroundUnit extends Unit{ // 지상유닛
	GroundUnit(int hp){
		super(hp);
	}
}

class AirUnit extends Unit{ // 공중 유닛
	AirUnit(int hp){
		super(hp);
	}
}

class Tank extends GroundUnit implements Repairable{ // 지상유닛 소속의 인터페이스 구현
	Tank(){
		super(150); // Tank의 HP는 150이다.
		hitPoint = MAX_HP;
	}
	public String toString() {
		return "Tank";
	}
	//...
}

class Dropship extends AirUnit implements Repairable{
	Dropship(){
		super(125); // Dropship의 HP는 125이다.
		hitPoint = MAX_HP;
	}
	public String toString() {
		return "Dropship";
	}
	//...
}

class Marine extends GroundUnit{
	Marine(){
		super(40);
		hitPoint = MAX_HP;
	}
	//...
}

class SCV extends GroundUnit implements Repairable{
	SCV(){
		super(60);
		hitPoint = MAX_HP;
	}
	void repair(Repairable r) {
		if(r instanceof Unit) {
			Unit u = (Unit)r;
			while(u.hitPoint!=u.MAX_HP) {
				/* Unit의 HP를 증가시킨다. */
				u.hitPoint++;
			}
			System.out.println(u.toString()+ "의 수리가 끝났습니다.");
		}
	}
	//...
}