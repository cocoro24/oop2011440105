import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{
	JButton button, btn;	//�ʵ�ó�� ����Ѵ�. ��ư��. ��� �޼ҵ忡�� �� ��ư�� access�Ҽ��ִ�.
	JTextField tf;
	
	MyFrame() {
		setSize(900,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Dakyo's Frame");

		this.setLayout(new FlowLayout());
		button = new JButton("��ư�� ����������");
		this.add(button);
		this.button.setActionCommand("Button1");
		button.addActionListener(this);	//event listener ���
		
		btn = new JButton("�ι�° ��ư");
		this.add(btn);
		this.btn.setActionCommand("Button2");
		btn.addActionListener(this);
		
		tf = new JTextField(20);
		this.add(tf);


		//event listener ��ü ����
//		MyListener lstn = new MyListener();
//		button.addActionListener(lstn);	//event listener ���
		
		
		this.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		//JButton�� ��ü��� ĳ������ ���ش�
		//e.getSource�� �̺�Ʈ���� �޾ƿ� ��ư�� �������ִ°�.
		if(e.getActionCommand().equals("Button1")) {
			this.tf.setText("ù��° ��ư");
			this.button.setText("ù��° ��ư�̿���");


		}
		else {
			this.tf.setText("�ι�° ��ư");
			this.btn.setText("���� ������?");


		}


	}

}
