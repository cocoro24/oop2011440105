import java.awt.*;

import javax.swing.*;

class MyFrame extends JFrame{
	public MyFrame() {
		setSize(900,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Dakyo 2nd Frame");
		
		//add new component on the frame

		
		setLayout(new FlowLayout());
		//setLayout메소드는 JFrame에 얹을 컴포넌트들의 배치방법을 지정하는 메소드.
		//FlowLayout은 왼쪽에서 오른쪽으로, 위에서 아래로 순서대로
		//컨테이너의 크기가 변경되면 컴포넌트들의 위치는 변하고 크기는 고정.
		
		JLabel label = new JLabel("다교님");
		JTextField tf = new JTextField(20);	//몇칸인지 써주기
		JPasswordField pw = new JPasswordField(15);
		JButton button = new JButton();
		
		button.setText("ON");
		button.setEnabled(false);
		tf.setText("이다교님이 입장하셨습니다.");
		
		//패널 생성
		JPanel p = new JPanel();
		//패널안에 add로 레이블과 textfield를 넣어준당.
		p.add(label);
		p.add(tf);
		
		//프레임 안에 패널을 추가해준당.
		add(p);
		
		this.add(pw);
		this.add(button);
		
//		pack();		//프레임 사이즈를 컴포넌트 사이즈로 만드러준당
		
		setVisible(true);

	}
	
}