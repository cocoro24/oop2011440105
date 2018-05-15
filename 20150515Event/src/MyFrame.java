import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{
	JButton button, btn;	//필드처럼 사용한다. 버튼을. 모든 메소드에서 이 버튼을 access할수있다.
	JTextField tf;
	
	MyFrame() {
		setSize(900,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Dakyo's Frame");

		this.setLayout(new FlowLayout());
		button = new JButton("버튼을 눌러보세요");
		this.add(button);
		this.button.setActionCommand("Button1");
		button.addActionListener(this);	//event listener 등록
		
		btn = new JButton("두번째 버튼");
		this.add(btn);
		this.btn.setActionCommand("Button2");
		btn.addActionListener(this);
		
		tf = new JTextField(20);
		this.add(tf);


		//event listener 객체 생성
//		MyListener lstn = new MyListener();
//		button.addActionListener(lstn);	//event listener 등록
		
		
		this.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		//JButton의 객체라고 캐스팅을 해준다
		//e.getSource는 이벤트에서 받아온 버튼을 선택해주는것.
		if(e.getActionCommand().equals("Button1")) {
			this.tf.setText("첫번째 버튼");
			this.button.setText("첫번째 버튼이에오");


		}
		else {
			this.tf.setText("두번째 버튼");
			this.btn.setText("나를 눌렀어?");


		}


	}

}
