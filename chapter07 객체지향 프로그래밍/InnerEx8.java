import java.awt.*;
import java.awt.event.*;

class InnerEx8 {
	public static void main(String[] args) {
		Button b = new Button("Start");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				System.out.println("ActionEvent occurred!!!");
				}
			} // 익명 클래스의 끝
		);
	} // main의 끝
} // 괄호 안에 new ActionListener() { } 하고 있다. 햇갈리지 말자.