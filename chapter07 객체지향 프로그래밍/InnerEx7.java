import java.awt.*;
import java.awt.event.*;

class InnerEx7{
	public static void main(String[] args) {
		Button b = new Button("Start");
		b.addActionListener(new EventHandler());
	}
}

class EventHandler implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		System.out.println("ActionEvent occurred!!!");
	}
} // 실행하면 아무것도 안나옴. 익명 클래스 변환 예제 InnerEx8을 확인하자.