import java.awt.Frame;
import java.awt.event.WindowEvent;

class Exercise_01{
	for(int i = 0; i < cards.length; i++) {
		int num = i % 10 + 1;
		boolean isKwang = (i < 10) && (num==1 || num == 3 || num == 8);
		
		cards[i] = new SutdaCard(num, isKwang);
		// �ν��Ͻ��� ��� �迭�� ä��� �����̴�! ��ü�迭�̶� ���信 ���ؼ� �� ��������.
		// new (class�̸�)�� �׻� �ν��Ͻ��� �����Ѵٴ� ���� ��������!!!!
	}
}

class Exercise_02{
	void shuffle() {
		for(int i = 0; i < cards.length*2; i++) { // ������ ���̰� 2��Ƚ����ŭ ����
			int x = (int)(Math.radom()*cards.length); // �迭�� �ε��� �� �� ��. [0, cards.length)
			int y = (int)(Math.random()*cards.length);
			// ���⼭ ������ temp�� �����ؾ��ϴµ� �迭 cards[]�� SutdaCard�� �� �������̴�.
			// �׷��Ƿ� int�� ���� �⺻���� �ƴ϶� ����Ǿ� �ִ� �ν��Ͻ��� ���������� �����ؾ��Ѵ�.
			SutdaCard temp = cards[x];
			cards[x] = cards[y];
			cards[y] = temp;
		}
 	}
	SutdaCard pick(int index) {
		// *��ȿ�� �˻縦 ���־����. index�� ������ üũ�϶�� ��!! �׽�Ʈ�� �׷��� �ڵ� ���൵
		// �׷��� ������ ���� ������ ���־���Ѵ�.
		if(index < 0 || index >= cards.length)
			return null; // Ʋ���� �ƹ��͵� ��ȯ x
		return cards[index];
	}
	
	SutdaCard pick() {
		int x = (int)(Math.random()*cards.length);
		return cards[x]; // Ȥ�� �ٸ� pick�Լ���  pick(x)�� ȣ���Ѵ�.
	}
}

class Exercise_03{
	/*
	�������̵��� ���� Ŭ������ �޼��带 �ڼ� Ŭ�������� �� ���ӻ��� �°� ������ �����ϴ� ��. �������ϴ�
	���� ���Ѵ�. ���� Ŭ������ �޼��带 �״�� ��� ���ϴ� ��찡 �־ �ڼ� Ŭ�������� �����ؼ� ����ϴ�
	�������̵��� �� �ʿ��ϴ�.
	 */
}

class Exercise_04{
	/*
	c : ���������ڴ� ���󺸴� �� ���� �����θ� ���氡��. ������ ���� ������ ��.
	d : ���ܴ� ���󺸴� �� ���� ������ �� ����.
	���⼭�� ��޾ȵ����� static���� ��쿡�� static�� ���̰ų� �� �� ����.
	 */
}

class Exercise_05{
	// Tv�� Product�� ��ӹ޾Ҵ�. �� �ڼ�Ŭ�����̴�. �׷��ٸ� �ڼ� Ŭ������ ����ڴ�
	// �ݵ�� ù�ٿ��� ���� Ŭ������ �����ڸ� ȣ���ؾ��Ѵ�. ���⼭�� ȣ���� ������ �ʴ�. �̿� �����Ϸ���
	// �� ������ super();�� �ҷ��� ���ε� ������ Product Ŭ�������� default �����ڰ� ���ٴ� ���̴�.
	// �׷��Ƿ� ������ ������ �߻��Ѵ�. �̸� �ذ��ϱ� ���ؼ��� Product�� defaul �����ڸ� �߰��ϰų���
	// Tv Ŭ���� �������� ù�ٿ� Product(int price)�� ���� Ŭ������ �����ڸ� �־���Ѵ�.
}

class Exercise_06{
	// �ڼ� Ŭ�������� �ν��Ͻ��� �����ϸ� �������κ��� ��ӹ��� �����鵵 �����̵ȴ�. ��,
	// �� �����鿡 ���ؼ� �ʱ�ȭ�� �Ǿ���ϱ� ������ �ڼ� Ŭ������ �������� ù �ٿ��� ���� Ŭ������
	// �����ڸ� ȣ���ϴ� ���̴�.
}

class Exercise_07{
	/*
	�����Ϸ��� ���� Ŭ������ �����ڸ� �Ͻ������� ȣ���ϹǷ�
	Child(), Parent(), Parent(int x), Child(int x) ������ ȣ��ȴ�. 
	// �׷��� �˾����� Child�� �����ڰ� ��εǰ� �� ���� Parent �����ڰ� ȣ��ȴ�. ������ �𸣰ڴ�. ����ΰ�?
	�̿� ����  Parent�� x = 200, Child�� x = 1000�̴�.
	c�� getX()�� �޼��带 ȣ���ϴµ� getX�� ����Ŭ������ �޼����̹Ƿ� ParentŬ������
	x�� �ǹ��Ѵ�. ��, 200�� ��µȴ�.
	 */
}

class Exercise_08{
	// ���� ������� �����ϸ� a�̴�.
}

class Exercise_09{
	// c �����ε��� �ƴ϶� �������̵��̴�. �����ε��� �׳� �̸��� ���� ���ο� �Լ��̴�.
}

class Exercise_10{ // ��ȿ�� �˻� ��������!!
	// isPowerOn, channel, volume�� private�� �ٿ��� ������ ���ѽ�Ų��.
	
	public boolean getIsPowerOn() {
		return isPowerOn;
	}
	public void setIsPowerOn(boolean a) {
		isPowerOn = a;
	}
	
	public int getChannel() {
		return channel;
	}
	
	public void setChannel(int channel) {
		if(channel < 1 || channel > 100)
			return;
		
		this.channel = channel;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int volume) {
		if(volume < 0 || volume > 100)
			return;
		
		this.volume = volume;
	}
}

class Exercise_11{
	class MyTv2{
	 // 10������ �ۼ��� get, set�Լ� ���� ����� ��� �ִٰ� �����Ѵ�.
		private int prevChannel = 10;
	// setChannel ����
		public void setChannel(int channel) {
			// ��ȿ�� �˻� ����
			prevChannel = this.channel;
			this.channel = channel;
		}
		public void gotoPrevChannel() {
			setChannel(prevChannel);
		}
	}
}

class Exercise_12{
	/*
	c ������������ ���� ������ ���Ұ�.
	 */
}

class Exercise_13{
	/*
	�����ڸ� private�� �س������ν� �ٸ� Ŭ������ �̸� ��ӹ޾� ������� ���ϰ� �ϴ� ���̴�.
	-> Ʋ�ȴ�. MathŬ������ ��� �޼���� static�޼����̱� ������ �ν��Ͻ� ������ �������� �ʾ�
	��ü�� ������ �ʿ䰡 ���� �����̴�.
	 */
}

class Exercise_14{
	// ��� ������ ���� final �����ڸ� �ٿ� ����� ����� �̸� �����ڿ����� �ʱ�ȭ �� �� �ְ� �Ѵ�.
	final int NUM;
	final boolean IS_KWANG; // ����ϱ� ��� �빮��ó��
	
	SutdaCard(int num, boolean isKwang){
		this.NUM = num;
		this.IS_KWANG = isKwang;
	}
	// public String toString() �޼����� ���뵵 num, isKwang��
	// �ٲ� ����� NUM, IS_KWANG�� �ٲٸ� �ȴ�.
}

class Exercise_15{
	/*
	 e u�� tank�� ���� �ν��Ͻ��� �����ϴ� ���������̴�. ���� �ν��Ͻ��� �ڼ� ����������
	 �Ҵ� �����Ѱ�? ���� �Ұ����ϴ�. �ֳ��ϸ� �ڼ� ���������� ������ �� �ִ� ����� ������ ���� �����̴�.
	 */
}

class Exercise_16{
	/*
	 e �ϳ��� ���������̹Ƿ� ������ �ν��Ͻ��� ���Ե��ִٴ����� ���谡 �ƴϴ�.
	 �׷��Ƿ� �������� false�� ��µȴ�.
	 
	 b�� implement�� �ް��� �� �ִµ� ������ Movable�� �ν��Ͻ���
	 FireEngineŬ���� �ȿ� �������ִ� ���̹Ƿ� �������� true��.
	 */
}

class Exercise_17{
	class Unit{ // ����
		int x, y;
		abstract void move(int x, int y); // �߻� Ŭ������ ����������. ���� ����X
	}
	// ���� Marine, Tank, Dropship ��� extends Unit���� ��ӹ޴´�.
	// ������ Ŭ�������� move ����.
}

class Exercise_18{ // static �޼��� �ƴϸ� ���δ� ���������κ��� ���ؾ���.
	void action(Robot r) {
		if(r instanceof DanceRobot)
			DanceRobot dr = (DanceRobot)r;
			dr.Dance();
		if(r instanceof SingRobot)
			// ���� ������� ���������� �����ϰ� Singȣ��
		if(r instanceof DrawRobot)
			// ���� ������� ���������� �����ϰ� Drawȣ��
	}
}

class Exercise_19{
	// å�� �ִ� ����״�ο��� Ǯ�� �ʾҴ�. �׽�Ʈ�� �ϳ��� ������ �����غ��Ҵµ�
	// �ʹ� å�̶� �Ȱ��� �����ؼ� ���� �ʿ���� �� ���� Ǯ���ʾҴ�.
}

class Exercise_20{ // �޼���� �ν��Ͻ��� ��������� ���������� ������ ������ ��������!
	/*
	p.x = 100
	Child Method
	p.x = 200
	Child Method
	 */
}

class Exercise_21{
	// null, Movable �������̽��� ������ Ŭ����(�ڼ�Ŭ����)
	// null�� �׳� ��... interface�� ��ü������ �ν��Ͻ��� ������ �� ������ �Ű����� ����X
	// �׷��Ƿ� �ƿ� �ȵ��� null�̰ų� �̸� ������ ������ Ŭ���� �ν��Ͻ��̴�.
}

class Exercise_22{
	class Re extends Shape{
		double width;
		double height;
		
		Re(double width, double height){
			this(new Point(0,0), width, height);
		}
		
		Re(Point p, double width, double height){
			super(p);
			this.width = width;
			this.height = height;
		}
		
		boolean isSquare() {
			// �̰� ���Ծ���. ���� ������ �����־���Ѵ�.
			return width*height!=0 && width==height;
		}
		
		double AreaSum() {
			return width*height;
		}
	}
	
	class Circle extends Shape{
		double r;
		
		Circle(double r){
			this(new Point(0,0), r);
		}
		Circle(Point p, double r){
			super(p);
			this.r = r;
		}
		double AreaSum() {
			return Math.PI*r*r;//PI���� �����ϴ°ž�
		}
	}
}

class Exercise_23{
	static double sumArea(Shape[] arr) {
		double sum = 0;
		
		for(int i = 0; i<arr.length; i++) {
			sum+=arr[i].AreaSum(); // arr[i]�� �ν��Ͻ�
		}
		return sum;
	}
}

class Exercise_24{
	// e ��Ű������ ������ �������� �ʴ´�. �������� ��� �������̴�.
}

class Exercise_25{
	Outer o = new Outer();
	Outer.Inner ii = o.new Inner();
	System.out.println(ii.iv);
}

class Exercise_26{
	Outer.Inner ii = new Outer.Inner();
	System.out.println(ii.iv); // static inner class�� ������ �ܺ� Ŭ������ �ν��Ͻ�
	// ���� ���̵� �׳� �����ϴ�. static ����� �ν��Ͻ� �������� ����� �� �־��� ��ó��!
}

class Exercise_27{
	/*
	(1) value
	(2) this.value
	(3) Outer.this.value
	(4) Outer o = new Outer();
		Outer.Inner inner = o.new Inner(); // �ν��Ͻ� Ŭ������ ����ϱ����� �ܺ� Ŭ���� �ν��Ͻ� ����
	 */
}

class Exercise_28{
	// �͸�Ŭ������ ������ �ܺ��� ����� ���ǰ� �Ǿ��ִ� Ŭ������ ���ְ� main�Լ��� �շ� ��Ų��.
	public static void main(String[] args) {
		Frame f = new Frame();
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
				System.exit(0);  // new WindowAdapter()������ �͸� Ŭ������ Ư������ �ߴµ�
				// �� ���ϴ� �𸣰ھ ����� �����ߴ�.
			}
		});
	}
}

class Exercise_29{
	// ���������� ������ �޼��尡 ����ǰ� ���� ������ �Ҹ�ʿ��� �ұ��ϰ� ���� Ŭ������ �ν��Ͻ���
	// �� ���������� ȣ���� �� �ֱ� �����̴�. �Ҹ�� ���� ȣ���� �� ������ ������ ����� ������
	// final�� ���� ����� ������ �����ϴ�.
}
